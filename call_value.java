import java.util.*;

public class call_value {
    public static void printamit() {
        System.out.println("Hello function");

    }

    // write the return word b/c error find
    // public static void main(String args[]) {
    // printamit();// function call

    public static int calculatesum(int num1, int num2) {// parameters or formal parameters
        int sum = num1 + num2;
        return sum;
    }

    public static void swap(int a, int b) {
        // swap
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String args[]) {
        // swap // value exchange
        int a = 5;
        int b = 10;
        swap(a, b);
    }
}
