package com.example.tassa.calculator4;

/**
 * Created by Lenovo on 10/10/2016.
 */
public class HitungCalculator {

    private double angka;
    private double waitAngka;
    private String operator;
    public static final String ADD = "+";
    public static final String SUBTRACT = "-";
    public static final String MULTIPLY = "x";
    public static final String DIVIDE = ":";

    public static final String CLEAR = "CC";
    public static final String SQUAREROOT = "√";
    public static final String SQUARED = "x²";

    public HitungCalculator() {
        // initialize variables upon start
        angka = 0;
        waitAngka = 0;
        operator = "";

    }

    public void setOperand(double angka_tmp) {
        angka = angka_tmp;
    }

    public double getResult() {
        return angka;
    }
    public String toString() {
        return Double.toString(angka);
    }

    protected double performOperation(String operator_tmp) {

        switch (operator_tmp) {
            case CLEAR:
               angka = 0;
                operator = "";
                waitAngka = 0;
                break;
            case SQUAREROOT:
               angka = Math.sqrt(angka);
                break;
            case SQUARED:
                angka = angka * angka;
                break;
            default:
                kalkulasi();
                operator = operator_tmp;
                waitAngka = angka;
                break;
        }

        return angka;
    }
    protected void kalkulasi() {

        switch (operator) {
            case ADD:
                angka = waitAngka +angka;
                break;
            case SUBTRACT:
                angka = waitAngka - angka;
                break;
            case MULTIPLY:
               angka = waitAngka * angka;
                break;
            case DIVIDE:
                if (angka != 0) {
                    angka = waitAngka / angka;
                }
                break;
        }

    }

}




