package com.users_project_1;

import java.util.ArrayList;

public class UserManager {
    ArrayList<User> users;

    public UserManager() {
        users = new ArrayList<>();
    }

    //Add user
    public void addUser(User user) {
        boolean userExist = users.contains(user); //If exist this user
            if (userExist) {
                System.out.println("User with id: " + user.id + " already exists in the list");
            }
            else users.add(user);
    }

    //Delete user
    public void removeUser(int id) {

    }

    //Search user
    public User findUser(int id) {
        return null;
    }

    //Demonstrate all users
    public void listUsers() {

    }


    public void printUsers() {
        for (User user : users) {
            System.out.println(user); // Это автоматически вызовет user.toString()
        }
    }

}
