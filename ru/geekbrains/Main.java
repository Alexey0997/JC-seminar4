package ru.geekbrains;

public class Main {
    public static void main(String[] args) {
        /**
         * Для проверки корректности работы поиска исключений создадим три массива:
         * myArray1 - соответствует заданным критериям: размер 4х4, элементы могут быть преобразованы в цифры;
         * myArray2 - имеет размер 3х3;
         * myArray3 - содержит элемент, который не может быть преобразован в целое число.
         */
        String[][] myArray1 = new String[][]{{"1", "1", "1", "1"}, {"2", "2", "2", "2"},
                {"3", "3", "3", "3"}, {"4", "4", "4", "4"}};
        System.out.println("\nРабота с массивом myArray1:");
        MyException.findException(myArray1);

        String[][] myArray2 = new String[][]{{"2", "2", "2"},
                {"3", "3", "3"}, {"4", "4", "4"}};
        System.out.println("\n\nРабота с массивом myArray2:");
        MyException.findException(myArray2);

        String[][] myArray3 = new String[][]{{"1", "Опа!", "1", "1"}, {"2", "2", "2", "2"},
                {"3", "3", "3", "3"}, {"4", "4", "4", "4"}};
        System.out.println("\n\nРабота с массивом myArray3:");
        MyException.findException(myArray3);
    }
}