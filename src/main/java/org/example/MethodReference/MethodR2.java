package org.example.MethodReference;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class MethodR2 {
    public static void main(String[] args) {
        Function<String, Integer> strLength = String::length;
        int length = strLength.apply("hello world");
        System.out.println(length);

        BiPredicate<String, String> strEquals = String::equals;
        boolean helloEqualsWorld = strEquals.test("hell", "world");
        System.out.println(helloEqualsWorld);

        List<User> users = new ArrayList<>();
        users.add(new User(3, "Alice"));
        users.add(new User(1, "Charlie"));
        users.add(new User(5, "Bob"));

        printUserField(users, User::getId);
    }

    public static void printUserField(List<User> users, Function<User, Object> getter) {
        for (User user : users) {
            System.out.println(getter.apply(user));
        }

    }
}

class User {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
