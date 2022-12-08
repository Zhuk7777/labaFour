import junit.framework.TestCase;

public class HumanTest extends TestCase {

    Human obj=new Human();

    public void testInfoHuman()
    {
        Subdivision sbd=new Subdivision("I");
        int idDiv=sbd.getID();
        obj=new Human(1,"David","Male",sbd,100000,"07.02.2001");
        assertEquals("ID: 1 name: David gender: Male birthday: 07.02.2001 salary: 100000 division: I ID division: "+idDiv,obj.infoHuman());
    }

    public void testGetID() {
        obj.setID(1200);
        assertEquals(1200,obj.getID());
    }

    public void testSetID() {
        obj.setID(3000);
        assertEquals(3000,obj.getID());

    }

    public void testGetName() {
        obj.setName("David");
        assertEquals("David",obj.getName());
    }

    public void testSetName() {
        obj.setName("Vlad");
        assertEquals("Vlad",obj.getName());
    }

    public void testGetGender() {
        obj.setGender("Male");
        assertEquals("Male",obj.getGender());
    }

    public void testSetGender() {
        obj.setGender("Female");
        assertEquals("Female",obj.getGender());
    }

    public void testGetSubdivision() {
        Subdivision sbd=new Subdivision();
        sbd.setName("K");
        obj.setSubdivision(sbd);
        assertEquals("K",obj.getSubdivision().getName());
    }

    public void testSetSubdivision() {
        Subdivision sbd=new Subdivision();
        sbd.setName("I");
        obj.setSubdivision(sbd);
        assertEquals("I",obj.getSubdivision().getName());
    }

    public void testGetSalary() {
        obj.setSalary(54000);
        assertEquals(54000,obj.getSalary());

    }

    public void testSetSalary() {
        obj.setSalary(7000);
        assertEquals(7000,obj.getSalary());
    }

    public void testGetBirthday() {
        obj.setBirthday("13.12.2020");
        assertEquals("13.12.2020",obj.getBirthday());
    }

    public void testSetBirthday() {
        obj.setBirthday("12.12.2022");
        assertEquals("12.12.2022",obj.getBirthday());
    }
}