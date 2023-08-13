import java.util.*;

class array {
    public static void main(String[] args) {
        int i;
        int[] arr = new int[10];
        System.out.print("Enter element:");
        Scanner sc = new Scanner(System.in);
        for (i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Diplay element:");
        for (i = 0; i < 5; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}