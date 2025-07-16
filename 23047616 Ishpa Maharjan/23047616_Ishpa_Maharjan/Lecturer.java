public class Lecturer extends Teacher
{
    private String Department; //declaring instance variables
    private int YearsOfExperience;
    private int gradedScore;
    private boolean hasGraded;

   public Lecturer(int teacherID,String teachername,String address,String workingtype,int working_hours,String employment_status,String Department,int YearsOfExperience)
   {
       super(teacherID,teachername,address,workingtype,employment_status); //calling super class constructor
       setworking_hours(working_hours);
       this.Department=Department;
       this.YearsOfExperience=YearsOfExperience;
       this.gradedScore=0;  //passing default value
       this.hasGraded=false;   //default value
    }
    
    public String getDepartment()   //create Accessor methods
    {
        return this.Department;
    }

    public int getYearsOfExperience()
    {
        return this.YearsOfExperience;
    }

    public int getGradedScore()
    {
        return this.gradedScore;
    }

    public boolean hasGraded() 
    {
        return this.hasGraded;
    }

      
    
    public void setGradedScore(int gradedScore)   // Mutator method for gradedScore
    {
        this.gradedScore = gradedScore;
    }
    
    
    

    public void gradeAssignment(int gradedScore, String Department, int YearsOfExperience)      // Method to grade assignments
    {
        if(hasGraded==false)
        if (YearsOfExperience >= 5 && Department.equals(Department)) 
        {
                if (gradedScore >= 70) 
                {
                    System.out.print("grade: A");
                } 
                else if (gradedScore >= 60) 
                {
                    System.out.print("grade: B");
                } 
                else if (gradedScore >= 50)
                {
                    System.out.print("grade:C");
                }
                else if (gradedScore >= 40)
                {
                   System.out.print("grade:D");
                }
                else
                {
                    System.out.print("grade:E");
                }
                hasGraded=true;
        }
        else 
        {
            System.out.print("The assignment is already graded.");
        }
    }   

    

    
    public void display()   //display method from teacher class using super keyword and lecturer class
    {
        super.displayTeacher();  
        System.out.print("The Department is=" +Department);
        System.out.print("The Years Of Experience is=" +YearsOfExperience);
        if(hasGraded)
        {
            System.out.print("The Graded Score is=" +gradedScore);
        }
        else
        {
            System.out.print("The Score has not been Graded");
        }
    }

    
}
   
   
   
   
   

