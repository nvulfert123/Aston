package main;

import model.BaseClass;
import model.Bus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start  {
    public static void main(String[] args) throws IOException {
        int numberClass, inputType, numberOfObject;
        BaseClass [] dataArray;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        numberClass = getClassNumber(reader); // выбор класса 1-Автобус, 2-Пользователь, 3-Студент
        inputType = getInputType(reader); // Выбор способа создания 1-Из файла, 2-Рандом, 3-Вручную
        dataArray = new BaseClass[getNumberOfObject(reader, inputType)]; // создание массива объектов заданного размера
        System.out.println("проверка что дошли дальше");
        // Заполнение массива объектов
        // тестовое создание массива вручную для дальнейшей работы.
        dataArray = new BaseClass[4];
        dataArray[0] = new Bus.BusBuilder().setModel("модель1").setNumber("X234TE").setMilieage(100).build();
        dataArray[1] = new Bus.BusBuilder().setModel("модель2").setNumber("A123TE").setMilieage(300).build();
        dataArray[2] = new Bus.BusBuilder().setModel("модель4").setNumber("B234TE").setMilieage(500).build();
        dataArray[3] = new Bus.BusBuilder().setModel("модель3").setNumber("A123TE").setMilieage(300).build();
        System.out.println(dataArray.toString());

        // цикл сортировки / поиска

    }
    private static int getClassNumber (BufferedReader reader) throws IOException {
        boolean flag1 = true;
        while (flag1) {
            try {
                System.out.println("Выберите класс для работы: \n1-Автобус, 2-Пользователь, 3-Студент");
                String input = reader.readLine();
                int temp = Integer.parseInt(input);
                switch (temp){
                    case 1:
                        System.out.println("Вы выбрали класс Автобус");
                        flag1 = false;
                        return 1;
                    case 2:
                        System.out.println("Вы выбрали класс Пользователь");
                        flag1 = false;
                        return 2;

                    case 3:
                        System.out.println("Вы выбрали класс Студент");
                        flag1 = false;
                        return 3;

                    default:
                        System.out.println("Введите число 1, 2 или 3");
                }
            }
            catch (NumberFormatException e) {
                System.err.println("Ошибка: не удалось преобразовать введенное значение в число.");
            }
        }
        return 0;
    }
    private static int getInputType (BufferedReader reader) throws IOException {
        boolean flag1 = true;
        while (flag1) {
            try {
                System.out.println("Выберите способ ввода: \n1-Из файла, 2-Рандом, 3-Вручную");
                String input = reader.readLine();
                int temp = Integer.parseInt(input);
                switch (temp){
                    case 1:
                        System.out.println("Вы выбрали ввод из файла");
                        flag1 = false;
                        return 1;
                    case 2:
                        System.out.println("Вы выбрали случайный ввод");
                        flag1 = false;
                        return 2;

                    case 3:
                        System.out.println("Вы выбрали ввод вручную");
                        flag1 = false;
                        return 3;

                    default:
                        System.out.println("Введите число 1, 2 или 3");
                }
            }
            catch (NumberFormatException e) {
                System.err.println("Ошибка: не удалось преобразовать введенное значение в число.");
            }
        }
        return 0;
    }
    private static int getNumberOfObject (BufferedReader reader, int inputType) throws IOException {
        int numberOfObject = 0;
        if (inputType == 1) {
            numberOfObject = 0; // ЗАМЕНИТЬ НА МЕТОД ПОЛУЧЕНИЯ ЧИСЛА ОБЪЕКТОВ ИЗ ФАЙЛА
        } else {
            boolean flag1 = true;
            while (flag1) {
                try {
                    System.out.println("Введите длину массива данных");
                    String input = reader.readLine();
                    numberOfObject = Integer.parseInt(input);
                    flag1 = false;
                } catch (NumberFormatException e) {
                    System.err.println("Ошибка: не удалось преобразовать введенное значение в число.");
                }
            }
        }
        return numberOfObject;
    }
}