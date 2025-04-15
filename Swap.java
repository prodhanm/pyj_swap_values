import java.util.Scanner;

public class Swap {
    public static int[] swap(int a, int b) {
        int temp; 
        temp = a;
        a = b;
        b = temp;
        return new int[]{a, b};
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the first value: ");
        int a = inp.nextInt();
        System.out.print("Enter the second value: ");
        int b = inp.nextInt();
        int[] swappedValues = swap(a, b);
        System.out.println("After swapping: a = " + swappedValues[0] + ", b = " + swappedValues[1]);
        inp.close();
    }
}