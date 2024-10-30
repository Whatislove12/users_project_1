package com.users_project_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("");
            System.out.println("Текущий список пользователей:");
            userManager.listUsers();
            System.out.println("");
            System.out.println("Введите команду (добавить, удалить, поиск, изменить или q для выхода): ");
            String command = scanner.nextLine().trim();

            if (command.equals("q")) {
                System.out.println("Завершение программы.");
                break;
            }

            int id;

            switch (command) {
                case "добавить":
                    System.out.println("Введите имя");
                    String name = scanner.nextLine();
                    System.out.println("Введите фамилию");
                    String surName = scanner.nextLine();
                    System.out.println("Введите возраст");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // очищаем остаток после ввода числа

                    userManager.addUser(new User(name, surName, age));
                    System.out.println("Пользователь добавлен");
                    break;
                case "удалить":
                    System.out.println("Введите ID пользователя, которого хотите удалить");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    userManager.removeUser(id);
                    break;
                case "поиск":
                    System.out.println("Введите id пользователя, которого хотите найти и отобразить");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    userManager.aUser(id);
                    break;
                case "изменить":
                    System.out.println("Введите id пользователя, которого хотите изменить");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    userManager.changeUser(id);
                    break;

            }
        }
    }
}