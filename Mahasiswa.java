public class Mahasiswa implements PesertaKelas {
    private String nim;
    private double ipk;
    private int golUkt;

    @Override
    public void masukKelas() {
        // implementation
    }

    @Override
    public String getNama() {
        return "Nama Mahasiswa";
    }

    @Override
    public int getUmur() {
        return 20;
    }

    // Method khusus untuk Mahasiswa
    public void belajar() {
        // implementation
    }
}
