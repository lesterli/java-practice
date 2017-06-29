package lester.github.com.practice;

import java.util.Optional;

/**
 * Created by lyy on 2017/6/28.
 */
public class OptionalDemo {

    public static void main(String[] args) {
        Optional<String> fullName = Optional.ofNullable(null);
        Optional<String> firstName = Optional.of("Lester");

        System.out.println("Full Name is set? " + fullName.isPresent());
        System.out.println("Full Name: " + fullName.orElseGet(() -> "NULL"));
        System.out.println(fullName.map(s -> "Hi " + s + "!").orElse("Hi Stranger!"));

        System.out.println("First Name is set? " + firstName.isPresent());
        System.out.println("First Name " + firstName.orElseGet(() -> "NULL"));
        System.out.println(firstName.map(s -> "Hi " + s + "!").orElse("Hi Stranger!"));
    }

}
