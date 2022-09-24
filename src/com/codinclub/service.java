package com.codinclub;

public class service implements operation{
    @Override
    public float addition(float a, float b) {
        float result = a + b;
        return result;
    }
    @Override
    public float subtracting(float a, float b) {
        float result = a - b;
        return result;
    }
    @Override
    public float multiply(float a, float b) {
        float result = a * b;
        return result;
    }
    @Override
    public float divides(float a, float b) {
        float result = a / b;
        return result;
    }
}
