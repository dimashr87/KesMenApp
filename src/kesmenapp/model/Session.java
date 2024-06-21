/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kesmenapp.model;

/**
 *
 * @author Dimas Haafizh Rahman
 */
public class Session {
    private static Mahasiswa loggedInMahasiswa;

    public static void setLoggedInMahasiswa(Mahasiswa mahasiswa) {
        loggedInMahasiswa = mahasiswa;
    }

    public static Mahasiswa getLoggedInMahasiswa() {
        return loggedInMahasiswa;
    }
}
