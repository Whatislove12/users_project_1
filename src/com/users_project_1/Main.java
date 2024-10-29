package com.users_project_1;

public class Main {
    public static void main(String[] args) {
        User vlad = new User(1, "Vlad", "Podymskiy", 27);


        UserManager userManager = new UserManager();

        // Создаем пользователей
        User user1 = new User(2, "Иван", "Иванов", 25);
        User user2 = new User(3, "Петр", "Петров", 30);
        User user3 = new User(2, "Иван", "Иванов", 25); // Тот же, что и user1 для проверки на дубликаты

        // Добавляем пользователей
        userManager.addUser(user1);
        userManager.addUser(user2);
        userManager.addUser(user3); // Это должно вывести сообщение о существующем пользователе

        // Проверяем пользователей (если есть метод для вывода информации)
        userManager.printUsers();
    }
}