package com.users_project_1;

import java.util.ArrayList;
import java.util.Scanner;

public class UserManager {
    ArrayList<User> users;

    public UserManager() {
        users = new ArrayList<>();
    }

    //Add user
    public void addUser(User user) {
        boolean userExist = users.contains(user); //If exist this user
        if (userExist) {
            System.out.println("User with id: " + user.getId() + " already exists in the list");
        } else users.add(user);
    }

    //Delete user
    public void removeUser(int id) {
        User user = findUser(id);
        if (user != null) {
            users.remove(user);
            System.out.println("User with id " + id + " has been removed.");
        } else System.out.println("User with id " + id + " does not exist.");
    }

    //Search user
    private User findUser(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    //Demonstrate all users
    public void listUsers() {
        for (User user : users) {
            System.out.println(user); // Это автоматически вызовет user.toString()
        }
    }

    //Demonstrate a user
    public void aUser(int id) {
        User user = findUser(id);
        if (user != null) {
            System.out.println(user);
        } else System.out.println("User with id " + id + " does not exist.");
    }

    //Сохранить в файл

    //Change a user
    public void changeUser(int id) {
        User user = findUser(id);
        Scanner scanner = new Scanner(System.in);
        if (user != null) {
            System.out.println("What do you want to change? (1 - first name, 2 - last name, 3 - age): ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter a new name: ");
                    String newName = scanner.nextLine();
                    user.setName(newName);
                    break;
                case 2:
                    System.out.print("Enter a new surname: ");
                    String newSurname = scanner.nextLine();
                    user.setSurname(newSurname);
                    break;
                case 3:
                    System.out.print("Enter a new age: ");
                    int newAge = scanner.nextInt();
                    user.setAge(newAge);
                    break;
                default:
                    System.out.println("Wrong choice.");
            }
        }
        else {
            System.out.println("User with this ID was not found.");
        }
    }
}
