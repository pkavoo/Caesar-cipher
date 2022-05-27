import org.junit.*;
import static org.junit.Assert.*;

public class DecryptTest {

    @Test
    public void runDecrypt_instantiates(){
        Decrypt testDecrypt = new Decrypt("!obnf", 1);
        assertEquals(true, testDecrypt instanceof Decrypt);
    }

    @Test
    public void runDecrypt_ifInputIsString() {
        Decrypt testDecrypt = new Decrypt("obnf", 1);
        assertEquals("obnf", testDecrypt.getmInputString());
    }

    @Test
    public void runDecrypt_ifKeyIsInt() {
        Decrypt testDecrypt = new Decrypt("obnf",1);
        assertEquals(1, testDecrypt.getmShift());
    }
    @Test
    public void runDecrypt_ifDecryptsVariousInputs() {
        Decrypt testDecrypt = new Decrypt("!ODCB EURZQ IRA MXPSV RYHU D ODCB GRJ2", 3);
        // does not decrypt integers and other characters but returns them as is
        assertEquals("!LAZY BROWN FOX JUMPS OVER A LAZY DOG2", Decrypt.decrypt(testDecrypt));
    }
}