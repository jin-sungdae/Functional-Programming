package org.example.optional;

import org.example.optional.model.User;

import java.util.Optional;

public class OptionalEx {
    public static void main(String[] args) {
        User user1 = new User()
                .setId(1001)
                .setName("Alice")
                .setVerified(false);
        User user2 = new User()
                .setId(1001)
                .setName("Alice")
                .setVerified(false)
                .setEmailAddress("alice@fastcampus.co.kr");

        System.out.println("Same?  : " + userEquals(user2, user1));

        String someEmail = "some@email.com";
        String nullEmail = null;

        Optional<String> maybeEmail = Optional.of(someEmail);
        Optional<String> maybeEmail2 = Optional.empty();
        Optional<String> maybeEmail3 = Optional.ofNullable(someEmail);
        Optional<String> maybeEmail4 = Optional.ofNullable(nullEmail);

        String email = maybeEmail.get();
        System.out.println(email);
        if (maybeEmail2.isPresent()) {
            String email2 = maybeEmail2.get();
            System.out.println(email2);
        }
        String defaultEmail = "default@Email.com";
        String email3 = maybeEmail2.orElse(defaultEmail);
        System.out.println(email3);
        String email4 = maybeEmail2.orElseGet(() -> defaultEmail);
        System.out.println(email4);
        String email5 = maybeEmail2.orElseThrow(() -> new RuntimeException("email not present"));

    }

    public static boolean userEquals(User u1, User u2) {
        return u1.getId() == u2.getId()
                && u1.getName().equals(u2.getName())
                && u1.getEmailAddress().equals(u2.getEmailAddress())
                && u1.isVerified() == u2.isVerified();
    }
}
