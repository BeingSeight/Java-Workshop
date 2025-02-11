// Jacked array a1[0] a1[1] a1[2] new int from 2 to 4
import java.util.InputMismatchException;
import java.util.Scanner;

public class dJackedArr {

    public static void main(String[] args) {
        int[][] a1 = new int[3][];
        a1[0] = new int[2];
        a1[1] = new int[3];
        a1[2] = new int[4];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[i].length; j++) {
                while (true) {
                    try {
                        a1[i][j] = sc.nextInt();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Please enter a valid integer.");
                        sc.next(); // Clear the invalid input
                    }
                }
            }
        }
        sc.close();
        
        // Print the elements of the jagged array
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[i].length; j++) {
                System.out.print(a1[i][j] + " ");
            }
            System.out.println();
        }
    }
}