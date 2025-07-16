public class Teacher
{
    private int teacherID; //declaring instance variables
    private String teachername;
    private String address;
    private String workingtype;
    private String employment_status;
    private int working_hours;
    
    public Teacher(int teacherID,String teachername,String address,String workingtype,String employment_status)
    {
        this.teacherID=teacherID; //local variable is stored in instance variable
        this.teachername=teachername; 
        this.address=address;
        this.workingtype=workingtype;
        this.employment_status=employment_status;
    }
    
    
    //creating getter(accessor) methods for all attributes
    public int getteacherID()
    {
        return this.teacherID;
    }
    public String getteachername()
    {
        return this.teachername;
    }
    public String getaddress()
    {
        return this.address;
    }
    public String getworkingtype()
    {
        return this.workingtype;
    }
    public String getemployment_status()
    {
        return this.employment_status;
    }
    public int getworking_hours()
    {
        return this.working_hours;
    }
    
    
    //creating setter(mutator) methods for working_hours attribute
    public void setworking_hours(int working_hours)
    {
        this.working_hours=working_hours;
    }
    
    
    public void displayTeacher() //display method
    {
        System.out.println("The teacher ID is ="+ teacherID);
        System.out.println("The teacher name is=" + teachername);
        System.out.println("The address is=" + address);
        System.out.println("The workingtype is=" + workingtype);
        System.out.println("The Employment Status is=" + employment_status);
        
        
        if(working_hours > 0)
            {
                System.out.println("Working Hours: " + working_hours);
            }
        else
            {
                System.out.println("Working Hours: Not assigned");
            }
    }
    
    
}
