package org.example.stream;

import org.example.stream.model.User;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterEx {
    public static void main(String[] args) {
        Stream<Integer> numberStream = Stream.of(3, -5, 7, 10, -3);
        Stream<Integer> filteredNumberStream = numberStream.filter(x -> x > 0);
        List<Integer> filteredNumbers = filteredNumberStream.collect(Collectors.toList());
        System.out.println(filteredNumbers);

        List<Integer> newFilteredNumbers = Stream.of(3, -5, 7, 10, -3)
                .filter(x -> x > 0)
                .collect(Collectors.toList());
        System.out.println(newFilteredNumbers);

        User user1 = new User()
                .setId(101)
                .setName("Alice")
                .setVerified(true)
                .setEmailAddress("alice@fastcampus.co.kr");
        User user2 = new User()
                .setId(102)
                .setName("Bob")
                .setVerified(false)
                .setEmailAddress("bob@fastcampus.co.kr");
        User user3 = new User()
                .setId(103)
                .setName("Charlie")
                .setVerified(false)
                .setEmailAddress("Charlie@fastcampus.co.kr");
        List<User> users = Arrays.asList(user1, user2, user3);
        List<User> verifiedUsers = users.stream()
                .filter(User::isVerified)
                .collect(Collectors.toList());
        System.out.println(verifiedUsers);

        List<User> unverifiedUsers = users.stream()
                .filter(user -> !user.isVerified())
                .collect(Collectors.toList());
        System.out.println(unverifiedUsers);
    }
}

