package com.mballem.desconstrutor;

public record Vehicle(String brand, String model, String licensePlate) {}

class Main {
    public static void main(String[] args) {
        com.mballem.group.Person person = new com.mballem.group.Person("Mario Anselmo", "Pereira", 32);
        System.out.printf("Full Name: %s %s \n", person.firstName(), person.lastName());
        System.out.printf("Age: %d", person.age());
    }
}

