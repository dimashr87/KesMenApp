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
import kesmenapp.model.TesMahasiswa;

/**
 *
 * @author Dimas Haafizh Rahman
 */
public class TesMahasiswaRepository {
    private Connection connection;
    
    public TesMahasiswaRepository() {
        connection = DBConn.getInstance().getConnection();
    }
    
    public List<TesMahasiswa> getListTesMahasiswa() {
        List<TesMahasiswa> tesMahasiswaList = new ArrayList<>();
        MahasiswaRepository mahasiswaRepository = new MahasiswaRepository();
       
        try {
            PreparedStatement preparedStatement1 = connection.prepareStatement("SELECT * FROM tesmahasiswa");
            ResultSet resultSet = preparedStatement1.executeQuery();
            while (resultSet.next()) {
                TesMahasiswa tesMahasiswa = new TesMahasiswa();                
                tesMahasiswa.setIdTes(resultSet.getInt("idTes"));
                tesMahasiswa.setMahasiswa(mahasiswaRepository.getMahasiswaByNim(resultSet.getString("nim")));
                tesMahasiswa.setP1(resultSet.getInt("p1"));
                tesMahasiswa.setP2(resultSet.getInt("p2"));
                tesMahasiswa.setP3(resultSet.getInt("p3"));
                tesMahasiswa.setP4(resultSet.getInt("p4"));
                tesMahasiswa.setP5(resultSet.getInt("p5"));
                tesMahasiswa.setP6(resultSet.getInt("p6"));
                tesMahasiswa.setP7(resultSet.getInt("p7"));
                tesMahasiswa.setP8(resultSet.getInt("p8"));
                tesMahasiswa.setP9(resultSet.getInt("p9"));
                tesMahasiswa.setNilaiAkhir(resultSet.getInt("nilaiAkhir"));
                tesMahasiswa.setStatus(resultSet.getString("status"));
                tesMahasiswaList.add(tesMahasiswa);
            }
        } catch (Exception e) {
        }
        return tesMahasiswaList; 
    }

    public void insertTesMahasiswa(TesMahasiswa tesMahasiswa) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(
                "INSERT INTO tesMahasiswa (nim, p1, p2, p3, p4, p5, p6, p7, p8, p9, nilaiAkhir, status)"
                        + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
            preparedStatement.setString(1, tesMahasiswa.getMahasiswa().getNim());
            preparedStatement.setInt(2, tesMahasiswa.getP1());
            preparedStatement.setInt(3, tesMahasiswa.getP2());
            preparedStatement.setInt(4, tesMahasiswa.getP3());
            preparedStatement.setInt(5, tesMahasiswa.getP4());
            preparedStatement.setInt(6, tesMahasiswa.getP5());
            preparedStatement.setInt(7, tesMahasiswa.getP6());
            preparedStatement.setInt(8, tesMahasiswa.getP7());
            preparedStatement.setInt(9, tesMahasiswa.getP8());
            preparedStatement.setInt(10, tesMahasiswa.getP9());
            preparedStatement.setInt(11, tesMahasiswa.getNilaiAkhir());
            preparedStatement.setString(12, tesMahasiswa.getStatus());
            
            int affectedRows = preparedStatement.executeUpdate();
            if (affectedRows > 0) {
                try (ResultSet generatedKeys = preparedStatement.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        tesMahasiswa.setIdTes(generatedKeys.getInt(1));
                    } else {
                        throw new SQLException("Inserting tesMahasiswa failed, no ID obtained.");
                    }
                }
            }   
//            preparedStatement.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();    
        }       
    }
    
    public TesMahasiswa getTesMahasiswaByNim(String nim) {
        TesMahasiswa tesMahasiswa = new TesMahasiswa();
        
        try {
            PreparedStatement preparedStatementMahasiswa = connection.prepareStatement("SELECT * FROM tesmahasiswa WHERE nim = ?");            
            preparedStatementMahasiswa.setString(1, nim);
            ResultSet resultSet = preparedStatementMahasiswa.executeQuery();
            
            while (resultSet.next()) {
                tesMahasiswa.setIdTes(resultSet.getInt("idTes"));
                tesMahasiswa.setP1(resultSet.getInt("p1"));
                tesMahasiswa.setP2(resultSet.getInt("p2"));
                tesMahasiswa.setP3(resultSet.getInt("p3"));
                tesMahasiswa.setP4(resultSet.getInt("p4"));
                tesMahasiswa.setP5(resultSet.getInt("p5"));
                tesMahasiswa.setP6(resultSet.getInt("p6"));
                tesMahasiswa.setP7(resultSet.getInt("p7"));
                tesMahasiswa.setP8(resultSet.getInt("p8"));
                tesMahasiswa.setP9(resultSet.getInt("p9"));
                tesMahasiswa.setNilaiAkhir(resultSet.getInt("nilaiAkhir"));
                tesMahasiswa.setStatus(resultSet.getString("status"));
            }
            
        } catch (Exception e) {
        }
        return tesMahasiswa;    
    }  
}
