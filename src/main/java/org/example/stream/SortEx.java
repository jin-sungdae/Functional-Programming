package org.example.stream;

import org.example.stream.model.Order;
import org.example.stream.model.User;

import java.time.LocalDateTime;
import java.time.ZoneId;
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

        LocalDateTime now = LocalDateTime.now(ZoneId.of("Asia/Seoul"));
        Order order1 = new Order()
                .setId(1001)
                .setStatus(Order.OrderStatus.CRETED)
                .setCreatedAt(now.minusHours(4))
                .setCreatedByUserId(101);
        Order order2 = new Order()
                .setId(1002)
                .setStatus(Order.OrderStatus.ERROR)
                .setCreatedAt(now.minusHours(1))
                .setCreatedByUserId(103);
        Order order3 = new Order()
                .setId(1003)
                .setStatus(Order.OrderStatus.PROCESSED)
                .setCreatedAt(now.minusHours(36))
                .setCreatedByUserId(102);
        Order order4 = new Order()
                .setId(1004)
                .setStatus(Order.OrderStatus.ERROR)
                .setCreatedAt(now.minusHours(15))
                .setCreatedByUserId(104);
        Order order5 = new Order()
                .setId(1005)
                .setStatus(Order.OrderStatus.IN_PROGRESS)
                .setCreatedAt(now.minusHours(10))
                .setCreatedByUserId(101);

        List<Order> orders = Arrays.asList(order1, order2, order3, order4, order5);

        List<Order> sortedOrders = orders
                .stream()
                .sorted((u1, u2) -> u1.getCreatedAt().compareTo(u2.getCreatedAt()))
                .collect(Collectors.toList());
        System.out.println(sortedOrders);
    }
}
