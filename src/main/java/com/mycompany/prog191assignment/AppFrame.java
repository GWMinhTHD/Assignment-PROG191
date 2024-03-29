/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.prog191assignment;

import java.awt.Desktop;
import java.awt.FileDialog;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import org.imgscalr.Scalr;

public class AppFrame extends javax.swing.JFrame {
    
    
    ArrayList<Student> studentList;
    ArrayList<Student> statList;
    String tabheads[] = new String[]{"Name", "Gender", "Math", "Literature", "Language"};
    DefaultTableModel tabmod;
    int row= -1;
    boolean isStat = false;
    String imgPath="";
    String imgFilename="";
    String listFile="";

    /**
     * Creates new form AppFrame
     */
    public AppFrame() {
        initComponents();
        studentList = new ArrayList<>();
        statList = new ArrayList<>();
        tabmod = new DefaultTableModel(tabheads,0){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jTable1.setModel(tabmod);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sensei's Gakusei Manager");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("Math");

        jLabel5.setText("Literature");

        jLabel6.setText("Language");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jButton1.setText("Add Image");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Student name");

        jLabel2.setText("Gender");

        jLabel3.setText("Choose image");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 126, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(202, 202, 202))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Edit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton7.setText("Highest GPA");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenu1.setText("File");

        jMenuItem1.setText("Open");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("New");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private String nameInput() throws InputException{
            String name = jTextField1.getText().trim();
            if (name.equals("")) throw new InputException("No input");
            else if (name.matches("\\D*") != true) throw new InputException("No number allowed");
            else {
                String[] arr = name.split("[ ]{1,}");
                StringBuffer sb = new StringBuffer();
                for (int i = 0; i < arr.length; i++) {
                    sb.append(Character.toUpperCase(arr[i].charAt(0)))
                    .append(arr[i].substring(1)).append(" ");
                }
                return sb.toString().trim();
            }
    }
    
    private String imgHandle() throws IOException{
        String img="default.jpg";
        String ext; 
        if (imgFilename.equals("") != true){
            ext = imgFilename.substring(imgFilename.lastIndexOf("."),imgFilename.length());
            
            // Generate new name for image saving to avoid duplicate by getting a random number from a seed that is the current time in Unix Epoch
            long unixTime = System.currentTimeMillis() / 1000L;
            Random ran = new Random(unixTime);
            img = Long.toString(ran.nextLong())+ext;
            
            // Copy image to prject folder
            File src = new File(imgPath+imgFilename);
            File dest = new File(System.getProperty("user.dir")+"\\img\\"+img);
            Files.copy(src.toPath(), dest.toPath());
        }
        return img;
    }
    
    private double[] scoreInput()throws NumberFormatException, InputException{
            double[] scores = new double[3];
            scores[0] = Double.parseDouble(jTextField2.getText().trim());
            scores[1] = Double.parseDouble(jTextField3.getText().trim());
            scores[2] = Double.parseDouble(jTextField4.getText().trim());
            if(scores[0] < 0 || scores[0] > 10) throw new InputException("Score out of range 0-10");
            else if(scores[1] < 0 || scores[1] > 10) throw new InputException("Score out of range 0-10");
            else if(scores[2] < 0 || scores[2] > 10) throw new InputException("Score out of range 0-10");
            else return scores;
    }

    //reset fields
    private void clearField(){
        jTextField1.setText("");
        jTextField1.requestFocus();
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jComboBox1.setSelectedIndex(0);
        imgPath="";
        imgFilename="";
    }
    
    private void displayTable(ArrayList<Student> list){
        tabmod.setRowCount(0); //clear table
        //write list to table
        for (Student s: list) {
            Object[] objs = {
                             s.getName(),
                             s.getGender(),
                             s.getMath(),
                             s.getLit(),
                             s.getLang()};
            tabmod.addRow(objs);
        }
        clearField();
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FileDialog fd = new FileDialog(this, "Choose an image", FileDialog.LOAD);
        fd.setDirectory(System.getProperty("user.home"));
        fd.setVisible(true);
        String filename = fd.getFile();
        String path =fd.getDirectory();
        String file;
        try{
            if (filename == null) throw new InputException("No file selected");
            else {
                String ext = filename.substring(filename.lastIndexOf("."),filename.length());
                if ((ext.equals(".jpg") != true) &&
                    (ext.equals(".jpeg") != true) &&
                    (ext.equals(".png") != true)) throw new InputException("Wrong file type");
                else{
                    imgPath = path;
                    imgFilename = filename;
                    
                }
            }
        }catch(InputException e){
            JOptionPane.showMessageDialog (null, "The file you chose need to be an image");
            return;
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void delImg(String fn) throws DirectoryNotEmptyException, IOException{
        if (fn.equals("default.jpg") != true){
            Files.deleteIfExists(Paths.get(System.getProperty("user.dir")+"\\img\\"+studentList.get(row).getImgFileName()));
        }
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
            if (listFile.equals("")) throw new InputException("No file to operate on");
        }catch(InputException e){
            JOptionPane.showMessageDialog (null, "Please open or create a new list");
            return;
        }
        if (isStat == true){
            displayTable(studentList);
            isStat = false;
        }
        try{
            if (row < 0) throw new InputException("Row Unselect");
        }catch(InputException e){
            JOptionPane.showMessageDialog (null, "Please select a row");
            return;
        }
        String name= studentList.get(row).getName();
        double math= studentList.get(row).getMath();
        double lit= studentList.get(row).getLit();
        double lang= studentList.get(row).getLang();
        try{
            name = nameInput();
        }catch(InputException e){
            JOptionPane.showMessageDialog (null, "Student name must not be empty and it must not contain any number");
            return;
        }
        String gen = jComboBox1.getSelectedItem().toString();
        try{
            double[] score = scoreInput();
            math = score[0];
            lit = score[1];
            lang = score[2];
        }catch(NumberFormatException | InputException e){
            JOptionPane.showMessageDialog (null, "Any score must be a float in the range of 0.00 to 10.00");
            return;
        }
        if (imgFilename.equals("") != true){
            try{
                delImg(studentList.get(row).getImgFileName());
            }catch(IOException e){
                JOptionPane.showMessageDialog (null, "Fail to delete old image or old image does not exit, the program will still update the entry with new image");
            }
            try{
                studentList.get(row).setImgFileName(imgHandle());
            }catch(IOException e){
                JOptionPane.showMessageDialog (null, "Copy failed");
            }
        }
        studentList.get(row).setName(name);
        studentList.get(row).setGender(gen);
        studentList.get(row).setMath(math);
        studentList.get(row).setLit(lit);
        studentList.get(row).setLang(lang);
        save();
        displayTable(studentList);
        row= -1;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try{
            if (listFile.equals("")) throw new InputException("No file to operate on");
        }catch(InputException e){
            JOptionPane.showMessageDialog (null, "Please open or create a new list");
            return;
        }
        if (isStat == true){
            displayTable(studentList);
            isStat = false;
            return;
        }
        try{
            if (row < 0) throw new InputException("Row Unselect");
        }catch(InputException e){
            JOptionPane.showMessageDialog (null, "Please select a row");
            return;
        }
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Delete this student?", "Delete Student", dialogButton);
        if(dialogResult == 0) {
            try{
                if (studentList.size() != 1) {delImg(studentList.get(row).getImgFileName());}
            }catch(IOException e){
                JOptionPane.showMessageDialog (null, "Fail to delete old image or old image does not exit, the program will still try to delete the entry in the file");
            }
            try{
                if (studentList.size() != 1){
                tabmod.removeRow(row);
                studentList.remove(row);
                save();
                }
                else throw new InputException("Only entry in list");
            }catch(InputException e){
                JOptionPane.showMessageDialog (null, "Can't remove the only entry on the list, please create a new entry before you could delete this one");
            }
            displayTable(studentList);
            row= -1;
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (isStat == true) isStat = false;
        try{
            if (listFile.equals("")) throw new InputException("No file to operate on");
        }catch(InputException e){
            JOptionPane.showMessageDialog (null, "Please open or create a new list");
            return;
        }
        String name="";
        double math= 0.00;
        double lit= 0.00;
        double lang= 0.00;
        String img="";
        try{
            name = nameInput();
        }catch(InputException e){
            JOptionPane.showMessageDialog (null, "Student name must not be empty and it must not contain any number");
            return;
        }
        try{
            img = imgHandle();
        }catch(IOException e){
            JOptionPane.showMessageDialog (null, "Copy error");
            return;
        }
        String gen = jComboBox1.getSelectedItem().toString();
        try{
            double[] score = scoreInput();
            math = score[0];
            lit = score[1];
            lang = score[2];
        }catch(NumberFormatException | InputException e){
            JOptionPane.showMessageDialog (null, "Any score must be a float in the range of 0.00 to 10.00");
            return;
        }
        studentList.add(new Student(name,gen, math, lit, lang, img));
        save();
        displayTable(studentList);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void findTopGPA(){
        statList.clear();
        double maxAvg = studentList.get(1).gpa();
        for (Student s : studentList){
            double avg = s.gpa();
            if (avg >= maxAvg){ maxAvg=avg;}
        }
        for (Student s : studentList){
            double avg = s.gpa();
            if (avg >= maxAvg){ statList.add(s);}
        }
    }
    
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try{
            if (listFile.equals("")) throw new InputException("No file to operate on");
        }catch(InputException e){
            JOptionPane.showMessageDialog (null, "Please open or create a new list");
            return;
        }
        isStat = true;
        findTopGPA();
        displayTable(statList);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FileDialog fd = new FileDialog(this, "Choose a file with \".cnuy\" extension", FileDialog.LOAD);
        fd.setDirectory(System.getProperty("user.dir")+"\\lists");
        fd.setVisible(true);
        String filename = fd.getFile();
        String path =fd.getDirectory();
        try{
            if (filename == null) throw new InputException("No file selected");
            if (filename.contains(".") == false) throw new InputException("Wrong file type");
            else {
                String ext = filename.substring(filename.lastIndexOf("."),filename.length());
                if (ext.equals(".cnuy") != true) throw new InputException("Wrong file type");
            }
        }catch(InputException e){
            JOptionPane.showMessageDialog (null, "You must choose a file with \".cnuy\" extension");
            return;
        }
        try {
            FileInputStream fis = new FileInputStream(path+filename);
            ObjectInputStream ois = new ObjectInputStream(fis);
            studentList = (ArrayList<Student>) ois.readObject();
            ois.close();
            displayTable(studentList);
            listFile = filename.substring(0, filename.lastIndexOf('.'));
            }catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog (null, "File error");
            }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    
    //Populate the fields with data from selected row in the table and also choose which index in list to delete, edit, display image
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        clearField();
        row = jTable1.getSelectedRow();
        jTextField1.setText(tabmod.getValueAt(row, 0).toString());
        jTextField2.setText(tabmod.getValueAt(row, 2).toString());
        jTextField3.setText(tabmod.getValueAt(row, 3).toString());
        jTextField4.setText(tabmod.getValueAt(row, 4).toString());
        String gen = tabmod.getValueAt(row, 1).toString();
        for (int i = 0; i<(jComboBox1.getItemCount());i++){
            if (jComboBox1.getItemAt(i).equalsIgnoreCase(gen)){
                jComboBox1.setSelectedIndex(i);
            }
        }
        // Display image
        String filename="";
        try{
            if (isStat == true){
                filename = statList.get(row).getImgFileName();
            }
            else filename = studentList.get(row).getImgFileName();
            File imgF = new File(System.getProperty("user.dir")+"\\img\\"+filename);
            BufferedImage img = ImageIO.read(imgF);
            BufferedImage rs = Scalr.resize(img, Scalr.Method.ULTRA_QUALITY, Scalr.Mode.AUTOMATIC, 300, 400, Scalr.OP_ANTIALIAS);
            ImageIcon icon = new ImageIcon(rs);
            jLabel7.setToolTipText(studentList.get(row).getImgFileName());
            jLabel7.setIcon(icon);
        }catch(IOException e){
            
        }
        if(isStat == true){
            row= -1;
            clearField();
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        String filename = "";
        try {
            filename = JOptionPane.showInputDialog("Enter filename:");
            if (filename.equals("")) throw new InputException("No input");
            else listFile = filename;
            JOptionPane.showMessageDialog (null, "File will be saved on disk upon adding first entry");
            studentList.clear();
            tabmod.setRowCount(0);
        }catch(NullPointerException | InputException e){
            JOptionPane.showMessageDialog (null, "Please input a filename");
        }
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        String imgname = jLabel7.getToolTipText();
        File file = new File( "img/"+imgname );
        try{
            Desktop.getDesktop().open(file);
        }catch(IOException e){
            
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void save(){
        try {
            if(studentList.isEmpty()) throw new InputException("Empty list");
            FileOutputStream fos = new FileOutputStream("lists/"+listFile+".cnuy");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(studentList);
            oos.close();
        } catch (InputException e){
            JOptionPane.showMessageDialog (null, "File will not save an empty list, please add a new entry to save");
        }
        catch (IOException e) {
            JOptionPane.showMessageDialog (null, "File error");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AppFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AppFrame frame = new AppFrame();
                try{
                Image image = ImageIO.read(new File("appicon.png"));
                frame.setIconImage(image);
                }catch(IOException e){
                    
                }
                frame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

}
