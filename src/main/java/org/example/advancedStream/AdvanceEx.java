package org.example.advancedStream;

import org.example.stream.model.User;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class AdvanceEx {
    public static void main(String[] args) {
        Optional<Integer> max = Stream.of(5,3,6,2,1)
                .max(Integer::compareTo);
        System.out.println(max.get());
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
        User firstUser = users.stream()
                .min((u1, u2) -> u1.getName().compareTo(u2.getName()))
                .get();
        System.out.println(firstUser);

        long positiveIntegerCount = Stream.of(1, -4, 5, -3, 6)
                .filter(x -> x > 0)
                .count();
        System.out.println(positiveIntegerCount);
    }
}
