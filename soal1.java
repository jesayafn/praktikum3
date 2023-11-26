import java.util.Scanner;

class SequentialSearch {
    public static void main(String[] args) {
        // Mendefinisikan data array
        int[] data = {9,10,89,100,5};

        // Meminta pengguna memasukkan angka yang akan dicari
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka yang ingin dicari: ");
        int target = scanner.nextInt();

        // Memanggil metode sequentialSearch untuk mencari angka
        int result = sequentialSearch(data, target);
    
        // Menampilkan hasil pencarian
        if (result == -1) {
            System.out.println("Angka tidak ditemukan dalam data.");
        } else {
            System.out.println("Angka ditemukan di indeks: " + result);
        }
    }

    // Metode untuk sequential search
    public static int sequentialSearch(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            // Jika angka ditemukan, kembalikan indeksnya
            if (data[i] == target) {
                return i;
            }
        }
        // Jika angka tidak ditemukan, kembalikan -1
        return -1;
    }
}
