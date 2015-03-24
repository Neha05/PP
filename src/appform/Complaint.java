/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appform;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Set;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Complaint extends JFrame implements ActionListener{
    JLabel Complaint;
    TextField complaint=new TextField();
    JButton submit=new JButton("Submit");
    public Complaint(){
        setVisible(true);
        setSize(700, 700);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Complaint= new JLabel("Any Complaints/Suggestions??");
        submit.addActionListener(this);
        add(Complaint);
        add(complaint);
        add(submit);
        
    }

    
    public static void updateComplaint(String complaint){
    try{
    FileInputStream file = new FileInputStream(new File("Complaint.xls"));
    XSSFWorkbook workbook = new XSSFWorkbook(file);
    XSSFSheet sheet = workbook.getSheetAt(0);
        HashMap data;
        data = new HashMap<>();
        data.put("7", new Object[] {complaint});
        Set keyset = data.keySet();
        int rownum = sheet.getLastRowNum()+1;
        for (Object key : keyset) {
            Row row = sheet.createRow(rownum++);
            Object [] objArr = (Object[]) data.get(key);
            int cellnum = 0;
            for (Object obj : objArr) {
                Cell cell = row.createCell(cellnum++);
                if(obj instanceof String)
                    cell.setCellValue((String)obj);
                else if(obj instanceof Double)
                    cell.setCellValue((Double)obj);
            }
        }
            FileOutputStream out = new FileOutputStream(new File("Complaint.xls"));
            workbook.write(out);
            out.close();
            System.out.println("Complaint written successfully..");
             
       
//</string></string,></string,>
}
     
     catch(Exception e){}
}
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==submit){
   updateComplaint(complaint.toString());
        }
    
    
}}