/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kesmenapp.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import kesmenapp.model.Mahasiswa;

/**
 *
 * @author Dimas Haafizh Rahman
 */
public class MahasiswaRepository {
    
    private Connection connection;
    public MahasiswaRepository() {
        connection = DBConn.getInstance().getConnection();
    }
    
    public List<Mahasiswa> getListMahasiswa() {
        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement1 = connection.prepareStatement("SELECT * FROM mahasiswa");
            ResultSet resultSet = preparedStatement1.executeQuery();
            while (resultSet.next()) {
                Mahasiswa mahasiswa = new Mahasiswa();
                mahasiswa.setNim(resultSet.getString("nim"));                
                mahasiswa.setNama(resultSet.getString("nama"));
                mahasiswa.setEmail(resultSet.getString("email"));
                mahasiswa.setPassword(resultSet.getString("password"));
                mahasiswaList.add(mahasiswa);
            }
        } catch (Exception e) {
        }
        return mahasiswaList; 
    }

    public void insertMahasiswa(Mahasiswa mahasiswa) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO mahasiswa (nim, nama, email, password)VALUES (?,?,?,?)");
            preparedStatement.setString(1, mahasiswa.getNim());
            preparedStatement.setString(2, mahasiswa.getNama());
            preparedStatement.setString(3, mahasiswa.getEmail());
            preparedStatement.setString(4, mahasiswa.getPassword());
            preparedStatement.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();    
        }       
    }

    public Mahasiswa getMahasiswaByNim(String nim) {
        Mahasiswa mahasiswa = new Mahasiswa();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM mahasiswa WHERE nim = ?");            
            preparedStatement.setString(1, nim);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {
                mahasiswa.setNim(resultSet.getString("nim"));
                mahasiswa.setNama(resultSet.getString("nama"));
                mahasiswa.setEmail(resultSet.getString("email"));      
                mahasiswa.setPassword(resultSet.getString("password"));      
            }
            
        } catch (Exception e) {
        }
        return mahasiswa;   
    }

    public Mahasiswa getMahasiswaByEmail(String email) {
        Mahasiswa mahasiswa = new Mahasiswa();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM mahasiswa WHERE email = ?");            
            preparedStatement.setString(1,email);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                mahasiswa.setNim(resultSet.getString("nim"));
                mahasiswa.setNama(resultSet.getString("nama"));
                mahasiswa.setEmail(resultSet.getString("email"));      
                mahasiswa.setPassword(resultSet.getString("password"));                         
            } 
              
        } catch (Exception e) {
        }
        return mahasiswa;   
    }
}
