package com.users_project_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("");
            System.out.println("Current list of users:");
            userManager.listUsers();
            System.out.println("");
            System.out.println("Enter a command (add, delete, search, modify, or q to exit): ");
            String command = scanner.nextLine().trim();

            if (command.equals("q")) {
                System.out.println("Completion of the programme");
                break;
            }

            int id;

            switch (command) {
                case "add":
                    System.out.println("Enter a name");
                    String name = scanner.nextLine();
                    System.out.println("Enter a surname");
                    String surName = scanner.nextLine();
                    System.out.println("Enter an age");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // очищаем остаток после ввода числа

                    userManager.addUser(new User(name, surName, age));
                    System.out.println("User added");
                    break;
                case "delete":
                    System.out.println("Enter the ID of the user you want to delete");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    userManager.removeUser(id);
                    break;
                case "search":
                    System.out.println("Enter the id of the user you want to search and display");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    userManager.aUser(id);
                    break;
                case "modify":
                    System.out.println("Enter the id of the user you want to change");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    userManager.changeUser(id);
                    break;

            }
        }
    }
}