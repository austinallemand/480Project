
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
import javax.swing.JFileChooser;
import java.io.File;
import java.io.FileReader;
import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.Map;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Austin
 */
public class adminInformation extends javax.swing.JFrame {

    private String searchID;
    
    public adminInformation() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public adminInformation(String passedFirstName, String passedLastName, String passedMiddleName, String passedCwuID, String passedEmail, String passedDateOfBirth,
            String passedAreaCode, String passedMiddleThreePhoneNumber, String passedLastThreePhoneNumber, String passedStreetAddress,
            String passedAptNumber, String passedCity, String passedState, String passedZipcode, String passedGender, String passedSSN,
            String passedAcaM, String passedPGradD, String passedEthnicity, String passedPlaceOfBirth, String passedSelectiveNumber, String passedMailingResident, String passedMailingDorm,
            String passedMailingStreet, String passedMailingCity, String passedMailingState, String passedMailingZip, String passedPriorS, 
            String passedHasPriorS, String passedIllHealth, String passedNotify, String passedNoD, String passedMaritialS, String passedPFirst, String passedPMI, String passedPLast, String passedPAddress,
            String passedPCity, String passedPState, String passedPZipcode, String passedPNumber, String passedPPlaceOfBirth, 
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
            String psasedJunior, String passedEagle, String passedEnlisted){
            
            initComponents();
            this.setLocationRelativeTo(null);
    
            //Personal Tab
            
            userFN.setText(passedFirstName);
            userLN.setText(passedLastName);
            userMN.setText(passedMiddleName);
            userCWUID.setText(passedCwuID);
            userEmail.setText(passedEmail);
            userDoB.setText(passedDateOfBirth);
            userAreaCode.setText(passedAreaCode);
            userMPN.setText(passedMiddleThreePhoneNumber);
            userLPN.setText(passedLastThreePhoneNumber);
            userStreet.setText(passedStreetAddress);
            userApt.setText(passedAptNumber);
            userCity.setText(passedCity);
            userState.setText(passedState);
            userZip.setText(passedZipcode);
            userGender.setSelectedItem(passedGender);
            userSSN.setText(passedSSN);
            userAcMajor.setText(passedAcaM);
            userGradDate.setText(passedPGradD);
            userRace.setSelectedItem(passedEthnicity);
            userPoB.setText(passedPlaceOfBirth);
            userSelectiveServiceNum.setText(passedSelectiveNumber);
            userDiffMailing.setSelectedItem(passedMailingResident);
            userMailingDorm.setText(passedMailingDorm);
            userMailingStreet.setText(passedMailingStreet);
            userMailingCity.setText(passedMailingCity);
            userMailingState.setText(passedMailingState);
            userMailingZip.setText(passedMailingZip);
            userPriorS.setSelectedItem(passedPriorS);
            userHasPriorS.setSelectedItem(passedHasPriorS);
            userIllHealth.setText(passedIllHealth);
            userNotify.setText(passedNotify);
            userNoD.setText(passedNoD);
            
            //Family tab
    
            userMaritialS.setSelectedItem(passedMaritialS);
            userPartnerFN.setText(passedPFirst);
            userPartnerMI.setText(passedPMI);
            userPartnerLN.setText(passedPLast);
            userPartnerStreet.setText(passedPAddress);
            userPartnerCity.setText(passedPCity);
            userPartnerState.setText(passedPState);
            userPartnerZip.setText(passedPZipcode);
            userPartnerPN.setText(passedPNumber);
            userPartnerPoB.setText(passedPPlaceOfBirth);
            userChildren.setSelectedItem(passedChildren);
            userChildFN.setText(passedChildFN);
            userChildMI.setText(passedChildMI);
            userChildLN.setText(passedChildLN);
            userChildDoB.setText(passedChildDoB);
            userChildRelationship.setText(passedChildRelatonship);
            userChildStreet.setText(passedChildStreet);
            userChildCity.setText(passedChildCity);
            userChildState.setText(passedChildState);
            userChildZip.setText(passedChildZip);
            userChildPN.setText(passedChildPN);
            userFatherFN.setText(passedFatherFN);
            userFatherMI.setText(passedFatherMI);
            userFatherLN.setText(passedFatherLN);
            userFatherStreet.setText(passedFatherStreet);
            userFatherCity.setText(passedFatherCity);
            userFatherState.setText(passedFatherState);
            userFatherZip.setText(passedFatherZip);
            userFatherPN.setText(passedFatherPN);
            userMotherFN.setText(passedMotherFN);
            userMotherMI.setText(passedMotherMI);
            userMotherLN.setText(passedMotherLN);
            userMotherStreet.setText(passedMotherStreet);
            userMotherCity.setText(passedMotherCity);
            userMotherState.setText(passedMotherState);
            userMotherZip.setText(passedMotherZip);
            userMotherPN.setText(passedMotherPN);
            userEmergency.setText(passedEContact);
            userEmergencyStreet.setText(passedEContactStreet);
            userEmergencyCity.setText(passedEContactCity);
            userEmergencyState.setText(passedEContactState);
            userEmergencyZip.setText(passedEZip);
            userEmergencyPN.setText(passedEContactPN);
            
            //Other tab
    
            userDeath.setText(passedDBeneficiary);
            userDeathRelationship.setText(passedDBeneficiaryRelationship);
            userDeathStreet.setText(passedDBeneficiaryStreet);
            userDeathCity.setText(passedDBeneficiaryCity);
            userDeathState.setText(passedDBeneficiaryState);
            userDeathZip.setText(passedDBeneficiaryZip);
            userDeathPN.setText(passedDBeneficiaryPN);
            userDeathPercentage.setText(passedDBeneficiaryPercent);
            userGuardStatus.setSelectedItem(passedGuardianPS);
            userHasPriorGuardS.setSelectedItem(passedGuardianHasPS);
            userGuardianYearsOfService.setText(passedGuardianPSYears);
            userGuardianHighGrade.setText(passedGuardianPSGrade);
            userGuardianFrom.setText(passedGuardianPSStart);
            userGuardianTo.setText(passedGuardianPSFinish);
            userGuardianType.setText(passedGuardianPSDischarge);
            userGuardianYearsRem.setText(passedGuardianPSRemaining);
            userJuniorROTC.setSelectedItem(psasedJunior);
            userEagleScout.setSelectedItem(passedEagle);
            userEnlistment.setText(passedEnlisted);
    
    
    }
    
     public void Fill(){
         Connection con;
            searchID = searchCadet.getText();
            try {
                String url = "jdbc:derby://localhost:1527/CadetInfo";
                String username = "adminCadre";
                String password = "cadrecwu";
                con = DriverManager.getConnection(url, username, password);
                Statement sta = con.createStatement();
                ResultSet rs = sta.executeQuery("Select * From INFO WHERE CWUID ='"+ searchID+"'");
                if(rs.next()){
                    
                    userLN.setText(rs.getString("LASTNAME"));
                    userFN.setText(rs.getString("FIRSTNAME"));
                    userMN.setText(rs.getString("MIDDLEINITIAL"));
                    userCWUID.setText(rs.getString("CWUID"));
                    userEmail.setText(rs.getString("EMAIL"));
                    userDoB.setText(rs.getString("DATEOFBIRTHMDDYYYY"));
                    userAreaCode.setText(rs.getString("PHONENUMBER").substring(1, 4));
                    userMPN.setText(rs.getString("PHONENUMBER").substring(6, 9));
                    userLPN.setText(rs.getString("PHONENUMBER").substring(10, 14));
                    userStreet.setText(rs.getString("STREETADDRESS"));
                    userApt.setText(rs.getString("APT"));
                    userCity.setText(rs.getString("CITY"));
                    userState.setText(rs.getString("STATE"));
                    userZip.setText(rs.getString("ZIPCODE"));
                    userGender.setSelectedItem(rs.getString("GENDER"));
                    userSSN.setText(rs.getString("SSAN"));
                    userAcMajor.setText(rs.getString("ACAMAJOR"));
                    userGradDate.setText(rs.getString("GRADDATE"));
                    userRace.setSelectedItem(rs.getString("ETHNICITY"));
                    userPoB.setText(rs.getString("PLACEOFBIRTH"));
                    userSelectiveServiceNum.setText(rs.getString("SELECTIVESERVERNUMBER"));
                    userDiffMailing.setSelectedItem(rs.getString("MAILINGYESORNO"));
                    userMailingDorm.setText(rs.getString("MAILINGDORM"));
                    userMailingStreet.setText(rs.getString("MAILINGSTREET"));
                    userMailingCity.setText(rs.getString("MAILINGCITY"));
                    userMailingState.setText(rs.getString("MAILINGSTATE"));
                    userMailingZip.setText(rs.getString("MAILINGZIP"));
                    userPriorS.setSelectedItem(rs.getString("PRIORSERVICE"));
                    userHasPriorS.setSelectedItem(rs.getString("PRIORSERVICEYES"));
                    userIllHealth.setText(rs.getString("CADETILLHEALTH"));
                    userNotify.setText(rs.getString("CADETNOTIFY"));
                    userNoD.setText(rs.getString("DEPENDENTS"));
                    //Family tab

                    userMaritialS.setSelectedItem(rs.getString("MARITIALSTATUS"));
                    userPartnerFN.setText(rs.getString("PARTNERFIRSTNAME"));
                    userPartnerMI.setText(rs.getString("PARTNERMI"));
                    userPartnerLN.setText(rs.getString("PARTNERLASTNAME"));
                    userPartnerStreet.setText(rs.getString("PARTNERADDRESS"));
                    userPartnerCity.setText(rs.getString("PARTNERCITY"));
                    userPartnerState.setText(rs.getString("PARTNERSTATE"));
                    userPartnerZip.setText(rs.getString("PARTNER"));
                    userPartnerPN.setText(rs.getString("PARTNERNUMBER"));
                    userPartnerPoB.setText(rs.getString("PARTNERPOB"));
                    userChildren.setSelectedItem(rs.getString("CHILDREN"));
                    userChildFN.setText(rs.getString("CHILDFIRSTNAME"));
                    userChildMI.setText(rs.getString("CHILDMI"));
                    userChildLN.setText(rs.getString("CHILDLASTNAME"));
                    userChildDoB.setText(rs.getString("CHILDDOB"));
                    userChildRelationship.setText(rs.getString("CHILDRELATIONSHIP"));
                    userChildStreet.setText(rs.getString("CHILDADDRESS"));
                    userChildCity.setText(rs.getString("CHILDCITY"));
                    userChildState.setText(rs.getString("CHILDSTATE"));
                    userChildZip.setText(rs.getString("CHILDZIP"));
                    userChildPN.setText(rs.getString("CHILDNUMBER"));
                    userFatherFN.setText(rs.getString("FATHERFIRSTNAME"));
                    userFatherMI.setText(rs.getString("FATHERMI"));
                    userFatherLN.setText(rs.getString("FATHERLASTNAME"));
                    userFatherStreet.setText(rs.getString("FATHERADDRESS"));
                    userFatherCity.setText(rs.getString("FATHERCITY"));
                    userFatherState.setText(rs.getString("FATHERSTATE"));
                    userFatherZip.setText(rs.getString("FATHERZIP"));
                    userFatherPN.setText(rs.getString("FATHERPN"));
                    userMotherFN.setText(rs.getString("MOTHERFIRSTNAME"));
                    userMotherMI.setText(rs.getString("MOTHERMI"));
                    userMotherLN.setText(rs.getString("MOTHERLASTNAME"));
                    userMotherStreet.setText(rs.getString("MOTHERADDRESS"));
                    userMotherCity.setText(rs.getString("MOTHERCITY"));
                    userMotherState.setText(rs.getString("MOTHERSTATE"));
                    userMotherZip.setText(rs.getString("MOTHERZIP"));
                    userMotherPN.setText(rs.getString("MOTHERPN"));
                    userEmergency.setText(rs.getString("EMERGENCYCONTACT"));
                    userEmergencyStreet.setText(rs.getString("EMERGENCYSTREET"));
                    userEmergencyCity.setText(rs.getString("EMERGENCYCITY"));
                    userEmergencyState.setText(rs.getString("EMERGENCYSTATE"));
                    userEmergencyZip.setText(rs.getString("EMERGENCYZIP"));
                    userEmergencyPN.setText(rs.getString("EMERGENCYNUMBER"));

                    //Other tab

                    userDeath.setText(rs.getString("DEATHBENEFICARY"));
                    userDeathRelationship.setText(rs.getString("DEATHBENEFICARYRELATIONSHIP"));
                    userDeathStreet.setText(rs.getString("DEATHBENEFICARYSTREET"));
                    userDeathCity.setText(rs.getString("DEATHBENEFICARYCITY"));
                    userDeathState.setText(rs.getString("DEATHBENEFICARYSTATE"));
                    userDeathZip.setText(rs.getString("DEATHBENEFICARYZIP"));
                    userDeathPN.setText(rs.getString("DEATHBENEFICARYPN"));
                    userDeathPercentage.setText(rs.getString("DEATHBENEFICARYPERCENT"));
                    userGuardStatus.setSelectedItem(rs.getString("GUARDIANPRIORSERVICE"));
                    userHasPriorGuardS.setSelectedItem(rs.getString("GUARDIANPRIORSERVICEYES"));
                    userGuardianYearsOfService.setText(rs.getString("GUARDIANPRIORSERVICEYEARS"));
                    userGuardianHighGrade.setText(rs.getString("GUARDIANPRIORSERVICEGRADE"));
                    userGuardianFrom.setText(rs.getString("GUARDIANPRIORSERVICESTART"));
                    userGuardianTo.setText(rs.getString("GUARDIANPRIORSERVICEEND"));
                    userGuardianType.setText(rs.getString("GUARDIANPRIORSERVICECHARGE"));
                    userGuardianYearsRem.setText(rs.getString("GUARDIANPRIORSERVICEREMAIN"));
                    userJuniorROTC.setSelectedItem(rs.getString("JUNIORROTC"));
                    userEagleScout.setSelectedItem(rs.getString("EAGLESCOUT"));
                    userEnlistment.setText(rs.getString("ENLISTEDWARRANT"));

                }
            }catch(Exception e) {
                System.err.println("Exception: "+e.getMessage());
            }
     }       
    
    /*
    public adminInformation(String passedFirstName, String passedLastName, String passedMiddleInitial, 
            String passedCwuID, String passedEmail, String passedDateOfBirth, String passedAreaCode,
            String passedMiddleThreePhoneNumber, String passedLastThreePhoneNumber, String passedAptNumber,
            String passedStreetAddress, String passedCity, String passedState, String passedZipcode, String passedGender, String passedSSN, String passedAcaM,
            String passedPGradD, String passedEthnicity, String passedMaritialS, String passedPName, String passedPAddress, String passedPCity, String passedPState,
            String passedPNumber, String passedPoB, String passedNoD, String passedChildren, String passedEContact, String passedEStreet,String passedECity, String passedEState, String passedENumber,
            String passedDBeneficiary, String passedPriorS,String passedHasPriorS, String passedGuardianPS,String passedGuardianHasPS, String passedEnlisted, 
             String psasedJunior, String passedEagle){
            
            initComponents();
            this.setLocationRelativeTo(null);
            userFN.setText(passedFirstName);
            userLN.setText(passedLastName);
            userMN.setText(passedMiddleInitial);
            userCWUID.setText(passedCwuID);
            userEmail.setText(passedEmail);
            userDoB.setText(passedDateOfBirth);
            userAreaCode.setText(passedAreaCode);
            userMPN.setText(passedMiddleThreePhoneNumber);
            userLPN.setText(passedLastThreePhoneNumber);
            userStreet.setText(passedStreetAddress);
            userApt.setText(passedAptNumber);
            userCity.setText(passedCity);
            userState.setText(passedState);
            userZip.setText(passedZipcode);
            userGender.setSelectedItem(passedGender);
            
            userSSN.setText(passedSSN);
            userAcMajor.setText(passedAcaM);
            userGradDate.setText(passedPGradD);
            userRace.setSelectedItem(passedEthnicity);
            userMaritialS.setSelectedItem(passedMaritialS);
            //userPartnerName.setText(passedPName);
            userPartnerAddress.setText(passedPAddress);
            userPartnerCity.setText(passedPCity);
            userPartnerState.setText(passedPState);
            userPartnerNumber.setText(passedPNumber);
            userPartnerPoB.setText(passedPoB);
            userNoD.setText(passedNoD);
            userChildren.setSelectedItem(passedChildren);
            userEmergency.setText(passedEContact);
            userEmergencyStreet.setText(passedEStreet);
            userEmergencyCity.setText(passedECity);
            userEmergencyState.setText(passedEState);
            userENumber.setText(passedENumber);
            userDeath.setText(passedDBeneficiary);
            userPriorS.setSelectedItem(passedPriorS);
            userHasPriorS.setSelectedItem(passedHasPriorS);
            userGuardStatus.setSelectedItem(passedGuardianPS);
            userHasPriorGuardS.setSelectedItem(passedGuardianHasPS);
            userEnlistment.setText(passedEnlisted);
            userJuniorROTC.setSelectedItem(psasedJunior);
            userEagleScout.setSelectedItem(passedEagle);
    
    }
    */    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel21 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        searchCadet = new javax.swing.JTextField();
        exportCadet = new javax.swing.JButton();
        updateCadet = new javax.swing.JButton();
        cadetForm = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        importCadet = new javax.swing.JButton();
        searchCadetButton = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabelFN = new javax.swing.JLabel();
        userFN = new javax.swing.JTextField();
        jLabelLN = new javax.swing.JLabel();
        userLN = new javax.swing.JTextField();
        jLabelMI = new javax.swing.JLabel();
        userMN = new javax.swing.JTextField();
        jLabelCWUID = new javax.swing.JLabel();
        userCWUID = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        userEmail = new javax.swing.JTextField();
        jLabelDoB = new javax.swing.JLabel();
        userDoB = new javax.swing.JTextField();
        jLabelPN = new javax.swing.JLabel();
        userAreaCode = new javax.swing.JTextField();
        userMPN = new javax.swing.JTextField();
        userLPN = new javax.swing.JTextField();
        jLabelStreet = new javax.swing.JLabel();
        userStreet = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        userApt = new javax.swing.JTextField();
        jLabelCity = new javax.swing.JLabel();
        userCity = new javax.swing.JTextField();
        jLabelState = new javax.swing.JLabel();
        userState = new javax.swing.JTextField();
        jLabelZip = new javax.swing.JLabel();
        userZip = new javax.swing.JTextField();
        jLabelGender = new javax.swing.JLabel();
        userGender = new javax.swing.JComboBox();
        jLabelSSN = new javax.swing.JLabel();
        userSSN = new javax.swing.JTextField();
        jLabelAM = new javax.swing.JLabel();
        userAcMajor = new javax.swing.JTextField();
        jLabelPGD = new javax.swing.JLabel();
        userGradDate = new javax.swing.JTextField();
        jLabelEth = new javax.swing.JLabel();
        userRace = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        userPoB = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        userSelectiveServiceNum = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        userDiffMailing = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        userMailingStreet = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        userMailingCity = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        userMailingState = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        userMailingZip = new javax.swing.JTextField();
        jLabelPS1 = new javax.swing.JLabel();
        userPriorS = new javax.swing.JComboBox<>();
        userHasPriorS = new javax.swing.JComboBox<>();
        jLabelSSN1 = new javax.swing.JLabel();
        userIllHealth = new javax.swing.JTextField();
        jLabelSSN2 = new javax.swing.JLabel();
        userNotify = new javax.swing.JTextField();
        userMailingDorm = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabelNoD = new javax.swing.JLabel();
        userNoD = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabelMS = new javax.swing.JLabel();
        userMaritialS = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        userPartnerFN = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        userPartnerMI = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        userPartnerLN = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        userPartnerStreet = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        userPartnerCity = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        userPartnerState = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        userPartnerZip = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        userPartnerPN = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        userPartnerPoB = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        userChildren = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        userChildFN = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        userChildMI = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        userChildLN = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        userChildDoB = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        userChildRelationship = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        userChildStreet = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        userChildCity = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        userChildZip = new javax.swing.JTextField();
        userChildState = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        userChildPN = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        userFatherFN = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        userFatherMI = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        userFatherLN = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        userFatherStreet = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        userFatherCity = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        userFatherState = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        userFatherZip = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        userFatherPN = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        userMotherFN = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        userMotherMI = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        userMotherLN = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        userMotherStreet = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        userMotherCity = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        userMotherState = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        userMotherZip = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        userMotherPN = new javax.swing.JTextField();
        jLabelEC = new javax.swing.JLabel();
        userEmergency = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        userEmergencyStreet = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        userEmergencyCity = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        userEmergencyState = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        userEmergencyZip = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        userEmergencyPN = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        goBack = new javax.swing.JButton();
        jLabelDB = new javax.swing.JLabel();
        userDeath = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        userDeathRelationship = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        userDeathStreet = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        userDeathCity = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        userDeathState = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        userDeathZip = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        userDeathPN = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        userDeathPercentage = new javax.swing.JTextField();
        jLabelGPS1 = new javax.swing.JLabel();
        userGuardStatus = new javax.swing.JComboBox<>();
        userHasPriorGuardS = new javax.swing.JComboBox<>();
        jLabel75 = new javax.swing.JLabel();
        userGuardianYearsOfService = new javax.swing.JTextField();
        jLabel76 = new javax.swing.JLabel();
        userGuardianHighGrade = new javax.swing.JTextField();
        jLabel77 = new javax.swing.JLabel();
        userGuardianFrom = new javax.swing.JTextField();
        jLabel78 = new javax.swing.JLabel();
        userGuardianTo = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        userGuardianType = new javax.swing.JTextField();
        jLabel80 = new javax.swing.JLabel();
        userGuardianYearsRem = new javax.swing.JTextField();
        jLabelJROTC1 = new javax.swing.JLabel();
        userJuniorROTC = new javax.swing.JComboBox<>();
        jLabelEagleScount1 = new javax.swing.JLabel();
        userEagleScout = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        userEnlistment = new javax.swing.JTextField();

        jLabel21.setText("jLabel21");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        searchCadet.setText("Search Cadet...");
        searchCadet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCadetActionPerformed(evt);
            }
        });
        searchCadet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchCadetKeyPressed(evt);
            }
        });

        exportCadet.setText("Export Cadet to Text File");
        exportCadet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportCadetActionPerformed(evt);
            }
        });

        updateCadet.setText("Update/Add Cadet");
        updateCadet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCadetActionPerformed(evt);
            }
        });

        cadetForm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please Select a Form", "Item 2", "Item 3", "Item 4" }));
        cadetForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadetFormActionPerformed(evt);
            }
        });

        jButton1.setText("Export Text File to Excel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Export Database to Text File");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel34.setText("Admin Access");

        importCadet.setText("Import Cadet");
        importCadet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importCadetActionPerformed(evt);
            }
        });

        searchCadetButton.setText("Search Cadet");
        searchCadetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCadetButtonActionPerformed(evt);
            }
        });

        jLabelFN.setText("First Name:");

        userFN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userFNActionPerformed(evt);
            }
        });

        jLabelLN.setText("Last Name:");

        userLN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userLNActionPerformed(evt);
            }
        });

        jLabelMI.setText("Middle Name:");

        userMN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userMNActionPerformed(evt);
            }
        });

        jLabelCWUID.setText("CWU ID:");

        userCWUID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userCWUIDActionPerformed(evt);
            }
        });

        jLabelEmail.setText("Email:");

        userEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userEmailActionPerformed(evt);
            }
        });

        jLabelDoB.setText("Date of birth (YYYY/MM/DD):");

        userDoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userDoBActionPerformed(evt);
            }
        });

        jLabelPN.setText("Phone Number:");

        userAreaCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userAreaCodeActionPerformed(evt);
            }
        });

        jLabelStreet.setText("Street Address:");

        jLabel40.setText("Apartment:");

        jLabelCity.setText("City:");

        jLabelState.setText("State:");

        jLabelZip.setText("Zip Code:");

        jLabelGender.setText("Gender:");

        userGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        userGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userGenderActionPerformed(evt);
            }
        });

        jLabelSSN.setText("Social Security:");

        jLabelAM.setText("Academic Major:");

        jLabelPGD.setText("Projected Graduation Date (YY/MM):");

        jLabelEth.setText("Ethnicity:");

        userRace.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Asian", "American Indian Or Alaskan Native", "Hawaiian", "Black, Not Of Hispanic Origin", "White, Not Of Hispanic Origin", "Hispanic", "Decline To Respond" }));

        jLabel9.setText("Place of Birth(City,State):");

        userPoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userPoBActionPerformed(evt);
            }
        });

        jLabel15.setText("Selective Service Number:");

        jLabel16.setText("<html>Mailing address the same<br></br> as resident address?</br></html>");

        userDiffMailing.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No", "Yes" }));
        userDiffMailing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userDiffMailingActionPerformed(evt);
            }
        });

        jLabel18.setText("Street Address:");

        jLabel19.setText("City:");

        jLabel20.setText("State:");

        jLabel22.setText("Zip Code:");

        jLabelPS1.setText("Prior Service:");

        userPriorS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Yes" }));
        userPriorS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userPriorSMouseClicked(evt);
            }
        });
        userPriorS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userPriorSActionPerformed(evt);
            }
        });
        userPriorS.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                userPriorSPropertyChange(evt);
            }
        });

        userHasPriorS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Army", "Air Force", "Navy", "Marines", "Cost Guard", "Merchant Marine" }));

        jLabelSSN1.setText("Don't notify due to ill health:");

        jLabelSSN2.setText("Notify instead:");

        jLabel23.setText("Dorm and Room #");

        jLabelNoD.setText("Number of dependants:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addGap(21, 21, 21)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userMailingDorm, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(userSelectiveServiceNum)
                                .addComponent(userDiffMailing, 0, 191, Short.MAX_VALUE))
                            .addComponent(userMailingStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userMailingCity, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userMailingState, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userMailingZip, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                                    .addComponent(jLabelCWUID, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelMI, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelLN, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelFN, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelEth, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userDoB, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(userAreaCode, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(userMPN, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(userLPN, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(userStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userApt, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userCity, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userState, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userZip, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userAcMajor, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userGradDate, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(userSSN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(userFN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                                .addComponent(userEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(userCWUID, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(userLN, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(userMN, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(userRace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userPoB, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelSSN1)
                            .addComponent(jLabelPS1)
                            .addComponent(jLabelSSN2)
                            .addComponent(jLabelNoD))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userIllHealth, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(userPriorS, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(userHasPriorS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(userNoD, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(userNotify, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFN)
                    .addComponent(userFN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userLN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMI)
                    .addComponent(userMN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCWUID)
                    .addComponent(userCWUID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userDoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDoB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userAreaCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userMPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userLPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(userApt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelState)
                    .addComponent(userState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelZip)
                    .addComponent(userZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGender)
                    .addComponent(userGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSSN)
                    .addComponent(userSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAM)
                    .addComponent(userAcMajor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userGradDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPGD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userRace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEth))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userPoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(userSelectiveServiceNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userDiffMailing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(userMailingDorm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(userMailingStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(userMailingCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(userMailingState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(userMailingZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelPS1)
                        .addComponent(userHasPriorS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(userPriorS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSSN1)
                    .addComponent(userIllHealth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSSN2)
                    .addComponent(userNotify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoD)
                    .addComponent(userNoD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(407, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Personal Information", jPanel4);

        jLabelMS.setText("Marital Status:");

        userMaritialS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married", "Widowed", " " }));

        jLabel4.setText("Partner First Name:");

        userPartnerFN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userPartnerFNActionPerformed(evt);
            }
        });

        jLabel29.setText("Partner Middle Initial:");

        jLabel28.setText("Partner Last Name:");

        jLabel11.setText("Partner Street Address:");

        jLabel13.setText("Partner City:");

        jLabel14.setText("Partner State:");

        jLabel56.setText("Partner Zipcode:");

        jLabel12.setText("Phone Number:");

        jLabel8.setText("Partner place of Birth :");

        jLabel2.setText("Do you have any children?");

        userChildren.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Yes", " " }));
        userChildren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userChildrenActionPerformed(evt);
            }
        });

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
                    .addComponent(userPartnerStreet)
                    .addComponent(userPartnerState)
                    .addComponent(userPartnerZip)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userChildPN, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userChildState, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userMaritialS, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userPartnerFN, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userPartnerMI, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userPartnerLN, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userPartnerCity, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userPartnerPN, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userPartnerPoB, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userChildren, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userChildFN, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userChildMI, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userChildLN, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userChildDoB, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userChildRelationship, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userChildStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userChildCity, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userChildZip, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 241, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userMaritialS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(userPartnerFN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(userPartnerMI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(userPartnerLN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(userPartnerStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(userPartnerCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(userPartnerState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(userPartnerZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(userPartnerPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(userPartnerPoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(userChildren, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(userChildFN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(userChildMI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(userChildLN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(userChildDoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(userChildRelationship, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(userChildStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(userChildCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userChildState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userChildZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel66))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userChildPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55))
                .addContainerGap(614, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Spouse/Child", jPanel5);

        jLabel67.setText("Father First Name:");

        userFatherFN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userFatherFNActionPerformed(evt);
            }
        });

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
                    .addComponent(userFatherMI)
                    .addComponent(userFatherLN)
                    .addComponent(userFatherStreet)
                    .addComponent(userFatherCity)
                    .addComponent(userFatherState)
                    .addComponent(userFatherZip)
                    .addComponent(userFatherPN)
                    .addComponent(userMotherFN)
                    .addComponent(userMotherMI)
                    .addComponent(userMotherLN)
                    .addComponent(userMotherStreet)
                    .addComponent(userMotherCity)
                    .addComponent(userMotherState)
                    .addComponent(userMotherZip)
                    .addComponent(userMotherPN)
                    .addComponent(userEmergency)
                    .addComponent(userEmergencyStreet)
                    .addComponent(userEmergencyCity)
                    .addComponent(userEmergencyState, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                    .addComponent(userEmergencyZip, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                    .addComponent(userEmergencyPN)
                    .addComponent(userFatherFN))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67)
                    .addComponent(userFatherFN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68)
                    .addComponent(userFatherMI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69)
                    .addComponent(userFatherLN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(userFatherStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(userFatherCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(userFatherState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(userFatherZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(userFatherPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(userMotherFN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(userMotherMI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(userMotherLN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(userMotherStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(userMotherCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(userMotherState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(userMotherZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(userMotherPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEC)
                    .addComponent(userEmergency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(userEmergencyStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(userEmergencyCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(userEmergencyState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(userEmergencyZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(userEmergencyPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(627, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Parents and Emergency", jPanel1);

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

        jLabelDB.setText("Death beneficiary:");

        userDeath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userDeathActionPerformed(evt);
            }
        });

        jLabel59.setText("Relationship:");

        jLabel60.setText("Address:");

        jLabel61.setText("City:");

        jLabel62.setText("State:");

        jLabel63.setText("Zipcode:");

        jLabel64.setText("Phone Number:");

        jLabel65.setText("Death Beneficiary Percentage:");

        userDeathPercentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userDeathPercentageActionPerformed(evt);
            }
        });

        jLabelGPS1.setText("Guardian Prior Service:");

        userGuardStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Guardian Status:", "Civilian", "Retired Military", "Active Duty" }));
        userGuardStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userGuardStatusMouseClicked(evt);
            }
        });
        userGuardStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userGuardStatusActionPerformed(evt);
            }
        });

        userHasPriorGuardS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Army", "Air Force", "Navy", "Marines", "Coast Guard", "Merchant Marine" }));
        userHasPriorGuardS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userHasPriorGuardSMouseClicked(evt);
            }
        });
        userHasPriorGuardS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userHasPriorGuardSActionPerformed(evt);
            }
        });

        jLabel75.setText("Guardian years of service:");

        jLabel76.setText("Guardian Highest Grade:");

        jLabel77.setText("Guardian From(Month/Year):");

        jLabel78.setText("Guardian To(Month/Year):");

        jLabel79.setText("Guardian Type of Discharge:");

        jLabel80.setText("<html>Guardian Years Remaining on <br></br>Enlistment:</html>");

        jLabelJROTC1.setText("Junior ROTC:");

        userJuniorROTC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "1 Year", "2 Years", "3 Years", "4 Years" }));

        jLabelEagleScount1.setText("Eagle Scout:");

        userEagleScout.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Yes" }));

        jLabel10.setText("<html>Are you now or have you ever been an enlisted or warrant\n<br>  officer of any component of the US armed forces?</html>");

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
                    .addComponent(jLabelEagleScount1)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userDeath, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                            .addComponent(userDeathRelationship)
                            .addComponent(userDeathStreet)
                            .addComponent(userDeathCity)
                            .addComponent(userDeathState)
                            .addComponent(userDeathZip, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                            .addComponent(userDeathPN, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(userDeathPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(userGuardStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(userHasPriorGuardS, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(userGuardianYearsOfService)
                            .addComponent(userGuardianHighGrade)
                            .addComponent(userGuardianFrom)
                            .addComponent(userGuardianTo)
                            .addComponent(userGuardianType)
                            .addComponent(userGuardianYearsRem, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                            .addComponent(userJuniorROTC, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(userEagleScout, 0, 260, Short.MAX_VALUE))
                        .addContainerGap(76, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(goBack, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userEnlistment, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDB)
                    .addComponent(userDeath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(userDeathRelationship, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(userDeathStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(userDeathCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(userDeathState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63)
                    .addComponent(userDeathZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel64)
                    .addComponent(userDeathPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65)
                    .addComponent(userDeathPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGPS1)
                    .addComponent(userGuardStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userHasPriorGuardS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel75)
                    .addComponent(userGuardianYearsOfService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel76)
                    .addComponent(userGuardianHighGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel77)
                    .addComponent(userGuardianFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel78)
                    .addComponent(userGuardianTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79)
                    .addComponent(userGuardianType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userGuardianYearsRem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelJROTC1)
                    .addComponent(userJuniorROTC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEagleScount1)
                    .addComponent(userEagleScout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(userEnlistment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(goBack))
                .addGap(875, 875, 875))
        );

        jTabbedPane2.addTab("Other Information", jPanel6);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(searchCadet)
                        .addGap(18, 18, 18)
                        .addComponent(searchCadetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(jLabel34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(updateCadet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(exportCadet, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(importCadet, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cadetForm, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 645, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel34)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchCadet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchCadetButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(importCadet)
                    .addComponent(exportCadet)
                    .addComponent(updateCadet))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadetForm, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1168, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(465, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackActionPerformed

        this.dispose();
        goBack.setVisible(true);
    }//GEN-LAST:event_goBackActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    }//GEN-LAST:event_jButton3ActionPerformed

    private void userGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userGenderActionPerformed

    private void userAreaCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userAreaCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userAreaCodeActionPerformed

    private void userDoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userDoBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userDoBActionPerformed

    private void userEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userEmailActionPerformed

    private void userCWUIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userCWUIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userCWUIDActionPerformed

    private void userMNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userMNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userMNActionPerformed

    private void userLNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userLNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userLNActionPerformed

    private void userFNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userFNActionPerformed

    }//GEN-LAST:event_userFNActionPerformed

    private void searchCadetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCadetButtonActionPerformed
        Fill();
        /*
        Connection con;
        searchID = searchCadet.getText();
        try {
            String url = "jdbc:derby://localhost:1527/CadetInfo";
            String username = "adminCadre";
            String password = "cadrecwu";
            con = DriverManager.getConnection(url, username, password);
            Statement sta = con.createStatement();
            ResultSet rs = sta.executeQuery("Select * From INFO WHERE CWUID ='"+ searchID+"'");
            if(rs.next()){
                
                userLN.setText(rs.getString("LASTNAME"));
                userFN.setText(rs.getString("FIRSTNAME"));
                userMN.setText(rs.getString("MIDDLEINITIAL"));
                userCWUID.setText(rs.getString("CWUID"));
                userEmail.setText(rs.getString("EMAIL"));
                userDoB.setText(rs.getString("DATEOFBIRTHMDDYYYY"));
                userAreaCode.setText(rs.getString("PHONENUMBER").substring(1, 4));
                userMPN.setText(rs.getString("PHONENUMBER").substring(6, 9));
                userLPN.setText(rs.getString("PHONENUMBER").substring(10, 14));
                userStreet.setText(rs.getString("STREETADDRESS"));
                userApt.setText(rs.getString("APT"));
                userCity.setText(rs.getString("CITY"));
                userState.setText(rs.getString("STATE"));
                userZip.setText(rs.getString("ZIPCODE"));
                userGender.setSelectedItem(rs.getString("GENDER"));
                userSSN.setText(rs.getString("SSAN"));
                userAcMajor.setText(rs.getString("ACAMAJOR"));
                userGradDate.setText(rs.getString("GRADDATE"));
                userRace.setSelectedItem(rs.getString("ETHNICITY"));
                userPoB.setText(rs.getString("PLACEOFBIRTH"));
                userSelectiveServiceNum.setText(rs.getString("SELECTIVESERVERNUMBER"));
                userDiffMailing.setSelectedItem(rs.getString("MAILINGYESORNO"));
                userMailingStreet.setText(rs.getString("MAILINGSTREET"));
                userMailingCity.setText(rs.getString("MAILINGCITY"));
                userMailingState.setText(rs.getString("MAILINGSTATE"));
                userMailingZip.setText(rs.getString("MAILINGZIP"));
                userPriorS.setSelectedItem(rs.getString("PRIORSERVICE"));
                userHasPriorS.setSelectedItem(rs.getString("PRIORSERVICEYES"));

                //Family tab

                userMaritialS.setSelectedItem(rs.getString("MARITIALSTATUS"));
                userPartnerFN.setText(rs.getString("PARTNERFIRSTNAME"));
                userPartnerMI.setText(rs.getString("PARTNERMI"));
                userPartnerLN.setText(rs.getString("PARTNERLASTNAME"));
                userPartnerStreet.setText(rs.getString("PARTNERADDRESS"));
                userPartnerCity.setText(rs.getString("PARTNERCITY"));
                userPartnerState.setText(rs.getString("PARTNERSTATE"));
                userPartnerZipcode.setText(rs.getString("PARTNER"));
                userPartnerNumber.setText(rs.getString("PARTNERNUMBER"));
                userPartnerPoB.setText(rs.getString("PARTNERPOB"));
                userNoD.setText(rs.getString("DEPENDENTS"));
                userChildren.setSelectedItem(rs.getString("CHILDREN"));
                userChildFirstName.setText(rs.getString("CHILDFIRSTNAME"));
                userChildMI.setText(rs.getString("CHILDMI"));
                userChildLastName.setText(rs.getString("CHILDLASTNAME"));
                userChildDoB.setText(rs.getString("CHILDDOB"));
                userChildRelationship.setText(rs.getString("CHILDRELATIONSHIP"));
                userChildStreet.setText(rs.getString("CHILDADDRESS"));
                userChildCity.setText(rs.getString("CHILDCITY"));
                userChildState.setText(rs.getString("CHILDSTATE"));
                userChildZip.setText(rs.getString("CHILDZIP"));
                userChildPN.setText(rs.getString("CHILDNUMBER"));
                userFatherFN.setText(rs.getString("FATHERFIRSTNAME"));
                userFatherMI.setText(rs.getString("FATHERMI"));
                userFatherLN.setText(rs.getString("FATHERLASTNAME"));
                userFatherStreet.setText(rs.getString("FATHERADDRESS"));
                userFatherCity.setText(rs.getString("FATHERCITY"));
                userFatherState.setText(rs.getString("FATHERSTATE"));
                userFatherZip.setText(rs.getString("FATHERZIP"));
                userFatherNum.setText(rs.getString("FATHERPN"));
                userMotherFN.setText(rs.getString("MOTHERFIRSTNAME"));
                userMotherMI.setText(rs.getString("MOTHERMI"));
                userMotherLN.setText(rs.getString("MOTHERLASTNAME"));
                userMotherStreet.setText(rs.getString("MOTHERADDRESS"));
                userMotherCity.setText(rs.getString("MOTHERCITY"));
                userMotherState.setText(rs.getString("MOTHERSTATE"));
                userMotherZip.setText(rs.getString("MOTHERZIP"));
                userMotherNum.setText(rs.getString("MOTHERPN"));
                userEmergency.setText(rs.getString("EMERGENCYCONTACT"));
                userEmergencyStreet.setText(rs.getString("EMERGENCYSTREET"));
                userEmergencyCity.setText(rs.getString("EMERGENCYCITY"));
                userEmergencyState.setText(rs.getString("EMERGENCYSTATE"));
                userEmergencyPN.setText(rs.getString("EMERGENCYNUMBER"));

                //Other tab

                userDeath.setText(rs.getString("DEATHBENEFICARY"));
                userDeathRelationship.setText(rs.getString("DEATHBENEFICARYRELATIONSHIP"));
                userDeathStreet.setText(rs.getString("DEATHBENEFICARYSTREET"));
                userDeathCity.setText(rs.getString("DEATHBENEFICARYCITY"));
                userDeathState.setText(rs.getString("DEATHBENEFICARYSTATE"));
                userDeathZip.setText(rs.getString("DEATHBENEFICARYZIP"));
                userDeathPN.setText(rs.getString("DEATHBENEFICARYPN"));
                userDeathPercentage.setText(rs.getString("DEATHBENEFICARYPERCENT"));
                userGuardStatus.setSelectedItem(rs.getString("GUARDIANPRIORSERVICE"));
                userHasPriorGuardS.setSelectedItem(rs.getString("GUARDIANPRIORSERVICEYES"));
                userGuardianYearsOfService.setText(rs.getString("GUARDIANPRIORSERVICEYEARS"));
                userGuardianHighGrade.setText(rs.getString("GUARDIANPRIORSERVICEGRADE"));
                userGuardianFrom.setText(rs.getString("GUARDIANPRIORSERVICESTART"));
                userGuardianTo.setText(rs.getString("GUARDIANPRIORSERVICEEND"));
                userGuardianType.setText(rs.getString("GUARDIANPRIORSERVICECHARGE"));
                userGuardianYearsRem.setText(rs.getString("GUARDIANPRIORSERVICEREMAIN"));
                userJuniorROTC.setSelectedItem(rs.getString("JUNIORROTC"));
                userEagleScout.setSelectedItem(rs.getString("EAGLESCOUT"));
                userEnlistment.setText(rs.getString("ENLISTEDWARRANT"));
                
            }
        }catch(Exception e) {
            System.err.println("Exception: "+e.getMessage());
        }
        */
    }//GEN-LAST:event_searchCadetButtonActionPerformed

    private void importCadetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importCadetActionPerformed
        JFileChooser cadetFile = new JFileChooser();
        cadetFile.showOpenDialog(null);
        File file = cadetFile.getSelectedFile();
        decrypt decryption = new decrypt();
        String fileName = file.getAbsolutePath();

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            //Peronal Tab
            userFN.setText(decryption.deCrypt(bufferedReader.readLine()));
            userLN.setText(decryption.deCrypt(bufferedReader.readLine()));
            userMN.setText(decryption.deCrypt(bufferedReader.readLine()));
            userCWUID.setText(decryption.deCrypt(bufferedReader.readLine()));
            userEmail.setText(decryption.deCrypt(bufferedReader.readLine()));
            userDoB.setText(decryption.deCrypt(bufferedReader.readLine()));
            userAreaCode.setText(decryption.deCrypt(bufferedReader.readLine()));
            userMPN.setText(decryption.deCrypt(bufferedReader.readLine()));
            userLPN.setText(decryption.deCrypt(bufferedReader.readLine()));
            userStreet.setText(decryption.deCrypt(bufferedReader.readLine()));
            userApt.setText(decryption.deCrypt(bufferedReader.readLine()));
            userCity.setText(decryption.deCrypt(bufferedReader.readLine()));
            userState.setText(decryption.deCrypt(bufferedReader.readLine()));
            userZip.setText(decryption.deCrypt(bufferedReader.readLine()));
            userGender.setSelectedItem(decryption.deCrypt(bufferedReader.readLine()));
            userSSN.setText(decryption.deCrypt(bufferedReader.readLine()));
            userAcMajor.setText(decryption.deCrypt(bufferedReader.readLine()));
            userGradDate.setText(decryption.deCrypt(bufferedReader.readLine()));
            userRace.setSelectedItem(decryption.deCrypt(bufferedReader.readLine()));
            userPoB.setText(decryption.deCrypt(bufferedReader.readLine()));
            userSelectiveServiceNum.setText(decryption.deCrypt(bufferedReader.readLine()));
            userMailingDorm.setText(decryption.deCrypt(bufferedReader.readLine()));
            userMailingStreet.setText(decryption.deCrypt(bufferedReader.readLine()));
            userMailingCity.setText(decryption.deCrypt(bufferedReader.readLine()));
            userMailingState.setText(decryption.deCrypt(bufferedReader.readLine()));
            userMailingZip.setText(decryption.deCrypt(bufferedReader.readLine()));
            userPriorS.setSelectedItem(decryption.deCrypt(bufferedReader.readLine()));
            userHasPriorS.setSelectedItem(decryption.deCrypt(bufferedReader.readLine()));
            userIllHealth.setText(decryption.deCrypt(bufferedReader.readLine()));
            userNotify.setText(decryption.deCrypt(bufferedReader.readLine()));
            userNoD.setText(decryption.deCrypt(bufferedReader.readLine()));
            
            //Family Tab
            userMaritialS.setSelectedItem(decryption.deCrypt(bufferedReader.readLine()));
            userPartnerFN.setText(decryption.deCrypt(bufferedReader.readLine()));
            userPartnerMI.setText(decryption.deCrypt(bufferedReader.readLine()));
            userPartnerLN.setText(decryption.deCrypt(bufferedReader.readLine()));
            userPartnerStreet.setText(decryption.deCrypt(bufferedReader.readLine()));
            userPartnerCity.setText(decryption.deCrypt(bufferedReader.readLine()));
            userPartnerState.setText(decryption.deCrypt(bufferedReader.readLine()));
            userPartnerZip.setText(decryption.deCrypt(bufferedReader.readLine()));
            userPartnerPN.setText(decryption.deCrypt(bufferedReader.readLine()));
            userPartnerPoB.setText(decryption.deCrypt(bufferedReader.readLine()));
            userChildren.setSelectedItem(decryption.deCrypt(bufferedReader.readLine()));
            userChildFN.setText(decryption.deCrypt(bufferedReader.readLine()));
            userChildMI.setText(decryption.deCrypt(bufferedReader.readLine()));
            userChildLN.setText(decryption.deCrypt(bufferedReader.readLine()));
            userChildDoB.setText(decryption.deCrypt(bufferedReader.readLine()));
            userChildRelationship.setText(decryption.deCrypt(bufferedReader.readLine()));
            userChildStreet.setText(decryption.deCrypt(bufferedReader.readLine()));
            userChildCity.setText(decryption.deCrypt(bufferedReader.readLine()));
            userChildState.setText(decryption.deCrypt(bufferedReader.readLine()));
            userChildZip.setText(decryption.deCrypt(bufferedReader.readLine()));
            userChildPN.setText(decryption.deCrypt(bufferedReader.readLine()));
            userFatherFN.setText(decryption.deCrypt(bufferedReader.readLine()));
            userFatherMI.setText(decryption.deCrypt(bufferedReader.readLine()));
            userFatherLN.setText(decryption.deCrypt(bufferedReader.readLine()));
            userFatherStreet.setText(decryption.deCrypt(bufferedReader.readLine()));
            userFatherCity.setText(decryption.deCrypt(bufferedReader.readLine()));
            userFatherState.setText(decryption.deCrypt(bufferedReader.readLine()));
            userFatherZip.setText(decryption.deCrypt(bufferedReader.readLine()));
            userFatherPN.setText(decryption.deCrypt(bufferedReader.readLine()));
            userMotherFN.setText(decryption.deCrypt(bufferedReader.readLine()));
            userMotherMI.setText(decryption.deCrypt(bufferedReader.readLine()));
            userMotherLN.setText(decryption.deCrypt(bufferedReader.readLine()));
            userMotherStreet.setText(decryption.deCrypt(bufferedReader.readLine()));
            userMotherCity.setText(decryption.deCrypt(bufferedReader.readLine()));
            userMotherState.setText(decryption.deCrypt(bufferedReader.readLine()));
            userMotherZip.setText(decryption.deCrypt(bufferedReader.readLine()));
            userMotherPN.setText(decryption.deCrypt(bufferedReader.readLine()));
            userEmergency.setText(decryption.deCrypt(bufferedReader.readLine()));
            userEmergencyStreet.setText(decryption.deCrypt(bufferedReader.readLine()));
            userEmergencyCity.setText(decryption.deCrypt(bufferedReader.readLine()));
            userEmergencyState.setText(decryption.deCrypt(bufferedReader.readLine()));
            userEmergencyZip.setText(decryption.deCrypt(bufferedReader.readLine()));
            userEmergencyPN.setText(decryption.deCrypt(bufferedReader.readLine()));
            
            //Other info tab
            
            userDeath.setText(decryption.deCrypt(bufferedReader.readLine()));
            userDeathRelationship.setText(decryption.deCrypt(bufferedReader.readLine()));
            userDeathStreet.setText(decryption.deCrypt(bufferedReader.readLine()));
            userDeathCity.setText(decryption.deCrypt(bufferedReader.readLine()));
            userDeathState.setText(decryption.deCrypt(bufferedReader.readLine()));
            userDeathZip.setText(decryption.deCrypt(bufferedReader.readLine()));
            userDeathPN.setText(decryption.deCrypt(bufferedReader.readLine()));
            userDeathPercentage.setText(decryption.deCrypt(bufferedReader.readLine()));
            userGuardStatus.setSelectedItem(decryption.deCrypt(bufferedReader.readLine()));
            userHasPriorGuardS.setSelectedItem(decryption.deCrypt(bufferedReader.readLine()));
            userGuardianYearsOfService.setText(decryption.deCrypt(bufferedReader.readLine()));
            userGuardianHighGrade.setText(decryption.deCrypt(bufferedReader.readLine()));
            userGuardianFrom.setText(decryption.deCrypt(bufferedReader.readLine()));
            userGuardianTo.setText(decryption.deCrypt(bufferedReader.readLine()));
            userGuardianType.setText(decryption.deCrypt(bufferedReader.readLine()));
            userGuardianYearsRem.setText(decryption.deCrypt(bufferedReader.readLine()));
            userJuniorROTC.setSelectedItem(decryption.deCrypt(bufferedReader.readLine()));
            userEagleScout.setSelectedItem(decryption.deCrypt(bufferedReader.readLine()));
            userEnlistment.setText(decryption.deCrypt(bufferedReader.readLine()));
            

        }
        catch(IOException ex) {

        }
    }//GEN-LAST:event_importCadetActionPerformed

    private void cadetFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadetFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadetFormActionPerformed

    private void updateCadetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCadetActionPerformed
        Confirmation confirm = new Confirmation(userFN.getText(),userLN.getText(), userMN.getText(), userCWUID.getText(),userEmail.getText(),userDoB.getText(), userAreaCode.getText(), userMPN.getText(),userLPN.getText(),
            userStreet.getText(),userApt.getText(),userCity.getText(),userState.getText(),userZip.getText(),
            userGender.getSelectedItem().toString(),userSSN.getText(),userAcMajor.getText(),userGradDate.getText(), userRace.getSelectedItem().toString(),
            userPoB.getText(), userSelectiveServiceNum.getText(), userDiffMailing.getSelectedItem().toString(), userMailingDorm.getText(), userMailingStreet.getText(), 
            userMailingCity.getText(), userMailingState.getText(), userMailingZip.getText(), userPriorS.getSelectedItem().toString(), userHasPriorS.getSelectedItem().toString(),
            userIllHealth.getText(), userNotify.getText(),  userNoD.getText(),
                
            userMaritialS.getSelectedItem().toString(),userPartnerFN.getText(), userPartnerMI.getText(), 
            userPartnerLN.getText(), userPartnerStreet.getText(),userPartnerCity.getText(),userPartnerState.getText(),userPartnerZip.getText(), userPartnerPN.getText(),
            userPartnerPoB.getText(), userChildren.getSelectedItem().toString(), userChildFN.getText(), userChildMI.getText(), userChildLN.getText(),
            userChildDoB.getText(), userChildRelationship.getText(), userChildStreet.getText(), userChildCity.getText(), userChildState.getText(), userChildZip.getText(), 
            userChildPN.getText(), userFatherFN.getText(), userFatherMI.getText(), userFatherLN.getText(), userFatherStreet.getText(), userFatherCity.getText(),     
            userFatherState.getText(), userFatherZip.getText(), userFatherPN.getText(), userMotherFN.getText(), userMotherMI.getText(), userMotherLN.getText(),   
            userMotherStreet.getText(), userMotherCity.getText(), userMotherState.getText(), userMotherZip.getText(), userMotherPN.getText(),    
            userEmergency.getText(), userEmergencyStreet.getText(), userEmergencyCity.getText(), userEmergencyState.getText(), userEmergencyZip.getText(), userEmergencyPN.getText(),
                
            userDeath.getText(), userDeathRelationship.getText(), userDeathStreet.getText(), userDeathCity.getText(), userDeathState.getText(), userDeathZip.getText(), 
            userDeathPN.getText(), userDeathPercentage.getText(), userGuardStatus.getSelectedItem().toString(), userHasPriorGuardS.getSelectedItem().toString(),
            userGuardianYearsOfService.getText(), userGuardianHighGrade.getText(), userGuardianFrom.getText(), userGuardianTo.getText(),
            userGuardianType.getText(), userGuardianYearsRem.getText(), userJuniorROTC.getSelectedItem().toString(), userEagleScout.getSelectedItem().toString(),
            userEnlistment.getText());
            
        /*

            userDeathPercentage.setText(passedDBeneficiaryPercent);
            userGuardStatus.setSelectedItem(passedGuardianPS);
            userHasPriorGuardS.setSelectedItem(passedGuardianHasPS);
            userGuardianYearsOfService.setText(passedGuardianPSYears);
            userGuardianHighGrade.setText(passedGuardianPSGrade);
            userGuardianFrom.setText(passedGuardianPSStart);
            userGuardianTo.setText(passedGuardianPSFinish);
            userGuardianType.setText(passedGuardianPSDischarge);
            userGuardianYearsRem.setText(passedGuardianPSRemaining);
            userJuniorROTC.setSelectedItem(psasedJunior);
            userEagleScout.setSelectedItem(passedEagle);
            userEnlistment.setText(passedEnlisted);
        */
        confirm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_updateCadetActionPerformed

    private void searchCadetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchCadetKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            Fill();
            /*
            Connection con;
            searchID = searchCadet.getText();
            try {
                String url = "jdbc:derby://localhost:1527/CadetInfo";
                String username = "adminCadre";
                String password = "cadrecwu";
                con = DriverManager.getConnection(url, username, password);
                Statement sta = con.createStatement();
                ResultSet rs = sta.executeQuery("Select * From INFO WHERE CWUID ='"+ searchID+"'");
                if(rs.next()){
                    
                    userLN.setText(rs.getString("LASTNAME"));
                    userFN.setText(rs.getString("FIRSTNAME"));
                    userMN.setText(rs.getString("MIDDLEINITIAL"));
                    userCWUID.setText(rs.getString("CWUID"));
                    userEmail.setText(rs.getString("EMAIL"));
                    userDoB.setText(rs.getString("DATEOFBIRTHMDDYYYY"));
                    userAreaCode.setText(rs.getString("PHONENUMBER").substring(1, 4));
                    userMPN.setText(rs.getString("PHONENUMBER").substring(6, 9));
                    userLPN.setText(rs.getString("PHONENUMBER").substring(10, 14));
                    userStreet.setText(rs.getString("STREETADDRESS"));
                    userApt.setText(rs.getString("APT"));
                    userCity.setText(rs.getString("CITY"));
                    userState.setText(rs.getString("STATE"));
                    userZip.setText(rs.getString("ZIPCODE"));
                    userGender.setSelectedItem(rs.getString("GENDER"));
                    userSSN.setText(rs.getString("SSAN"));
                    userAcMajor.setText(rs.getString("ACAMAJOR"));
                    userGradDate.setText(rs.getString("GRADDATE"));
                    userRace.setSelectedItem(rs.getString("ETHNICITY"));
                    userPoB.setText(rs.getString("PLACEOFBIRTH"));
                    userSelectiveServiceNum.setText(rs.getString("SELECTIVESERVERNUMBER"));
                    userDiffMailing.setSelectedItem(rs.getString("MAILINGYESORNO"));
                    userMailingStreet.setText(rs.getString("MAILINGSTREET"));
                    userMailingCity.setText(rs.getString("MAILINGCITY"));
                    userMailingState.setText(rs.getString("MAILINGSTATE"));
                    userMailingZip.setText(rs.getString("MAILINGZIP"));
                    userPriorS.setSelectedItem(rs.getString("PRIORSERVICE"));
                    userHasPriorS.setSelectedItem(rs.getString("PRIORSERVICEYES"));

                    //Family tab

                    userMaritialS.setSelectedItem(rs.getString("MARITIALSTATUS"));
                    userPartnerFN.setText(rs.getString("PARTNERFIRSTNAME"));
                    userPartnerMI.setText(rs.getString("PARTNERMI"));
                    userPartnerLN.setText(rs.getString("PARTNERLASTNAME"));
                    userPartnerStreet.setText(rs.getString("PARTNERADDRESS"));
                    userPartnerCity.setText(rs.getString("PARTNERCITY"));
                    userPartnerState.setText(rs.getString("PARTNERSTATE"));
                    userPartnerZipcode.setText(rs.getString("PARTNER"));
                    userPartnerNumber.setText(rs.getString("PARTNERNUMBER"));
                    userPartnerPoB.setText(rs.getString("PARTNERPOB"));
                    userNoD.setText(rs.getString("DEPENDENTS"));
                    userChildren.setSelectedItem(rs.getString("CHILDREN"));
                    userChildFirstName.setText(rs.getString("CHILDFIRSTNAME"));
                    userChildMI.setText(rs.getString("CHILDMI"));
                    userChildLastName.setText(rs.getString("CHILDLASTNAME"));
                    userChildDoB.setText(rs.getString("CHILDDOB"));
                    userChildRelationship.setText(rs.getString("CHILDRELATIONSHIP"));
                    userChildStreet.setText(rs.getString("CHILDADDRESS"));
                    userChildCity.setText(rs.getString("CHILDCITY"));
                    userChildState.setText(rs.getString("CHILDSTATE"));
                    userChildZip.setText(rs.getString("CHILDZIP"));
                    userFatherFN.setText(rs.getString("FATHERFIRSTNAME"));
                    userFatherMI.setText(rs.getString("FATHERMI"));
                    userFatherLN.setText(rs.getString("FATHERLASTNAME"));
                    userFatherStreet.setText(rs.getString("FATHERADDRESS"));
                    userFatherCity.setText(rs.getString("FATHERCITY"));
                    userFatherState.setText(rs.getString("FATHERSTATE"));
                    userFatherZip.setText(rs.getString("FATHERZIP"));
                    userFatherNum.setText(rs.getString("FATHERPN"));
                    userMotherFN.setText(rs.getString("MOTHERFIRSTNAME"));
                    userMotherMI.setText(rs.getString("MOTHERMI"));
                    userMotherLN.setText(rs.getString("MOTHERLASTNAME"));
                    userMotherStreet.setText(rs.getString("MOTHERADDRESS"));
                    userMotherCity.setText(rs.getString("MOTHERCITY"));
                    userMotherState.setText(rs.getString("MOTHERSTATE"));
                    userMotherZip.setText(rs.getString("MOTHERZIP"));
                    userMotherNum.setText(rs.getString("MOTHERPN"));
                    userEmergency.setText(rs.getString("EMERGENCYCONTACT"));
                    userEmergencyStreet.setText(rs.getString("EMERGENCYSTREET"));
                    userEmergencyCity.setText(rs.getString("EMERGENCYCITY"));
                    userEmergencyState.setText(rs.getString("EMERGENCYSTATE"));
                    userEmergencyPN.setText(rs.getString("EMERGENCYNUMBER"));

                    //Other tab

                    userDeath.setText(rs.getString("DEATHBENEFICARY"));
                    userDeathRelationship.setText(rs.getString("DEATHBENEFICARYRELATIONSHIP"));
                    userDeathStreet.setText(rs.getString("DEATHBENEFICARYSTREET"));
                    userDeathCity.setText(rs.getString("DEATHBENEFICARYCITY"));
                    userDeathState.setText(rs.getString("DEATHBENEFICARYSTATE"));
                    userDeathZip.setText(rs.getString("DEATHBENEFICARYZIP"));
                    userDeathPN.setText(rs.getString("DEATHBENEFICARYPN"));
                    userDeathPercentage.setText(rs.getString("DEATHBENEFICARYPERCENT"));
                    userGuardStatus.setSelectedItem(rs.getString("GUARDIANPRIORSERVICE"));
                    userHasPriorGuardS.setSelectedItem(rs.getString("GUARDIANPRIORSERVICEYES"));
                    userGuardianYearsOfService.setText(rs.getString("GUARDIANPRIORSERVICEYEARS"));
                    userGuardianHighGrade.setText(rs.getString("GUARDIANPRIORSERVICEGRADE"));
                    userGuardianFrom.setText(rs.getString("GUARDIANPRIORSERVICESTART"));
                    userGuardianTo.setText(rs.getString("GUARDIANPRIORSERVICEEND"));
                    userGuardianType.setText(rs.getString("GUARDIANPRIORSERVICECHARGE"));
                    userGuardianYearsRem.setText(rs.getString("GUARDIANPRIORSERVICEREMAIN"));
                    userJuniorROTC.setSelectedItem(rs.getString("JUNIORROTC"));
                    userEagleScout.setSelectedItem(rs.getString("EAGLESCOUT"));
                    userEnlistment.setText(rs.getString("ENLISTEDWARRANT"));

                }
            }catch(Exception e) {
                System.err.println("Exception: "+e.getMessage());
            }
            */
            
        }
            
    }//GEN-LAST:event_searchCadetKeyPressed

    private void searchCadetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCadetActionPerformed

    }//GEN-LAST:event_searchCadetActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        adminInformation parentFrame = new adminInformation();
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify a file to save");   
 
        int userSelection = fileChooser.showSaveDialog(parentFrame);
 
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
        
            String userFile = fileToSave.getAbsolutePath();
        
            try{    
            Connection con;
            String url = "jdbc:derby://localhost:1527/CadetInfo";
            String username = "adminCadre";
            String password = "cadrecwu";
            con = DriverManager.getConnection(url, username, password);
            PreparedStatement ps = con.prepareStatement("CALL SYSCS_UTIL.SYSCS_EXPORT_TABLE (?,?,?,?,?,?)");
            ps.setString(1,"ADMINCADRE");
            ps.setString(2,"INFO");
            ps.setString(3,userFile);
            ps.setString(4,null);
            ps.setString(5,null);
            ps.setString(6,null);
            ps.execute();
            }
            catch(Exception e) {
                System.err.println("Exception: "+e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //XSSFWorkbook  workbook = new XSSFWorkbook ();
        //Map<String, Object[]> data = new HashMap<String, Object[]>();
        //FileReader fileReader = new FileReader(fileName);
        //BufferedReader bufferedReader = new BufferedReader(fileReader);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void exportCadetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportCadetActionPerformed
        try { 
            PrintWriter outputFile = new PrintWriter ("cadetPDF.txt");
            outputFile.print("LASTNAME\t");
            outputFile.print("FIRSTNAME\t");
            outputFile.print("MIDDLEINITIAL\t");
            outputFile.print("FULLNAME\t");
            outputFile.print("SSAN\t");
            outputFile.print("DATEOFBIRTHMDDYYYY\t");
            outputFile.print("CWUID\t");
            outputFile.print("EMAIL\t");
            outputFile.print("PHONENUMBER\t");
            outputFile.print("STREETADDRESS\t");
            outputFile.print("APT\t");
            outputFile.print("CITY\t");
            outputFile.print("STATE\t");
            outputFile.print("ZIPCODE\t");
            outputFile.print("GENDER\t");
            outputFile.print("ACAMAJOR\t");
            outputFile.print("GRADDATE\t");
            outputFile.print("ETHNICTY\t");
            outputFile.print("MARITIALSTATUS\t");
            outputFile.print("PARTNERNAME\t");
            outputFile.print("PARTNERADDRESS\t");
            outputFile.print("PARTNERCITY\t");
            outputFile.print("PARTNERSTATE\t");
            outputFile.print("PARTNERNUMBER\t");
            outputFile.print("PARTNERPOB\t");
            outputFile.print("DEPENDENTS\t");
            outputFile.print("EMERGENCYCONTACT\t");
            outputFile.print("EMERGENCYSTREET\t");
            outputFile.print("EMERGENCYCITY\t");
            outputFile.print("EMERGENCYSTATE\t");
            outputFile.print("EMERGENCYNUMBER\t");
            outputFile.print("DEATHBENEFICARY\t");
            outputFile.print("PRIORSERVICEYES\t");
            outputFile.print("JUNIORROTC\t");
            outputFile.print("CHILDREN\t");
            outputFile.print("PRIORSERVICE\t");
            outputFile.print("EAGLESCOUT\t");
            outputFile.print("ENLISTEDWARRANT\t");
            outputFile.print("GUARDIANPRIORSERVICE\t");
            outputFile.print("GUARDIANPRIORSERVICEYES\t");
            outputFile.print("PLACEOFBIRTH\t");
            outputFile.print("SELECTIVESERVERNUMBER\t");
            outputFile.print("CURRENTMAILINGADDRESS\t");
            outputFile.print("GUARDIANPRIORSERVICEYEARS\t");
            outputFile.print("GUARDIANPRIORSERVICEGRADE\t");
            outputFile.print("GUARDIANPRIORSERVICESTART\t");
            outputFile.print("GUARDIANPRIORSERVICEEND\t");
            outputFile.print("GUARDIANPRIORSERVICEDISCHARGE\t");
            outputFile.print("GUARDIANPRIORSERVICEREMAIN\t");
            outputFile.print("PARTNERADDRESSCOMBO\t");
            outputFile.print("CHILDFULLNAME\t");
            outputFile.print("CHILDRELATIONSHIP\t");
            outputFile.print("CHILDDOB\t");
            outputFile.print("CHILDADDRESS\t");
            outputFile.print("FATHERSFULLNAME\t");
            outputFile.print("FATHERSADDRESS\t");
            outputFile.print("MOTHERSSFULLNAME\t");
            outputFile.print("MOTHERSADDRESS\t");
            outputFile.print("CADETNOTIFY\t");
            outputFile.print("CADETILLHEALTH\t");
            outputFile.print("DEATHBENEFICARYRELATIONSHIP\t");
            outputFile.print("DEATHBENEFICARYADDRESS\t");
            outputFile.print("DEATHBENEFICARYPERCENT\t");
            outputFile.print("MAILINGADDRESSPHONE\t");
            outputFile.print("MAILINGADDRESSEMAIL\t");
            outputFile.print("INITIALS\t");
            outputFile.print("PARTNERZIPCODE\t");
            outputFile.print("MAILINGYESORNO\t");
            outputFile.print("CHILDFIRSTNAME\t");
            outputFile.print("CHILDMI\t");
            outputFile.print("CHILDLASTNAME\t");
            outputFile.print("CHILDCITY\t");
            outputFile.print("CHILDSTATE\t");
            outputFile.print("CHILDZIP\t");
            outputFile.print("FATHERFIRSTNAME\t");
            outputFile.print("FATHERMI\t");
            outputFile.print("FATHERLASTNAME\t");
            outputFile.print("FATHERCITY\t");
            outputFile.print("FATHERSTATE\t");
            outputFile.print("FATHERZIP\t");
            outputFile.print("FATHERPN\t");
            outputFile.print("MOTHERFIRSTNAME\t");
            outputFile.print("MOTHERMI\t");
            outputFile.print("MOTHERLASTNAME\t");
            outputFile.print("MOTHERCITY\t");
            outputFile.print("MOTHERSTATE\t");
            outputFile.print("MOTHERZIP\t");
            outputFile.print("MOTHERPN\t");
            outputFile.print("DEATHBENEFICARYSTREET\t");
            outputFile.print("DEATHBENEFICARYCITY\t");
            outputFile.print("MAILINGSTREET\t");
            outputFile.print("MAILINGCITY\t");
            outputFile.print("MAILINGSTATE\t");
            outputFile.print("MAILINGZIP\t");
            outputFile.print("PARTNERFIRSTNAME\t");
            outputFile.print("PARTNERMI\t");
            outputFile.print("PARTNERLASTNAME\t");
            outputFile.print("CHILDNUMBER\t");
            outputFile.print("EMERGENCYZIP\t");
            outputFile.println();
            
            
            outputFile.print(userLN.getText()+"\t");
            outputFile.print(userFN.getText()+"\t");
            outputFile.print(userMN.getText()+"\t");
            outputFile.print(userLN.getText()+", " + userFN.getText() + " " + userMN.getText()+ "\t");
            outputFile.print(userSSN.getText()+"\t");
            outputFile.print(userDoB.getText()+"\t");
            outputFile.print(userCWUID.getText()+"\t");
            outputFile.print(userEmail.getText()+"\t");
            outputFile.print(userAreaCode.getText()+ userMPN.getText() + userLPN.getText()+"\t");
            outputFile.print(userStreet.getText()+"\t");
            outputFile.print(userApt.getText()+"\t");
            outputFile.print(userCity.getText()+"\t");
            outputFile.print(userState.getText()+"\t");
            outputFile.print(userZip.getText()+"\t");
            outputFile.print(userGender.getSelectedItem().toString()+"\t");
            outputFile.print(userAcMajor.getText()+"\t");
            outputFile.print(userGradDate.getText()+"\t");
            outputFile.print(userRace.getSelectedItem().toString()+"\t");
            outputFile.print(userMaritialS.getSelectedItem().toString()+"\t");
            outputFile.print(userPartnerLN.getText()+ ", " + userPartnerFN.getText() + " " + userPartnerMI.getText() +"\t");
            outputFile.print(userPartnerStreet.getText()+"\t");
            outputFile.print(userPartnerCity.getText()+"\t");
            outputFile.print(userPartnerState.getText()+"\t");
            outputFile.print(userPartnerPN.getText()+"\t");
            outputFile.print(userPartnerPoB.getText()+"\t");
            outputFile.print(userNoD.getText() +"\t");    
            outputFile.print(userEmergency.getText()+"\t");
            outputFile.print(userEmergencyStreet.getText()+"\t");
            outputFile.print(userEmergencyCity.getText() +"\t");
            outputFile.print(userEmergencyState.getText()+"\t");
            outputFile.print(userEmergencyZip.getText()+"\t");
            outputFile.print(userEmergencyPN.getText()+"\t");
            outputFile.print(userDeath.getText()+"\t");
            outputFile.print(userHasPriorS.getSelectedItem().toString()+"\t");
            outputFile.print(userJuniorROTC.getSelectedItem().toString()+"\t");
            outputFile.print(userChildren.getSelectedItem().toString()+"\t");
            outputFile.print(userPriorS.getSelectedItem().toString()+"\t");
            outputFile.print(userEagleScout.getSelectedItem().toString()+"\t");
            outputFile.print(userEnlistment.getText()+"\t");
            outputFile.print(userGuardStatus.getSelectedItem().toString()+"\t");
            outputFile.print(userHasPriorGuardS.getSelectedItem().toString()+"\t");
            
            outputFile.print(userPoB.getText()+"\t");
            outputFile.print(userSelectiveServiceNum.getText()+"\t");
            
            //Current Mailing
            //Needs dorm and room number information
            outputFile.print(userAreaCode.getText()+ "-" + userMPN.getText() + "-" + userLPN.getText() 
                    +userStreet.getText()+ ", " + userCity.getText() + ", " + userState.getText() 
                    + ", " + userZip.getText() + "\t");
     
            outputFile.print(userGuardianYearsOfService.getText()+"\t");
            outputFile.print(userGuardianHighGrade.getText()+"\t");
            outputFile.print(userGuardianFrom.getText()+"\t");
            outputFile.print(userGuardianTo.getText()+"\t");
            outputFile.print(userGuardianType.getText()+"\t");
            outputFile.print(userGuardianYearsRem.getText()+"\t");
            
            //Partner's Full Address
            outputFile.print(userPartnerStreet.getText() + ", " + userPartnerCity.getText() + ", " 
                   + userPartnerState.getText() + ", " + userPartnerZip.getText() + ", "
                   + userPartnerPN.getText() + "\t");
            
            //Child's Full name
            outputFile.print(userChildLN.getText() + ", " + userChildFN.getText() 
                    + " , " + userChildMI.getText() + "\t");
            
            outputFile.print(userChildRelationship.getText()+"\t");
            outputFile.print(userChildDoB.getText()+"\t");
            
            //Child's Full Address
            outputFile.print(userChildStreet.getText() + ", " + userChildCity.getText() + ", " 
                   + userChildState.getText() + ", " + userChildZip.getText() + ", "
                   + userChildPN.getText() + "\t");
            
            //Father's Full Name
            outputFile.print(userFatherLN.getText()+ ", " + userFatherFN.getText() 
                    + ", " + userFatherMI.getText() + "\t");
            
            //Father's Full Address
            outputFile.print(userFatherStreet.getText() + ", " + userFatherCity.getText() + ", " 
                   + userFatherState.getText() + ", " + userFatherZip.getText() + ", "
                   + userFatherPN.getText() + "\t");
            
            //Mother's Full Name
            outputFile.print(userMotherLN.getText()+ ", " + userMotherFN.getText() 
                    + ", " + userMotherMI.getText() + "\t");
            
            //Mother's Full Address
            outputFile.print(userMotherStreet.getText() + ", " + userMotherCity.getText() + ", " 
                   + userMotherState.getText() + ", " + userMotherZip.getText() + ", "
                   + userMotherPN.getText() + "\t");
            
            outputFile.print(userNotify.getText()+"\t");
            outputFile.print(userIllHealth.getText()+"\t");
            outputFile.print(userDeathRelationship.getText()+"\t");
            
            //Beneficary's Full Address
            outputFile.print(userDeathStreet.getText() + ", " + userDeathCity.getText() + ", " 
                   + userDeathState.getText() + ", " + userDeathZip.getText() + ", "
                   + userDeathPN.getText() + "\t");
            
            outputFile.print(userDeathPercentage.getText()+"\t");
            
            //Permanent Mailing no Email
            outputFile.print(userStreet.getText() + ", " + userCity.getText() + ", " 
                   + userState.getText() + ", " + userZip.getText() + ", "
                   + userAreaCode.getText() + "-" +  userMPN.getText() + "-" + userLPN.getText() + "\t");
            
            //Permanent Mailing with Email
            outputFile.print(userStreet.getText() + ", " + userCity.getText() + ", " 
                   + userState.getText() + ", " + userZip.getText() + ", "
                   + userAreaCode.getText() + "-" +  userMPN.getText() + "-" + userLPN.getText() + ", "
                   + userEmail.getText() + "\t");
            
            //Initials first and last
            outputFile.print(userFN.getText().charAt(0)+ "." + userLN.getText().charAt(0) + "\t");
            
            outputFile.print(userPartnerZip.getText()+"\t");
            outputFile.print(userDiffMailing.getSelectedItem()+"\t");
            
            outputFile.print(userChildFN.getText()+"\t");
            outputFile.print(userChildMI.getText()+"\t");
            outputFile.print(userChildLN.getText()+"\t");
            outputFile.print(userChildCity.getText()+"\t");
            outputFile.print(userChildState.getText()+"\t");
            outputFile.print(userChildZip.getText()+"\t");
            
            outputFile.print(userFatherFN.getText()+"\t");
            outputFile.print(userFatherMI.getText()+"\t");
            outputFile.print(userFatherLN.getText()+"\t");
            outputFile.print(userFatherCity.getText()+"\t");
            outputFile.print(userFatherState.getText()+"\t");
            outputFile.print(userFatherZip.getText()+"\t");
            outputFile.print(userFatherPN.getText()+"\t");
            
            outputFile.print(userMotherFN.getText()+"\t");
            outputFile.print(userMotherMI.getText()+"\t");
            outputFile.print(userMotherLN.getText()+"\t");
            outputFile.print(userMotherCity.getText()+"\t");
            outputFile.print(userMotherState.getText()+"\t");
            outputFile.print(userMotherZip.getText()+"\t");
            outputFile.print(userMotherPN.getText()+"\t");
            
            outputFile.print(userDeathStreet.getText()+"\t");
            outputFile.print(userDeathCity.getText()+"\t");
            
            outputFile.print(userMailingStreet.getText()+"\t");
            outputFile.print(userMailingCity.getText()+"\t");
            outputFile.print(userMailingState.getText()+"\t");
            outputFile.print(userMailingZip.getText()+"\t");
            outputFile.print(userPartnerFN.getText()+"\t");
            outputFile.print(userPartnerMI.getText()+"\t");
            outputFile.print(userPartnerLN.getText()+"\t");
            outputFile.print(userChildPN.getText()+"\t");
            
            outputFile.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(adminInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_exportCadetActionPerformed

    private void userPoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userPoBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userPoBActionPerformed

    private void userDiffMailingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userDiffMailingActionPerformed
        String yes = (String)userDiffMailing.getSelectedItem();
        if(yes.equals("Yes")) {
            userMailingStreet.setEnabled(true);
            userMailingCity.setEnabled(true);
            userMailingState.setEnabled(true);
            userMailingZip.setEnabled(true);
        }else{
            userMailingStreet.setEnabled(false);
            userMailingCity.setEnabled(false);
            userMailingState.setEnabled(false);
            userMailingZip.setEnabled(false);

        }
    }//GEN-LAST:event_userDiffMailingActionPerformed

    private void userPriorSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userPriorSMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_userPriorSMouseClicked

    private void userPriorSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userPriorSActionPerformed
        String yes = (String)userPriorS.getSelectedItem();
        if(yes.equals("Yes")) {
            userHasPriorS.setEnabled(true);

        }else
        userHasPriorS.setEnabled(false);
    }//GEN-LAST:event_userPriorSActionPerformed

    private void userPriorSPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_userPriorSPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_userPriorSPropertyChange

    private void userPartnerFNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userPartnerFNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userPartnerFNActionPerformed

    private void userChildrenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userChildrenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userChildrenActionPerformed

    private void userDeathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userDeathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userDeathActionPerformed

    private void userDeathPercentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userDeathPercentageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userDeathPercentageActionPerformed

    private void userGuardStatusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userGuardStatusMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_userGuardStatusMouseClicked

    private void userGuardStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userGuardStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userGuardStatusActionPerformed

    private void userHasPriorGuardSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userHasPriorGuardSMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_userHasPriorGuardSMouseClicked

    private void userHasPriorGuardSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userHasPriorGuardSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userHasPriorGuardSActionPerformed

    private void userFatherFNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userFatherFNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userFatherFNActionPerformed

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
            java.util.logging.Logger.getLogger(adminInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cadetForm;
    private javax.swing.JButton exportCadet;
    private javax.swing.JButton goBack;
    private javax.swing.JButton importCadet;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JLabel jLabel34;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTextField searchCadet;
    private javax.swing.JButton searchCadetButton;
    private javax.swing.JButton updateCadet;
    private javax.swing.JTextField userAcMajor;
    private javax.swing.JTextField userApt;
    private javax.swing.JTextField userAreaCode;
    private javax.swing.JTextField userCWUID;
    private javax.swing.JTextField userChildCity;
    private javax.swing.JTextField userChildDoB;
    private javax.swing.JTextField userChildFN;
    private javax.swing.JTextField userChildLN;
    private javax.swing.JTextField userChildMI;
    private javax.swing.JTextField userChildPN;
    private javax.swing.JTextField userChildRelationship;
    private javax.swing.JTextField userChildState;
    private javax.swing.JTextField userChildStreet;
    private javax.swing.JTextField userChildZip;
    private javax.swing.JComboBox<String> userChildren;
    private javax.swing.JTextField userCity;
    private javax.swing.JTextField userDeath;
    private javax.swing.JTextField userDeathCity;
    private javax.swing.JTextField userDeathPN;
    private javax.swing.JTextField userDeathPercentage;
    private javax.swing.JTextField userDeathRelationship;
    private javax.swing.JTextField userDeathState;
    private javax.swing.JTextField userDeathStreet;
    private javax.swing.JTextField userDeathZip;
    private javax.swing.JComboBox userDiffMailing;
    private javax.swing.JTextField userDoB;
    private javax.swing.JComboBox<String> userEagleScout;
    private javax.swing.JTextField userEmail;
    private javax.swing.JTextField userEmergency;
    private javax.swing.JTextField userEmergencyCity;
    private javax.swing.JTextField userEmergencyPN;
    private javax.swing.JTextField userEmergencyState;
    private javax.swing.JTextField userEmergencyStreet;
    private javax.swing.JTextField userEmergencyZip;
    private javax.swing.JTextField userEnlistment;
    private javax.swing.JTextField userFN;
    private javax.swing.JTextField userFatherCity;
    private javax.swing.JTextField userFatherFN;
    private javax.swing.JTextField userFatherLN;
    private javax.swing.JTextField userFatherMI;
    private javax.swing.JTextField userFatherPN;
    private javax.swing.JTextField userFatherState;
    private javax.swing.JTextField userFatherStreet;
    private javax.swing.JTextField userFatherZip;
    private javax.swing.JComboBox userGender;
    private javax.swing.JTextField userGradDate;
    private javax.swing.JComboBox<String> userGuardStatus;
    private javax.swing.JTextField userGuardianFrom;
    private javax.swing.JTextField userGuardianHighGrade;
    private javax.swing.JTextField userGuardianTo;
    private javax.swing.JTextField userGuardianType;
    private javax.swing.JTextField userGuardianYearsOfService;
    private javax.swing.JTextField userGuardianYearsRem;
    private javax.swing.JComboBox<String> userHasPriorGuardS;
    private javax.swing.JComboBox<String> userHasPriorS;
    private javax.swing.JTextField userIllHealth;
    private javax.swing.JComboBox<String> userJuniorROTC;
    private javax.swing.JTextField userLN;
    private javax.swing.JTextField userLPN;
    private javax.swing.JTextField userMN;
    private javax.swing.JTextField userMPN;
    private javax.swing.JTextField userMailingCity;
    private javax.swing.JTextField userMailingDorm;
    private javax.swing.JTextField userMailingState;
    private javax.swing.JTextField userMailingStreet;
    private javax.swing.JTextField userMailingZip;
    private javax.swing.JComboBox<String> userMaritialS;
    private javax.swing.JTextField userMotherCity;
    private javax.swing.JTextField userMotherFN;
    private javax.swing.JTextField userMotherLN;
    private javax.swing.JTextField userMotherMI;
    private javax.swing.JTextField userMotherPN;
    private javax.swing.JTextField userMotherState;
    private javax.swing.JTextField userMotherStreet;
    private javax.swing.JTextField userMotherZip;
    private javax.swing.JTextField userNoD;
    private javax.swing.JTextField userNotify;
    private javax.swing.JTextField userPartnerCity;
    private javax.swing.JTextField userPartnerFN;
    private javax.swing.JTextField userPartnerLN;
    private javax.swing.JTextField userPartnerMI;
    private javax.swing.JTextField userPartnerPN;
    private javax.swing.JTextField userPartnerPoB;
    private javax.swing.JTextField userPartnerState;
    private javax.swing.JTextField userPartnerStreet;
    private javax.swing.JTextField userPartnerZip;
    private javax.swing.JTextField userPoB;
    private javax.swing.JComboBox<String> userPriorS;
    private javax.swing.JComboBox<String> userRace;
    private javax.swing.JTextField userSSN;
    private javax.swing.JTextField userSelectiveServiceNum;
    private javax.swing.JTextField userState;
    private javax.swing.JTextField userStreet;
    private javax.swing.JTextField userZip;
    // End of variables declaration//GEN-END:variables
    private String fileName = "cadetQuestionare.txt";

    /*********
    Bit shift encryption for SSNs (similiar to a Ceasear shift)
    *********/
    private int deEncrypt(int passedSSN){
        int shiftOne = 3;
        int encryptedSSN = passedSSN;
        
        encryptedSSN = encryptedSSN << shiftOne;

        return encryptedSSN;
    }
}

