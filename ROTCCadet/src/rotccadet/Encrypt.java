package rotccadet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Austin
 */
public class Encrypt {
    
    
    public String doEncrypt(String encrypt) {
        
        encrypt = encrypt.toLowerCase();
        
        String encrypt2 = new StringBuffer(encrypt).reverse().toString();
       
        
       for(int i = 0; i<5; i++) { 
           encrypt2 = encrypt2.charAt(encrypt2.length() - 1) + encrypt2.substring(0, encrypt2.length() - 1);
       
       }
       
       char[] encrypt3 = encrypt2.toCharArray();
       
       for(int swi = 0; swi <encrypt3.length; swi++) {
           
           switch(encrypt3[swi]) {
               
               case 'a':
               encrypt3[swi] = 'm';
               break;
               case 'b':
               encrypt3[swi] = 't';
               break;
               case 'c':
               encrypt3[swi] = 'v';
               break;
               case 'd':
               encrypt3[swi] = 'x';
               break;
               case 'e':
               encrypt3[swi] = '0';
               break;
               case 'f':
               encrypt3[swi] = 'p';
               break;
               case 'g':
               encrypt3[swi] = 'n';
               break;
               case 'h':
               encrypt3[swi] = 's';
               break;
               case 'i':
               encrypt3[swi] = '4';
               break;
               case 'j':
               encrypt3[swi] = 'r';
               break;
               case 'k':
               encrypt3[swi] = 'e';
               break;
               case 'l':
               encrypt3[swi] = 'f';
               break;
               case 'm':
               encrypt3[swi] = 'g';
               break;
               case 'n':
               encrypt3[swi] = 'h';
               break;
               case 'o':
               encrypt3[swi] = '9';
               break;
               case 'p':
               encrypt3[swi] = 'q';
               break;
               case 'q':
               encrypt3[swi] = 'd';
               break;
               case 'r':
               encrypt3[swi] = 'i';
               break;
               case 's':
               encrypt3[swi] = 'c';
               break;
               case 't':
               encrypt3[swi] = 'u';
               break;
               case 'u':
               encrypt3[swi] = '6';
               break;
               case 'v':
               encrypt3[swi] = '8';
               break;
               case 'w':
               encrypt3[swi] = '3';
               break;
               case 'x':
               encrypt3[swi] = '1';
               break;
               case 'y':
               encrypt3[swi] = '5';
               break;
               case 'z':
               encrypt3[swi] = '7';
               break;
               case '0':
               encrypt3[swi] = 'b';
               break;
               case '1':
               encrypt3[swi] = 'a';
               break;
               case '2':
               encrypt3[swi] = 'j';
               break;
               case '3':
               encrypt3[swi] = 'w';
               break;
               case '4':
               encrypt3[swi] = 'y';
               break;
               case '5':
               encrypt3[swi] = 'k';
               break;
               case '6':
               encrypt3[swi] = 'l';
               break;
               case '7':
               encrypt3[swi] = 'z';
               break;
               case '8':
               encrypt3[swi] = 'o';
               break;
               case '9':
               encrypt3[swi] = '2';
               break;
              
               default: encrypt3 = encrypt3;
               
           }
           
           
           
           
           
       }
       
       String encrypt4 = new String(encrypt3);
       
       
       
       return encrypt4; 
      
    }
    
    
    
    
    
    
}
