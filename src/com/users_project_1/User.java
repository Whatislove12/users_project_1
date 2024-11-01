package com.users_project_1;

import java.util.Objects;

public class User {
    private static int lastId = 0; // Статическая переменная для хранения последнего ID
    private int id;
    private String name;
    private String surname;
    private int age;

    //КОНСТРУКТОР
    User (String n, String sn, int ag) {
        this.id = ++lastId;
        this.name = n;
        this.surname = sn;
        this.age = ag;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return this.id;
    }

    //ПРОВЕРКА при добавлении нового объекта на условие его существования (в частности его ID) в массиве
    @Override //переопределение метода
    public boolean equals(Object obj) {
        if (this == obj) return true; //если ссылки равны. Obj - объект сравнения, тот что планируется добавить, а this - каждый объект, находящийсяя уже в массиве
        if (obj == null || this.getClass() != obj.getClass()) return false; //идет проверка что оба класса соответствуют. Операция user.getClass выводит что-то типа "class com.users_project_1.User"

        User user = (User) obj; //Нужно привести obj к типу User для того чтобы обращаться к специфичным полям и методам. Это похоже на то когда мы использовали (double) weight / height, или же не сильно похоже, но явно нужно для приведения и использования доп методов и для безопасности...
        return this.id == user.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    //ВЫВОД на экран
    @Override
    public String toString() {
        return "ID: " + id + "; Name: " + name + "; Surname: " + surname + "; Age: " + age + ";";
    }
}
