package Caesar;

import java.util.Scanner;

public class Caesar {


    private final String message;
    private final int shift;

    public String getMessage() {
        return message;
    }

    public int getShift() {
        return shift;
    }

    public Caesar(String message, int shift) {
        this.message = message;
        this.shift= shift;

    }
    // Encryption Logic
    public static String encrypt(String plainText, int shift) {

        if (shift > 26) {
            shift = shift % 26;
        } else if (shift < 0) {
            shift = (shift % 26) + 26;
        }

        String cipherText = "";
        int length = plainText.length();
        for (int i = 0; i < length; i++) {    //for loop to shift the letters
            char ch = plainText.charAt(i);
            if (Character.isLetter(ch)) {    // ensures the characters are letters
                if (Character.isLowerCase(ch)) {
                    char c = (char) (ch + shift);
                    if (c > 'z') {
                        cipherText += (char) (ch - (26 - shift));
                    } else {
                        cipherText += c;
                    }
                } else if (Character.isUpperCase(ch)) {
                    char c = (char) (ch + shift);
                    if (c > 'Z') {
                        cipherText += (char) (ch - (26 - shift));
                    } else {
                        cipherText += c;
                    }
                }
            } else {
                cipherText += ch;
            }
        }
        return cipherText;
    }
// Decryption Logic

    public static String decrypt(String plainText, int shift) {
        if (shift > 26) {
            shift = shift % 26;
        } else if (shift < 0) {
            shift = (shift % 26) + 26;
        }

        String cipherText = "";
        int length = plainText.length();
        for (int i = 0; i < length; i++) {    //for loop to shift the letters
            char ch = plainText.charAt(i);
            if (Character.isLetter(ch)) {    // ensures the characters are letters
                if (Character.isLowerCase(ch)) {
                    char c = (char) (ch - shift);
                    if (c < 'a') {
                        cipherText += (char) (ch + (26 - shift));
                    } else {
                        cipherText += c;
                    }
                } else if (Character.isUpperCase(ch)) {
                    char c = (char) (ch - shift);
                    if (c < 'A') {
                        cipherText += (char) (ch + (26 - shift));
                    } else {
                        cipherText += c;
                    }
                }
            } else {
                cipherText += ch;
            }
        }
        return cipherText;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Caeser's Famous Cipher");
        while (true) {
            System.out.println("TYPE IN 'E' for ENCRYPTION or 'D' FOR DECRYPTION (without the quotes)");
            Scanner input = new Scanner(System.in);
            String userChoice = input.nextLine().toUpperCase();
            if (userChoice.equals("E")) {
                // encryption
                Scanner myScanner = new Scanner(System.in);
                System.out.println(">| Enter Message you want encrypted");
                String text = myScanner.nextLine();
                System.out.println(">| Enter Key to encrypt");
                int shift = Integer.parseInt(myScanner.nextLine());
                String cipher = encrypt(text, shift); // the actual shifitng
                System.out.println("Encrypted text is:" + " " + cipher);
                System.out.println("Thank you, and come back soon");
                System.exit(0); // to terminate app

            } else if (userChoice.equals("D")) {
                // decryption
                System.out.println(">| Enter Message you want decrypted");
                Scanner myScanner = new Scanner(System.in);
                String text = myScanner.nextLine(); // takes text to be encrypted from user
                System.out.println(">| Enter Key to decrypt");
                int shift = Integer.parseInt(myScanner.nextLine());
                String cipher = decrypt(text, shift);
                System.out.println("Decrypted text is: " + " " + cipher);
                System.out.println("Thank you, and come back soon");
                System.exit(0); // terminates app
                break;
            } else {
                System.out.println("Invalid Entry. Please follow on-screen instructions");
            }

        }
    }
}


