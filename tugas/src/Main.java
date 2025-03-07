import java.util.Scanner; // Mengimpor class Scanner untuk menerima input dari pengguna sama konsepnya dengan

public class Main { // Mendeklarasikan class utama
    public static void main(String[] args) { // method utama
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk input

        System.out.println("Pilih login:"); // Menampilkan menu pilihan login
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan: ");
        int pilihan = scanner.nextInt(); // Membaca input pilihan pengguna
        scanner.nextLine(); // Membersihkan buffer input

        if (pilihan == 1) { // Jika pengguna memilih 1 (Admin)
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine(); // Membaca input username
            System.out.print("Masukkan password: ");
            String password = scanner.nextLine(); // Membaca input password

            if (username.equals("Admin149") && password.equals("Password149")) { // login Admin
                System.out.println("Login Admin berhasil!");
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }
        } else if (pilihan == 2) { // Jika pengguna memilih 2 (Mahasiswa)
            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine(); // Membaca input nama
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine(); // Membaca input NIM

            if (nama.equals("helmi") && nim.equals("149")) { // login Mahasiswa
                System.out.println("Login Mahasiswa berhasil!");
                System.out.println("Nama: " + nama);
                System.out.println("NIM: " + nim);
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }
        } else {
            System.out.println("Pilihan tidak valid."); // Jika pilihan bukan 1 atau 2
        }

        scanner.close(); // Menutup Scanner untuk mencegah kebocoran sumber daya
    }
}