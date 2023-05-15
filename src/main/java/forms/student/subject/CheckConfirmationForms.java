/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package forms.student.subject;

import checkin.CheckInSession;
import dialog.InfoDialog;
import handlers.CheckInHandler;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import user.AuthUser;
import user.Student;

/**
 *
 * @author WINDOWS 10
 */
public class CheckConfirmationForms extends javax.swing.JInternalFrame {

    private CheckInSession selectedData;
    private Map<String, Object> checkInData = new HashMap<>();

    /**
     * Creates new form CheckinSuccessForms
     */
    public CheckConfirmationForms(CheckInSession checkIn) {
        initComponents();
        this.selectedData = checkIn;
        showCheckInData();
    }

    private void showCheckInData() {
        subIDdisplay.setText(selectedData.getSubjectID());
        subNamedisplay.setText(selectedData.getSubjectName());
        classroomTextField.setText(selectedData.getClassroom());
        classTimeTextField.setText(selectedData.getClassTime());
        teacherTextField.setText(selectedData.getTeacherName());
        coursedetailTextField.setText(selectedData.getSessionNote());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        subNamedisplay = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        classTimeTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        classroomTextField = new javax.swing.JTextField();
        teacherTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        coursedetailTextField = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        subIDdisplay = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        confirmbtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        cancelbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        subNamedisplay.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        subNamedisplay.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subNamedisplay.setText("Probability and Statistics");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("วัน - เวลาเรียน");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("ห้องเรียน");

        classTimeTextField.setEditable(false);
        classTimeTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        classTimeTextField.setText("09.00 - 12.00");
        classTimeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classTimeTextFieldActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("ชื่ออาจารย์ผู้สอน");

        classroomTextField.setEditable(false);
        classroomTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        classroomTextField.setText("IT : M23");
        classroomTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classroomTextFieldActionPerformed(evt);
            }
        });

        teacherTextField.setEditable(false);
        teacherTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        teacherTextField.setText("ผศ. ดร. ศิลา ภักดีวงษ์");
        teacherTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherTextFieldActionPerformed(evt);
            }
        });

        coursedetailTextField.setEditable(false);
        coursedetailTextField.setColumns(20);
        coursedetailTextField.setRows(5);
        coursedetailTextField.setText("สอบ Quiz ตึง ๆ");
        jScrollPane2.setViewportView(coursedetailTextField);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("รายละเอียดวิชา");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(classroomTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(classTimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(teacherTextField))
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(classroomTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(classTimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(teacherTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        subIDdisplay.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        subIDdisplay.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subIDdisplay.setText("รหัสวิชา : (060661000)");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(41, 121, 255));
        jLabel1.setText("ยืนยันการเช็คชื่อเข้าชั้นเรียน");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("โปรดตรวจสอบข้อมูลเเละรายละเอียดเกี่ยวกับเช็คชั่นเช็คชื่อเข้าเรียน");

        confirmbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        confirmbtn.setForeground(new java.awt.Color(41, 121, 255));
        confirmbtn.setText("ยืนยันการเช็คชื่อ");
        confirmbtn.setPreferredSize(new java.awt.Dimension(200, 35));
        confirmbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmbtnMouseClicked(evt);
            }
        });
        confirmbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmbtnActionPerformed(evt);
            }
        });
        jPanel2.add(confirmbtn);

        jPanel3.setPreferredSize(new java.awt.Dimension(50, 35));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3);

        cancelbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelbtn.setText("ยกเลิก / ปิด");
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
        jPanel2.add(cancelbtn);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_form_icons/icons8-today-48.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(subNamedisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(subIDdisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addComponent(jLabel3))
                .addGap(30, 30, 30)
                .addComponent(subNamedisplay)
                .addGap(12, 12, 12)
                .addComponent(subIDdisplay)
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void classTimeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classTimeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classTimeTextFieldActionPerformed

    private void classroomTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classroomTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classroomTextFieldActionPerformed

    private void teacherTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teacherTextFieldActionPerformed

    private void confirmbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmbtnActionPerformed

    private void confirmbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmbtnMouseClicked
        checkInData = toCheckInDataMap();
        if (CheckInHandler.handleUpdateCheckInSession(selectedData.getSessionID(), (HashMap<String, Object>) checkInData)) {
            new InfoDialog("เช็คชื่อเข้าชั้นเรียนสำเร็จ", "นักศึกษาทำการเช็คชื่อเข้าชั้นเรียน เรียบร้อยแล้ว !").show();
            this.dispose();
        }
    }//GEN-LAST:event_confirmbtnMouseClicked

    private void cancelbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelbtnMouseClicked
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_cancelbtnMouseClicked

    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtnActionPerformed

    }//GEN-LAST:event_cancelbtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelbtn;
    private javax.swing.JTextField classTimeTextField;
    private javax.swing.JTextField classroomTextField;
    private javax.swing.JButton confirmbtn;
    private javax.swing.JTextArea coursedetailTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel subIDdisplay;
    private javax.swing.JLabel subNamedisplay;
    private javax.swing.JTextField teacherTextField;
    // End of variables declaration//GEN-END:variables

    private Map<String, Object> toCheckInDataMap() {

        String sessionID = selectedData.getSessionID();
        String subjectID = selectedData.getSubjectID();
        String subjectName = selectedData.getSubjectName();
        String classTime = selectedData.getClassTime();
        String classroom = selectedData.getClassroom();
        String teacherName = selectedData.getTeacherName();
        String sessionNote = selectedData.getSessionNote();
        boolean isActive = selectedData.isIsActive();

        Student student = (Student) AuthUser.getAuthUser();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        String checkInByStudentCode = student.getStudentId();
        String checkInByStudentFirstName = student.getThFirstName();
        String checkInByStudentLastName = student.getThLastName();
        String checkInByStudentTitle = student.getThNameTitle();
        String checkInAt = dtf.format(LocalDateTime.now());

        Map<String, Object> checkInData = new HashMap<>();

        ArrayList<String> studentCheckIn = selectedData.getStudentCheckIn();
        String studentInfo = checkInByStudentCode + "&" + checkInByStudentTitle + " " + checkInByStudentFirstName + " " + checkInByStudentLastName + "&" + checkInAt;
        studentCheckIn.add(studentInfo);

        checkInData.put("sessionID", sessionID);
        checkInData.put("subjectID", subjectID);
        checkInData.put("subjectName", subjectName);
        checkInData.put("classTime", classTime);
        checkInData.put("classroom", classroom);
        checkInData.put("teacherName", teacherName);
        checkInData.put("sessionNote", sessionNote);
        checkInData.put("isActive", isActive);
        checkInData.put("studentCheckIn", studentCheckIn);

        return checkInData;
    }
}
