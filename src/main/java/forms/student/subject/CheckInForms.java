/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package forms.student.subject;

import checkin.CheckInSession;
import dialog.InfoDialog;
import forms.MainForm;
import handlers.CheckInHandler;
import helper.FrameHelper;
import user.AuthUser;
import user.Student;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author WINDOWS 10
 */
public class CheckInForms extends javax.swing.JInternalFrame implements KeyListener {

    private CheckInSession selectedData;
    private Map<String, Object> checkInData = new HashMap<>();
    private String prevCheckInCode = "";

    /**
     * Creates new form CheckinForms
     */
    public CheckInForms() {
        initComponents();
        codeTextField.addKeyListener(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        codeTextField = new javax.swing.JTextField();
        finalLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        finalLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cheeckbtn = new javax.swing.JButton();
        cancelbtn = new javax.swing.JButton();

        codeTextField.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        codeTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        codeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeTextFieldActionPerformed(evt);
            }
        });

        finalLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        finalLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        finalLabel.setText("(รอรหัสเซคชั่นเช็คชื่อจากอาจารย์ผู้สอน เพื่อดำเนินการต่อ)");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(41, 121, 255));
        jLabel1.setText("ระบบเช็คชื่อเข้าชั้นเรียน HongFah Check-In");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("เช็คชื่อเข้าชั้นเรียนผ่านระบบสารสนเทศนักศึกษา ห้องฟ้าออนไลน์ (HongFah Online)");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_form_icons/icons8-today-48.png"))); // NOI18N

        finalLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        finalLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        finalLabel1.setText("โปรดกรอกรหัสเซตชั่นเช็คชื่อ");

        cheeckbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cheeckbtn.setForeground(new java.awt.Color(41, 121, 255));
        cheeckbtn.setText("เช็คชื่อเข้าชั้นเรียน");
        cheeckbtn.setPreferredSize(new java.awt.Dimension(200, 35));
        cheeckbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cheeckbtnMouseClicked(evt);
            }
        });
        cheeckbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheeckbtnActionPerformed(evt);
            }
        });
        jPanel1.add(cheeckbtn);

        cancelbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelbtn.setText("ยกเลิก / ปิด");
        cancelbtn.setToolTipText("");
        cancelbtn.setPreferredSize(new java.awt.Dimension(200, 35));
        cancelbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelbtnMouseClicked(evt);
            }
        });
        cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtnActionPerformed(evt);
            }
        });
        jPanel1.add(cancelbtn);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(finalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(finalLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(codeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addComponent(jLabel3))
                .addGap(24, 24, 24)
                .addComponent(finalLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(finalLabel)
                .addGap(24, 24, 24)
                .addComponent(codeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cheeckbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheeckbtnActionPerformed

    }//GEN-LAST:event_cheeckbtnActionPerformed

    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelbtnActionPerformed

    private void codeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codeTextFieldActionPerformed

    private void cheeckbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cheeckbtnMouseClicked

//        if (codeTextField.getText().length() == 6) {
//            try {
//                String sessionID = (String) codeTextField.getText();
//                CheckInSession seleCheckInSession = CheckInHandler.handleGetCheckInBySessionID(sessionID);
//                CheckConfirmationForms checkConfirmationForms = new CheckConfirmationForms(seleCheckInSession);
//                FrameHelper.setLocationToCenter(checkConfirmationForms);
//                MainForm.mainDesktopPane.add(checkConfirmationForms);
//                checkConfirmationForms.setVisible(true);
//                this.setVisible(false);
//                this.dispose();
//            } catch (Exception e) {
//                new InfoDialog("กรอกรหัสผิด", "รหัสเซคชั่นไม่ถูกต้อง!").show();
//                codeTextField.setText("");
//            }
//        } else if (codeTextField.getText().length() < 6) {
//            new InfoDialog("กรอกรหัสไม่ครบ", "โปรดกรอกรหัสเซคชั่นให้ครบ 6 หลัก").show();
//            codeTextField.setText("");
//        }

        String checkInSessionCode = codeTextField.getText();
        CheckInSession checkInFormsData = CheckInHandler.handleGetCheckInBySessionID(checkInSessionCode);

        if (checkInFormsData == null) {
            new InfoDialog("ไม่พบเซ็คชั่นเช็คชื่อเข้าเรียน", "ไม่พบเซ็คชั่นเข้าเรียนนี้ โปรดตรวจสอบรหัสใหม่อีกครั้ง").show();
            return;
        } else if (!checkInFormsData.isIsActive()) {
            new InfoDialog("เซคชั่นนี้ปิดการเช็คชื่อไปแล้ว", "ไม่สามารถเช็คชื่อได้ เนื่องจากปิดการเช็คชื่อแล้ว");
            return;
        }

        boolean isCurrentStudentCheckedIn = false;
        String currentStudentId = ((Student) AuthUser.getAuthUser()).getStudentId();
        ArrayList<String> checkInStudents = checkInFormsData.getStudentCheckIn();
        for (int x = 0; x <= (checkInStudents.size() - 1); x++) {
            String[] checkInStudentData = checkInStudents.get(x).split("&");
            if (checkInStudentData[0].equalsIgnoreCase(currentStudentId)) {
                isCurrentStudentCheckedIn = true;
                break;
            }
        }

        if (isCurrentStudentCheckedIn) {
            new InfoDialog("นักศึกษาได้เช็คชื่อในเซคชั่นนี้ไปแล้ว", "นักศึกษาทำการเช้คชื่อในเซคชั่นนี้ไปเรียบร้อยแล้ว !").show();
            return;
        }

        CheckConfirmationForms checkConfirmationForms = new CheckConfirmationForms(checkInFormsData);
        FrameHelper.setLocationToCenter(checkConfirmationForms);
        MainForm.mainDesktopPane.add(checkConfirmationForms);
        checkConfirmationForms.setVisible(true);

    }//GEN-LAST:event_cheeckbtnMouseClicked

    private void cancelbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelbtnMouseClicked
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_cancelbtnMouseClicked

    @Override
    public void keyTyped(KeyEvent e) {
        if (codeTextField.getText().length() >= 6) {
            e.consume();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        String upperCaseText = codeTextField.getText().toUpperCase();
        codeTextField.setText(upperCaseText);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelbtn;
    private javax.swing.JButton cheeckbtn;
    private javax.swing.JTextField codeTextField;
    private javax.swing.JLabel finalLabel;
    private javax.swing.JLabel finalLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
