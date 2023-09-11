package ru.geekbrains;

/**
 * MyArrayDataException - класс, наследующий класс Exception, реализует проверку исключений по содержанию массива.
 */
public class MyArrayDataException extends Exception {
    public int i;
    public int j;

    /**
     * MyArrayDataException - конструктор класса, содержащий два параметра.
     * @param i - номер ячейки по горизонтали.
     * @param j - номер ячейки по вертикали.
     */
    MyArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;
    }
}
