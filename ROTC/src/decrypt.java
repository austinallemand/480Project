/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Austin
 */
public class decrypt {
    
    
    public String deCrypt(String decipher) {
        
         char[] decrypt = decipher.toCharArray();
        
        for(int swi = 0; swi <decrypt.length; swi++) {
           
           switch(decrypt[swi]) {
               
               case 'm':
               decrypt[swi] = 'a';
               break;
               case 't':
               decrypt[swi] = 'b';
               break;
               case 'v':
               decrypt[swi] = 'c';
               break;
               case 'x':
               decrypt[swi] = 'd';
               break;
               case '0':
               decrypt[swi] = 'e';
               break;
               case 'p':
               decrypt[swi] = 'f';
               break;
               case 'n':
               decrypt[swi] = 'g';
               break;
               case 's':
               decrypt[swi] = 'h';
               break;
               case '4':
               decrypt[swi] = 'i';
               break;
               case 'r':
               decrypt[swi] = 'j';
               break;
               case 'e':
               decrypt[swi] = 'k';
               break;
               case 'f':
               decrypt[swi] = 'l';
               break;
               case 'g':
               decrypt[swi] = 'm';
               break;
               case 'h':
               decrypt[swi] = 'n';
               break;
               case '9':
               decrypt[swi] = 'o';
               break;
               case 'q':
               decrypt[swi] = 'p';
               break;
               case 'd':
               decrypt[swi] = 'q';
               break;
               case 'i':
               decrypt[swi] = 'r';
               break;
               case 'c':
               decrypt[swi] = 's';
               break;
               case 'u':
               decrypt[swi] = 't';
               break;
               case '6':
               decrypt[swi] = 'u';
               break;
               case '8':
               decrypt[swi] = 'v';
               break;
               case '3':
               decrypt[swi] = 'w';
               break;
               case '1':
               decrypt[swi] = 'x';
               break;
               case '5':
               decrypt[swi] = 'y';
               break;
               case '7':
               decrypt[swi] = 'z';
               break;
               case 'b':
               decrypt[swi] = '0';
               break;
               case 'a':
               decrypt[swi] = '1';
               break;
               case 'j':
               decrypt[swi] = '2';
               break;
               case 'w':
               decrypt[swi] = '3';
               break;
               case 'y':
               decrypt[swi] = '4';
               break;
               case 'k':
               decrypt[swi] = '5';
               break;
               case 'l':
               decrypt[swi] = '6';
               break;
               case 'z':
               decrypt[swi] = '7';
               break;
               case 'o':
               decrypt[swi] = '8';
               break;
               case '2':
               decrypt[swi] = '9';
               break;
              
               default: decrypt = decrypt;
               
           }
           
           
           
           
           
           
           
       }       
        String decrypt2 = new String(decrypt);
        
        for(int i = 0; i<5; i++) { 
            
           decrypt2 = decrypt2.substring(1, decrypt2.length()) + decrypt2.charAt(0);
       
       }
        
        String decrypt3 = new StringBuffer(decrypt2).reverse().toString();
        
        
        
        
        decrypt3 = decrypt3.substring(0, 1).toUpperCase() + decrypt3.substring(1);
        
        
        return decrypt3;
    }
    
    
    
    
    
    
    
}
