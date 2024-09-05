package nilai;

public class Nilai {
    String NIM;
    String Nama;
    int NilaiAbsen;
    int NilaiTugas;
    int NilaiUTS;
    int NilaiUAS;
    
     // Nilai
    public Nilai(String NIM, String Nama, int NilaiAbsen, int NilaiTugas, int 
    NilaiUTS, int NilaiUAS) {
    this.NIM = NIM;
    this.Nama = Nama;
    this.NilaiAbsen = NilaiAbsen;
    this.NilaiTugas = NilaiTugas;
    this.NilaiUTS = NilaiUTS;
    this.NilaiUAS = NilaiUAS;
    }
    // mencetak nilai
    public void CetakNilai() {
    System.out.println("NIM : " + NIM);
    System.out.println("Nama : " + Nama);
    System.out.println("Nilai Absen[10%] : " + NilaiAbsen);
    System.out.println("Nilai Tugas [20%] : " + NilaiTugas);
    System.out.println("Nilai UTS [30%] : " + NilaiUTS);
    System.out.println("Nilai UAS [40%] : " + NilaiUAS);

    // Menghitung nilai akhir (misalnya, rata-rata berbobot)
    double nilaiAkhir = (0.10 * NilaiAbsen) + (0.20 * NilaiTugas) + (0.30 * 
NilaiUTS) + (0.40 * NilaiUAS);
    System.out.println("Nilai Akhir : " + nilaiAkhir);
    

    }
}   


