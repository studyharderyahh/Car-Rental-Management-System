/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package View;


import Model.Customer;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author a2597
 */
public class ShowCustomerIFrame extends javax.swing.JInternalFrame {

    public DefaultTableModel model;

    /**
     * Creates new form ShowCustomerIFrame
     */
    public ShowCustomerIFrame() {
        initComponents();
        model = (DefaultTableModel) CustomerDetailsTable.getModel();
        populateCustomerTable();
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
        CustomerDetailsTable = new javax.swing.JTable();
        goBackButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();

        CustomerDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CustomerID", "Name", "Gender", "Address", "DOB", "Phone", "License No", "License Type", "License Expire Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(CustomerDetailsTable);

        goBackButton.setBackground(new java.awt.Color(255, 51, 0));
        goBackButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        goBackButton.setForeground(new java.awt.Color(255, 255, 255));
        goBackButton.setText("Go Back");
        goBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(51, 0, 255));
        deleteButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 204));
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(goBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(246, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackButtonActionPerformed
        // TODO add your handling code here:
        CustomerDashboardInternalFrame dashBoard = new CustomerDashboardInternalFrame();
        dashBoard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_goBackButtonActionPerformed

    private void populateCustomerTable() {
        model.setRowCount(0);

        ArrayList<Customer> customers = HomeForm.person.getCustomers();

        // Populate the table with customer data
        for (Customer c : customers) {
            Object[] customerData = {
                c.getPersonID(),
                c.getName(),
                c.getGender(),
                c.getAddress(),
                c.getPhone(),
                c.getDateOfBirth().getDate(),
                c.getLicenseNumber(),
                c.getLicenseType(),
                c.getLicenseExpiryDate()
            };
            model.addRow(customerData);
        }
    }
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        // Get the selected row
        int selectedRow = CustomerDetailsTable.getSelectedRow();

        // Check if a row is selected
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Get the person ID from the selected row
        String personIdToDelete = (String) CustomerDetailsTable.getValueAt(selectedRow, 0);

        // Display a confirmation dialog
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this Customer?", "Confirm Delete", JOptionPane.YES_NO_OPTION);

        // Check the user's response
        if (confirm == JOptionPane.YES_OPTION) {
            // Remove the selected row from the table model
            model.removeRow(selectedRow);
            HomeForm.person.removeCustomerById(personIdToDelete);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CustomerDetailsTable;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton goBackButton;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    
}
