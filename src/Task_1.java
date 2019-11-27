public class Task_1 {
    public static void main(String[] args) {

        double x = functionxt(0) + functionyt(0) * 0.5;
        System.out.println("xEuler: " + x);
        double xt = functionxt(0.5);
        System.out.println("True value: " + xt);
        double et = 100 * ((x - xt) / xt);
        System.out.printf("Global error: %.2f%s\n", et, '%');
        double etl = 100 * ((x - xt) / xt);
        System.out.printf("Local error: %.2f%s\n", etl, '%');

        double x1 = x + functionyt(0.5) * 0.5;
        System.out.println("\nxEuler: " + x1);
        double x1t = functionxt(1);
        System.out.println("True value: " + x1t);
        et = 100 * ((x1 - x1t) / x1t);
        System.out.printf("Global error: %.2f%s\n", et, '%');
        etl = 100 * (x1 - x1t - (x - xt)) / x1t;
        System.out.printf("Local error: %.2f%s\n", etl, '%');


        double x2 = x1 + functionyt(1) * 0.5;
        System.out.println("\nxEuler: " + x2);
        double x2t = functionxt(1.5);
        System.out.println("True value: " + x2t);
        et = 100 * ((x2 - x2t) / x2t);
        System.out.printf("Global error: %.2f%s\n", et, '%');
        etl = 100 * (x2 - x2t - (x1 - x1t)) / x2t;
        System.out.printf("Local error: %.2f%s\n", etl, '%');

        double x3 = x2 + functionyt(1.5) * 0.5;
        System.out.println("\nxEuler: " + x3);
        double x3t = functionxt(2);
        System.out.println("True value: " + x3t);
        et = 100 * ((x3 - x3t) / x3t);
        System.out.printf("Global error: %.2f%s\n", et, '%');
        etl = Math.abs(100 * (x3 - x3t - (x2 - x2t)) / x3t);
        System.out.printf("Local error: %.2f%s\n", etl, '%');

        double x4 = x3 + functionyt(2) * 0.5;
        System.out.println("\nxEuler: " + x4);
        double x4t = functionxt(2.5);
        System.out.println("True value: " + x4t);
        et = 100 * ((x4 - x4t) / x4t);
        System.out.printf("Global error: %.2f%s\n", et, '%');
        etl = Math.abs(100 * (x4 - x4t - (x3 - x3t)) / x4t);
        System.out.printf("Local error: %.2f%s\n", etl, '%');

        double x5 = x4 + functionyt(2.5) * 0.5;
        System.out.println("\nxEuler: " + x5);
        double x5t = functionxt(3);
        System.out.println("True value: " + x5t);
        et = 100 * ((x5 - x5t) / x5t);
        System.out.printf("Global error: %.2f%s\n", et, '%');
        etl = Math.abs(100 * (x5 - x5t - (x4 - x4t)) / x5t);
        System.out.printf("Local error: %.2f%s\n", etl, '%');

        double x6 = x5 + functionyt(3) * 0.5;
        System.out.println("\nxEuler: " + x6);
        double x6t = functionxt(3.5);
        System.out.println("True value: " + x6t);
        et = 100 * ((x6 - x6t) / x6t);
        System.out.printf("Global error: %.2f%s\n", et, '%');
        etl = 100 * (x6 - x6t - (x5 - x5t)) / x6t;
        System.out.printf("Local error: %.2f%s\n", etl, '%');

        double x7 = x6 + functionyt(3.5) * 0.5;
        System.out.println("\nxEuler: " + x7);
        double x7t = functionxt(4);
        System.out.println("True value: " + x7t);
        et = 100 * ((x7 - x7t) / x7t);
        System.out.printf("Global error: %.2f%s\n", et, '%');
        etl = 100 * (x7 - x7t - (x6 - x6t)) / x7t;
        System.out.printf("Local error: %.2f%s\n", etl, '%');


//        double x = functionxt(0) + functionyt(0) * 0.25;
//        System.out.println("xEuler: " + x);
//        double xt = functionxt(0.5);
//        System.out.println("True value: " + xt);
//        double et = 100 * ((x - xt) / xt);
//        System.out.printf("Global error: %.2f%s\n", et, '%');
//        double etl = 100 * ((x - xt) / xt);
//        System.out.printf("Local error: %.2f%s\n", etl, '%');
//
//        double x1 = x + functionyt(0.5) * 0.25;
//        System.out.println("\nxEuler: " + x1);
//        double x1t = functionxt(1);
//        System.out.println("True value: " + x1t);
//        et = 100 * ((x1 - x1t) / x1t);
//        System.out.printf("Global error: %.2f%s\n", et, '%');
//        etl = 100 * (x1 - x1t - (x - xt)) / x1t;
//        System.out.printf("Local error: %.2f%s\n", etl, '%');
//
//
//        double x2 = x1 + functionyt(1) * 0.25;
//        System.out.println("\nxEuler: " + x2);
//        double x2t = functionxt(1.5);
//        System.out.println("True value: " + x2t);
//        et = 100 * ((x2 - x2t) / x2t);
//        System.out.printf("Global error: %.2f%s\n", et, '%');
//        etl = 100 * (x2 - x2t - (x1 - x1t)) / x2t;
//        System.out.printf("Local error: %.2f%s\n", etl, '%');
//
//        double x3 = x2 + functionyt(1.5) * 0.25;
//        System.out.println("\nxEuler: " + x3);
//        double x3t = functionxt(2);
//        System.out.println("True value: " + x3t);
//        et = 100 * ((x3 - x3t) / x3t);
//        System.out.printf("Global error: %.2f%s\n", et, '%');
//        etl = Math.abs(100 * (x3 - x3t - (x2 - x2t)) / x3t);
//        System.out.printf("Local error: %.2f%s\n", etl, '%');
//
//        double x4 = x3 + functionyt(2) * 0.25;
//        System.out.println("\nxEuler: " + x4);
//        double x4t = functionxt(2.5);
//        System.out.println("True value: " + x4t);
//        et = 100 * ((x4 - x4t) / x4t);
//        System.out.printf("Global error: %.2f%s\n", et, '%');
//        etl = Math.abs(100 * (x4 - x4t - (x3 - x3t)) / x4t);
//        System.out.printf("Local error: %.2f%s\n", etl, '%');
//
//        double x5 = x4 + functionyt(2.5) * 0.25;
//        System.out.println("\nxEuler: " + x5);
//        double x5t = functionxt(3);
//        System.out.println("True value: " + x5t);
//        et = 100 * ((x5 - x5t) / x5t);
//        System.out.printf("Global error: %.2f%s\n", et, '%');
//        etl = Math.abs(100 * (x5 - x5t - (x4 - x4t)) / x5t);
//        System.out.printf("Local error: %.2f%s\n", etl, '%');
//
//        double x6 = x5 + functionyt(3) * 0.25;
//        System.out.println("\nxEuler: " + x6);
//        double x6t = functionxt(3.5);
//        System.out.println("True value: " + x6t);
//        et = 100 * ((x6 - x6t) / x6t);
//        System.out.printf("Global error: %.2f%s\n", et, '%');
//        etl = 100 * (x6 - x6t - (x5 - x5t)) / x6t;
//        System.out.printf("Local error: %.2f%s\n", etl, '%');
//
//        double x7 = x6 + functionyt(3.5) * 0.25;
//        System.out.println("\nxEuler: " + x7);
//        double x7t = functionxt(4);
//        System.out.println("True value: " + x7t);
//        et = 100 * ((x7 - x7t) / x7t);
//        System.out.printf("Global error: %.2f%s\n", et, '%');
//        etl = 100 * (x7 - x7t - (x6 - x6t)) / x7t;
//        System.out.printf("Local error: %.2f%s\n", etl, '%');

    }//end of main

    public static double functionxt(double x) {
        double xt = -0.5 * Math.pow(x, 4) + 4 * Math.pow(x, 3) - 10 * Math.pow(x, 2) + 8.5 * x + 1;
        return xt;
    }//end of functionxt

    public static double functionyt(double x) {
        double yt = -2 * Math.pow(x, 3) + 12 * Math.pow(x, 2) - 20 * x + 8.5;
        return yt;
    }

}//end of class
