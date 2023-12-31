package model;

import java.util.Random;
import java.io.IOException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * ToyStore класс модуля Model, который описывает магазин игрушек как сущность.
 */
public class ToyStore {
    private List<Toy> toys;
    private List<Toy> prizeToys;

    /**
     * Конструктор класса ToyStore, необходимый для нициализации  пустых списков игрушек и призовых игрушек.
     */
    public ToyStore() {
        toys = new ArrayList<>();
        prizeToys = new ArrayList<>();
    }

    /**
     * addToy - метод необходимый для добавления игрушки в магазин.
     *
     * @param toy - игрушка с которой будут производится манипуляции.
     */
    public void addToy(Toy toy) {
        toys.add(toy);
    }

    /**
     * updateFrequencyToyDrop - метод необходимый для обновления частоты выпадения игрушки по ее уникальному ID.
     *
     * @param toyId     - ID игрушки.
     * @param frequency - новая частота выпадения игрушки.
     */
    public void updateFrequencyToyDrop(int toyId, int frequency) {
        for (Toy toy : toys) {
            if (toy.getId() == toyId) {
                toy.setFrequency(frequency);
                break;
            }
        }
    }

    /**
     * HoldingDrawToy - метод для организации розыгрыша игрушек, с учетом их частоты
     * выпадения.
     * 
     * @param totalFrequencies - совокупная  частота выпадения игрушек.
     * @param totalFrequency   - суммарная  частота выпадения игрушек.
     * @param sum              - суммарное значение.
     * 
     */
    public void HoldingDrawToy() {
        Random random = new Random();
        int[] totalFrequencies = new int[toys.size()];
        int sum = 0; 
        for (int i = 0; i < toys.size(); i++) { 
            sum += toys.get(i).getFrequency();
            totalFrequencies[i] = sum;
        }
        int totalFrequency = sum;

        while (!toys.isEmpty()) {
            int randomNumber = random.nextInt(totalFrequency);
            int index = 0;
            while (index < totalFrequencies.length && totalFrequencies[index] <= randomNumber) {
                index++;
            }
            Toy prizeToy = toys.get(index);
            toys.remove(index);
            sum -= prizeToy.getFrequency();
            totalFrequency = sum;
            prizeToys.add(prizeToy);
        }
    }

    /**
     * getPrizeToy - метод для получения призовой игрушки.
     *
     * @return призовая игрушка или "null", если призы закончились.
     */
    public Toy getPrizeToy() {
        Toy prizeToy = null;
        try {
            prizeToy = prizeToys.get(0);
            prizeToys.remove(0);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Ошибка: отсутствует список игрушек");
        }
        return prizeToy;
    }

    /**
     * writeWinToysToFile - метод для записи призовых игрушек в файл.
     *
     * @param filename - имя файла, в который запишутся разыгранные игрушки.
     * @throws IOException - возникнет , если произойдет ошибка записи в файл.
     */
    public void writeToFile(String filename) {
        try {
            FileWriter writer = new FileWriter(filename);
            for (Toy toy : prizeToys) {
                writer.write(toy.getId() + "," + toy.getName() + "," + toy.getFrequency() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Ошибка записи  игрушек в файл: " + e.getMessage());
        }
    }
}