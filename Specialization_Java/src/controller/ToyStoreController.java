package controller;

import model.Toy;
import model.ToyStore;

/**
 * Класс ToyStoreController  модуля Controller необходимый  для управления магазином игрушек.
 */
public class ToyStoreController {
    private ToyStore toyStore;

    /**
     * Конструктор класса ToyStoreController.
     */
    public ToyStoreController() {
        toyStore = new ToyStore();
    }

    /**
     * Метод, необходимый для добавления новой игрушки в магазин.
     *
     * @param toy - добавленная в магазин игрушка.
     */
    public void addToy(Toy toy) {
        toyStore.addToy(toy);
    }

    /**
     * updateFrequencyToyDrop - метод необходимый  для обновления частоты выпадения игрушки по ее id.
     *
     * @param toyId     - идентификатор игрушки.
     * @param frequency - частота выпадения игрушки.
     */
    public void updateFrequencyToyDrop(int toyId, int frequency) {
        toyStore.updateFrequencyToyDrop(toyId, frequency);
    }

    /**
     * HoldingDrawToy - метод описывающий процесс розыгрыша игрушек.
     */
    public void HoldingDrawToy() {
        toyStore.HoldingDrawToy();
    }

    /**
     * getPrizeToy - метод описывающий получения  игрушки в качестве приза при проведении розыгрыша.
     *
     * @return игрушка ,выпавшая в качестве приза.
     */
    public Toy getPrizeToy() {
        return toyStore.getPrizeToy();
    }

    /**
     * writeToFile - метод необходимый для записи призовых игрушек в файл.
     *
     * @param filename - имя файла для записи.
     */
    public void writeToFile(String filename) {
        toyStore.writeToFile(filename);
    }
}