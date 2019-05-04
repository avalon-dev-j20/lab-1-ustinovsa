package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;

import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.text.html.HTMLDocument;
import ru.avalon.java.j20.labs.models.Fibonacci;

/**
 * Задание №3
 *
 * <p>
 * Тема: "Изучение интерфейсов {@link Iterable} и {@link Iterator}".
 */
public class Task3 implements Task {

    public void sum(Fibonacci f) {
        int sum = 0;
        for (Integer n : f) {
            sum += n;
        }
        System.out.println("Sum of Fibonacci sequence of "
                + f.getSize() + " = " + sum);
    }

    @Override
    public void run() {
        /*
         * TODO(Студент): Выполнить задание №3
         *
         * 1. Завершить описание класса Fibonacci так, чтобы класс
         *    возвращал заданное количество чисел последовательности
         *    Фибоначчи.
         *
         *    Количество чисел последовательности можно указывать
         *    при создании экземпляра класса.
         *
         *    Найти сумму 20 первых чисел последовательности Фибоначчи:
         *
         * 2. Создать экземпляр класса Fibonacci так, чтобы он
         *    возвращал последовательность чисел Фибоначчи длиной
         *    в 20 элементов.
         *
         * 3. Найти сумму полученных значений.
         *
         * 4. С использованием отладчика проверьте корректность
         *    выполнения задания.
         */

        Fibonacci fib = new Fibonacci(10);

        Fibonacci fib2 = new Fibonacci(20);

        Fibonacci fib3 = new Fibonacci(15);

        sum(fib);
        sum(fib2);
        sum(fib3);
    }
}
