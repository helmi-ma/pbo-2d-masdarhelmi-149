class KarakterGame {
    private String nama;
    private int kesehatan;

    public KarakterGame(String nama, int kesehatan) {
        this.nama = nama;
        this.kesehatan = kesehatan;
    }

    public String getNama() {
        return nama;
    }

    public int getKesehatan() {
        return kesehatan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKesehatan(int kesehatan) {
        this.kesehatan = kesehatan;
    }

    public void serang(KarakterGame target) {
        System.out.println(this.nama + " menyerang " + target.getNama());
    }

    public void status() {
        System.out.println(nama + " Memiliki Kesehatan: " + kesehatan);
    }
}

class Pahlawan extends KarakterGame {
    public Pahlawan(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    @Override
    public void serang(KarakterGame target) {
        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan pedang!");
        target.setKesehatan(target.getKesehatan() - 20);
        System.out.println(target.getNama() + " sekarang memiliki " + target.getKesehatan() + " kesehatan.");
    }

    @Override
    public void status() {
        System.out.println(getNama() + " Memiliki Kesehatan: " + getKesehatan());
    }
}

class Musuh extends KarakterGame {
    public Musuh(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    @Override
    public void serang(KarakterGame target) {
        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan sihir!");
        target.setKesehatan(target.getKesehatan() - 15);
        System.out.println(target.getNama() + " sekarang memiliki " + target.getKesehatan() + " kesehatan.");
    }

    @Override
    public void status() {
        System.out.println(getNama() + " Memiliki Kesehatan: " + getKesehatan());
    }
}

public class Main {
    public static void main(String[] args) {
        Pahlawan pahlawanObj = new Pahlawan("Alucart", 150);
        Musuh musuhObj = new Musuh("Lord", 200);

        pahlawanObj.status();
        musuhObj.status();

        pahlawanObj.serang(musuhObj); // Pahlawan menyerang musuh
        musuhObj.serang(pahlawanObj); // Musuh menyerang pahlawan

        pahlawanObj.status();
        musuhObj.status();
    }
}