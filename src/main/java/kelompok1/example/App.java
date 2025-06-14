/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelompok1.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Berapa banyak nama yang ingin dimasukkan?");
        int count = scanner.nextInt();
        scanner.nextLine(); // consume newline

        for (int i = 1; i <= count; i++) {
            System.out.print("Masukkan nama ke-" + i + ": ");
            String name = scanner.nextLine();
            System.out.println(greet(name));
        }

        scanner.close();
    }

    public static String greet(String name) {
        return "Halo, " + name + "!";
    }
}

