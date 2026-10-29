import java.util.Scanner;

public class Tugas102 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("input n : ");
        int n = input.nextInt();

        int total = 0;
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(j + " ");
                total++;
                j++;
            }
            System.out.println();
            i++;
        }

        System.out.println("Total yang dicetak: " + total);
        input.close();
    }
}
