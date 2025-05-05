class RekeningBank {

    String nomorRekening;
    String namaPemilik;
    double saldo;


    RekeningBank(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    void tampilkanInfo() {
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: Rp" + saldo);
        System.out.println();
    }

    void setorUang(double jumlah) {
        saldo += jumlah;
        System.out.println(namaPemilik + " menyetor Rp" + jumlah + ". Saldo sekarang: Rp" + saldo);
    }

    void tarikUang(double jumlah) {
        if (jumlah > saldo) {
            System.out.println(namaPemilik + " menarik Rp" + jumlah + ". (Gagal, Saldo tidak mencukupi) Saldo saat ini: Rp" + saldo);
        } else {
            saldo -= jumlah;
            System.out.println(namaPemilik + " menarik Rp" + jumlah + ". (Berhasil) Saldo sekarang: Rp" + saldo);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        RekeningBank rekening1 = new RekeningBank("202310730311129", "Maharani", 500000);
        RekeningBank rekening2 = new RekeningBank("202310730311307", "Amelia", 1000000);

        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        rekening1.setorUang(200000);
        rekening2.setorUang(500000);
        System.out.println();

        rekening1.tarikUang(800000); // Gagal
        rekening2.tarikUang(300000); // Berhasil
        System.out.println();

        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();
    }
}