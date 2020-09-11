import Caesar.Caesar;
import junit.framework.TestCase;
import org.junit.Test;


public class CaesarTest extends TestCase {
// Method names have the test prefix to make the tests visible to Junit

    @Test
    public void testtheMessage_shouldBeSonia_String(){
        Caesar caesar= new Caesar("Sonia", 2);
        assertEquals("Sonia", caesar.getMessage());
    }

    @Test
    public void testEncryptDecrypt_ShiftValueiSSaved_Integer() {
        Caesar caesar = new Caesar("Sonia", 3);
        assertEquals(3, caesar.getShift());
    }
    @Test
    public void testEncryptDecrypt_objectInstantiates() {
        Caesar caesar = new Caesar("Sonia", 3);
        assertEquals(true, caesar instanceof Caesar);

    }
}