
package smartitcafeteria.group.pkg10;

public class workersAdd {
    private int id;
    private String name;
    private String post;
    private double salary;
    private String contact;
    
    public workersAdd(int wid, String wname, String wpost,double wsalary ,String wcontact )
    {
        this.id = wid;
        this.name = wname;
        this.post = wpost;
        this.contact = wcontact;
        this.salary = wsalary;
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getName()
    { 
        return name;
    }
    
    public String getPost()
    {
        return post;
    }
    
    public double getSalary()
    {
        return salary;
    }
    
    public String getContact()
    {
        return contact;
    }
}

