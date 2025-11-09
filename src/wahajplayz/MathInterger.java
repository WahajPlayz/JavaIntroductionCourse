package wahajplayz;

public class MathInterger {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;

        //Addition

        int sum = a + b;

        System.out.println("Addition Sum is: " + sum);

        //Subtraction

        int sub = a - b;

        System.out.println("Subtraction Sum is: " + sub);

        //Multiplication

        int muti = a * b;

        System.out.println("Multiplication Sum is: " + muti);

        // Division

        int division = a / b;
        System.out.println("Division Sum is: " + division);

        division = b / a;
        System.out.println("Division Sum is: " + division);

        // No Division By 0
        // division = b / 0;
        // System.out.println("0 Divition is: " + division);

        // Remainder (Moudulo)
        int remainder = 100 % 2;
        System.out.println("Ramainding from 100/2: " + remainder);

        remainder = 100 % 3;
        System.out.println("Ramainding from 100/3: " + remainder);
        remainder = 100 % 4;
        System.out.println("Ramainding from 100/4: " + remainder);

        // Some Math Methods

        System.out.println("Absolute: " + Math.abs(-100));

        System.out.println("Ceiling: " + Math.ceil(1.23));     // Rounding Up
        System.out.println("Rounding: " + Math.round(1.23));   // Rounding
        System.out.println("Floor: " + Math.floor(1.23));      // Rounding Down

        System.out.println("Mininmum: " + Math.min(10, 200));
        System.out.println("Maximum: " + Math.max(100, 10000));
    }
}
