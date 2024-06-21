/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kesmenapp.controller;

import java.util.logging.Logger;
import kesmenapp.model.Mahasiswa;
import kesmenapp.model.Session;
import kesmenapp.model.TesMahasiswa;
import kesmenapp.repository.MahasiswaRepository;
import kesmenapp.repository.TesMahasiswaRepository;

/**
 *
 * @author Dimas Haafizh Rahman
 */
public class mahasiswaController {
    private static final Logger logger = Logger.getLogger(mahasiswaController.class.getName());
    
    public void inputTesMahasiswa(int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9){
        try {
            TesMahasiswa tesMahasiswa = new TesMahasiswa();
            TesMahasiswaRepository tesMahasiswaRepository = new TesMahasiswaRepository();
            
            Mahasiswa loggedInMahasiswa = Session.getLoggedInMahasiswa();
            String nim = loggedInMahasiswa.getNim();

            
            // Set data TesMahasiswa
            tesMahasiswa.setMahasiswa(loggedInMahasiswa);
            tesMahasiswa.setP1(p1);
            tesMahasiswa.setP2(p2);
            tesMahasiswa.setP3(p3);
            tesMahasiswa.setP4(p4);
            tesMahasiswa.setP5(p5);
            tesMahasiswa.setP6(p6);
            tesMahasiswa.setP7(p7);
            tesMahasiswa.setP8(p8);
            tesMahasiswa.setP9(p9);

            // Hitung nilai akhir dan status
            tesMahasiswa.calculateNilaiAkhir();
            tesMahasiswa.defineStatus(tesMahasiswa.getNilaiAkhir());

            // Simpan ke database
            tesMahasiswaRepository.insertTesMahasiswa(tesMahasiswa);
        } catch (Exception ex) {
            logger.log(java.util.logging.Level.SEVERE, "Failed to Insert", ex);
            ex.printStackTrace();
        }
    }
    
    public void tampilkanHasilTes(javax.swing.JTextField nilaiAkhirField, 
            javax.swing.JTextField statusField, javax.swing.JTextArea saranTextArea) {
        try {
            // Ambil data mahasiswa yang sedang login
            Mahasiswa loggedInMahasiswa = Session.getLoggedInMahasiswa();
            String nim = loggedInMahasiswa.getNim();
            
            TesMahasiswaRepository tesMahasiswaRepository = new TesMahasiswaRepository();
            TesMahasiswa tesMahasiswa = tesMahasiswaRepository.getTesMahasiswaByNim(nim);
            
            nilaiAkhirField.setText(String.valueOf(tesMahasiswa.getNilaiAkhir()));
            statusField.setText(tesMahasiswa.getStatus());
            saranTextArea.setText(generateSaran(tesMahasiswa.getStatus()));
        } catch (Exception ex) {
            logger.log(java.util.logging.Level.SEVERE, "Failed to display test results", ex);
            ex.printStackTrace();
        }
   }
    
    private String generateSaran(String status) {
        // Generate advice based on the status
        switch (status) {
            case "Tidak Depresi":
                return "Pertahankan pola hidup sehat "
                        + "dan tetap berpikir positif.";
            case "Gejala Ringan":
                return "Anda mulai mengalami Gejala depresi ringan, "
                        + "dianjurkan untuk terapi psikoedukasi "
                        + "bila ada perburukan gejala";
            case "Depresi Ringan":
                return "Anda mengalami Depresi ringan, "
                        + "dianjurkan untuk terapi observasi gejala "
                        + "yang ada dalam 1 bulan dan pertimbangan pemberian "
                        + "antidepresan atau psikoterapi singkat";
            case "Depresi Sedang":
                return "Anda mengalami Depresi sedang, "
                        + "dianjurkan untuk memberikan "
                        + "antidepresan atau psikoterapi";
            case "Depresi Berat":
                return "Anda mengalami Depresi berat, "
                        + "dianjurkan untuk memberikan "
                        + "antidepresan secara tunggal atau "
                        + "kombinasikan dengan psikoterapi intensi";
            default:
                return "Tidak ada saran yang tersedia.";
        }
    }
}
