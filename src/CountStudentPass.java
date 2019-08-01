import java.util.Scanner;

public class CountStudentPass {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = sc.nextInt();
            if (size > 30) {
                System.out.print("Size does not exceed 20");
            }
        } while (size > 30);

        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter a element: ");
            arr[i] = sc.nextInt();
        }

        int count = 0;
        System.out.print("List of score: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
            if (arr[i] >= 5 && arr[i] <= 10) {
                count++;
            }
        }
        System.out.print("\nNumber of student pass: " + count);
    }
}
