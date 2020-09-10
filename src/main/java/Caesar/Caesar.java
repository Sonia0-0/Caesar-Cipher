package Caesar;

import javax.crypto.Cipher;
import java.util.Scanner;

public class Caesar {
    public static String encrypt(String plainText, int shift){
        if (shift>26){
            shift = shift % 26;
        }
        else if (shift<0){
            shift = (shift%26)+26;
        }

        String cipherText = "";
        int length = plainText.length();
        for (int i = 0; i<length; i++ ){    //for loop to shift the letters
            char ch = plainText.charAt(i);
            if (Character.isLetter(ch)){    // ensures the characters are letters

                if (Character.isLowerCase(ch)){

                    char c = (char)(ch + shift);
                    if (c>'z'){
                        cipherText += (char)(ch -(26-shift));
                    }
                        else{
                            cipherText += c;
                    }

                }
                else if (Character.isUpperCase(ch)){

                }
            }
            else {
                cipherText += ch;
            }
        }
        return cipherText;
    }
    public static String decrypt(String plainText, int shift){
        if (shift>26){
            shift = shift % 26;
        }
        else if (shift<0){
            shift = (shift%26)+26;
        }

        String cipherText = "";
        int length = plainText.length();
        for (int i = 0; i<length; i++ ){    //for loop to shift the letters
            char ch = plainText.charAt(i);
            if (Character.isLetter(ch)){    // ensures the characters are letters

                if (Character.isLowerCase(ch)){

                    char c = (char)(ch + shift);
                    if (c<'a'){
                        cipherText += (char)(ch +(26-shift));
                    }
                    else{
                        cipherText += c;
                    }

                }
                else if (Character.isUpperCase(ch)){
                    char c = (char)(ch + (26-shift));
                    if(c<'A'){
                        cipherText += (char)(ch + (26-shift));
                    }

                }
            }
            else {
                cipherText += ch;
            }
        }
        return cipherText;
    }

    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println(">| Enter Message you want encrypted");
        String text =  myScanner.nextLine();
        System.out.println(">| Enter Key to encrypt");
        int shift = Integer.parseInt(myScanner.nextLine());
        String cipher = encrypt(text,shift);
        System.out.println("Encrypted text is:"+ cipher);

        // decryption

        System.out.println(">| Enter Message you want decrypted");
         text =  myScanner.nextLine();
        System.out.println(">| Enter Key to decrypt");
         shift = Integer.parseInt(myScanner.nextLine());
        cipher = decrypt(text,shift);
        System.out.println("Decrypted text is:"+ cipher);



        // System.out.println(cipher);
      //  String decrypted = decrypt(cipher, 4);
       // System.out.println(decrypted);
    }
}