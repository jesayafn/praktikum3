import java.util.Arrays;
import java.util.Scanner;

class BinarySearch {
    public static void main(String[] args) {
        // Mendefinisikan data array (data harus sudah diurutkan)
        int[] data = {3,10,20,47,66};

        // Meminta pengguna memasukkan angka yang akan dicari
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka yang ingin dicari: ");
        int target = scanner.nextInt();

        // Memanggil metode binarySearch untuk mencari angka
        int result = binarySearch(data, target);

        // Menampilkan hasil pencarian
        if (result == -1) {
            System.out.println("Angka tidak ditemukan dalam data.");
        } else {
            System.out.println("Angka ditemukan di indeks: " + result);
        }
    }

    // Metode untuk binary search
    public static int binarySearch(int[] data, int target) {
        int left = 0;
        int right = data.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Jika angka target ditemukan di tengah
            if (data[mid] == target) {
                return mid;
            }

            // Jika angka target kurang dari elemen tengah, cari di setengah kiri
            if (target < data[mid]) {
                right = mid - 1;
            }
            // Jika angka target lebih besar dari elemen tengah, cari di setengah kanan
            else {
                left = mid + 1;
            }
        }

        // Jika angka tidak ditemukan, kembalikan -1
        return -1;
    }
}
