public class PersegiPanjang {
    double panjang, lebar;

    //fungsi hitung luas
    double hitungLuas(){
        return panjang * lebar;
    }

    //fungsi hitungKeliling
    double hitungKeliling(){
        return 2 * (panjang + lebar);
    }

    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang();
        pp.panjang = 10;
        pp.lebar = 5;

        System.out.println("Luas Persegi Panjang: " + pp.hitungLuas());
        System.out.println("Keliling Persegi Panjang: " + pp.hitungKeliling());
    }
}