package LatihanObjClass2;
public class datamhs {
    public String nama, nim, jurusan;

    public void tampilkanData(){
        System.out.println("Nama Mahasiswa     : "+nama);
        System.out.println("NIM Mahasiswa      : "+nim);
        System.out.println("Jurusan Mahasiswa  : "+jurusan);
    }
    public static void main(String[] args) {
        datamhs mhs = new datamhs();
        mhs.nama = "Adalah Pokoknya";
        mhs.nim = "991273645";
        mhs.jurusan = "Komputer Sains";

        mhs.tampilkanData();
    }
}