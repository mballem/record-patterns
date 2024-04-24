package com.mballem.calc;

public record CompoundInterest(double principal, double rate, int time) implements Interest {

}