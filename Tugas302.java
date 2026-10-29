import java.util.Scanner;

public class Tugas302 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input toko: ");
        int jumlahToko = input.nextInt();

        if (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal 1.");
        } else {
            int totalBarangSeluruh = 0;
            int tokoTerbanyak = 0;
            int barangTerbanyak = -1;

            int i = 1;
            while (i <= jumlahToko) {
                System.out.print("Jumlah pelanggan Toko " + i + ": ");
                int jumlahPelanggan = input.nextInt();

                while (jumlahPelanggan < 0) {
                    System.out.println("Jumlah pelanggan tidak boleh negatif");
                    System.out.print("Jumlah pelanggan toko " + i + ": ");
                    jumlahPelanggan = input.nextInt();
                }

                int totalBarangToko = 0;

                for (int j = 1; j <= jumlahPelanggan; j++) {
                    System.out.print(" Barang pelanggan " + j + ": ");
                    int barang = input.nextInt();

                    while (barang < 0) {
                        System.out.println(" Jumlah barang tidak boleh negatif");
                        System.out.print(" Barang pelanggan " + j + ": ");
                        barang = input.nextInt();
                    }

                    totalBarangToko += barang;
                }

                System.out.println("Toko " + i + " - pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangToko);

                totalBarangSeluruh += totalBarangToko;

                if (totalBarangToko > barangTerbanyak) {
                    barangTerbanyak = totalBarangToko;
                    tokoTerbanyak = i;
                }

                i++;
            }

            System.out.println("Total barang seluruhnya: " + totalBarangSeluruh);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        }

        input.close();
    }
}
