package org.example.stream;

import org.example.stream.model.User;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortEx {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, -5, 7, 4);
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedNumbers);

        User user1 = new User()
                .setId(101)
                .setName("Bob")
                .setVerified(true)
                .setEmailAddress("alice@fastcampus.co.kr");
        User user2 = new User()
                .setId(102)
                .setName("Charlie")
                .setVerified(false)
                .setEmailAddress("bob@fastcampus.co.kr");
        User user3 = new User()
                .setId(103)
                .setName("Alice")
                .setVerified(false)
                .setEmailAddress("Charlie@fastcampus.co.kr");

        List<User> users = Arrays.asList(user1, user2, user3);
        List<User> sortedUsers = users.stream()
                .sorted((u1, u2) -> u1.getName().compareTo(u2.getName()))
                .collect(Collectors.toList());
        System.out.println(sortedUsers );
    }
}
