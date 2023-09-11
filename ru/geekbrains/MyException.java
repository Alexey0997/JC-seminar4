package ru.geekbrains;

public class MyException {
    /**
     * findException  - метод реализует проверку массива в соовтетствии с иерархией исключений.
     * Если массив соответствует треованиям, то его строчные элементы преобразуются в целочисленные и ссумируются.
     * @param myArray - аргумент - двумерный массив строк.
     * @return        - возвращается сумма элементов массива.
     */
    public static void findException(String[][] myArray) {
        int count = 0;
        try {
            if (myArray.length != 4) {
                throw new MyArraySizeException();
            }
            for (int i = 0; i < myArray.length; i++) {
                if (myArray[i].length != 4) {
                    throw new MyArraySizeException();
                }
                for (int j = 0; j < myArray.length; j++) {
                    try {
                        count = count + Integer.parseInt(myArray[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(i, j);
                    }
                }
            }
            System.out.printf("Сумма всех элементов в ячейках массива = %s", count + ".");
        } catch (MyArraySizeException e){
            System.out.printf("Размер массива: %s", myArray.length + "x" + myArray.length + ", а требуется 4x4!");
        } catch (MyArrayDataException e) {
            System.out.printf("Массив содержит некорректное значение в ячейке: "
                    + e.i + " x " + e.j + ". Значение: " + "'" + myArray[e.i][e.j] + "'" + " не является числом!");
        } finally {
            System.out.println("\nПроверка окончена.");
        }
    }
}
