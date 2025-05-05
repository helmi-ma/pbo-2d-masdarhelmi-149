class Mahasiswa {
    private final String nama = "MASDAR HELMI";
    private final long nim = 202410370110149L;

    public boolean login(String inputNama, long inputNim) {
        return inputNama.equals(nama) && inputNim == nim;
    }

    public void tampilanInfo() {
        System.out.println("Login Mahasiswa Berhasil!");
        System.out.println("Nama: " + nama);
        System.out.println("NIM : " + nim);
    }
}