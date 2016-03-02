

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
import java.sql.PreparedStatement;

public class Confirmation extends javax.swing.JFrame {

    /**
     * Creates new form Confirmation
     */
    public Confirmation() {

        initComponents();
        this.setLocationRelativeTo(null);
    }

    public Confirmation(String passedFirstName, String passedLastName, String passedMiddleName, String passedCwuID, String passedEmail, String passedDateOfBirth,
            String passedAreaCode, String passedMiddleThreePhoneNumber, String passedLastThreePhoneNumber, String passedStreetAddress,
            String passedAptNumber, String passedCity, String passedState, String passedZipcode, String passedGender, String passedSSN,
            String passedAcaM, String passedPGradD, String passedEthnicity, String passedPlaceOfBirth, String passedSelectiveNumber, String passedMailingResident, String passedMailingDorm,
            String passedMailingStreet, String passedMailingCity, String passedMailingState, String passedMailingZip, String passedPriorS, 
            String passedHasPriorS, String passedIllHealth, String passedNotify, String passedMaritialS, String passedPFirst, String passedPMI, String passedPLast, String passedPAddress,
            String passedPCity, String passedPState, String passedPZipcode, String passedPNumber, String passedPPlaceOfBirth, String passedNoD,
            String passedChildren, String passedChildFN, String passedChildMI, String passedChildLN, String passedChildDoB, String passedChildRelatonship,
            String passedChildStreet, String passedChildCity, String passedChildState, String passedChildZip, String passedChildPN, String passedFatherFN, String passedFatherMI,
            String passedFatherLN, String passedFatherStreet, String passedFatherCity, String passedFatherState, String passedFatherZip,
            String passedFatherPN, String passedMotherFN, String passedMotherMI, String passedMotherLN, String passedMotherStreet,
            String passedMotherCity, String passedMotherState, String passedMotherZip, String passedMotherPN,
            String passedEContact, String passedEContactStreet, String passedEContactCity, String passedEContactState, String passedEZip,
            String passedEContactPN, String passedDBeneficiary, String passedDBeneficiaryRelationship, String passedDBeneficiaryStreet,
            String passedDBeneficiaryCity, String passedDBeneficiaryState, String passedDBeneficiaryZip, String passedDBeneficiaryPN,
            String passedDBeneficiaryPercent, String passedGuardianPS, String passedGuardianHasPS, String passedGuardianPSYears, String passedGuardianPSGrade,
            String passedGuardianPSStart, String passedGuardianPSFinish, String passedGuardianPSDischarge, String passedGuardianPSRemaining,
            String psasedJunior, String passedEagle, String passedEnlisted) {

            initComponents();
            this.setLocationRelativeTo(null);

            String fullName, conPrior2, conGuardianPS2;

            conFN.setText(passedFirstName);
            conLN.setText(passedLastName);
            conMI.setText(passedMiddleName);
            conCWUID.setText(passedCwuID);
            conEmail.setText(passedEmail);
            conDoB.setText(passedDateOfBirth);

            if (passedAreaCode.isEmpty() || passedMiddleThreePhoneNumber.isEmpty() || passedLastThreePhoneNumber.isEmpty()) {
                conPNum.setText("No input found");
            } else {
                conPNum.setText("(" + passedAreaCode + ")" + "-" + passedMiddleThreePhoneNumber + "-" + passedLastThreePhoneNumber);
            }

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
            conPrior.setText(passedPriorS);
            conPriorYes.setText(passedHasPriorS);

            conGuardianPSYes.setText(passedGuardianHasPS);
            conGuardianPS.setText(passedGuardianPS);
            conEnlisted.setText(passedEnlisted);
            conJunior.setText(passedJunior);
            conEagle.setText(passedEagle);
            conFull.setText(passedLastName + "," + passedFirstName + " " + passedMiddleName);

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
        conFullName = new javax.swing.JPanel();
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
        conPriorYes = new javax.swing.JLabel();
        conGuardianPSYes = new javax.swing.JLabel();
        conFull = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();

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

        conAptNumber.setText("no input found");

        jLabel15.setText("Social Secuirty Number");

        jLabel16.setText("Academenic Major");

        jLabel17.setText("Projected Grad. Date");

        jLabel18.setText("Ethnicity");

        jLabel19.setText("Marital Status:");

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

        conSSN.setText("no input found");

        conAcaM.setText("no input found");

        conGradD.setText("no input found");

        conEthnicity.setText("no input found");

        conMaritialS.setText("no input found");

        conPartnerN.setText("no input found");

        conPAddress.setText("no input found");

        conPCity.setText("no input found");

        conPState.setText("no input found");

        conPNumber.setText("no input found");

        conPPoB.setText("no input found");

        conNoD.setText("no input found");

        conChildren.setText("no input found");

        conEContact.setText("no input found");

        conEStreet.setText("no input found");

        conENumber.setText("no input found");

        conDeathB.setText("no input found");

        conPrior.setText("no input found");

        conGuardianPS.setText("no input found");

        conEnlisted.setText("no input found");

        conJunior.setText("no input found");

        conEagle.setText("no input found");

        jLabel37.setText("Emergency City");

        conECity.setText("no input found");

        jLabel38.setText("Emergency State");

        conEState.setText("no input found");

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

        conPriorYes.setText("no input found");

        conGuardianPSYes.setText("no input found");

        conFull.setText("no input found");

        jLabel39.setText("Full Name:");

        javax.swing.GroupLayout conFullNameLayout = new javax.swing.GroupLayout(conFullName);
        conFullName.setLayout(conFullNameLayout);
        conFullNameLayout.setHorizontalGroup(
            conFullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conFullNameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(conFullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
                    .addGroup(conFullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(conFullNameLayout.createSequentialGroup()
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
                    .addComponent(jLabel13)
                    .addComponent(jLabel39))
                .addGroup(conFullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(conFullNameLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(conFullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(conFullNameLayout.createSequentialGroup()
                                .addComponent(conLN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(112, 112, 112))
                            .addComponent(conMI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(conFullNameLayout.createSequentialGroup()
                                .addGroup(conFullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(conFull, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(conFN, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(conFullNameLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(conFullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addComponent(conEnlisted, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(conJunior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(conEagle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(conECity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(conEState, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, conFullNameLayout.createSequentialGroup()
                                .addGroup(conFullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(conPrior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(conGuardianPS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(conFullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(conPriorYes, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                    .addComponent(conGuardianPSYes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(481, 481, 481))
                            .addComponent(conDoB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
            .addGroup(conFullNameLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        conFullNameLayout.setVerticalGroup(
            conFullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conFullNameLayout.createSequentialGroup()
                .addGroup(conFullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(conFN)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(conFullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(conLN)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(conFullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(conFull)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(conFullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(conMI)
                    .addComponent(jLabel39))
                .addGap(9, 9, 9)
                .addGroup(conFullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(conCWUID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(conFullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(conEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(conFullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(conDoB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(conFullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(conPNum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(conFullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conStreet))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(conFullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(conAptNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(conFullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(conCity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(conFullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(conState))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(conFullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(conZip))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(conFullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(conGender))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(conFullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(conSSN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(conFullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(conAcaM))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(conFullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(conGradD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(conFullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(conEthnicity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(conFullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(conMaritialS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(conFullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(conPartnerN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(conFullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(conPAddress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(conFullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(conPCity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(conFullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(conPState))
                .addGap(18, 18, 18)
                .addGroup(conFullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(conPNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(conFullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(conPPoB))
                .addGap(18, 18, 18)
                .addGroup(conFullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(conNoD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(conFullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(conChildren))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(conFullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(conEContact))
                .addGap(18, 18, 18)
                .addGroup(conFullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(conEStreet))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(conFullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(conECity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(conFullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(conEState))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(conFullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(conENumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(conFullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(conDeathB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(conFullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(conPrior)
                    .addComponent(conPriorYes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(conFullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(conGuardianPS)
                    .addComponent(conGuardianPSYes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(conFullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(conEnlisted))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(conFullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(conJunior))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(conFullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(conEagle))
                .addGap(18, 18, 18)
                .addGroup(conFullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(conFullName);

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 916, Short.MAX_VALUE)
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

        try {
            Connection con = null;
            String queryCheck = "SELECT * from INFO WHERE CWUID = " + "'" + conCWUID.getText() +"'";
            String url = "jdbc:derby://localhost:1527/CadetInfo";
            String username = "adminCadre";
            String password = "cadrecwu";

            con = DriverManager.getConnection(url, username, password);
            Statement sta = con.createStatement();
            ResultSet rs = sta.executeQuery(queryCheck); // execute the query, and get a java resultset

// if this ID already exists, we delete the old coloumn and readd the cadet
            if (rs.next()) {

                try {

                    //delete the old entry
                    
                    String query = "delete from INFO where CWUID = " + conCWUID.getText();
                    PreparedStatement preparedStmt = con.prepareStatement(query);
                    preparedStmt.execute();
                    //add new entry
                    sta.executeUpdate("INSERT INTO INFO VALUES ('" + conLN.getText() + "', '" + conFN.getText() + "', '" + conMI.getText() + "','" + conFull.getText() + "','" + conSSN.getText() + "','" + conDoB.getText() + "','" + conCWUID.getText() + "',"
                            + "'" + conEmail.getText() + "','" + conPNum.getText() + "', '" + conStreet.getText() + "','" + conAptNumber.getText() + "',"
                            + "'" + conCity.getText() + "','" + conState.getText() + "', '" + conZip.getText() + "','" + conGender.getText() + "',"
                            + "'" + conAcaM.getText() + "','" + conGradD.getText() + "', '" + conEthnicity.getText() + "',"
                            + "'" + conMaritialS.getText() + "','" + conPartnerN.getText() + "', '" + conPAddress.getText() + "', '" + conPCity.getText() + "',"
                            + "'" + conPState.getText() + "','" + conPNumber.getText() + "', '" + conPPoB.getText() + "', '" + conNoD.getText() + "',  "
                            + "'" + conEContact.getText() + "','" + conEStreet.getText() + "', '" + conECity.getText() + "','" + conEState.getText() + "', '" + conENumber.getText() + "','" + conDeathB.getText() + "',"
                            + "'" + conPriorYes.getText() + "',"
                            + "'" + conJunior.getText() + "','" + conChildren.getText() + "',"
                            + "'" + conPrior.getText() + "','" + conEagle.getText() + "','" + conEnlisted.getText() + "','" + conGuardianPSYes.getText() + "', '" + conGuardianPS.getText() + "')");

                    sta.close();    
                } catch (Exception e) {
                    System.err.println("Exception: " + e.getMessage());
                
                }
            } else {//else it dose not exist
                System.out.println("HERE");
                //add new entry
                sta.executeUpdate("INSERT INTO INFO VALUES ('" + conLN.getText() + "', '" + conFN.getText() + "', '" + conMI.getText() + "','" + conFull.getText() + "','" + conSSN.getText() + "','" + conDoB.getText() + "','" + conCWUID.getText() + "',"
                        + "'" + conEmail.getText() + "','" + conPNum.getText() + "', '" + conStreet.getText() + "','" + conAptNumber.getText() + "',"
                        + "'" + conCity.getText() + "','" + conState.getText() + "', '" + conZip.getText() + "','" + conGender.getText() + "',"
                        + "'" + conAcaM.getText() + "','" + conGradD.getText() + "', '" + conEthnicity.getText() + "',"
                        + "'" + conMaritialS.getText() + "','" + conPartnerN.getText() + "', '" + conPAddress.getText() + "', '" + conPCity.getText() + "',"
                        + "'" + conPState.getText() + "','" + conPNumber.getText() + "', '" + conPPoB.getText() + "', '" + conNoD.getText() + "',  "
                        + "'" + conEContact.getText() + "','" + conEStreet.getText() + "', '" + conECity.getText() + "','" + conEState.getText() + "', '" + conENumber.getText() + "','" + conDeathB.getText() + "',"
                        + "'" + conPriorYes.getText() + "',"
                        + "'" + conJunior.getText() + "','" + conChildren.getText() + "',"
                        + "'" + conPrior.getText() + "','" + conEagle.getText() + "','" + conEnlisted.getText() + "','" + conGuardianPSYes.getText() + "', '" + conGuardianPS.getText() + "')");

                sta.close();

            }
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
        }

//end else

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        adminInformation adminInfo = new adminInformation(conFN.getText(), conLN.getText(), conMI.getText(), conCWUID.getText(),
                conEmail.getText(), conDoB.getText(), conPNum.getText().substring(1, 4), conPNum.getText().substring(6, 9), conPNum.getText().substring(10, 14),
                conAptNumber.getText(), conStreet.getText(), conCity.getText(), conState.getText(), conZip.getText(), conGender.getText(), conSSN.getText(),
                conAcaM.getText(), conGradD.getText(), conEthnicity.getText(), conMaritialS.getText(), conPartnerN.getText(), conPAddress.getText(), conPCity.getText(),
                conPState.getText(), conPNumber.getText(), conPPoB.getText(), conNoD.getText(), conChildren.getText(), conEContact.getText(), conEStreet.getText(), conECity.getText(),
                conEState.getText(), conENumber.getText(), conDeathB.getText(),
                conPrior.getText(), conPriorYes.getText(), conGuardianPS.getText(), conGuardianPSYes.getText(), conEnlisted.getText(), conJunior.getText(), conEagle.getText());

        adminInfo.setVisible(true);
        this.dispose();
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
    private javax.swing.JLabel conFull;
    private javax.swing.JPanel conFullName;
    private javax.swing.JLabel conGender;
    private javax.swing.JLabel conGradD;
    private javax.swing.JLabel conGuardianPS;
    private javax.swing.JLabel conGuardianPSYes;
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
    private javax.swing.JLabel conPriorYes;
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
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
