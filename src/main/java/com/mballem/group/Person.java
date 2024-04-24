package com.mballem.group;

public record Person(String firstName, String lastName, int age) {
}

class Main {
    public static void main(String[] args) {
        Person person = new Person("Mario Anselmo", "Pereira", 32);
        System.out.printf("Full Name: %s %s \n", person.firstName(), person.lastName());
        System.out.printf("Age: %d", person.age());
    }
}
