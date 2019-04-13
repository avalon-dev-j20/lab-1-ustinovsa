package ru.avalon.java.j20.labs.models;

public final class Numbers  {

    /**
     * Скрытый конструктор, чтобы предотвратить создание
     * экземпляров данного типа.
     */
    private Numbers() {}

    /**
     * Возвращает сумму значений переданного массиа.
     *
     * @param values массив чисел
     * @param <T> тип значений - любые числа, сравниваемые.
     * @return сумма элементов массива
     */
    public static <T extends Number & Comparable> double sum(T[] values) {
        double sum = 0;
        for (T value : values) sum += value.doubleValue();
        return sum;
    }

    /**
     * Выполняет поиск среднего арифметического заданного
     * массива чисел.
     *
     * @param values массив значений
     * @param <T> тип значений - любые числа, сравниваемые
     * @return среднее арифметическое с точностью до типа {@code double}.
     */
    public static <T extends Number & Comparable> double avg(T[] values) {
        return sum(values) / values.length;
    }

    /**
     * Возвращает большее из дух переданных значений.
     *
     * @param a перое значение
     * @param b второе значение
     * @param <T> тип значений - любые числа, сравниваемые.
     * @return большее из двух значений
     */
    public static <T extends Number & Comparable> T max(T a, T b) {
        return a.compareTo(b) > 0 ? a : b;
    }

    /**
     * Выполняет поиск максимального значения в массиве.
     *
     * @param values массив значений
     * @param <T> тип значений - любые числа, сравниваемые.
     * @return максимальное значение массива
     */
    public static <T extends Number & Comparable> T max(T[] values) {
        T result = values[0];
        for (int i = 1; i < values.length; i++) {
            result = max(result, values[i]);
        }
        return result;
    }

    /**
     * Возвращает меньшее из двух переданных значений.
     *
     * @param a первое значение
     * @param b второе значение
     * @param <T> тип значений - любые числа, сравниваемые.
     * @return меньшее из дух значений
     */
    public static <T extends Number & Comparable> T  min(T a, T b) {
        return a.compareTo(b) < 0 ? a : b;
    }

    /**
     * Выполняет поиск минимального значения массива.
     *
     * @param values массив значений
     * @param <T> тип значений - любые числа, сравниваемые.
     * @return минимальное значение массива
     */
    public static <T extends Number & Comparable> T min(T[] values) {
        T result = values[0];
        for (int i = 1; i < values.length; i++) {
            result = min(result, values[i]);
        }
        return result;
    }

    
}