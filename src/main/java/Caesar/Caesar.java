package Caesar;

public class Caesar {
 public String plainText;
 public int shift;

 public   Caesar(String plainText, int shift){
     this.plainText= plainText;
     this.shift = shift;

 }
    public String getPlainText() {
        return plainText;
    }

    public int getShift() {
        return shift;
    }
}

