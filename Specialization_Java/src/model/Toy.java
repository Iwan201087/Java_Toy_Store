package model;

/**
 * Toy класс модуля Model, который будет описывать  игрушки в магазине.
 */
public class Toy {
    private int id;
    private String name;
    private int frequency;

    /**
     * Конструктор класса Toy.
     *
     * @param id        - уникальный идентификатор игрушки.
     * @param name      - название игрушки.
     * @param frequency - частота выпадения игрушки в качестве приза.
     */
    public Toy(int id, String name, int frequency) {
        this.id = id;
        this.name = name;
        this.frequency = frequency;
    }

    /**
     * getId - метод необходимый для получения ID игрушки.
     *
     * @return уникальный ID игрушки.
     */
    public int getId() {
        return id;
    }

    /**
     * Метод необходимый для получения названия игрушки.
     *
     * @return getName - название игрушки.
     */
    public String getName() {
        return name;
    }

    /**
     * getFrequency - метод необходимый  для получения частоты получения  игрушки в качестве приза.
     *
     * @return частота получения  игрушки в качестве приза.
     */
    public int getFrequency() {
        return frequency;
    }

    /**
     * setFrequency - метод для обновления частоты получения  игрушки в качестве приза.
     *
     * @param frequency - новая частота получения  игрушки в качестве приза.
     */
    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
}