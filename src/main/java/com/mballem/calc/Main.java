package com.mballem.calc;

public class Main {

    public static void main(String[] args) {
        var res1 = calculate(new SimpleInterest(1000.0, 3.5, 2));
        System.out.println(res1);

        var res2 = calculate(new CompoundInterest(580.0, 5.5, 3));
        System.out.println(res2);
    }

    static Object calculate(Interest interest) {
        return switch(interest) {
            case SimpleInterest(var p, var r, var t) -> p * r * t / 100;

            case CompoundInterest(var p, var r, var t) -> p * Math.pow(1 + r / 100, t) - p;

            default -> "Invalid interest type.";
        };
    }
}
