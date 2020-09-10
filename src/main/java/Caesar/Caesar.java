package Caesar;

public class Caesar {
    public  static String encrypt(String plaintext, int shift){
        if(shift>26){
            shift = shift % 26;
        }
        else if(shift<0){
            shift= (shift%26)+26;

        }
        String cipherText = "";
        int length = plaintext.length();
        for (int i =0; i<length; i++){
            char ch = plaintext.charAt(i);
            if (Character.isLetter(ch)){
               if (Character.isLowerCase(ch)){

               }
               else if (Character.isUpperCase(ch)){
            }
            else {
                cipherText += ch;
            }
            return cipherText;
        }
        return cipherText;
                }



}





