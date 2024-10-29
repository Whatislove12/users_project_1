package com.users_project_1;

import java.util.Objects;

public class User {
    int id;
    String name;
    String surname;
    int age;

    User (int id, String n, String sn, int ag) {
        this.id = id;
        this.name = n;
        this.surname = sn;
        this.age = ag;
    }

    @Override //переопределение метода
    public boolean equals(Object obj) {
        if (this == obj) return true; //если ссылки равны. Obj - объект сравнения, тот что планируется добавить, а this - каждый объект, находящийсяя уже в массиве
        if (obj == null || this.getClass() != obj.getClass()) return false; //идет проверка что оба оба класса соответствуют. Операция user.getClass выводит что-то типа "class com.users_project_1.User"

        User user = (User) obj; //Нужно привести obj к типу User для того чтобы обращаться к специфичным полям и методам. Это похоже на то когда мы использовали (double) weight / height, или же не сильно похоже, но явно нужно для приведения и использования доп методов и для безопасности...
        return this.id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "ID: " + id + "; Name: " + name + "; Surname: " + surname + "; Age: " + age + ";";
    }
}
