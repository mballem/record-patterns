package com.mballem.desconstrutor;

public record Vehicle(String brand, String model, String licensePlate) {

}

class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Honda", "Fit 1.4", "JAV-1621");

        if(vehicle instanceof Vehicle(String brand, String model, String licensePlate)) {
            System.out.println(brand + " - " + model + ": " + licensePlate);
        }

        if(vehicle instanceof Vehicle(var marca, var modelo, var placa)) {
            System.out.println(marca + " - " + modelo + ": " + placa);
        }
    }
}

