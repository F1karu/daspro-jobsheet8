import java.util.Scanner;

public class Tugas202 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("input n: ");
        int n = input.nextInt();

        int jumlah = 0;
        int lebar = String.valueOf(n * n).length() + 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int hasil = i * j;
                System.out.printf("%" + lebar + "d", hasil);
                jumlah += hasil;
            }
            System.out.println();
        }

        System.out.println("Jumlah seluruh angka: " + jumlah);
        input.close();
    }
}
