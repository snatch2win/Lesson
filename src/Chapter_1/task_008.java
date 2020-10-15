//Составить программу вывода на экран числа, вводимого с клавиатуры. Выводимому числу должно предшествовать
//сообщение «Вы ввели число».


package Chapter_1;

import java.util.Scanner;

public class task_008 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int x = scanner.nextInt();

        System.out.println("Вы ввели число: " + x);



    }
}
