import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter length of the array");
        int length = scanner.nextInt();

        // Create an array of the specified length
        int[] array = new int[length];

        //Enter elements of the array
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Array elements:");
        for (int i = 0; i < length; i++) {
            System.out.println(array[i]);
        }


        System.out.println("Sum of numbers: " + sum(array));

    }
    public static int sum(int[] array) {
        int sum = 0;
        for (int number : array) {
            if (number > 0) {
                sum += number;
            }
        }
        return sum;
    }
}