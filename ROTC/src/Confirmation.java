

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Austin
 */
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JOptionPane;
import java.io.*;







public class Confirmation extends javax.swing.JFrame {

    private boolean conChildren1;
    private boolean conPrior1;
    private boolean conGuardianPS1;
    private boolean conEagle1;
    private String fullName, conPrior2, conGuardianPS2;
    /**
     * Creates new form Confirmation
     */
    public Confirmation() {
        
        initComponents();
        this.setLocationRelativeTo(null);
    }

     public Confirmation( String passedFirstName, String passedLastName, String passedMiddleInitial, 
            String passedCwuID, String passedEmail, String passedDateOfBirth, String passedAreaCode,
            String passedMiddleThreePhoneNumber, String passedLastThreePhoneNumber, String passedAptNumber,
            String passedStreetAddress, String passedCity, String passedState, String passedZipcode, String passedGender, String passedSSN, String passedAcaM,
            String passedPGradD, String passedEthnicity, String passedMaritialS, String passedPName, String passedPAddress, String passedPCity, String passedPState,
            String passedPNumber, String passedPoB, String passedNoD, String passedChildren, String passedEContact, String passedEStreet,String passedECity, String passedEState, String passedENumber,
            String passedDBeneficiary, String passedPriorS,String passedHasPriorS, String passedGuardianPS,String passedGuardianHasPS, String passedEnlisted, 
             String passedJunior, String passedEagle
            ){
       
         initComponents();
         this.setLocationRelativeTo(null);
         
       
        
      
        conFN.setText(passedFirstName);
        conLN.setText(passedLastName);
        conMI.setText(passedMiddleInitial);
        conCWUID.setText(passedCwuID);
        conEmail.setText(passedEmail);
        conDoB.setText(passedDateOfBirth);
        
        if(passedAreaCode.isEmpty() || passedMiddleThreePhoneNumber.isEmpty() || passedLastThreePhoneNumber.isEmpty()) {
                conPNum.setText("No input found");
            }else
                conPNum.setText("(" + passedAreaCode + ")" + "-" + passedMiddleThreePhoneNumber + "-" + passedLastThreePhoneNumber);
       
        conStreet.setText(passedStreetAddress);
        conAptNumber.setText(passedAptNumber);
        conCity.setText(passedCity);
        conState.setText(passedState);
        conZip.setText(passedZipcode);
        conGender.setText(passedGender);
        conSSN.setText(passedSSN);
        conAcaM.setText(passedAcaM);
        conGradD.setText(passedPGradD);
        conEthnicity.setText(passedEthnicity);
        conMaritialS.setText(passedMaritialS);
        conPartnerN.setText(passedPName);
        conPAddress.setText(passedPAddress);
        conPCity.setText(passedPCity);
        conPState.setText(passedPState);
        conPNumber.setText(passedPNumber);
        conPPoB.setText(passedPoB);
        conNoD.setText(passedNoD);
        conChildren.setText(passedChildren);
        conEContact.setText(passedEContact);
        conEStreet.setText(passedEStreet);
        conECity.setText(passedECity);
        conEState.setText(passedEState);
        conENumber.setText(passedENumber);
        conDeathB.setText(passedDBeneficiary);
        conPrior.setText(passedPriorS + " " + passedHasPriorS );
        conPrior2 = passedHasPriorS;
        conGuardianPS.setText(passedGuardianPS + " " + passedGuardianHasPS);
        conEnlisted.setText(passedEnlisted);
        conJunior.setText(passedJunior);
        conEagle.setText(passedEagle);
        
        
        //String conChildren1 = conChildren.getText();
        
        if(conChildren.getText().equals("Yes"))
            conChildren1 = true;
        else
            conChildren1 = false;

      
        
        if(passedPriorS.equals("Yes")){
            conPrior1 = true;
            conPrior2 = passedHasPriorS;
        }
        else
            conPrior1 = false;
            conPrior2 = "N/A";
            
        //String conGuardianPS1 = conGuardianPS.getText();
    
        
        if(passedGuardianPS.equals("Retired Military") || passedGuardianPS.equals("Active Duty")){
            conGuardianPS1 = true;
            conGuardianPS2 = passedGuardianHasPS;
        }
        else {
            conGuardianPS1 = false;
            conGuardianPS2 = "N/A";
        }

        //String conEagle1 = conEagle.getText();
        
        if(conEagle.getText().equals("Yes"))
            conEagle1 = true;
        else
            conEagle1 = false;
        String fullName = conLN + ", " + conFN + " " + conMI;
                
     
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        conLN = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        conStreet = new javax.swing.JLabel();
        conPNum = new javax.swing.JLabel();
        conState = new javax.swing.JLabel();
        conZip = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        conCWUID = new javax.swing.JLabel();
        conMI = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        conFN = new javax.swing.JLabel();
        conEmail = new javax.swing.JLabel();
        conDoB = new javax.swing.JLabel();
        conCity = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        conGender = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        conAptNumber = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        conSSN = new javax.swing.JLabel();
        conAcaM = new javax.swing.JLabel();
        conGradD = new javax.swing.JLabel();
        conEthnicity = new javax.swing.JLabel();
        conMaritialS = new javax.swing.JLabel();
        conPartnerN = new javax.swing.JLabel();
        conPAddress = new javax.swing.JLabel();
        conPCity = new javax.swing.JLabel();
        conPState = new javax.swing.JLabel();
        conPNumber = new javax.swing.JLabel();
        conPPoB = new javax.swing.JLabel();
        conNoD = new javax.swing.JLabel();
        conChildren = new javax.swing.JLabel();
        conEContact = new javax.swing.JLabel();
        conEStreet = new javax.swing.JLabel();
        conENumber = new javax.swing.JLabel();
        conDeathB = new javax.swing.JLabel();
        conPrior = new javax.swing.JLabel();
        conGuardianPS = new javax.swing.JLabel();
        conEnlisted = new javax.swing.JLabel();
        conJunior = new javax.swing.JLabel();
        conEagle = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        conECity = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        conEState = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Please confirm that all information is correct.");

        jLabel3.setText("Street Address:");

        conLN.setText("no input found");

        jLabel13.setText("Zip Code:");

        conStreet.setText("no input found");

        conPNum.setText("no input found");

        conState.setText("no input found");

        conZip.setText("no input found");

        jLabel9.setText("Gender:");

        jLabel7.setText("Middle Initial:");

        jLabel6.setText("First Name:");

        conCWUID.setText("no input found");

        conMI.setText("no input found");

        jLabel2.setText("Last Name:");

        jLabel5.setText("Email:");

        jLabel8.setText("Date of birth (YYYY\\MM\\DD):");

        jLabel11.setText("City:");

        jLabel12.setText("State:");

        conFN.setText("no input found");

        conEmail.setText("no input found");

        conDoB.setText("no input found");

        conCity.setText("no input found");

        jLabel4.setText("Phone Number:");

        jLabel10.setText("CWU ID:");

        conGender.setText("no input found");

        jLabel14.setText("Apartment:");

        conAptNumber.setText("N/A");

        jLabel15.setText("Social Secuirty Number");

        jLabel16.setText("Academenic Major");

        jLabel17.setText("Projected Grad. Date");

        jLabel18.setText("Ethnicity");

        jLabel19.setText("Maritial Status:");

        jLabel20.setText("Partner Name:");

        jLabel21.setText("Partner Address:");

        jLabel22.setText("Partner City:");

        jLabel23.setText("Partner State:");

        jLabel24.setText("Partner Number:");

        jLabel25.setText("Partner Place of Birth:");

        jLabel26.setText("Number of Dependents:");

        jLabel27.setText("Do you have any children:");

        jLabel28.setText("Emergency Contact:");

        jLabel29.setText("Emergency Street");

        jLabel30.setText("Emergency Number:");

        jLabel31.setText("Death Beneficary");

        jLabel32.setText("Prior Service:");

        jLabel33.setText("Guardian Prior Service:");

        jLabel34.setText("Enlisted or Warrant officer:");

        jLabel35.setText("Junior ROTC:");

        jLabel36.setText("Eagle Scout:");

        conSSN.setText("jLabel37");

        conAcaM.setText("jLabel38");

        conGradD.setText("jLabel39");

        conEthnicity.setText("jLabel40");

        conMaritialS.setText("jLabel41");

        conPartnerN.setText("jLabel42");

        conPAddress.setText("jLabel43");

        conPCity.setText("jLabel44");

        conPState.setText("jLabel45");

        conPNumber.setText("jLabel46");

        conPPoB.setText("jLabel47");

        conNoD.setText("jLabel48");

        conChildren.setText("jLabel49");

        conEContact.setText("jLabel50");

        conEStreet.setText("jLabel51");

        conENumber.setText("jLabel52");

        conDeathB.setText("jLabel53");

        conPrior.setText("jLabel54");

        conGuardianPS.setText("jLabel55");

        conEnlisted.setText("jLabel56");

        conJunior.setText("jLabel57");

        conEagle.setText("jLabel58");

        jLabel37.setText("Emergency City");

        conECity.setText("jLabel51");

        jLabel38.setText("Emergency State");

        conEState.setText("jLabel51");

        jButton1.setText("Save to Database");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Go Back");
        jButton3.setActionCommand("Go back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel38)
                    .addComponent(jLabel37)
                    .addComponent(jLabel36)
                    .addComponent(jLabel35)
                    .addComponent(jLabel34)
                    .addComponent(jLabel33)
                    .addComponent(jLabel32)
                    .addComponent(jLabel31)
                    .addComponent(jLabel30)
                    .addComponent(jLabel29)
                    .addComponent(jLabel28)
                    .addComponent(jLabel27)
                    .addComponent(jLabel26)
                    .addComponent(jLabel25)
                    .addComponent(jLabel24)
                    .addComponent(jLabel23)
                    .addComponent(jLabel22)
                    .addComponent(jLabel21)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19)
                    .addComponent(jLabel18)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14)
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel5))
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3)
                    .addComponent(jLabel13))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(conFN, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
                                    .addComponent(conLN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(conDoB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(conMI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(conCWUID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(conEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(conPNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(conStreet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(conAptNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(conCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(conState, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(conZip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(conGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(conSSN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(conAcaM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(conGradD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(conEthnicity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(conMaritialS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(conPartnerN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(conPAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(conPCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(conPState, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(conPNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(conPPoB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(conNoD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(conChildren, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(conEContact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(conEStreet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(conENumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(conDeathB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(conPrior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(conGuardianPS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(conEnlisted, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(conJunior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(conEagle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(conECity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(conEState, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(conFN)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(conLN))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(conMI))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(conCWUID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(conEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(conDoB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(conPNum))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(conStreet))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(conAptNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(conCity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(conState))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(conZip))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(conGender))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(conSSN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(conAcaM))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(conGradD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(conEthnicity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(conMaritialS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(conPartnerN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(conPAddress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(conPCity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(conPState))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(conPNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(conPPoB))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(conNoD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(conChildren))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(conEContact))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(conEStreet))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(conECity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(conEState))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(conENumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(conDeathB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(conPrior))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(conGuardianPS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(conEnlisted))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(conJunior))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(conEagle))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 904, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   /* (LASTNAME, FIRSTNAME, MIDDLEINITIAL, CWUID,EMAIL,DATEOFBIRTHMDDYYYY,PHONENUMBER,STREETADDRESS
          ,APT,CITY,STATE,ZIPCODE,GENDER,SSAN,ACAMAJOR,GRADDATE,ETHNICITY,MARITIALSTATUS,PARTNERNAME,PARTNERADDRESS,PARTNERCITY
        ,PARTNERSTATE,PARTNERNUMBER,PARTNERNUMBER,PARTNERPOB,DEPENDANTS,CHILDREN,EMERGENCYCONTACT,EMERGENCYSTREET,EMERGENCYNUMBER,
        DEATHBENEFICARY,PRIORSERVICE,PRIORSERVICEYES,GUARDIANPRIORSERVICE,GUARDIANPRIORSERVICEYES,ENLISTEDWARRANT
        ,JUNIORROTC,EAGESCOUT)
    */
    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     Connection con = null;
     
     try {
         String url = "jdbc:derby://localhost:1527/CadetInfo";
         String username = "adminCadre";
         String password = "cadrecwu";
         con = DriverManager.getConnection(url, username, password);
         Statement sta = con.createStatement();
         System.out.println(conChildren1 + " " + conPrior1 + " " +conGuardianPS1 + " " +conEagle1);
         
         sta.executeUpdate("INSERT INTO INFO " +
 "VALUES ('"+conLN.getText()+"', '"+conFN.getText()+"', '"+conMI.getText()+"','"+fullName+"', '"+conSSN.getText()+"','"+conDoB.getText()+"','"+conCWUID.getText()+"',"
                 + " '"+conEmail.getText()+"','"+conPNum.getText()+"', '"+conStreet.getText()+"', '"+conAptNumber.getText()+"',"
                 + "'"+conCity.getText()+"', '"+conState.getText()+"', '"+conZip.getText()+"','"+conGender.getText()+"', "
                 + "'"+conAcaM.getText()+"', '"+conGradD.getText()+"', '"+conEthnicity.getText()+"', "
                 + "'"+conMaritialS.getText()+"','"+conPartnerN.getText()+"', '"+conPAddress.getText()+"', '"+conPCity.getText()+"', "
                 + "'"+conPState.getText()+"','"+conPNumber.getText()+"', '"+conPPoB.getText()+"', '"+conNoD.getText()+"', '"+ conChildren1+"', "
                 + "'"+conEContact.getText()+"', '"+conEStreet.getText()+"', '"+conECity.getText()+"', '"+conEState.getText()+"', '"+conENumber.getText()+"', '"+conDeathB.getText()+"', "
                 + "'"+conPrior1+"', '"+conPrior2+"', '"+conGuardianPS1+"', '"+conGuardianPS2+"', "
                 + "'"+conEnlisted.getText()+"', '"+conJunior.getText()+"', '"+conEagle1+"')");
         
         sta.close();
         
     }catch (Exception e) {
      System.err.println("Exception: "+e.getMessage());
    }
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
      
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Confirmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Confirmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Confirmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Confirmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //Questionnaire question = new Questionnaire();
        //jLabel14 = question.
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Confirmation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel conAcaM;
    private javax.swing.JLabel conAptNumber;
    private javax.swing.JLabel conCWUID;
    private javax.swing.JLabel conChildren;
    private javax.swing.JLabel conCity;
    private javax.swing.JLabel conDeathB;
    private javax.swing.JLabel conDoB;
    private javax.swing.JLabel conECity;
    private javax.swing.JLabel conEContact;
    private javax.swing.JLabel conENumber;
    private javax.swing.JLabel conEState;
    private javax.swing.JLabel conEStreet;
    private javax.swing.JLabel conEagle;
    private javax.swing.JLabel conEmail;
    private javax.swing.JLabel conEnlisted;
    private javax.swing.JLabel conEthnicity;
    private javax.swing.JLabel conFN;
    private javax.swing.JLabel conGender;
    private javax.swing.JLabel conGradD;
    private javax.swing.JLabel conGuardianPS;
    private javax.swing.JLabel conJunior;
    private javax.swing.JLabel conLN;
    private javax.swing.JLabel conMI;
    private javax.swing.JLabel conMaritialS;
    private javax.swing.JLabel conNoD;
    private javax.swing.JLabel conPAddress;
    private javax.swing.JLabel conPCity;
    private javax.swing.JLabel conPNum;
    private javax.swing.JLabel conPNumber;
    private javax.swing.JLabel conPPoB;
    private javax.swing.JLabel conPState;
    private javax.swing.JLabel conPartnerN;
    private javax.swing.JLabel conPrior;
    private javax.swing.JLabel conSSN;
    private javax.swing.JLabel conState;
    private javax.swing.JLabel conStreet;
    private javax.swing.JLabel conZip;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
