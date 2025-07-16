public class Tutor extends Teacher
{
    private double salary; //declaring instance variables
    private String specialization;
    private String academic_qualifications;
    private int performanceIndex;
    private boolean isCertified;

    
    public Tutor(int teacherID,String teachername,String address,String workingtype,String employment_status,int working_hours,double salary,String specialization,String academic_qualifications,int performanceIndex)
    {
       super(teacherID,teachername,address,workingtype,employment_status); 
       setworking_hours(working_hours);
       this.salary= salary; //local variable is stored in instance variable
       this.specialization= specialization;
       this.academic_qualifications=academic_qualifications;
       this.performanceIndex=performanceIndex;
       this.isCertified=false;  //default values
    }
    
    //create (Accessor) methods for attributes of turor class
    public double getSalary() 
    {
        return this.salary;
    }

    public String getSpecialization()
    {
        return this.specialization;
    }

    public String getAcademicQualifications()
    {
        return this.academic_qualifications;
    }

    public int getPerformanceIndex() 
    {
        return this.performanceIndex;
    }
    
    public boolean isCertified()
    {
        return this.isCertified;
    }
    
    
    //create (Mutator) method for salary and performanceIndex
    public void setSalary(double Salary)
    {
        this.salary=salary;
    }

    public void setPerformanceIndex(int performanceIndex) 
    {
        this.performanceIndex = performanceIndex;
    }
    
    
    //method to set salary
    public void setsalary(double newSalary, int newPerformanceIndex)
    {
        if(isCertified==false)
        if (performanceIndex > 5 && getworking_hours()>20)
        {
            double appraisalPercentage;
                if (performanceIndex >= 5 && performanceIndex <= 7)
                {
                    appraisalPercentage = 0.05;
                }
                else if (performanceIndex >= 8 && performanceIndex <= 9) 
                {
                    appraisalPercentage = 0.10;
                }
                else if(performanceIndex==10)
                {
                    appraisalPercentage = 0.20;
                }
                else
                {
                    appraisalPercentage =0.0;
                }
                
                
                double appraisal = salary * appraisalPercentage;
                this.salary = newSalary+appraisal;
                this.performanceIndex = newPerformanceIndex;
                isCertified = true;

                System.out.println("Salary is successfully approved.");
        }    
                else
                {
                    System.out.println("Salary cannot be approved for the tutor.");
                }
        
        else
        {
            System.out.println("Salary cannot be changed for a certified tutor.");
        }
    }

    
    
    public void removeTutor() //// Method to remove tutor
    {
        if (isCertified==false)
        {
            this.salary = 0;
            this.specialization = "";
            this.academic_qualifications = "";
            this.performanceIndex = 0;
            this.isCertified = false;
            System.out.println("Tutor is successfully removed.");
        }
        else
        {
            System.out.println("Certified tutor cannot be removed");
        }
    }
    
    
    
    public void display()
    {
        if (isCertified) 
        {
            System.out.println("The Salary of a turor+" + salary);
            System.out.println("The Specialization of a tutor=" + specialization);
            System.out.println("The Academic Qualifications:of a tutor=" + academic_qualifications);
            System.out.println("The Performance Index of a tutor=" + performanceIndex);
        }
        else
        {
            super.displayTeacher(); //display from parent class teacher
        }
    }
}

