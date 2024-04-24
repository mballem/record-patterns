package com.mballem.calc;

public record SimpleInterest(double principal, double rate, int time) implements Interest {

}
