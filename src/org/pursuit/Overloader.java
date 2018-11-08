package org.pursuit;

public class Overloader {


//            * `doubleDivision`, which accepts two
// parameters of type `int`, stores both parameters as
// `double` values, divides the first parameter by the
// second parameter, and returns the result as a `double` value


    private double doubleDivision(int a, int b) {
        double num1 = a;
        double num2 = b;

        double result = num1 / num2;

        return result;
    }
//* `doubleDivision`, which accepts one parameter of type
// `int` and another parameter of type `double`, stores both
// parameters as `double` values, divides the first parameter by
// the second parameter, and returns the result as a `double` value

    private double doubleDivision(int c, double d) {
        double num3 = c;
        double num4 = d;

        double result = num3 / num4;

        return result;
    }


//* `doubleDivision`, which accepts one parameter of type `double`
// and another parameter of type `int`, stores both parameters as
// `double` values, divides the first parameter by the second
// parameter, and returns the result as a `double` value

    private double doubleDivision(double e, int f) {
        double num5 = e;
        double num6 = f;

        double result = num5 / num6;

        return result;
    }


//* `doubleDivision`, which accepts two parameters
// of type `double`, stores both parameters as `double`
// values, divides the first parameter by the second parameter,
// and returns the result as a `double` value

    private double doubleDivision(double g, double h) {
        double num7 = g;
        double num8 = h;

        double result = num7 / num8;

        return result;
    }

}
