/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kesmenapp.controller;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Element;
import javax.swing.text.Position;
import javax.swing.text.Segment;
import kesmenapp.model.TesMahasiswa;
import kesmenapp.repository.TesMahasiswaRepository;

/**
 *
 * @author Dimas Haafizh Rahman
 */
public class adminController {
    private static final Logger logger = Logger.getLogger(adminController.class.getName());
    
    public void loadTableData (DefaultTableModel dtm){
        while(dtm.getRowCount()>0){
            dtm.removeRow(0);
        }
        try {
            TesMahasiswaRepository tesMahasiswaRepository = new TesMahasiswaRepository();
            List<TesMahasiswa> tesMahasiswaList = tesMahasiswaRepository.getListTesMahasiswa();
            for(TesMahasiswa tesMahasiswa: tesMahasiswaList){ 
                dtm.addRow(new Object[]{
                    tesMahasiswa.getIdTes(),
                    tesMahasiswa.getMahasiswa().getNim(),
                    tesMahasiswa.getNilaiAkhir(), 
                    tesMahasiswa.getStatus()
                });
            }
        }catch (Exception ex) {
            logger.log(Level.SEVERE, "Failed to load table", ex);
            ex.printStackTrace();
        }       
    }
    
    public void ratarata(javax.swing.JTextField p1Field, javax.swing.JTextField p2Field, javax.swing.JTextField p3Field,
                     javax.swing.JTextField p4Field, javax.swing.JTextField p5Field, javax.swing.JTextField p6Field,
                     javax.swing.JTextField p7Field, javax.swing.JTextField p8Field, javax.swing.JTextField p9Field,
                     javax.swing.JTextField totalNilaiField)
    {
        double totalP1 = 0;
        double totalP2 = 0;
        double totalP3 = 0;
        double totalP4 = 0;
        double totalP5 = 0;
        double totalP6 = 0;
        double totalP7 = 0;
        double totalP8 = 0;
        double totalP9 = 0;
        double nilaitotal = 0;
        int jumlahData = 0;
        
        try {
            TesMahasiswaRepository tesMahasiswaRepository = new TesMahasiswaRepository();
            List<TesMahasiswa> tesMahasiswaList = tesMahasiswaRepository.getListTesMahasiswa();
            
            for (TesMahasiswa tesMahasiswa : tesMahasiswaList) {
                totalP1 += tesMahasiswa.getP1();
                totalP2 += tesMahasiswa.getP2();
                totalP3 += tesMahasiswa.getP3();
                totalP4 += tesMahasiswa.getP4();
                totalP5 += tesMahasiswa.getP5();
                totalP6 += tesMahasiswa.getP6();
                totalP7 += tesMahasiswa.getP7();
                totalP8 += tesMahasiswa.getP8();
                totalP9 += tesMahasiswa.getP9();
                nilaitotal += tesMahasiswa.getNilaiAkhir();
                jumlahData++;
            }
            
            if (jumlahData > 0) {
                p1Field.setText(String.valueOf(totalP1 / jumlahData));
                p2Field.setText(String.valueOf(totalP2 / jumlahData));
                p3Field.setText(String.valueOf(totalP3 / jumlahData));
                p4Field.setText(String.valueOf(totalP4 / jumlahData));
                p5Field.setText(String.valueOf(totalP5 / jumlahData));
                p6Field.setText(String.valueOf(totalP6 / jumlahData));
                p7Field.setText(String.valueOf(totalP7 / jumlahData));
                p8Field.setText(String.valueOf(totalP8 / jumlahData));
                p9Field.setText(String.valueOf(totalP9 / jumlahData));
                totalNilaiField.setText(String.valueOf(nilaitotal / jumlahData));
            }
        } catch (Exception ex) {
            logger.log(Level.SEVERE, "Failed to calculate averages", ex);
            ex.printStackTrace();
        }
    }

    public void export(DefaultTableModel dtm) throws DocumentException {
        //memilih penyimpanan
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Pilih Penyimpanan");
        fileChooser.setFileFilter(new FileNameExtensionFilter("PDF Files", "pdf"));

        int alamat = fileChooser.showSaveDialog(null);

        if (alamat == JFileChooser.APPROVE_OPTION) {
            String filePath = fileChooser.getSelectedFile().getAbsolutePath();
            if (!filePath.endsWith(".pdf")) {
                filePath += ".pdf";
            }

            //create pdf
            Document document = new Document();

            try {
                PdfWriter.getInstance((com.itextpdf.text.Document) document, new FileOutputStream(filePath));

                document.open();
                
                Paragraph title = new Paragraph("Hasil Tes Kesehatan Mental Mahasiswa"
                        + "");
                title.setAlignment(Paragraph.ALIGN_CENTER);
                document.add(title);

                PdfPTable pdfTable = new PdfPTable(dtm.getColumnCount());

                for (int i = 0; i < dtm.getColumnCount(); i++) {
                    pdfTable.addCell(dtm.getColumnName(i));
                }

                for (int rows = 0; rows < dtm.getRowCount(); rows++) {
                    for (int cols = 0; cols < dtm.getColumnCount(); cols++) {
                        pdfTable.addCell(dtm.getValueAt(rows, cols).toString());
                    }
                }

                document.add(pdfTable);

                document.close();

                System.out.println("PDF berhasi disimpan");
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
                // Tampilkan pesan kesalahan
                System.err.println("Terjadi kesalahan: " + ex.getMessage());
            }
        }
    }
}
