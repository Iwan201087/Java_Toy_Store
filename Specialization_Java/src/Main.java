import java.util.Scanner;

import view.ToyStoreView;

/**
 * Класс Main - точка входы в программу.
 */
public class Main {
    /**
     * Описание главного метода для работы с магазином игрушек.
     * 
     * @param addNewToy - добавление новых игрушек по уникальному id.
     * @param updateFrequencyToyDrop - изменение частоты (веса в %) выпадения игрушек при проведении розыгрыша.
     * @param HoldingDrawToy - проведение розыгрыша игрушек.
     * @param getPrizeToy - получение выигрыша.
     * @param writeToFile - запись в файл информации о выигрыше.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ToyStoreView view = new ToyStoreView();

        System.out.println("Добавление новых игрушек учавствующих в розыгрыше: ");
        view.addNewToy(001, "Машинка RC", 32);
        System.out.println("Машинка RC");

        view.addNewToy(002, "Набор сувенирных мишек", 2);
        System.out.println("Набор сувенирных мишек");

        view.addNewToy(003, "Мягкая игрушка - Винни ПУХ", 12);
        System.out.println("Мягкая игрушка - Винни ПУХ");

        view.addNewToy(004, "Мотоцикл для Барби", 18);
        System.out.println("Мотоцикл для Барби");

        view.addNewToy(005, "Набор для настольного тениса", 32);
        System.out.println("Набор для настольного тениса" );

        view.addNewToy(006, "Набор посуды для кукол", 42);
        System.out.println("Набор посуды для кукол" );

        view.addNewToy(007, "Конструктор - Дом", 37);
        System.out.println("Конструктор - Дом" + "\n" );

        System.out.println("Изменение частоты выпадения игрушек: ");
        view.updateFrequencyToyDrop(001, 25);
        System.out.println("Частота выпадения игрушки 'Машинка RC' установлена на 15");

        view.updateFrequencyToyDrop(002, 15);
        System.out.println("Частота выпадения игрушки 'Набор сувенирных мишек' установлена на 15");

        view.updateFrequencyToyDrop(003, 10);
        System.out.println("Частота выпадения игрушки 'Мягкая игрушка - Винни ПУХ' установлена на 5");

        view.updateFrequencyToyDrop(004, 35);
        System.out.println("Частота выпадения игрушки 'Мотоцикл для Барби' установлена на 5");

        view.updateFrequencyToyDrop(005, 40);
        System.out.println("Частота выпадения игрушки 'Набор для настольного тениса' установлена на 20");

        view.updateFrequencyToyDrop(006, 10);
        System.out.println("Частота выпадения игрушки 'Набор посуды для кукол' установлена на 20");

        view.updateFrequencyToyDrop(007, 20);
        System.out.println("Частота выпадения игрушки 'Конструктор - Дом' установлена на 20"+ "\n");
        

        view.HoldingDrawToy();
        System.out.println("Розыгрыш призовых игрушек организован! Вы получили: " + view.getPrizeToy().getName());

        view.writeToFile("prize_toys.txt");
        System.out.println("Игрушки, которые принимали участие  в проведении призового розыгрыша записаны в файл");
    }
}