/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.primeratareajava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.LinkedList;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Irving Fan
 */
public class InterfazGrafica extends javax.swing.JFrame {
    
    LinkedList<Estudiante> estudiante = new LinkedList<>();
    
    /**
     * Creates new form InterfazGrafica
     */
    public InterfazGrafica() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NombreTextfield = new javax.swing.JTextField();
        ApellidoTextfield = new javax.swing.JTextField();
        TelefonoTextfield = new javax.swing.JTextField();
        nicknameTextfield = new javax.swing.JTextField();
        TipoTextField = new javax.swing.JTextField();
        AnadirButton = new javax.swing.JButton();
        CargarButton = new javax.swing.JButton();
        GuardarButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        CarneIntfield = new javax.swing.JLabel();
        CarneTextfield1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ExamenTextfield = new javax.swing.JTextField();
        TareaTextfield = new javax.swing.JTextField();
        Proyecto1Textfield = new javax.swing.JTextField();
        QuizTextfield = new javax.swing.JTextField();
        Proyecto2Textfield = new javax.swing.JTextField();
        Proyecto3Textfield = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Carne:");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jLabel4.setText("Telefono");

        jLabel5.setText("Nickname");

        jLabel6.setText("Tipo de Estudiante:");

        NombreTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreTextfieldActionPerformed(evt);
            }
        });

        ApellidoTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoTextfieldActionPerformed(evt);
            }
        });

        nicknameTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nicknameTextfieldActionPerformed(evt);
            }
        });

        AnadirButton.setText("A??adir Tipo B");
        AnadirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnadirButtonActionPerformed(evt);
            }
        });

        CargarButton.setText("Cargar");
        CargarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarButtonActionPerformed(evt);
            }
        });

        GuardarButton.setText("Guardar");
        GuardarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarButtonActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Carne", "Nombre", "Apellido", "Telefono", "Nickname", "Tipo de Estudiante", "Nota P(Proyecto)", "Nota P(Quiz,Exa,Tarea)", "Nota Final"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
            jTable1.getColumnModel().getColumn(7).setResizable(false);
            jTable1.getColumnModel().getColumn(8).setResizable(false);
            jTable1.getColumnModel().getColumn(9).setResizable(false);
        }

        CarneTextfield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarneTextfield1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Guardar con extension .csv");

        jLabel9.setText("Nota (ex??menes)");

        jLabel10.setText(" Nota  (quices) ");

        jLabel11.setText("Nota (tareas) ");

        jLabel12.setText("Nota Proyecto #1 ");

        jLabel13.setText("Nota Proyecto #2");

        jLabel14.setText("Nota Proyecto #3");

        ExamenTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExamenTextfieldActionPerformed(evt);
            }
        });

        TareaTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TareaTextfieldActionPerformed(evt);
            }
        });

        Proyecto1Textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Proyecto1TextfieldActionPerformed(evt);
            }
        });

        QuizTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuizTextfieldActionPerformed(evt);
            }
        });

        Proyecto2Textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Proyecto2TextfieldActionPerformed(evt);
            }
        });

        Proyecto3Textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Proyecto3TextfieldActionPerformed(evt);
            }
        });

        jButton1.setText("A??adir Tipo A");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CargarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(GuardarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AnadirButton)
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(NombreTextfield)
                                .addComponent(TelefonoTextfield)
                                .addComponent(nicknameTextfield)
                                .addComponent(TipoTextField)
                                .addComponent(CarneTextfield1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                            .addComponent(ApellidoTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CarneIntfield, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ExamenTextfield, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(Proyecto1Textfield)
                            .addComponent(Proyecto2Textfield)
                            .addComponent(Proyecto3Textfield)
                            .addComponent(QuizTextfield)
                            .addComponent(TareaTextfield, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(120, 120, 120))))
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CarneIntfield)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CarneTextfield1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(ExamenTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(TareaTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NombreTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(QuizTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel12)
                                .addGap(17, 17, 17))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Proyecto1Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(Proyecto2Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(Proyecto3Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AnadirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ApellidoTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TelefonoTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(nicknameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(TipoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CargarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GuardarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addComponent(jLabel8)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ApellidoTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidoTextfieldActionPerformed

    private void NombreTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreTextfieldActionPerformed

    private void GuardarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarButtonActionPerformed
        // TODO add your handling code here:
        
                JFileChooser SeleccionarArchivo = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos csv","csv");
        
        SeleccionarArchivo.setFileFilter(filtro);
        
        int seleccionar = SeleccionarArchivo.showOpenDialog(this);
        
        if(seleccionar == JFileChooser.APPROVE_OPTION) {
            File Archivo = SeleccionarArchivo.getSelectedFile();
            GuardarArchivo(Archivo);
        }
        
    
        
        
    }//GEN-LAST:event_GuardarButtonActionPerformed
    public void GuardarArchivo(File archivo){
        
        FileWriter fw = null;
        PrintWriter pw = null;
        
        try{
            fw = new FileWriter(archivo);
            pw = new PrintWriter(fw);
            
            for(Estudiante e: estudiante){
                String linea = e.getID()+";"+e.getCarne()+";"+e.getNombre()+";"+e.getApellido()+";"+
                        e.getTelefono()+";"+e.getNickname()+";"+e.getTipo_estudiante()
                        +";"+e.getNota_promedio_proyectos()+";"+e.getNota_promedio_examen_quiz_tarea()
                        +";"+e.getNota_final();
                pw.println(linea);
                      
                        
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            try{
                if(fw != null){
                    fw.close();
                }
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
        

    }
        
    private void CargarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser SeleccionarArchivo = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos csv","csv");
        
        SeleccionarArchivo.setFileFilter(filtro);
        
        int seleccionar = SeleccionarArchivo.showOpenDialog(this);
        
        if(seleccionar == JFileChooser.APPROVE_OPTION) {
            File Archivo = SeleccionarArchivo.getSelectedFile();
            CargarArchivo(Archivo);
        }
    }//GEN-LAST:event_CargarButtonActionPerformed

    private void CarneTextfield1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarneTextfield1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CarneTextfield1ActionPerformed

    private void ExamenTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExamenTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExamenTextfieldActionPerformed

    private void TareaTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TareaTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TareaTextfieldActionPerformed

    private void Proyecto1TextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Proyecto1TextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Proyecto1TextfieldActionPerformed

    private void QuizTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuizTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuizTextfieldActionPerformed

    private void Proyecto2TextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Proyecto2TextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Proyecto2TextfieldActionPerformed

    private void Proyecto3TextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Proyecto3TextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Proyecto3TextfieldActionPerformed

    private void AnadirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnadirButtonActionPerformed
        // TODO add your handling code here:

        Estudiante e = new Estudiante();

        e.setID(estudiante.size());
        e.setApellido(ApellidoTextfield.getText());
        e.setCarne(CarneTextfield1.getText());
        e.setNombre(NombreTextfield.getText());
        e.setNickname(nicknameTextfield.getText());
        e.setTipo_estudiante(TipoTextField.getText());
        e.setTelefono(TelefonoTextfield.getText());
        
        
        
        int Exa = Integer.parseInt(ExamenTextfield.getText());
        int quiz = Integer.parseInt(QuizTextfield.getText());
        int tarea = Integer.parseInt(TareaTextfield.getText());
        int pro1 = Integer.parseInt(Proyecto1Textfield.getText());
        int pro2 = Integer.parseInt(Proyecto2Textfield.getText());
        int pro3 = Integer.parseInt(Proyecto3Textfield.getText());
        
        int nota_promedio_exa_quiz_tarea = (Exa + quiz + tarea) / 3;
        e.setNota_promedio_examen_quiz_tarea(nota_promedio_exa_quiz_tarea);
        
        int nota_final = (Exa + quiz + tarea + pro1 + pro2
                + pro3) / 6;
       e.setNota_final(nota_final);
        

        estudiante.add(e);

        ApellidoTextfield.setText("");
        CarneTextfield1.setText("");
        NombreTextfield.setText("");
        nicknameTextfield.setText("");
        TipoTextField.setText("");
        TelefonoTextfield.setText("");
        ExamenTextfield.setText("");
        QuizTextfield.setText("");
        TareaTextfield.setText("");
        Proyecto1Textfield.setText("");
        Proyecto2Textfield.setText("");
        Proyecto3Textfield.setText("");
        
        
        //creo un metodo llenarTabla
        llenarTabla();

    }//GEN-LAST:event_AnadirButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Estudiante e = new Estudiante();

        e.setID(estudiante.size());
        e.setApellido(ApellidoTextfield.getText());
        e.setCarne(CarneTextfield1.getText());
        e.setNombre(NombreTextfield.getText());
        e.setNickname(nicknameTextfield.getText());
        e.setTipo_estudiante(TipoTextField.getText());
        e.setTelefono(TelefonoTextfield.getText());
        
        
        
        int Exa = Integer.parseInt(ExamenTextfield.getText());
        int quiz = Integer.parseInt(QuizTextfield.getText());
        int tarea = Integer.parseInt(TareaTextfield.getText());
        int pro1 = Integer.parseInt(Proyecto1Textfield.getText());
        int pro2 = Integer.parseInt(Proyecto2Textfield.getText());
        int pro3 = Integer.parseInt(Proyecto3Textfield.getText());
        
        int nota_promedio_proyectos = (pro1 + pro2 + pro3) / 3;
        e.setNota_promedio_proyectos(nota_promedio_proyectos);
        int nota_final = (Exa + quiz + tarea + pro1 + pro2
                + pro3) / 6;
        e.setNota_final(nota_final);
        

        estudiante.add(e);

        ApellidoTextfield.setText("");
        CarneTextfield1.setText("");
        NombreTextfield.setText("");
        nicknameTextfield.setText("");
        TipoTextField.setText("");
        TelefonoTextfield.setText("");
        ExamenTextfield.setText("");
        QuizTextfield.setText("");
        TareaTextfield.setText("");
        Proyecto1Textfield.setText("");
        Proyecto2Textfield.setText("");
        Proyecto3Textfield.setText("");
        
        
        //creo un metodo llenarTabla
        llenarTabla();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void nicknameTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nicknameTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nicknameTextfieldActionPerformed

    

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnadirButton;
    private javax.swing.JTextField ApellidoTextfield;
    private javax.swing.JButton CargarButton;
    private javax.swing.JLabel CarneIntfield;
    private javax.swing.JTextField CarneTextfield1;
    private javax.swing.JTextField ExamenTextfield;
    private javax.swing.JButton GuardarButton;
    private javax.swing.JTextField NombreTextfield;
    private javax.swing.JTextField Proyecto1Textfield;
    private javax.swing.JTextField Proyecto2Textfield;
    private javax.swing.JTextField Proyecto3Textfield;
    private javax.swing.JTextField QuizTextfield;
    private javax.swing.JTextField TareaTextfield;
    private javax.swing.JTextField TelefonoTextfield;
    private javax.swing.JTextField TipoTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nicknameTextfield;
    // End of variables declaration//GEN-END:variables

    private void llenarTabla() {
        DefaultTableModel mD = new DefaultTableModel(new String[]{"ID","Carne",
            "Nombre","Apellido","Telefono","Nickname",
            "Tipo De Estudiante","Nota P(Proyecto)",
        "Nota P(Quiz,Exa,Tarea)","Nota Final"},estudiante.size());
    
        jTable1.setModel(mD);
        TableModel tm = jTable1.getModel();
        
        for(int i = 0; i<estudiante.size();i++){
            Estudiante e = estudiante.get(i);
            tm.setValueAt(e.getID(), i , 0);
            tm.setValueAt(e.getCarne(), i , 1);
            tm.setValueAt(e.getNombre(), i, 2);
            tm.setValueAt(e.getApellido(), i , 3);
            tm.setValueAt(e.getTelefono(), i , 4);
            tm.setValueAt(e.getNickname(), i , 5);
            tm.setValueAt(e.getTipo_estudiante(), i , 6);
            tm.setValueAt(e.getNota_promedio_examen_quiz_tarea(), i, 7);
            tm.setValueAt(e.getNota_promedio_proyectos(), i, 8);
            tm.setValueAt(e.getNota_final(), i, 9);
            
            
            
        }
        
    }

    public void CargarArchivo(File Archivo) {
        
        FileReader fr = null;
        BufferedReader br = null;
        
        try {
            fr = new FileReader(Archivo);
            br = new BufferedReader(fr);
            
            
            String linea;
            while ((linea = br.readLine()) != null){
                
                
                String arreglo [] = linea.split(";");
                if(arreglo.length==10){
                    Estudiante e = new Estudiante();
                    e.setID(Integer.parseInt(arreglo[0]));
                    e.setCarne((arreglo[1]));
                    e.setNombre((arreglo[2]));
                    e.setApellido((arreglo[3]));
                    e.setTelefono((arreglo[4]));
                    e.setNickname((arreglo[5]));
                    e.setTipo_estudiante((arreglo[6]));
                    e.setNota_promedio_proyectos(Integer.parseInt(arreglo[7]));
                    e.setNota_promedio_examen_quiz_tarea(Integer.parseInt(arreglo[8]));
                    e.setNota_final(Integer.parseInt(arreglo[9]));
                    
                    estudiante.add(e);
                    
                }
                llenarTabla();
            }
            
    
            
    
        }catch(Exception ex){
            System.out.println(ex);
        }
        finally{
            try{
                if( fr != null){
                    fr.close();
                }
                
            }
            catch(Exception ex){
                ex.printStackTrace();
                
            }
        }
    }
}
