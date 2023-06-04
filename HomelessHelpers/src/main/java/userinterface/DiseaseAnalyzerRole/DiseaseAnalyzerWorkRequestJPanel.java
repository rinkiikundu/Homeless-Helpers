/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.DiseaseAnalyzerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.LocalHospitalAgencyEnterprise;
import Business.Network.Network;
import Business.Organization.PharmacyOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BloodTestWorkRequest;
import Business.WorkQueue.DiseaseAnalyzerWorkRequest;
import Business.WorkQueue.PharmacyWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ameyg
 */
public class DiseaseAnalyzerWorkRequestJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    DiseaseAnalyzerWorkRequest request;
    private UserAccount userAccount;
    private EcoSystem business;

    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    public DiseaseAnalyzerWorkRequestJPanel(JPanel userProcessContainer, DiseaseAnalyzerWorkRequest request, UserAccount userAccount, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.userAccount = userAccount;
        this.business = business;
        populateTable();
    }

    public void populateTable() {
        DefaultTableModel model1 = (DefaultTableModel) tblHomelessPersonRecords1.getModel();
        DefaultTableModel model2 = (DefaultTableModel) tblHomelessPersonRecords2.getModel();
        model1.setRowCount(0);
        model2.setRowCount(0);
        if (request.getHomelessPerson() != null) {
            Object[] row = new Object[8];
            row[0] = request.getHomelessPerson().getName();
            row[1] = request.gethospitalAllocationWorkRequest().getDepartment();
            row[2] = request.getHomelessPerson().getCity();
            row[3] = request.getHomelessPerson().getCurrentAddress();
            row[4] = request.getHomelessPerson().getSSNNo();
            row[5] = request.getHomelessPerson().getContactNo();
            row[6] = request.getHomelessPerson().getEmailAddress();
            row[7] = request.getHomelessPerson().getDependents();
            model1.addRow(row);
            Object[] rowSecond = new Object[5];
            rowSecond[0] = request.getHomelessPerson().getGender();
            rowSecond[1] = request.getHomelessPerson().isHasCriminalRecord() ? "Yes" : "No";
            rowSecond[2] = request.getHomelessPerson().isMajorIllness() ? "Yes" : "No";
            rowSecond[3] = request.getHomelessPerson().isCarrierDisease() ? "Yes" : "No";
            rowSecond[4] = request.getHomelessPerson().isGeneticDisease() ? "Yes" : "No";
            model2.addRow(rowSecond);

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        resultJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHomelessPersonRecords1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHomelessPersonRecords2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFieldHousingOption1 = new javax.swing.JTextField();
        btnPassResults = new javax.swing.JButton();
        btnFailResults = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(223, 190, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        resultJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultJTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(resultJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 731, 88, 0));

        backJButton.setBackground(new java.awt.Color(114, 158, 161));
        backJButton.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        backJButton.setText("<");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 50));

        tblHomelessPersonRecords1.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        tblHomelessPersonRecords1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Department", "City", "current address", "SSNNo", "Contact No", "Email Address", "Dependents"
            }
        ));
        jScrollPane1.setViewportView(tblHomelessPersonRecords1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 195, 1225, 100));

        tblHomelessPersonRecords2.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        tblHomelessPersonRecords2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Qualifications", "Accomplishments", "Income", "Employ Status", "Gender", "Criminal Record?", "Major Illness??", "Carrier Illness??", "Genetic Illness??"
            }
        ));
        jScrollPane2.setViewportView(tblHomelessPersonRecords2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 313, 1225, 100));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(104, 144, 146));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Disease Analysis Work Area");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 1225, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel3.setText("Enter Detected Disease & Medicines Details");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 431, 469, -1));

        txtFieldHousingOption1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldHousingOption1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtFieldHousingOption1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 350, 30));

        btnPassResults.setBackground(new java.awt.Color(114, 158, 161));
        btnPassResults.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        btnPassResults.setText("Submit Results");
        btnPassResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPassResultsActionPerformed(evt);
            }
        });
        jPanel1.add(btnPassResults, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 659, 250, 50));

        btnFailResults.setBackground(new java.awt.Color(114, 158, 161));
        btnFailResults.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        btnFailResults.setText("No Disease");
        btnFailResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFailResultsActionPerformed(evt);
            }
        });
        jPanel1.add(btnFailResults, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 659, -1, 50));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Person Details:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 143, 1225, 34));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1237, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 824, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 824, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnFailResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFailResultsActionPerformed
        if (request.getStatus().equals("Completed")) {
            JOptionPane.showMessageDialog(null, "This request has already been completed by you!");
            return;
        }
        UserAccount account = new UserAccount();
        account.setUsername("None");
        request.gethospitalAllocationWorkRequest().setReceiver(account);
        request.gethospitalAllocationWorkRequest().setTestResult("The request has been denied by Disease Analyzer");
        request.setStatus("Completed");
        JOptionPane.showMessageDialog(null, "Volunteer has been informed abt failure!");
    }//GEN-LAST:event_btnFailResultsActionPerformed

    private void btnPassResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPassResultsActionPerformed
        if (request.getStatus().equals("Completed")) {
            JOptionPane.showMessageDialog(null, "This request has already been completed by you!");
            return;
        }

        List<String> diseases = new ArrayList<>();
        if (!txtFieldHousingOption1.getText().equals("")) {
            diseases.add(txtFieldHousingOption1.getText());
        }
        request.setStatus("Completed");
        request.setTestResult("Sent to Pharmacy");
        request.gethospitalAllocationWorkRequest().setTestResult("Completed by Disease Analysis and and sent to Pharmacy");
        UserAccount account = new UserAccount();
        account.setUsername("None");
        request.gethospitalAllocationWorkRequest().setReceiver(account);
        request.gethospitalAllocationWorkRequest().setDiseasesForHomeless(diseases);
        PharmacyWorkRequest fcRequest = new PharmacyWorkRequest();
        fcRequest.setMessage("Provide Medicines");
        fcRequest.setSender(userAccount);
        fcRequest.setStatus("Sent");
        fcRequest.setHomelessPerson(request.getHomelessPerson());
        fcRequest.setHospitalAllocationWorkRequest(request.gethospitalAllocationWorkRequest());
        Date d = new Date();
        fcRequest.setRequestDate(d);
        Organization org = null;

        for (Network network : business.getNetworkList()) {
            //Step 2.a: check against each enterprise
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise instanceof LocalHospitalAgencyEnterprise) {
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (organization instanceof PharmacyOrganization) {
                            org = organization;
                            break;
                        }
                    }
                }
            }
        }
        if (org != null) {
            org.getWorkQueue().getWorkRequestList().add(fcRequest);
            userAccount.getWorkQueue().getWorkRequestList().add(fcRequest);
            JOptionPane.showMessageDialog(this, "Request Sent to Pharmacy Organization");
        }
    }//GEN-LAST:event_btnPassResultsActionPerformed

    private void txtFieldHousingOption1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldHousingOption1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldHousingOption1ActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DiseaseAnalyzerWorkAreaJPanel dwjp = (DiseaseAnalyzerWorkAreaJPanel) component;
        dwjp.populateReceiveTable();
        dwjp.populateSentTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void resultJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultJTextFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnFailResults;
    private javax.swing.JButton btnPassResults;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField resultJTextField;
    private javax.swing.JTable tblHomelessPersonRecords1;
    private javax.swing.JTable tblHomelessPersonRecords2;
    private javax.swing.JTextField txtFieldHousingOption1;
    // End of variables declaration//GEN-END:variables
}
