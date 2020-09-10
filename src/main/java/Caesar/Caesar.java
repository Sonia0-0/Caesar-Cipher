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
        return cipherText;
                }



}





