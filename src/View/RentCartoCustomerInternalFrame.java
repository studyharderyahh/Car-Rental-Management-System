/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package View;

import Model.BodyTypeofCar;
import Model.StatusoftheCar;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author Kashish Patel
 */
public class RentCartoCustomerInternalFrame extends javax.swing.JInternalFrame {

    ArrayList<RentCartoCustomer> car = new ArrayList<RentCartoCustomer>();
    ArrayList<RentCartoCustomer> customerList = new ArrayList<RentCartoCustomer>();

    RentCartoCustomer rc = new RentCartoCustomer();

    
    public RentCartoCustomerInternalFrame() {

        initComponents();

        RentCartoCustomer customer1 = new RentCartoCustomer("C01", "John Doe", "+1234567890", "123 Main St, Cityville");
        RentCartoCustomer customer2 = new RentCartoCustomer("C02", "Jane Smith", "+9876543210", "456 Oak St, Townsville");
        RentCartoCustomer customer3 = new RentCartoCustomer("C03", "Bob Johnson", "+1112223333", "789 Pine St, Villagetown");
        RentCartoCustomer customer4 = new RentCartoCustomer("C04", "Alice Williams", "+4445556666", "321 Elm St, Hamlet");
        RentCartoCustomer customer5 = new RentCartoCustomer("C05", "Charlie Brown", "+7778889999", "654 Birch St, Countryside");
        RentCartoCustomer customer6 = new RentCartoCustomer("C06", "Eva Davis", "+3334445555", "987 Maple St, Riverside");
        RentCartoCustomer customer7 = new RentCartoCustomer("C07", "Michael White", "+6667778888", "101 Cedar St, Lakeside");
        RentCartoCustomer customer8 = new RentCartoCustomer("C08", "Sophia Miller", "+2223334444", "202 Willow St, Mountainside");
        RentCartoCustomer customer9 = new RentCartoCustomer("C09", "Ryan Wilson", "+5556667777", "303 Rose St, Hilltop");
        RentCartoCustomer customer10 = new RentCartoCustomer("C10", "Olivia Davis", "+8889990000", "404 Sun St, Seaside");
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);
        customerList.add(customer5);
        customerList.add(customer6);
        customerList.add(customer7);
        customerList.add(customer8);
        customerList.add(customer9);
        customerList.add(customer10);
        refreshcombobox();

    }

    public ArrayList<String> getCustomerIds() {
        ArrayList<String> ids = new ArrayList<String>();
        for (RentCartoCustomer customer : customerList) {
            ids.add(customer.getCustomerID());
        }
        return ids;
    }

    public void refreshcombobox() {
        DefaultComboBoxModel idModel = new DefaultComboBoxModel(getCustomerIds().toArray());
        CustomerComboBox.setModel(idModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RentCarDesktopPane = new javax.swing.JDesktopPane();
        jLabel9 = new javax.swing.JLabel();
        DueDateDatePicker = new org.jdesktop.swingx.JXDatePicker();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        StatusofCarComboBox = new javax.swing.JComboBox<>();
        DateRentedDatePicker = new org.jdesktop.swingx.JXDatePicker();
        ColourTextField = new javax.swing.JTextField();
        RentalAmountTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        RentCarButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        TypeofCarComboBox = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        CustomerComboBox = new javax.swing.JComboBox<>();
        AddnewCustomerButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        RegisterationNumTextField = new javax.swing.JTextField();
        SearchButton = new javax.swing.JButton();

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel9.setText("Status Of Car:");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel2.setText("Colour:");

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel7.setText("Rental Amount:");

        StatusofCarComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusofCarComboBoxActionPerformed(evt);
            }
        });

        DateRentedDatePicker.setToolTipText("");
        DateRentedDatePicker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateRentedDatePickerActionPerformed(evt);
            }
        });

        ColourTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColourTextFieldActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel8.setText("Type Of Car:");

        RentCarButton.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        RentCarButton.setText("RENT CAR ");
        RentCarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RentCarButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel6.setText("Date Rented:");

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel11.setText("Due Date :");

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("Customer");

        AddnewCustomerButton.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        AddnewCustomerButton.setText("Add New Customer");
        AddnewCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddnewCustomerButtonActionPerformed(evt);
            }
        });

        RentCarDesktopPane.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        RentCarDesktopPane.setLayer(DueDateDatePicker, javax.swing.JLayeredPane.DEFAULT_LAYER);
        RentCarDesktopPane.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        RentCarDesktopPane.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        RentCarDesktopPane.setLayer(StatusofCarComboBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        RentCarDesktopPane.setLayer(DateRentedDatePicker, javax.swing.JLayeredPane.DEFAULT_LAYER);
        RentCarDesktopPane.setLayer(ColourTextField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        RentCarDesktopPane.setLayer(RentalAmountTextField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        RentCarDesktopPane.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        RentCarDesktopPane.setLayer(RentCarButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        RentCarDesktopPane.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        RentCarDesktopPane.setLayer(TypeofCarComboBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        RentCarDesktopPane.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        RentCarDesktopPane.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        RentCarDesktopPane.setLayer(CustomerComboBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        RentCarDesktopPane.setLayer(AddnewCustomerButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout RentCarDesktopPaneLayout = new javax.swing.GroupLayout(RentCarDesktopPane);
        RentCarDesktopPane.setLayout(RentCarDesktopPaneLayout);
        RentCarDesktopPaneLayout.setHorizontalGroup(
            RentCarDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RentCarDesktopPaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RentCarButton)
                .addGap(235, 235, 235))
            .addGroup(RentCarDesktopPaneLayout.createSequentialGroup()
                .addGroup(RentCarDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addGroup(RentCarDesktopPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, 65)
                .addGroup(RentCarDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RentCarDesktopPaneLayout.createSequentialGroup()
                        .addGroup(RentCarDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StatusofCarComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RentalAmountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DateRentedDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(RentCarDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11)
                            .addComponent(jLabel1))
                        .addGap(25, 25, 25)
                        .addGroup(RentCarDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DueDateDatePicker, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TypeofCarComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CustomerComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(ColourTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 30, Short.MAX_VALUE))
            .addGroup(RentCarDesktopPaneLayout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(AddnewCustomerButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RentCarDesktopPaneLayout.setVerticalGroup(
            RentCarDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RentCarDesktopPaneLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(RentCarDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ColourTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(RentCarDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(DateRentedDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(DueDateDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RentCarDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RentCarDesktopPaneLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9))
                    .addGroup(RentCarDesktopPaneLayout.createSequentialGroup()
                        .addGroup(RentCarDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RentalAmountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(TypeofCarComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(RentCarDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(StatusofCarComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(CustomerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24)
                .addComponent(AddnewCustomerButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RentCarButton)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel5.setText("Registeration Number:");

        RegisterationNumTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterationNumTextFieldActionPerformed(evt);
            }
        });

        SearchButton.setText("Search");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RentCarDesktopPane)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RegisterationNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(SearchButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RegisterationNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RentCarDesktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddnewCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddnewCustomerButtonActionPerformed
        // TODO add your handling code here:
        RentCarDesktopPane.removeAll();
        AddCustomerIFrame iframe = new AddCustomerIFrame();
        iframe.setVisible(true);
        RentCarDesktopPane.add(iframe);

    }//GEN-LAST:event_AddnewCustomerButtonActionPerformed

    private void StatusofCarComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusofCarComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StatusofCarComboBoxActionPerformed

    private void DateRentedDatePickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateRentedDatePickerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateRentedDatePickerActionPerformed

    private void ColourTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColourTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ColourTextFieldActionPerformed

    private void RentCarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RentCarButtonActionPerformed
        // TODO add your handling code here:

//             DefaultComboBoxModel Customer = new DefaultComboBoxModel(Customer.values());
//             CustomerComboBox.setModel(Customer);

    }//GEN-LAST:event_RentCarButtonActionPerformed

    private void RegisterationNumTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterationNumTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegisterationNumTextFieldActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        // TODO add your handling code here:

        String registerationNum = RegisterationNumTextField.getText();
        RentCartoCustomer car1 = new RentCartoCustomer("ABC123", "Blue", new Date(), new Date(), 100, StatusoftheCar.InShop, BodyTypeofCar.SEDAN);
        RentCartoCustomer car2 = new RentCartoCustomer("XYZ456", "Red", new Date(), new Date(), 120, StatusoftheCar.InShop, BodyTypeofCar.SUV);
        RentCartoCustomer car3 = new RentCartoCustomer("DEF789", "Green", new Date(), new Date(), 90, StatusoftheCar.InShop, BodyTypeofCar.HATCHBACK);
        RentCartoCustomer car4 = new RentCartoCustomer("GHI012", "Black", new Date(), new Date(), 110, StatusoftheCar.InShop, BodyTypeofCar.VAN);
        RentCartoCustomer car5 = new RentCartoCustomer("JKL345", "Silver", new Date(), new Date(), 95, StatusoftheCar.InShop, BodyTypeofCar.SEDAN);
        RentCartoCustomer car6 = new RentCartoCustomer("MNO678", "White", new Date(), new Date(), 130, StatusoftheCar.InShop, BodyTypeofCar.SUV);
        RentCartoCustomer car7 = new RentCartoCustomer("PQR901", "Yellow", new Date(), new Date(), 100, StatusoftheCar.InShop, BodyTypeofCar.HATCHBACK);
        RentCartoCustomer car8 = new RentCartoCustomer("STU234", "Gray", new Date(), new Date(), 115, StatusoftheCar.InShop, BodyTypeofCar.VAN);
        RentCartoCustomer car9 = new RentCartoCustomer("VWX567", "Brown", new Date(), new Date(), 98, StatusoftheCar.InShop, BodyTypeofCar.SEDAN);
        RentCartoCustomer car10 = new RentCartoCustomer("YZA890", "Purple", new Date(), new Date(), 125, StatusoftheCar.InShop, BodyTypeofCar.SUV);
        car.add(car1);
        car.add(car2);
        car.add(car3);
        car.add(car4);
        car.add(car5);
        car.add(car6);
        car.add(car7);
        car.add(car8);
        car.add(car9);

        boolean found = false;

        for (RentCartoCustomer c : car) {
            if (c.getRegisterationNum().equals(registerationNum)) {
                found = true;
                String colour = c.getColour();
                Date daterented = c.getDaterented();
                Date duedate = c.getDuedate();
                float rentalamount = c.getRentalamount();
                DefaultComboBoxModel typeofCar = new DefaultComboBoxModel(BodyTypeofCar.values());
                TypeofCarComboBox.setModel(typeofCar);
                DefaultComboBoxModel statusoftheCar = new DefaultComboBoxModel(StatusoftheCar.values());
                StatusofCarComboBox.setModel(statusoftheCar);
                ColourTextField.setText(colour);
                DateRentedDatePicker.setDate(daterented);
                DueDateDatePicker.setDate(duedate);
                RentalAmountTextField.setText(String.valueOf(rentalamount));
                break;

            }

        }
        if (!found) {
            JOptionPane.showMessageDialog(this, "Invalid registration number");
        }


    }//GEN-LAST:event_SearchButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddnewCustomerButton;
    private javax.swing.JTextField ColourTextField;
    private javax.swing.JComboBox<String> CustomerComboBox;
    private org.jdesktop.swingx.JXDatePicker DateRentedDatePicker;
    private org.jdesktop.swingx.JXDatePicker DueDateDatePicker;
    private javax.swing.JTextField RegisterationNumTextField;
    private javax.swing.JButton RentCarButton;
    private javax.swing.JDesktopPane RentCarDesktopPane;
    private javax.swing.JTextField RentalAmountTextField;
    private javax.swing.JButton SearchButton;
    private javax.swing.JComboBox<String> StatusofCarComboBox;
    private javax.swing.JComboBox<String> TypeofCarComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

}
