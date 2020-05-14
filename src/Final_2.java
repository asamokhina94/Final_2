import java.util.Scanner;

public class Final_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int arraySize = in.nextInt();    //Запись размера массива в переменную
        int array[] = new int[arraySize];    //Объявление массива
        System.out.print("Задайте элементы массива через пробел: ");
        for (int i = 0; i < arraySize; i++) {        //Цикл для записи значений в массив
            array[i] = in.nextInt();
        }
        //Сортировка массива "вставками"
        int tmp, j;
        for(int i = 0; i < array.length - 1; i++){
            if (array[i] > array[i + 1]) {
                tmp = array[i + 1];
                array[i + 1] = array[i];
                j = i;
                while (j > 0 && tmp < array[j - 1]) {
                    array[j] = array[j - 1];
                    j--;
                }
                array[j] = tmp;
            }
        }
        System.out.print("Отсортированный массив: ");
        for (int k = 0; k < arraySize; k++) {     //Вывод элементов массива
            System.out.print(array[k] + " ");
        }
    }
}
