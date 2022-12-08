import com.opencsv.bean.CsvBindByName;

import java.util.Date;

/**
 * A class for storing data about a person
 * @author Давид
 * @see Human#Human(int, String, String, Subdivision, int, String)
 * @see Human#Human()
 * @see Human#getName()
 * @see Human#setName(String)
 * @see Human#getBirthday()
 * @see Human#setBirthday(String)
 * @see Human#getID()
 * @see Human#setID(int)
 * @see Human#getSalary()
 * @see Human#setSalary(int)
 * @see Human#getGender()
 * @see Human#setGender(String)
 * @see Human#getSubdivision()
 * @see Human#setSubdivision(Subdivision)
 * @see Human#printHuman()
 */
public class Human {
    @CsvBindByName(column = "id")
    private int ID;
    @CsvBindByName(column = "name")
    private String name;
    @CsvBindByName(column = "gender")
    private String g;
    @CsvBindByName(column = "BirtDate")
    private String birthday;
    @CsvBindByName(column = "Division")
    private String div="";//Auxiliary field for reading data from a file, because I didn't understand how to read in a field with the type of my class
    private Subdivision sbd;

    @CsvBindByName(column = "Salary")
    private int salary;


    /**
     * Constructor with parameters
     * @param _ID
     * @param _name
     * @param _g
     * @param _sbd
     * @param _salary
     * @param _birthday
     */
   public Human(int _ID,String _name,String _g,Subdivision _sbd,int _salary,String _birthday)
    {
        ID=_ID;
        name=_name;
        g=_g;
        sbd=_sbd;
        salary=_salary;
        birthday=_birthday;
    }

    /**
     * Default constructor
     */
    public Human()
    {
        ID=0;
        name="";
        g="";
        sbd=new Subdivision();
        salary=0;
        birthday="";
    }


    /**
     * Function for getting a person's ID
     * @return
     */
    public int getID() {
        return ID;
    }

    /**
     * Function for setting id
     * @param ID
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * Function for getting a person's name
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Function for setting the name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Function for getting a person's gender
     * @return
     */
    public String getGender() {
        return g;
    }

    /**
     * Function for setting gender
     * @param g
     */
    public void setGender(String g) {
        this.g = g;
    }

    /**
     *Function for getting a subdivision
     * @return
     */
     public Subdivision getSubdivision() {
         if("".equals(div)==false)
             sbd.setName(div);
         return sbd;
    }

    /**
     * Function for setting a subdivision
     * @param sbd
     */
    public void setSubdivision(Subdivision sbd) {
        this.sbd = sbd;
    }

    /**
     *Function for getting the salary amount
     * @return
     */
    public int getSalary() {
        return salary;
    }

    /**
     *Function for setting salary
     * @param salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     *Function for getting a person's date of birth
     * @return
     */
    public String getBirthday() {
        return birthday;
    }


    /**
     *Function for setting the date of birth
     * @param birthday
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    /**
     *Function for displaying information about a person
     */
    public void printHuman()
    {
        System.out.print("ID: "+ID+" ");
        System.out.print("name: "+name+" ");
        System.out.print("gender: "+g+" ");
        System.out.print("birthday: "+birthday+" ");
        System.out.print("salary: "+salary+" ");
        if("".equals(div)==false)
            sbd.setName(div);
        System.out.print("division: "+sbd.getName()+" ");
        System.out.println("ID division: "+sbd.getID());
    }

    /**
     * The function returns information about a person in the form of a string
     * @return
     */
    public String infoHuman()
    {
        String result;

        if("".equals(div)==false)
            sbd.setName(div);

        result="ID: "+ID+" name: "+name+" gender: "+g+" birthday: "+birthday+" salary: "+salary+" division: "+sbd.getName()+" ID division: "+sbd.getID();

        return result;
    }

}
