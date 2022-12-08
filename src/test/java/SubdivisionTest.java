import junit.framework.TestCase;

public class SubdivisionTest extends TestCase {

    Subdivision obj=new Subdivision();

    public void testTestGetName() {
        obj.setName("K");
        assertEquals("K",obj.getName());
    }

    public void testTestSetName() {
        obj.setName("I");
        assertEquals("I",obj.getName());
    }
}