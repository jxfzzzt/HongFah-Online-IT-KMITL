/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms.admin.subject;
import checkin.CheckInSession;
/**
 *
 * @author WINDOWS 10
 */
public class CheckingForms extends javax.swing.JFrame {

    /**
     * Creates new form forms
     */
    public CheckingForms() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        studentCheckTable = new javax.swing.JTable();
        deActivateB = new javax.swing.JButton();
        classcode = new javax.swing.JLabel();
        detailPanel = new javax.swing.JPanel();
        finalClassID = new javax.swing.JLabel();
        subjectName = new javax.swing.JTextField();
        finalClassName = new javax.swing.JLabel();
        subjectID = new javax.swing.JTextField();
        FinalTime = new javax.swing.JLabel();
        finalClassroom = new javax.swing.JLabel();
        time = new javax.swing.JTextField();
        finalTeacher = new javax.swing.JLabel();
        classroom = new javax.swing.JTextField();
        teacher = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        courseDetail = new javax.swing.JTextArea();
        finalDetail = new javax.swing.JLabel();
        finalCode = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        studentCheckTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Student ID", "Name", "Chech-in"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(studentCheckTable);
        if (studentCheckTable.getColumnModel().getColumnCount() > 0) {
            studentCheckTable.getColumnModel().getColumn(2).setMinWidth(10);
        }

        deActivateB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        deActivateB.setText("ปิดการเข้าเช็คชื่อ");
        deActivateB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deActivateBActionPerformed(evt);
            }
        });

        classcode.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        classcode.setText("123456");

        finalClassID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        finalClassID.setText("รหัสวิชา");

        subjectName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        finalClassName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        finalClassName.setText("ชื่อวิชา");

        subjectID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        subjectID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectIDActionPerformed(evt);
            }
        });

        FinalTime.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        FinalTime.setText("วัน - เวลาเรียน");

        finalClassroom.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        finalClassroom.setText("ห้องเรียน");

        time.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeActionPerformed(evt);
            }
        });

        finalTeacher.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        finalTeacher.setText("ชื่ออาจารย์ผู้สอน");

        classroom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        classroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classroomActionPerformed(evt);
            }
        });

        teacher.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        teacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherActionPerformed(evt);
            }
        });

        courseDetail.setColumns(20);
        courseDetail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        courseDetail.setRows(5);
        jScrollPane2.setViewportView(courseDetail);

        finalDetail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        finalDetail.setText("รายละเอียดวิชา");

        javax.swing.GroupLayout detailPanelLayout = new javax.swing.GroupLayout(detailPanel);
        detailPanel.setLayout(detailPanelLayout);
        detailPanelLayout.setHorizontalGroup(
            detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailPanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(finalClassroom)
                        .addGap(64, 64, 64)
                        .addComponent(FinalTime))
                    .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, detailPanelLayout.createSequentialGroup()
                            .addComponent(classroom, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(time))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, detailPanelLayout.createSequentialGroup()
                            .addComponent(subjectID, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(subjectName, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(detailPanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(finalClassID)
                        .addGap(71, 71, 71)
                        .addComponent(finalClassName))
                    .addGroup(detailPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(finalTeacher))
                    .addComponent(teacher, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(detailPanelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(finalDetail)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        detailPanelLayout.setVerticalGroup(
            detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(finalClassID)
                    .addComponent(finalClassName)
                    .addComponent(finalDetail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(detailPanelLayout.createSequentialGroup()
                        .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(subjectName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subjectID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(finalClassroom)
                            .addComponent(FinalTime))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(classroom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(finalTeacher)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(teacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        finalCode.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        finalCode.setText("CODE : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deActivateB)
                .addGap(340, 340, 340))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(classcode)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(finalCode)
                                .addGap(49, 49, 49)))
                        .addComponent(detailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 814, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(detailPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(finalCode)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(classcode)
                        .addGap(35, 35, 35)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deActivateB)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deActivateBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deActivateBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deActivateBActionPerformed

    private void classroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classroomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classroomActionPerformed

    private void subjectIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectIDActionPerformed

    private void timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeActionPerformed

    private void teacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teacherActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CheckingForms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckingForms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckingForms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckingForms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckingForms().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FinalTime;
    private javax.swing.JLabel classcode;
    private javax.swing.JTextField classroom;
    private javax.swing.JTextArea courseDetail;
    private javax.swing.JButton deActivateB;
    private javax.swing.JPanel detailPanel;
    private javax.swing.JLabel finalClassID;
    private javax.swing.JLabel finalClassName;
    private javax.swing.JLabel finalClassroom;
    private javax.swing.JLabel finalCode;
    private javax.swing.JLabel finalDetail;
    private javax.swing.JLabel finalTeacher;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable studentCheckTable;
    private javax.swing.JTextField subjectID;
    private javax.swing.JTextField subjectName;
    private javax.swing.JTextField teacher;
    private javax.swing.JTextField time;
    // End of variables declaration//GEN-END:variables
}
