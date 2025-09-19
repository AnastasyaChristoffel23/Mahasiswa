import java.util.Scanner;

public class Mahasiswa  {
    String nama;
    String nim;
    String jurusan;

    // Constructor
    public Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    // Method untuk menampilkan data mahasiswa
    public void tampilkanData() {
        System.out.println("Nama     : " + nama);
        System.out.println("NIM      : " + nim);
        System.out.println("Jurusan  : " + jurusan);
        System.out.println("-------------------------");
    }

    // Main program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array untuk menampung 7 mahasiswa
        Mahasiswa[] daftarMhs = new Mahasiswa[7];

        // Input data mahasiswa
        for (int i = 0; i < daftarMhs.length; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));

            System.out.print("Nama     : ");
            String nama = input.nextLine();

            System.out.print("NIM      : ");
            String nim = input.nextLine();

            System.out.print("Jurusan  : ");
            String jurusan = input.nextLine();

            // Simpan ke array
            daftarMhs[i] = new Mahasiswa(nama, nim, jurusan);

            System.out.println();
        }

        // Tampilkan semua data mahasiswa
        System.out.println("===== DATA MAHASISWA =====");
        for (Mahasiswa m : daftarMhs) {
            m.tampilkanData();
        }

        input.close();
    }
}