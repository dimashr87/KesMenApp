/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kesmenapp.controller;

import java.util.logging.Logger;
import kesmenapp.model.Admin;
import kesmenapp.model.Mahasiswa;
import kesmenapp.model.Session;
import kesmenapp.repository.AdminRepository;
import kesmenapp.repository.MahasiswaRepository;

/**
 *
 * @author Dimas Haafizh Rahman
 */
public class authController {
    private static final Logger logger = Logger.getLogger(authController.class.getName());
    
    public boolean validateFieldSignIn(String email, String password){
        return (email.isEmpty() || password.isEmpty());
    }
       
    public String login(String email, String password){
        try{
            MahasiswaRepository mahasiswaRepo = new MahasiswaRepository();
            AdminRepository adminRepo = new AdminRepository();
            Mahasiswa mahasiswa = mahasiswaRepo.getMahasiswaByEmail(email);
            Admin admin = adminRepo.getAdminByEmail(email);
          
            if(email.equals(admin.getEmail())){
                if (admin.getPassword().equals(password)) {
                    return "Login Sebagai Admin Berhasil";
                }else{
                    return "Login Gagal, password tidak sesuai";
                }
            }else if (email.equals(mahasiswa.getEmail())){
                if (mahasiswa.getPassword().equals(password)) {
                    Session.setLoggedInMahasiswa(mahasiswa);
                    return "Login Berhasil";
                }else{
                    return "Login Gagal, password tidak sesuai";
                }
            }else{
                return "Akun tidak ditemukan, silakan Registrasi!";
            }  
        }catch (Exception ex) {
            logger.log(java.util.logging.Level.SEVERE, "Failed to Login", ex);
            ex.printStackTrace();
    }
      return "Cek Koneksi, Gagal Terhubung";  
    }
    
    public boolean validateFieldSignUp (String nim, String nama, String email, String password) {
        return (nim.isEmpty() || nama.isEmpty() || email.isEmpty() || password.isEmpty());
    }

    public String signUp(String nim, String nama, String email, String password){

        try {
            Mahasiswa mahasiswa = new Mahasiswa();
            MahasiswaRepository mahasiswaRepo = new MahasiswaRepository();
            mahasiswa.setNim(nim);
            mahasiswa.setNama(nama);
            mahasiswa.setEmail(email);
            mahasiswa.setPassword(password);
            mahasiswaRepo.insertMahasiswa(mahasiswa);
            return "Sign Up Berhasil!";
        } catch (Exception ex) {
            logger.log(java.util.logging.Level.SEVERE, "Gagal Menambahkan Mahasiswa", ex);
            ex.printStackTrace();
        }
        return "Gagal Melakukan Registrasi";
    }
    
    public static void logout() {
        Session.setLoggedInMahasiswa(null);
    }
}

