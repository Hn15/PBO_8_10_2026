public class Data_Mhs {
    public String nama, nim, jurusan;

    public void tampilkanData(){
        System.out.println("Nama Mahasiswa     : "+nama);
        System.out.println("NIM Mahasiswa      : "+nim);
        System.out.println("Jurusan Mahasiswa  : "+jurusan);
    }
    //mengisi nama, nim, jurusan   
    public void isiData(String nama, String nim, String jurusan){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }
}