/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kesmenapp.model;

/**
 *
 * @author Dimas Haafizh Rahman
 */
public class TesMahasiswa {
    private int idTes;
    private Mahasiswa mahasiswa;
    private int p1;
    private int p2;
    private int p3;
    private int p4;
    private int p5;
    private int p6;
    private int p7;
    private int p8;
    private int p9;
    private int nilaiAkhir;
    private String status;

    
    public int getIdTes() {
        return idTes;
    }

    public void setIdTes(int idTes) {
        this.idTes = idTes;
    }
    
    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa (Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }
    
    public int getP1() {
        return p1;
    }

    public void setP1(int p1) {
        this.p1 = p1;
    }
    
    public int getP2() {
        return p2;
    }

    public void setP2(int p2) {
        this.p2 = p2;
    }
    
    public int getP3() {
        return p3;
    }

    public void setP3(int p3) {
        this.p3 = p3;
    }
    
    public int getP4() {
        return p4;
    }

    public void setP4(int p4) {
        this.p4 = p4;
    }
    
    public int getP5() {
        return p5;
    }

    public void setP5(int p5) {
        this.p5 = p5;
    }
    
    public int getP6() {
        return p6;
    }

    public void setP6(int p6) {
        this.p6 = p6;
    }
    
    public int getP7() {
        return p7;
    }

    public void setP7(int p7) {
        this.p7 = p7;
    }
    
    public int getP8() {
        return p8;
    }

    public void setP8(int p8) {
        this.p8 = p8;
    }
    
    public int getP9() {
        return p9;
    }

    public void setP9(int p9) {
        this.p9 = p9;
    }
    
    public int getNilaiAkhir() {
        return nilaiAkhir;
    }

    public void setNilaiAkhir(int nilaiAkhir) {
        this.nilaiAkhir = nilaiAkhir;
    }
    
    public void calculateNilaiAkhir() {
        this.nilaiAkhir = getP1() + getP2() + getP3() + 
            getP4() + getP5() + getP6() + 
            getP7() + getP8() + getP9();
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public void defineStatus(int nilaiAkhir){
        if (nilaiAkhir < 4){
            setStatus("Tidak Depresi");
        } else if (nilaiAkhir > 4 && nilaiAkhir < 10){
            setStatus("Gejala Ringan");
        } else if (nilaiAkhir > 9 && nilaiAkhir < 15){
            setStatus("Depresi Ringan");
        } else if (nilaiAkhir > 14 && nilaiAkhir < 20){
            setStatus("Depresi Sedang");
        } else{
            setStatus("Depresi Berat");
        }
    }
}