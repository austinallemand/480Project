

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
            String passedAcaM, String passedPGradD, String passedEthnicity, String passedPlaceOfBirth, String passedSelectiveNumber, 
            String passedMailingResident, String passedMailingDorm,
            String passedMailingStreet, String passedMailingCity, String passedMailingState, String passedMailingZip, String passedPriorS, 
            String passedHasPriorS, String passedIllHealth, String passedNotify, String passedNoD, 
            
            String passedMaritialS, String passedPFirst, String passedPMI, String passedPLast, String passedPStreet,
            String passedPCity, String passedPState, String passedPZipcode, String passedPNumber, String passedPPlaceOfBirth,
            String passedChildren, String passedChildFN, String passedChildMI, String passedChildLN, String passedChildDoB, String passedChildRelatonship,
            String passedChildStreet, String passedChildCity, String passedChildState, String passedChildZip, String passedChildPN, 
            String passedFatherFN, String passedFatherMI,
            String passedFatherLN, String passedFatherStreet, String passedFatherCity, String passedFatherState, String passedFatherZip,
            String passedFatherPN, 
            String passedMotherFN, String passedMotherMI, String passedMotherLN, String passedMotherStreet,
            String passedMotherCity, String passedMotherState, String passedMotherZip, String passedMotherPN,
            String passedEContact, String passedEContactStreet, String passedEContactCity, String passedEContactState, String passedEZip,
            String passedEContactPN, 
            
            String passedDBeneficiary, String passedDBeneficiaryRelationship, String passedDBeneficiaryStreet,
            String passedDBeneficiaryCity, String passedDBeneficiaryState, String passedDBeneficiaryZip, String passedDBeneficiaryPN,
            String passedDBeneficiaryPercent, 
            String passedGuardianPS, String passedGuardianHasPS, String passedGuardianPSYears, String passedGuardianPSGrade,
            String passedGuardianPSStart, String passedGuardianPSFinish, String passedGuardianPSDischarge, String passedGuardianPSRemaining,
            String passedJunior, String passedEagle, 
            
            String passedQuestion1A, String passedQuestion2A, String passedQuestion3A, String passedQuestion4A, String passedQuestion5A, String passedQuestion6A,
            String passedQuestion6B, String passedQuestion7A, String passedQuestion8A, String passedQuestion9A, String passedQuestion10A,String passedQuestion10B,
            String passedQuestion11A, String passedQuestion12A, String passedQuestion13A, String passedQuestion14A) {

            initComponents();
            this.setLocationRelativeTo(null);

            //First tab

            conFN.setText(passedFirstName);
            conLN.setText(passedLastName);
            conMN.setText(passedMiddleName);
            conFull.setText(passedLastName + "," + passedFirstName + " " + passedMiddleName);
            conCWUID.setText(passedCwuID);
            conEmail.setText(passedEmail);
            conDoB.setText(passedDateOfBirth);

            if (passedAreaCode.isEmpty() || passedMiddleThreePhoneNumber.isEmpty() || passedLastThreePhoneNumber.isEmpty()) {
                            conPN.setText("No input found");
            } 
            else {
                    conPN.setText(passedAreaCode + "-" + passedMiddleThreePhoneNumber + "-" + passedLastThreePhoneNumber);
            }

            conStreet.setText(passedStreetAddress);
            conApt.setText(passedAptNumber);
            conCity.setText(passedCity);
            conState.setText(passedState);
            conZip.setText(passedZipcode);
            conGender.setText(passedGender);
            conSSN.setText(passedSSN);
            conAcMajor.setText(passedAcaM);
            conGradDate.setText(passedPGradD);
            conRace.setText(passedEthnicity);
            conPoB.setText(passedPlaceOfBirth);
            conSelectiveServiceNum.setText(passedSelectiveNumber);
            conDiffMailing.setText(passedMailingResident);
            conMailingDorm.setText(passedMailingDorm);
            conMailingStreet.setText(passedMailingStreet);
            conMailingCity.setText(passedMailingCity);
            conMailingState.setText(passedMailingState);
            conMailingZip.setText(passedMailingZip);
            conPriorS.setText(passedPriorS);
            conHasPriorS.setText(passedHasPriorS);
            conIllHealth.setText(passedIllHealth);
            conNotify.setText(passedNotify);
            conNoD.setText(passedNoD);
            
            //Second tab

            conMaritialS.setText(passedMaritialS);
            conPartnerFN.setText(passedPFirst);
            conPartnerMI.setText(passedPMI);
            conPartnerLN.setText(passedPLast);
            conPartnerStreet.setText(passedPStreet);
            conPartnerCity.setText(passedPCity);
            conPartnerState.setText(passedPState);
            conPartnerZip.setText(passedPZipcode);
            conPartnerPN.setText(passedPNumber);
            conPartnerPoB.setText(passedPPlaceOfBirth);
            conChildren.setText(passedChildren);
            conChildFN.setText(passedChildFN);
            conChildMI.setText(passedChildMI);
            conChildLN.setText(passedChildLN);
            conChildDoB.setText(passedChildDoB);
            conChildRelationship.setText(passedChildRelatonship);
            conChildStreet.setText(passedChildStreet);
            conChildCity.setText(passedChildCity);
            conChildState.setText(passedChildState);
            conChildZip.setText(passedChildZip);
            conChildPN.setText(passedChildPN);
            
            //Third tab

            conFatherFN.setText(passedFatherFN);
            conFatherMI.setText(passedFatherMI);
            conFatherLN.setText(passedFatherLN);
            conFatherStreet.setText(passedFatherStreet);
            conFatherCity.setText(passedFatherCity);
            conFatherState.setText(passedFatherState);
            conFatherZip.setText(passedFatherZip);
            conFatherPN.setText(passedFatherPN);
            conMotherFN.setText(passedMotherFN);
            conMotherMI.setText(passedMotherMI);
            conMotherLN.setText(passedMotherLN);
            conMotherStreet.setText(passedMotherStreet);
            conMotherCity.setText(passedMotherCity);
            conMotherState.setText(passedMotherState);
            conMotherZip.setText(passedMotherZip);
            conMotherPN.setText(passedMotherPN);
            conEmergency.setText(passedEContact);
            conEmergencyStreet.setText(passedEContactStreet);
            conEmergencyCity.setText(passedEContactCity);
            conEmergencyState.setText(passedEContactState);
            conEmergencyZip.setText(passedEZip);
            conEmergencyPN.setText(passedEContactPN);
            
            //Fourth Tab

            conDeath.setText(passedDBeneficiary);
            conDeathRelationship.setText(passedDBeneficiaryRelationship);
            conDeathStreet.setText(passedDBeneficiaryStreet);
            conDeathCity.setText(passedDBeneficiaryCity);
            conDeathState.setText(passedDBeneficiaryState);
            conDeathZip.setText(passedDBeneficiaryZip);
            conDeathPN.setText(passedDBeneficiaryPN);
            conDeathPercentage.setText(passedDBeneficiaryPercent);
            conGuardStatus.setText(passedGuardianPS);
            conHasPriorGuardS.setText(passedGuardianHasPS);
            conGuardianYearsOfService.setText(passedGuardianPSYears);
            conGuardianHighGrade.setText(passedGuardianPSGrade);
            conGuardianFrom.setText(passedGuardianPSStart);
            conGuardianTo.setText(passedGuardianPSFinish);
            conGuardianType.setText(passedGuardianPSDischarge);
            conGuardianYearsRem.setText(passedGuardianPSRemaining);
            conJuniorROTC.setText(passedJunior);
            conEagleScout.setText(passedEagle);

            //Fifth Tab
            
            conQuestion1A.setText(passedQuestion1A);
            conQuestion2A.setText(passedQuestion2A);
            conQuestion3A.setText(passedQuestion3A);
            conQuestion4A.setText(passedQuestion4A);
            conQuestion5A.setText(passedQuestion5A);
            conQuestion6A.setText(passedQuestion6A);
            conQuestion6B.setText(passedQuestion6B);
            conQuestion7A.setText(passedQuestion7A);
            conQuestion8A.setText(passedQuestion8A);
            conQuestion9A.setText(passedQuestion9A);
            conQuestion10A.setText(passedQuestion10A);
            conQuestion10B.setText(passedQuestion10B);
            conQuestion11A.setText(passedQuestion11A);
            conQuestion12A.setText(passedQuestion12A);
            conQuestion13A.setText(passedQuestion13A);
            conQuestion14A.setText(passedQuestion14A);
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabelFN = new javax.swing.JLabel();
        jLabelLN = new javax.swing.JLabel();
        jLabelMI = new javax.swing.JLabel();
        jLabelCWUID = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelDoB = new javax.swing.JLabel();
        jLabelPN = new javax.swing.JLabel();
        jLabelStreet = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabelCity = new javax.swing.JLabel();
        jLabelState = new javax.swing.JLabel();
        jLabelZip = new javax.swing.JLabel();
        jLabelGender = new javax.swing.JLabel();
        jLabelSSN = new javax.swing.JLabel();
        jLabelAM = new javax.swing.JLabel();
        jLabelPGD = new javax.swing.JLabel();
        jLabelEth = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabelPS1 = new javax.swing.JLabel();
        jLabelSSN1 = new javax.swing.JLabel();
        jLabelSSN2 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabelNoD = new javax.swing.JLabel();
        conFN = new javax.swing.JLabel();
        conLN = new javax.swing.JLabel();
        conMN = new javax.swing.JLabel();
        conCWUID = new javax.swing.JLabel();
        conEmail = new javax.swing.JLabel();
        conDoB = new javax.swing.JLabel();
        conPN = new javax.swing.JLabel();
        conStreet = new javax.swing.JLabel();
        conApt = new javax.swing.JLabel();
        conCity = new javax.swing.JLabel();
        conState = new javax.swing.JLabel();
        conZip = new javax.swing.JLabel();
        conGender = new javax.swing.JLabel();
        conSSN = new javax.swing.JLabel();
        conAcMajor = new javax.swing.JLabel();
        conGradDate = new javax.swing.JLabel();
        conRace = new javax.swing.JLabel();
        conPoB = new javax.swing.JLabel();
        conSelectiveServiceNum = new javax.swing.JLabel();
        conDiffMailing = new javax.swing.JLabel();
        conMailingDorm = new javax.swing.JLabel();
        conMailingStreet = new javax.swing.JLabel();
        conMailingCity = new javax.swing.JLabel();
        conMailingState = new javax.swing.JLabel();
        conMailingZip = new javax.swing.JLabel();
        conPriorS = new javax.swing.JLabel();
        conHasPriorS = new javax.swing.JLabel();
        conIllHealth = new javax.swing.JLabel();
        conNotify = new javax.swing.JLabel();
        conNoD = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        conFull = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabelMS = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        conMaritialS = new javax.swing.JLabel();
        conPartnerFN = new javax.swing.JLabel();
        conPartnerMI = new javax.swing.JLabel();
        conPartnerLN = new javax.swing.JLabel();
        conPartnerStreet = new javax.swing.JLabel();
        conPartnerCity = new javax.swing.JLabel();
        conPartnerState = new javax.swing.JLabel();
        conPartnerZip = new javax.swing.JLabel();
        conPartnerPN = new javax.swing.JLabel();
        conPartnerPoB = new javax.swing.JLabel();
        conChildren = new javax.swing.JLabel();
        conChildFN = new javax.swing.JLabel();
        conChildMI = new javax.swing.JLabel();
        conChildLN = new javax.swing.JLabel();
        conChildDoB = new javax.swing.JLabel();
        conChildRelationship = new javax.swing.JLabel();
        conChildStreet = new javax.swing.JLabel();
        conChildCity = new javax.swing.JLabel();
        conChildState = new javax.swing.JLabel();
        conChildZip = new javax.swing.JLabel();
        conChildPN = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabelEC = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        conFatherFN = new javax.swing.JLabel();
        conFatherMI = new javax.swing.JLabel();
        conFatherLN = new javax.swing.JLabel();
        conFatherStreet = new javax.swing.JLabel();
        conFatherCity = new javax.swing.JLabel();
        conFatherState = new javax.swing.JLabel();
        conFatherZip = new javax.swing.JLabel();
        conFatherPN = new javax.swing.JLabel();
        conMotherFN = new javax.swing.JLabel();
        conMotherMI = new javax.swing.JLabel();
        conMotherLN = new javax.swing.JLabel();
        conMotherStreet = new javax.swing.JLabel();
        conMotherCity = new javax.swing.JLabel();
        conMotherState = new javax.swing.JLabel();
        conMotherZip = new javax.swing.JLabel();
        conMotherPN = new javax.swing.JLabel();
        conEmergency = new javax.swing.JLabel();
        conEmergencyStreet = new javax.swing.JLabel();
        conEmergencyCity = new javax.swing.JLabel();
        conEmergencyState = new javax.swing.JLabel();
        conEmergencyZip = new javax.swing.JLabel();
        conEmergencyPN = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabelDB = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabelGPS1 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabelJROTC1 = new javax.swing.JLabel();
        jLabelEagleScount1 = new javax.swing.JLabel();
        conDeath = new javax.swing.JLabel();
        conDeathRelationship = new javax.swing.JLabel();
        conDeathStreet = new javax.swing.JLabel();
        conDeathCity = new javax.swing.JLabel();
        conDeathState = new javax.swing.JLabel();
        conDeathZip = new javax.swing.JLabel();
        conDeathPN = new javax.swing.JLabel();
        conDeathPercentage = new javax.swing.JLabel();
        conGuardianYearsOfService = new javax.swing.JLabel();
        conGuardianHighGrade = new javax.swing.JLabel();
        conGuardianFrom = new javax.swing.JLabel();
        conGuardianTo = new javax.swing.JLabel();
        conGuardianType = new javax.swing.JLabel();
        conGuardianYearsRem = new javax.swing.JLabel();
        conJuniorROTC = new javax.swing.JLabel();
        conGuardStatus = new javax.swing.JLabel();
        conHasPriorGuardS = new javax.swing.JLabel();
        conEagleScout = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        Question1 = new javax.swing.JLabel();
        Question2 = new javax.swing.JLabel();
        Question3 = new javax.swing.JLabel();
        Question4 = new javax.swing.JLabel();
        Question5 = new javax.swing.JLabel();
        Question6 = new javax.swing.JLabel();
        Question7 = new javax.swing.JLabel();
        Question8 = new javax.swing.JLabel();
        Question10 = new javax.swing.JLabel();
        Question11 = new javax.swing.JLabel();
        Question9 = new javax.swing.JLabel();
        Question12 = new javax.swing.JLabel();
        Question13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Question14 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        goBack = new javax.swing.JButton();
        conQuestion1A = new javax.swing.JLabel();
        conQuestion2A = new javax.swing.JLabel();
        conQuestion3A = new javax.swing.JLabel();
        conQuestion4A = new javax.swing.JLabel();
        conQuestion5A = new javax.swing.JLabel();
        conQuestion6A = new javax.swing.JLabel();
        conQuestion6B = new javax.swing.JLabel();
        conQuestion7A = new javax.swing.JLabel();
        conQuestion8A = new javax.swing.JLabel();
        conQuestion9A = new javax.swing.JLabel();
        conQuestion10A = new javax.swing.JLabel();
        conQuestion10B = new javax.swing.JLabel();
        conQuestion11A = new javax.swing.JLabel();
        conQuestion12A = new javax.swing.JLabel();
        conQuestion13A = new javax.swing.JLabel();
        conQuestion14A = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Please confirm that all information is correct.");

        jLabelFN.setText("First Name:");

        jLabelLN.setText("Last Name:");

        jLabelMI.setText("Middle Name:");

        jLabelCWUID.setText("CWU ID:");

        jLabelEmail.setText("Email:");

        jLabelDoB.setText("Date of birth (YYYY/MM/DD):");

        jLabelPN.setText("Phone Number:");

        jLabelStreet.setText("Street Address:");

        jLabel40.setText("Apartment:");

        jLabelCity.setText("City:");

        jLabelState.setText("State:");

        jLabelZip.setText("Zip Code:");

        jLabelGender.setText("Gender:");

        jLabelSSN.setText("Social Security:");

        jLabelAM.setText("Academic Major:");

        jLabelPGD.setText("Projected Graduation Date (YY/MM):");

        jLabelEth.setText("Ethnicity:");

        jLabel9.setText("Place of Birth(City,State):");

        jLabel15.setText("Selective Service Number:");

        jLabel16.setText("<html>Mailing address the same<br></br> as resident address?</br></html>");

        jLabel18.setText("Street Address:");

        jLabel19.setText("City:");

        jLabel20.setText("State:");

        jLabel22.setText("Zip Code:");

        jLabelPS1.setText("Prior Service:");

        jLabelSSN1.setText("Don't notify due to ill health:");

        jLabelSSN2.setText("Notify instead:");

        jLabel23.setText("Dorm and Room #");

        jLabelNoD.setText("Number of dependants:");

        conFN.setText("jLabel21");

        conLN.setText("jLabel21");

        conMN.setText("jLabel21");

        conCWUID.setText("jLabel21");

        conEmail.setText("jLabel21");

        conDoB.setText("jLabel21");

        conPN.setText("jLabel21");

        conStreet.setText("jLabel21");

        conApt.setText("jLabel21");

        conCity.setText("jLabel21");

        conState.setText("jLabel21");

        conZip.setText("jLabel21");

        conGender.setText("jLabel21");

        conSSN.setText("jLabel21");

        conAcMajor.setText("jLabel21");

        conGradDate.setText("jLabel21");

        conRace.setText("jLabel21");

        conPoB.setText("jLabel21");

        conSelectiveServiceNum.setText("jLabel21");

        conDiffMailing.setText("jLabel21");

        conMailingDorm.setText("jLabel21");

        conMailingStreet.setText("jLabel21");

        conMailingCity.setText("jLabel21");

        conMailingState.setText("jLabel21");

        conMailingZip.setText("jLabel21");

        conPriorS.setText("jLabel21");

        conHasPriorS.setText("jLabel21");

        conIllHealth.setText("jLabel21");

        conNotify.setText("jLabel21");

        conNoD.setText("jLabel21");

        jLabel21.setText("Full Name:");

        conFull.setText("jLabel24");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelPGD, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelAM, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelSSN, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelGender, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelZip, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelState, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelCity, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelStreet, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelPN, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelDoB, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelMI, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelLN, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelFN, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelEth, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel21)
                                        .addComponent(jLabelCWUID)))
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(conFN, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(conMN)
                                    .addComponent(conLN)
                                    .addComponent(conCWUID)
                                    .addComponent(conEmail)
                                    .addComponent(conDoB)
                                    .addComponent(conFull)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(conStreet)
                                    .addComponent(conPN)
                                    .addComponent(conApt)
                                    .addComponent(conCity)
                                    .addComponent(conState)
                                    .addComponent(conZip)
                                    .addComponent(conGender)
                                    .addComponent(conSSN)
                                    .addComponent(conAcMajor)
                                    .addComponent(conGradDate)
                                    .addComponent(conRace)))
                            .addComponent(conPoB)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23)
                            .addComponent(jLabel18))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(conMailingDorm))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(conSelectiveServiceNum))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(conDiffMailing))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(conMailingCity)
                                    .addComponent(conMailingStreet)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(conMailingZip)
                                    .addComponent(conMailingState)))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelSSN1)
                            .addComponent(jLabelPS1)
                            .addComponent(jLabelSSN2)
                            .addComponent(jLabelNoD))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(conPriorS, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(conHasPriorS))
                            .addComponent(conIllHealth)
                            .addComponent(conNotify)
                            .addComponent(conNoD))))
                .addContainerGap(343, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFN)
                    .addComponent(conFN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLN)
                    .addComponent(conLN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMI)
                    .addComponent(conMN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(conFull))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCWUID)
                    .addComponent(conCWUID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail)
                    .addComponent(conEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDoB)
                    .addComponent(conDoB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPN)
                    .addComponent(conPN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conStreet))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(conApt))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabelCity))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(conCity)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelState)
                    .addComponent(conState))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelZip)
                    .addComponent(conZip))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGender)
                    .addComponent(conGender))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabelSSN))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(conSSN)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAM)
                    .addComponent(conAcMajor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPGD)
                    .addComponent(conGradDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEth)
                    .addComponent(conRace))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conPoB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(conSelectiveServiceNum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conDiffMailing))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(conMailingDorm))
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(conMailingStreet))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(conMailingCity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(conMailingState))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(conMailingZip))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPS1)
                    .addComponent(conPriorS)
                    .addComponent(conHasPriorS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSSN1)
                    .addComponent(conIllHealth))
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSSN2)
                    .addComponent(conNotify))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoD)
                    .addComponent(conNoD))
                .addContainerGap(540, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Personal Information", jPanel4);

        jLabelMS.setText("Marital Status:");

        jLabel4.setText("Partner First Name:");

        jLabel29.setText("Partner Middle Initial:");

        jLabel28.setText("Partner Last Name:");

        jLabel11.setText("Partner Street Address:");

        jLabel13.setText("Partner City:");

        jLabel14.setText("Partner State:");

        jLabel56.setText("Partner Zipcode:");

        jLabel12.setText("Phone Number:");

        jLabel8.setText("Partner place of Birth :");

        jLabel2.setText("Do you have any children?");

        jLabel30.setText("Child First Name:");

        jLabel31.setText("Child Middle Initial:");

        jLabel32.setText("Child Last Name:");

        jLabel33.setText("Child Date of Birth(YYYY/MM/DD):");

        jLabel35.setText("Child Relationship:");

        jLabel36.setText("Child Street Address:");

        jLabel37.setText("Child City:");

        jLabel55.setText("Child Phone Number:");

        jLabel52.setText("Child State:");

        jLabel66.setText("Child Zipcode:");

        conMaritialS.setText("jLabel21");

        conPartnerFN.setText("jLabel21");

        conPartnerMI.setText("jLabel21");

        conPartnerLN.setText("jLabel21");

        conPartnerStreet.setText("jLabel21");

        conPartnerCity.setText("jLabel21");

        conPartnerState.setText("jLabel21");

        conPartnerZip.setText("jLabel21");

        conPartnerPN.setText("jLabel21");

        conPartnerPoB.setText("jLabel21");

        conChildren.setText("jLabel21");

        conChildFN.setText("jLabel21");

        conChildMI.setText("jLabel21");

        conChildLN.setText("jLabel21");

        conChildDoB.setText("jLabel21");

        conChildRelationship.setText("jLabel21");

        conChildStreet.setText("jLabel21");

        conChildCity.setText("jLabel21");

        conChildState.setText("jLabel21");

        conChildZip.setText("jLabel21");

        conChildPN.setText("jLabel21");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel56)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel32)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel33)))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel37)
                                .addComponent(jLabel36)
                                .addComponent(jLabel35)
                                .addComponent(jLabel4)
                                .addComponent(jLabelMS))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel52, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel55, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel66, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(conMaritialS)
                    .addComponent(conPartnerFN)
                    .addComponent(conPartnerMI)
                    .addComponent(conPartnerLN)
                    .addComponent(conPartnerStreet)
                    .addComponent(conPartnerCity)
                    .addComponent(conPartnerState)
                    .addComponent(conPartnerZip)
                    .addComponent(conPartnerPN)
                    .addComponent(conPartnerPoB)
                    .addComponent(conChildren)
                    .addComponent(conChildFN)
                    .addComponent(conChildMI)
                    .addComponent(conChildLN)
                    .addComponent(conChildDoB)
                    .addComponent(conChildRelationship)
                    .addComponent(conChildStreet)
                    .addComponent(conChildCity)
                    .addComponent(conChildState)
                    .addComponent(conChildZip)
                    .addComponent(conChildPN))
                .addGap(0, 385, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMS)
                    .addComponent(conMaritialS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(conPartnerFN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(conPartnerMI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(conPartnerLN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(conPartnerStreet))
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(conPartnerCity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(conPartnerState))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(conPartnerZip))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(conPartnerPN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(conPartnerPoB))
                .addGap(38, 38, 38)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(conChildren))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(conChildFN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(conChildMI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(conChildLN))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel33))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(conChildDoB)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addComponent(conChildRelationship))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(conChildStreet))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(conChildCity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(conChildState))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66)
                    .addComponent(conChildZip))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(conChildPN))
                .addContainerGap(725, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Spouse/Child", jPanel5);

        jLabel67.setText("Father First Name:");

        jLabel68.setText("Father Middle Initial:");

        jLabel69.setText("Father Last Name:");

        jLabel42.setText("Father Street Address:");

        jLabel43.setText("Father City:");

        jLabel44.setText("Father State:");

        jLabel54.setText("Father Zipcode:");

        jLabel45.setText("Father Phone Number(xxx-xxx-xxxx):");

        jLabel46.setText("Mother First Name:");

        jLabel47.setText("Mother Middle Initial:");

        jLabel48.setText("Mother Last Name:");

        jLabel49.setText("Mother Street Address:");

        jLabel50.setText("Mother City:");

        jLabel51.setText("Mother State:");

        jLabel57.setText("Mother Zipcode:");

        jLabel58.setText("Mother Phone Number(xxx-xxx-xxxx):");

        jLabelEC.setText("Emergency Contact:");

        jLabel3.setText("Emergency Street Address:");

        jLabel6.setText("Emergency City:");

        jLabel7.setText("Emergency State:");

        jLabel17.setText("Emergency Zipcode:");

        jLabel5.setText("Emergency Phone Number(xxx-xxx-xxxx):");

        conFatherFN.setText("jLabel21");

        conFatherMI.setText("jLabel21");

        conFatherLN.setText("jLabel21");

        conFatherStreet.setText("jLabel21");

        conFatherCity.setText("jLabel21");

        conFatherState.setText("jLabel21");

        conFatherZip.setText("jLabel21");

        conFatherPN.setText("jLabel21");

        conMotherFN.setText("jLabel21");

        conMotherMI.setText("jLabel21");

        conMotherLN.setText("jLabel21");

        conMotherStreet.setText("jLabel21");

        conMotherCity.setText("jLabel21");

        conMotherState.setText("jLabel21");

        conMotherZip.setText("jLabel21");

        conMotherPN.setText("jLabel21");

        conEmergency.setText("jLabel21");

        conEmergencyStreet.setText("jLabel21");

        conEmergencyCity.setText("jLabel21");

        conEmergencyState.setText("jLabel21");

        conEmergencyZip.setText("jLabel21");

        conEmergencyPN.setText("jLabel21");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel17)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(jLabelEC)
                    .addComponent(jLabel58)
                    .addComponent(jLabel57)
                    .addComponent(jLabel51)
                    .addComponent(jLabel50)
                    .addComponent(jLabel49)
                    .addComponent(jLabel48)
                    .addComponent(jLabel47)
                    .addComponent(jLabel46)
                    .addComponent(jLabel45)
                    .addComponent(jLabel54)
                    .addComponent(jLabel44)
                    .addComponent(jLabel43)
                    .addComponent(jLabel42)
                    .addComponent(jLabel69)
                    .addComponent(jLabel68)
                    .addComponent(jLabel67))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(conFatherFN)
                    .addComponent(conFatherMI)
                    .addComponent(conFatherLN)
                    .addComponent(conFatherStreet)
                    .addComponent(conFatherCity)
                    .addComponent(conFatherState)
                    .addComponent(conFatherZip)
                    .addComponent(conFatherPN)
                    .addComponent(conMotherFN)
                    .addComponent(conMotherMI)
                    .addComponent(conMotherLN)
                    .addComponent(conMotherStreet)
                    .addComponent(conMotherCity)
                    .addComponent(conMotherState)
                    .addComponent(conMotherZip)
                    .addComponent(conMotherPN)
                    .addComponent(conEmergency)
                    .addComponent(conEmergencyStreet)
                    .addComponent(conEmergencyCity)
                    .addComponent(conEmergencyState)
                    .addComponent(conEmergencyZip)
                    .addComponent(conEmergencyPN))
                .addContainerGap(361, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67)
                    .addComponent(conFatherFN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68)
                    .addComponent(conFatherMI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69)
                    .addComponent(conFatherLN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(conFatherStreet))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(conFatherCity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(conFatherState))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(conFatherZip))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(conFatherPN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(conMotherFN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(conMotherMI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(conMotherLN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(conMotherStreet))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(conMotherCity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(conMotherState))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(conMotherZip))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(conMotherPN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEC)
                    .addComponent(conEmergency))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(conEmergencyStreet))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(conEmergencyCity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(conEmergencyState))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(conEmergencyZip))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(conEmergencyPN))
                .addContainerGap(759, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Parents and Emergency", jPanel1);

        jLabelDB.setText("Death beneficiary:");

        jLabel59.setText("Relationship:");

        jLabel60.setText("Address:");

        jLabel61.setText("City:");

        jLabel62.setText("State:");

        jLabel63.setText("Zipcode:");

        jLabel64.setText("Phone Number:");

        jLabel65.setText("Death Beneficiary Percentage:");

        jLabelGPS1.setText("Guardian Prior Service:");

        jLabel75.setText("Guardian years of service:");

        jLabel76.setText("Guardian Highest Grade:");

        jLabel77.setText("Guardian From(Month/Year):");

        jLabel78.setText("Guardian To(Month/Year):");

        jLabel79.setText("Guardian Type of Discharge:");

        jLabel80.setText("<html>Guardian Years Remaining on <br></br>Enlistment:</html>");

        jLabelJROTC1.setText("Junior ROTC:");

        jLabelEagleScount1.setText("Eagle Scout:");

        conDeath.setText("jLabel21");

        conDeathRelationship.setText("jLabel21");

        conDeathStreet.setText("jLabel21");

        conDeathCity.setText("jLabel21");

        conDeathState.setText("jLabel21");

        conDeathZip.setText("jLabel21");

        conDeathPN.setText("jLabel21");

        conDeathPercentage.setText("jLabel21");

        conGuardianYearsOfService.setText("jLabel21");

        conGuardianHighGrade.setText("jLabel21");

        conGuardianFrom.setText("jLabel21");

        conGuardianTo.setText("jLabel21");

        conGuardianType.setText("jLabel21");

        conGuardianYearsRem.setText("jLabel21");

        conJuniorROTC.setText("jLabel21");

        conGuardStatus.setText("jLabel21");

        conHasPriorGuardS.setText("jLabel21");

        conEagleScout.setText("jLabel21");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelDB)
                    .addComponent(jLabel59)
                    .addComponent(jLabel60)
                    .addComponent(jLabel61)
                    .addComponent(jLabel62)
                    .addComponent(jLabel63)
                    .addComponent(jLabel64)
                    .addComponent(jLabel65)
                    .addComponent(jLabelGPS1)
                    .addComponent(jLabel75)
                    .addComponent(jLabel76)
                    .addComponent(jLabel77)
                    .addComponent(jLabel78)
                    .addComponent(jLabel79)
                    .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelJROTC1)
                    .addComponent(jLabelEagleScount1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(conGuardStatus)
                        .addGap(57, 57, 57)
                        .addComponent(conHasPriorGuardS))
                    .addComponent(conDeath)
                    .addComponent(conDeathRelationship)
                    .addComponent(conDeathStreet)
                    .addComponent(conDeathCity)
                    .addComponent(conDeathState)
                    .addComponent(conDeathZip)
                    .addComponent(conDeathPN)
                    .addComponent(conDeathPercentage)
                    .addComponent(conGuardianYearsOfService)
                    .addComponent(conGuardianHighGrade)
                    .addComponent(conGuardianFrom)
                    .addComponent(conGuardianTo)
                    .addComponent(conGuardianType)
                    .addComponent(conGuardianYearsRem)
                    .addComponent(conJuniorROTC)
                    .addComponent(conEagleScout))
                .addContainerGap(199, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDB)
                    .addComponent(conDeath))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(conDeathRelationship))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(conDeathStreet))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(conDeathCity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(conDeathState))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63)
                    .addComponent(conDeathZip))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(conDeathPN))
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65)
                    .addComponent(conDeathPercentage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGPS1)
                    .addComponent(conGuardStatus)
                    .addComponent(conHasPriorGuardS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel75)
                    .addComponent(conGuardianYearsOfService))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76)
                    .addComponent(conGuardianHighGrade))
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel77)
                    .addComponent(conGuardianFrom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel78)
                    .addComponent(conGuardianTo))
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79)
                    .addComponent(conGuardianType))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conGuardianYearsRem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelJROTC1)
                    .addComponent(conJuniorROTC))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelEagleScount1))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(conEagleScout)))
                .addContainerGap(816, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Other Information", jPanel6);

        Question1.setText("<html>Are you now or have you ever been an enlisted or warrant <br>  officer of any component of the US armed forces?</html>");

        Question2.setText("<html>Are you now, or have you ever been, a commissioned officer of any component of the armed forces<br></br>(including Reserve, USAF,USMC,USCG,USG,Merchant,Marine, or preparatory schools?)<br></br></html>");

        Question3.setText("<html>Are you now, or have you ever been, an officer of the<br></br> Health Services and Metnal health Administsteration?</html>");

        Question4.setText("Are you a U.S citizen? If yes, how obtained:");

        Question5.setText("<html>If a naturalized citizen, or born outside of the U.S of <br></br>American parents, submit proof of citizenship. Reference AFROTCI 36-2011.)</html>");

        Question6.setText("<html>Have you ever taken the AFOQT (if yes, indicate in remarks <br></br>section where and when.)</html>");

        Question7.setText("<html>Have you ever had a physical for entry into the <br></br>armed forces, Air Force ROTC, etc?</html>");

        Question8.setText("Have you ever been denied enlistment into the armed forces?");

        Question10.setText("Do you already have a degree(BA, BS, etc?)");

        Question11.setText("Are you an AFROTC ScholarShip Designee?");

        Question9.setText("<html>Are you a conscientious objector?(A conscientious objector is defined as: <br></br> one who has or had a firm, fixed and sincere objection to participation in war in any form or to bearing of arms because of religious training or belief. which includes solely moral or ethical beliefs.)</html>");

        Question12.setText("<html><br></br>Are you now or have you ever been\naffiliated with any organization or movement that seeks to alter our form of government by unconstitutional means, or sympathetically associated with any such organization, movement, or members thereof? (if yes, please describe)</html>");

        Question13.setText("<html>Do you understand that participation in Air <br></br>Force ROTC required strenuous physical activity? (You will be required to obtain medicalclearance from a physician prior to program entry.)</html>");

        jLabel10.setText("<html>Have you ever applied for, been enrolled, or on contract <br> in an Officer Training Program of the US army, <br>USAF, USMC, USCG, USN, Merchant Marine, or preparatory?</html>");

        Question14.setText("<html>Are you now, or have you ever been, a memberr of the<br></br> National Oceanic Atmospheric Administration?</html>");

        jButton3.setText("Submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        goBack.setText("Cancel");
        goBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackActionPerformed(evt);
            }
        });

        conQuestion1A.setText("jLabel24");

        conQuestion2A.setText("jLabel24");

        conQuestion3A.setText("jLabel24");

        conQuestion4A.setText("jLabel24");

        conQuestion5A.setText("jLabel24");

        conQuestion6A.setText("jLabel24");

        conQuestion6B.setText("jLabel24");

        conQuestion7A.setText("jLabel24");

        conQuestion8A.setText("jLabel24");

        conQuestion9A.setText("jLabel24");

        conQuestion10A.setText("jLabel24");

        conQuestion10B.setText("jLabel24");

        conQuestion11A.setText("jLabel24");

        conQuestion12A.setText("jLabel24");

        conQuestion13A.setText("jLabel24");

        conQuestion14A.setText("jLabel24");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(Question7, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(conQuestion6A)
                                .addGap(32, 32, 32)
                                .addComponent(conQuestion6B))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(conQuestion2A)
                                    .addComponent(conQuestion1A)))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(conQuestion3A))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(conQuestion8A))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(conQuestion11A)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(conQuestion10A)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(conQuestion10B))))))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(Question14, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(conQuestion5A))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Question2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Question1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Question8)
                            .addComponent(Question6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Question9, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Question3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Question4)
                            .addComponent(Question5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Question10)
                            .addComponent(Question11)
                            .addComponent(Question12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(conQuestion4A))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(conQuestion7A))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(conQuestion9A))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(conQuestion12A))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(conQuestion13A))))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Question13, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(goBack, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(conQuestion14A))))
                .addGap(0, 206, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Question1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conQuestion1A))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(conQuestion2A)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Question2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(conQuestion3A)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Question3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conQuestion4A))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Question14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conQuestion5A))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Question4)
                    .addComponent(conQuestion6A)
                    .addComponent(conQuestion6B))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Question5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Question6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conQuestion7A))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Question7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conQuestion8A))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Question8)
                    .addComponent(conQuestion9A))
                .addGap(27, 27, 27)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Question10)
                    .addComponent(conQuestion10A)
                    .addComponent(conQuestion10B))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Question11)
                    .addComponent(conQuestion11A))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(Question9, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(conQuestion12A)
                        .addGap(41, 41, 41)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(Question12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(conQuestion13A)
                        .addGap(55, 55, 55)))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(Question13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(conQuestion14A)
                        .addGap(71, 71, 71)))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(goBack))
                .addContainerGap(321, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Yes/No Questions", jPanel10);

        jScrollPane2.setViewportView(jTabbedPane2);

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
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
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
                    sta.executeUpdate("INSERT INTO INFO VALUES ('" + conLN.getText()+ "', '" + conFN.getText()+ "', '" + conMN.getText()+ "', '" + conFull.getText() + "', '" 
                        + "'" + conSSN.getText() + "', '" + conDoB.getText() + "', '" + conCWUID.getText() + "', '" + conEmail.getText() + "', '" +  conPN.getText() + "', '" 
                        + "'" + conStreet.getText() + "', '" + conApt.getText() + "', '" + conCity.getText() + "', '" + conState.getText() + "', '" + conZip.getText() + "', '" 
                        + "'" + conGender.getText() + "', '" + conAcMajor.getText() + "', '" + conGradDate.getText() + "', '" + conRace.getText() + "', '" + conMaritialS.getText() + "', '" 
                        + "'" + (conPartnerLN.getText()+ ", " + conPartnerFN.getText() + " " + conPartnerMI.getText())  + "', '" + conPartnerStreet.getText() + "', '" 
                        + "'" + conPartnerCity.getText() + "', '" +  conPartnerState.getText() + "', '" + conPartnerPN.getText() + "', '" +  conPartnerPoB.getText() + "', '" 
                        + "'" + conNoD.getText() + "', '" + conEmergency.getText() + "', '" + conEmergencyStreet.getText() + "', '" + conEmergencyCity.getText()  + "', '" 
                        + "'" + conEmergencyState.getText() + "', '" + conEmergencyZip.getText() + "', '" + conEmergencyPN.getText() + "', '" + conDeath.getText() + "', '" 
                        + "'" + conHasPriorS.getText() + "', '" + conJuniorROTC.getText() + "', '" + conChildren.getText() + "', '" + conPriorS.getText() + "', '" 
                        + "'" + conEagleScout.getText() + "', '" + conQuestion1A.getText() + "', '" + conGuardStatus.getText() + "', '" + conHasPriorGuardS.getText() + "', '"
                        + "'" + conPoB.getText() + "', '" + conSelectiveServiceNum.getText() + "', '"
                        + "'" + (conPN.getText() +conStreet.getText()+ ", " + conCity.getText() + ", " + conState.getText()  + ", " + conZip.getText()) + "', '" 
                        + "'" + conGuardianYearsOfService.getText() + "', '" + conGuardianHighGrade.getText() + "', '" + conGuardianFrom.getText() + "', '" + conGuardianTo.getText() + "', '" 
                        + "'" + conGuardianType.getText() + "', '" + conGuardianYearsRem.getText() + "', '" 
                        + "'" + (conPartnerStreet.getText() + ", " + conPartnerCity.getText() + ", " + conPartnerState.getText() + ", " + conPartnerZip.getText() + ", " + conPartnerPN.getText()) + "', '" 
                        + "'" + (conChildLN.getText() + ", " + conChildFN.getText() + " , " + conChildMI.getText()) + "', '" 
                        + "'" + conChildRelationship.getText() + "', '" + conChildDoB.getText() + "', '" 
                        + "'" + (conChildStreet.getText() + ", " + conChildCity.getText() + ", "  + conChildState.getText() + ", " + conChildZip.getText() + ", "  + conChildPN.getText()) + "', '" 
                        + "'" + (conFatherLN.getText()+ ", " + conFatherFN.getText() + ", " + conFatherMI.getText()) + "', '" 
                        + "'" + (conFatherStreet.getText() + ", " + conFatherCity.getText() + ", "  + conFatherState.getText() + ", " + conFatherZip.getText() + ", " + conFatherPN.getText()) + "', '" 
                        + "'" + (conMotherLN.getText()+ ", " + conMotherFN.getText() + ", " + conMotherMI.getText()) + "', '" 
                        + "'" + (conMotherStreet.getText() + ", " + conMotherCity.getText() + ", " + conMotherState.getText() + ", " + conMotherZip.getText() + ", " + conMotherPN.getText()) + "', '"
                        + "'" + conNotify.getText() + "', '" + conIllHealth.getText() + "', '" + conDeathRelationship.getText() + "', '" 
                        + "'" + (conDeathStreet.getText() + ", " + conDeathCity.getText() + ", " + conDeathState.getText() + ", " + conDeathZip.getText() + ", " + conDeathPN.getText()) + "', '" 
                        + "'" +  conDeathPercentage.getText() + "', '" 
                        + "'" + (conStreet.getText() + ", " + conCity.getText() + ", "  + conState.getText() + ", " + conZip.getText() + ", " + conPN.getText() + ", " + conEmail.getText()) + "', '" 
                        + "'" + (conFN.getText().charAt(0)+ "." + conLN.getText().charAt(0)) + "', '" 
                        + "'" + conPartnerZip.getText() + "', '" + conDiffMailing.getText() + "', '" 
                        + "'" + conChildFN.getText() + "', '" + conChildMI.getText() + "', '" + conChildLN.getText() + "', '" + conChildCity.getText() + "', '" 
                        + "'" + conChildState.getText() + "', '" + conChildZip.getText() + "', '" + conFatherFN.getText() + "', '" + conFatherMI.getText() + "', '"
                        + "'" + conFatherLN.getText() + "', '" + conFatherCity.getText() + "', '" + conFatherState.getText() + "', '" + conFatherZip.getText() + "', '" 
                        + "'" + conFatherPN.getText() + "', '" +  conMotherFN.getText() + "', '" + conMotherMI.getText() + "', '" + conMotherLN.getText() + "', '" 
                        + "'" + conMotherCity.getText() + "', '" + conMotherState.getText() + "', '" + conMotherZip.getText() + "', '" + conMotherPN.getText() + "', '" 
                        + "'" + conDeathStreet.getText() + "', '" + conDeathCity.getText() + "', '" + conMailingStreet.getText() + "', '" + conMailingCity.getText() + "', '" 
                        + "'" + conMailingState.getText() + "', '" + conMailingZip.getText() + "', '" + conPartnerFN.getText() + "', '" +  conPartnerMI.getText() + "', '" 
                        + "'" + conPartnerLN.getText() + "', '" +  conChildPN.getText() + "', '" + conEmergencyZip.getText() + "', '" + conMailingDorm.getText() + "')");

                    sta.close();    
                } catch (Exception e) {
                    System.err.println("Exception: " + e.getMessage());
                
                }
            } else {//else it dose not exist
                System.out.println("HERE");
                //add new entry
                sta.executeUpdate("INSERT INTO INFO VALUES ('" + conLN.getText()+ "', '" + conFN.getText()+ "', '" + conMN.getText()+ "', '" + conFull.getText() + "', '" 
                        + "'" + conSSN.getText() + "', '" + conDoB.getText() + "', '" + conCWUID.getText() + "', '" + conEmail.getText() + "', '" +  conPN.getText() + "', '" 
                        + "'" + conStreet.getText() + "', '" + conApt.getText() + "', '" + conCity.getText() + "', '" + conState.getText() + "', '" + conZip.getText() + "', '" 
                        + "'" + conGender.getText() + "', '" + conAcMajor.getText() + "', '" + conGradDate.getText() + "', '" + conRace.getText() + "', '" + conMaritialS.getText() + "', '" 
                        + "'" + (conPartnerLN.getText()+ ", " + conPartnerFN.getText() + " " + conPartnerMI.getText())  + "', '" + conPartnerStreet.getText() + "', '" 
                        + "'" + conPartnerCity.getText() + "', '" +  conPartnerState.getText() + "', '" + conPartnerPN.getText() + "', '" +  conPartnerPoB.getText() + "', '" 
                        + "'" + conNoD.getText() + "', '" + conEmergency.getText() + "', '" + conEmergencyStreet.getText() + "', '" + conEmergencyCity.getText()  + "', '" 
                        + "'" + conEmergencyState.getText() + "', '" + conEmergencyZip.getText() + "', '" + conEmergencyPN.getText() + "', '" + conDeath.getText() + "', '" 
                        + "'" + conHasPriorS.getText() + "', '" + conJuniorROTC.getText() + "', '" + conChildren.getText() + "', '" + conPriorS.getText() + "', '" 
                        + "'" + conEagleScout.getText() + "', '" + conQuestion1A.getText() + "', '" + conGuardStatus.getText() + "', '" + conHasPriorGuardS.getText() + "', '"
                        + "'" + conPoB.getText() + "', '" + conSelectiveServiceNum.getText() + "', '"
                        + "'" + (conPN.getText() +conStreet.getText()+ ", " + conCity.getText() + ", " + conState.getText()  + ", " + conZip.getText()) + "', '" 
                        + "'" + conGuardianYearsOfService.getText() + "', '" + conGuardianHighGrade.getText() + "', '" + conGuardianFrom.getText() + "', '" + conGuardianTo.getText() + "', '" 
                        + "'" + conGuardianType.getText() + "', '" + conGuardianYearsRem.getText() + "', '" 
                        + "'" + (conPartnerStreet.getText() + ", " + conPartnerCity.getText() + ", " + conPartnerState.getText() + ", " + conPartnerZip.getText() + ", " + conPartnerPN.getText()) + "', '" 
                        + "'" + (conChildLN.getText() + ", " + conChildFN.getText() + " , " + conChildMI.getText()) + "', '" 
                        + "'" + conChildRelationship.getText() + "', '" + conChildDoB.getText() + "', '" 
                        + "'" + (conChildStreet.getText() + ", " + conChildCity.getText() + ", "  + conChildState.getText() + ", " + conChildZip.getText() + ", "  + conChildPN.getText()) + "', '" 
                        + "'" + (conFatherLN.getText()+ ", " + conFatherFN.getText() + ", " + conFatherMI.getText()) + "', '" 
                        + "'" + (conFatherStreet.getText() + ", " + conFatherCity.getText() + ", "  + conFatherState.getText() + ", " + conFatherZip.getText() + ", " + conFatherPN.getText()) + "', '" 
                        + "'" + (conMotherLN.getText()+ ", " + conMotherFN.getText() + ", " + conMotherMI.getText()) + "', '" 
                        + "'" + (conMotherStreet.getText() + ", " + conMotherCity.getText() + ", " + conMotherState.getText() + ", " + conMotherZip.getText() + ", " + conMotherPN.getText()) + "', '"
                        + "'" + conNotify.getText() + "', '" + conIllHealth.getText() + "', '" + conDeathRelationship.getText() + "', '" 
                        + "'" + (conDeathStreet.getText() + ", " + conDeathCity.getText() + ", " + conDeathState.getText() + ", " + conDeathZip.getText() + ", " + conDeathPN.getText()) + "', '" 
                        + "'" +  conDeathPercentage.getText() + "', '" 
                        + "'" + (conStreet.getText() + ", " + conCity.getText() + ", "  + conState.getText() + ", " + conZip.getText() + ", " + conPN.getText() + ", " + conEmail.getText()) + "', '" 
                        + "'" + (conFN.getText().charAt(0)+ "." + conLN.getText().charAt(0)) + "', '" 
                        + "'" + conPartnerZip.getText() + "', '" + conDiffMailing.getText() + "', '" 
                        + "'" + conChildFN.getText() + "', '" + conChildMI.getText() + "', '" + conChildLN.getText() + "', '" + conChildCity.getText() + "', '" 
                        + "'" + conChildState.getText() + "', '" + conChildZip.getText() + "', '" + conFatherFN.getText() + "', '" + conFatherMI.getText() + "', '"
                        + "'" + conFatherLN.getText() + "', '" + conFatherCity.getText() + "', '" + conFatherState.getText() + "', '" + conFatherZip.getText() + "', '" 
                        + "'" + conFatherPN.getText() + "', '" +  conMotherFN.getText() + "', '" + conMotherMI.getText() + "', '" + conMotherLN.getText() + "', '" 
                        + "'" + conMotherCity.getText() + "', '" + conMotherState.getText() + "', '" + conMotherZip.getText() + "', '" + conMotherPN.getText() + "', '" 
                        + "'" + conDeathStreet.getText() + "', '" + conDeathCity.getText() + "', '" + conMailingStreet.getText() + "', '" + conMailingCity.getText() + "', '" 
                        + "'" + conMailingState.getText() + "', '" + conMailingZip.getText() + "', '" + conPartnerFN.getText() + "', '" +  conPartnerMI.getText() + "', '" 
                        + "'" + conPartnerLN.getText() + "', '" +  conChildPN.getText() + "', '" + conEmergencyZip.getText() + "', '" + conMailingDorm.getText() + "')");

                sta.close();

            }
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
        }

//end else

    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void goBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackActionPerformed
        adminInformation adminInfo = new adminInformation(conFN.getText(), conLN.getText(), conMN.getText(), conCWUID.getText(), conEmail.getText(), conDoB.getText(),
                conPN.getText().substring(0, 3), conPN.getText().substring(3, 7), conPN.getText().substring(7),
                conStreet.getText(), conApt.getText(), conCity.getText(), conState.getText(), conZip.getText(), 
                conGender.getText(), conSSN.getText(), conAcMajor.getText(), conGradDate.getText(), conRace.getText(),
                conPoB.getText(), conSelectiveServiceNum.getText(), conDiffMailing.getText(), conMailingDorm.getText(), conMailingStreet.getText(),
                conMailingCity.getText(), conMailingState.getText(), conMailingZip.getText(), conPriorS.getText(), conHasPriorS.getText(),
                conIllHealth.getText(), conNotify.getText(), conNoD.getText(),
                
                conMaritialS.getText(), conPartnerFN.getText(), conPartnerMI.getText(), conPartnerLN.getText(), conPartnerStreet.getText(),
                conPartnerCity.getText(), conPartnerState.getText(), conPartnerZip.getText(), conPartnerPN.getText(), conPartnerPoB.getText(),
                
                conChildren.getText(), conChildFN.getText(), conChildMI.getText(), conChildLN.getText(), conChildDoB.getText(), conChildRelationship.getText(),
                conChildStreet.getText(), conChildCity.getText(), conChildState.getText(), conChildZip.getText(), conChildPN.getText(),
                
                conFatherFN.getText(), conFatherMI.getText(), conFatherLN.getText(), conFatherStreet.getText(), conFatherCity.getText(),
                conFatherState.getText(), conFatherZip.getText(), conFatherPN.getText(),
                
                conMotherFN.getText(), conMotherMI.getText(), conMotherLN.getText(), conMotherStreet.getText(), conMotherCity.getText(),
                conMotherState.getText(), conMotherZip.getText(), conMotherPN.getText(),
                
                conEmergency.getText(), conEmergencyStreet.getText(), conEmergencyCity.getText(), conEmergencyState.getText(), conEmergencyZip.getText(), conEmergencyPN.getText(),
                
                conDeath.getText(), conDeathRelationship.getText(), conDeathStreet.getText(), conDeathCity.getText(),
                conDeathState.getText(), conDeathZip.getText(), conDeathPN.getText(), conDeathPercentage.getText(),
                
                conGuardStatus.getText(), conHasPriorGuardS.getText(), conGuardianYearsOfService.getText(), conGuardianHighGrade.getText(),
                conGuardianFrom.getText(), conGuardianTo.getText(), conGuardianType.getText(), conGuardianYearsRem.getText(),
                
                conJuniorROTC.getText(), conEagleScout.getText(), 
                conQuestion1A.getText(), conQuestion2A.getText(), conQuestion3A.getText(), conQuestion4A.getText(),
                conQuestion5A.getText(), conQuestion6A.getText(), conQuestion6B.getText(), conQuestion7A.getText(),
                conQuestion8A.getText(), conQuestion9A.getText(), conQuestion10A.getText(), conQuestion10B.getText(),
                conQuestion11A.getText(), conQuestion12A.getText(), conQuestion13A.getText(), conQuestion14A.getText() );
        
        adminInfo.setVisible(true);
        this.dispose();
        //goBack.setVisible(true);
    }//GEN-LAST:event_goBackActionPerformed

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
    private javax.swing.JLabel Question1;
    private javax.swing.JLabel Question10;
    private javax.swing.JLabel Question11;
    private javax.swing.JLabel Question12;
    private javax.swing.JLabel Question13;
    private javax.swing.JLabel Question14;
    private javax.swing.JLabel Question2;
    private javax.swing.JLabel Question3;
    private javax.swing.JLabel Question4;
    private javax.swing.JLabel Question5;
    private javax.swing.JLabel Question6;
    private javax.swing.JLabel Question7;
    private javax.swing.JLabel Question8;
    private javax.swing.JLabel Question9;
    private javax.swing.JLabel conAcMajor;
    private javax.swing.JLabel conApt;
    private javax.swing.JLabel conCWUID;
    private javax.swing.JLabel conChildCity;
    private javax.swing.JLabel conChildDoB;
    private javax.swing.JLabel conChildFN;
    private javax.swing.JLabel conChildLN;
    private javax.swing.JLabel conChildMI;
    private javax.swing.JLabel conChildPN;
    private javax.swing.JLabel conChildRelationship;
    private javax.swing.JLabel conChildState;
    private javax.swing.JLabel conChildStreet;
    private javax.swing.JLabel conChildZip;
    private javax.swing.JLabel conChildren;
    private javax.swing.JLabel conCity;
    private javax.swing.JLabel conDeath;
    private javax.swing.JLabel conDeathCity;
    private javax.swing.JLabel conDeathPN;
    private javax.swing.JLabel conDeathPercentage;
    private javax.swing.JLabel conDeathRelationship;
    private javax.swing.JLabel conDeathState;
    private javax.swing.JLabel conDeathStreet;
    private javax.swing.JLabel conDeathZip;
    private javax.swing.JLabel conDiffMailing;
    private javax.swing.JLabel conDoB;
    private javax.swing.JLabel conEagleScout;
    private javax.swing.JLabel conEmail;
    private javax.swing.JLabel conEmergency;
    private javax.swing.JLabel conEmergencyCity;
    private javax.swing.JLabel conEmergencyPN;
    private javax.swing.JLabel conEmergencyState;
    private javax.swing.JLabel conEmergencyStreet;
    private javax.swing.JLabel conEmergencyZip;
    private javax.swing.JLabel conFN;
    private javax.swing.JLabel conFatherCity;
    private javax.swing.JLabel conFatherFN;
    private javax.swing.JLabel conFatherLN;
    private javax.swing.JLabel conFatherMI;
    private javax.swing.JLabel conFatherPN;
    private javax.swing.JLabel conFatherState;
    private javax.swing.JLabel conFatherStreet;
    private javax.swing.JLabel conFatherZip;
    private javax.swing.JLabel conFull;
    private javax.swing.JLabel conGender;
    private javax.swing.JLabel conGradDate;
    private javax.swing.JLabel conGuardStatus;
    private javax.swing.JLabel conGuardianFrom;
    private javax.swing.JLabel conGuardianHighGrade;
    private javax.swing.JLabel conGuardianTo;
    private javax.swing.JLabel conGuardianType;
    private javax.swing.JLabel conGuardianYearsOfService;
    private javax.swing.JLabel conGuardianYearsRem;
    private javax.swing.JLabel conHasPriorGuardS;
    private javax.swing.JLabel conHasPriorS;
    private javax.swing.JLabel conIllHealth;
    private javax.swing.JLabel conJuniorROTC;
    private javax.swing.JLabel conLN;
    private javax.swing.JLabel conMN;
    private javax.swing.JLabel conMailingCity;
    private javax.swing.JLabel conMailingDorm;
    private javax.swing.JLabel conMailingState;
    private javax.swing.JLabel conMailingStreet;
    private javax.swing.JLabel conMailingZip;
    private javax.swing.JLabel conMaritialS;
    private javax.swing.JLabel conMotherCity;
    private javax.swing.JLabel conMotherFN;
    private javax.swing.JLabel conMotherLN;
    private javax.swing.JLabel conMotherMI;
    private javax.swing.JLabel conMotherPN;
    private javax.swing.JLabel conMotherState;
    private javax.swing.JLabel conMotherStreet;
    private javax.swing.JLabel conMotherZip;
    private javax.swing.JLabel conNoD;
    private javax.swing.JLabel conNotify;
    private javax.swing.JLabel conPN;
    private javax.swing.JLabel conPartnerCity;
    private javax.swing.JLabel conPartnerFN;
    private javax.swing.JLabel conPartnerLN;
    private javax.swing.JLabel conPartnerMI;
    private javax.swing.JLabel conPartnerPN;
    private javax.swing.JLabel conPartnerPoB;
    private javax.swing.JLabel conPartnerState;
    private javax.swing.JLabel conPartnerStreet;
    private javax.swing.JLabel conPartnerZip;
    private javax.swing.JLabel conPoB;
    private javax.swing.JLabel conPriorS;
    private javax.swing.JLabel conQuestion10A;
    private javax.swing.JLabel conQuestion10B;
    private javax.swing.JLabel conQuestion11A;
    private javax.swing.JLabel conQuestion12A;
    private javax.swing.JLabel conQuestion13A;
    private javax.swing.JLabel conQuestion14A;
    private javax.swing.JLabel conQuestion1A;
    private javax.swing.JLabel conQuestion2A;
    private javax.swing.JLabel conQuestion3A;
    private javax.swing.JLabel conQuestion4A;
    private javax.swing.JLabel conQuestion5A;
    private javax.swing.JLabel conQuestion6A;
    private javax.swing.JLabel conQuestion6B;
    private javax.swing.JLabel conQuestion7A;
    private javax.swing.JLabel conQuestion8A;
    private javax.swing.JLabel conQuestion9A;
    private javax.swing.JLabel conRace;
    private javax.swing.JLabel conSSN;
    private javax.swing.JLabel conSelectiveServiceNum;
    private javax.swing.JLabel conState;
    private javax.swing.JLabel conStreet;
    private javax.swing.JLabel conZip;
    private javax.swing.JButton goBack;
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
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAM;
    private javax.swing.JLabel jLabelCWUID;
    private javax.swing.JLabel jLabelCity;
    private javax.swing.JLabel jLabelDB;
    private javax.swing.JLabel jLabelDoB;
    private javax.swing.JLabel jLabelEC;
    private javax.swing.JLabel jLabelEagleScount1;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEth;
    private javax.swing.JLabel jLabelFN;
    private javax.swing.JLabel jLabelGPS1;
    private javax.swing.JLabel jLabelGender;
    private javax.swing.JLabel jLabelJROTC1;
    private javax.swing.JLabel jLabelLN;
    private javax.swing.JLabel jLabelMI;
    private javax.swing.JLabel jLabelMS;
    private javax.swing.JLabel jLabelNoD;
    private javax.swing.JLabel jLabelPGD;
    private javax.swing.JLabel jLabelPN;
    private javax.swing.JLabel jLabelPS1;
    private javax.swing.JLabel jLabelSSN;
    private javax.swing.JLabel jLabelSSN1;
    private javax.swing.JLabel jLabelSSN2;
    private javax.swing.JLabel jLabelState;
    private javax.swing.JLabel jLabelStreet;
    private javax.swing.JLabel jLabelZip;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane2;
    // End of variables declaration//GEN-END:variables
}
