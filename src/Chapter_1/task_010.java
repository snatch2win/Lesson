//Составить программу, которая запрашивает имя человека и повторяет его на экране.


package Chapter_1;

import java.util.Scanner;

public class task_010 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("как Вас звовут?");

        String name = scanner.next();
        System.out.println("Вы " + name);

    }
}
