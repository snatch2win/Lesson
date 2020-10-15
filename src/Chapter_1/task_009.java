//Составить программу вывода на экран числа, вводимого с клавиатуры. После выводимого числа должно следовать
//сообщение «– вот какое число Вы ввели».


package Chapter_1;

import java.util.Scanner;

public class task_009 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int w = scanner.nextInt();

        System.out.print(w + " - вот какое число Вы ввели");
    }
}
