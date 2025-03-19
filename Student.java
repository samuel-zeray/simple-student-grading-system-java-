
public class Student {
    //data members
    // public  Course array[];
    String name,
             id,
          email,
     department,
            year;
    double GPA;
    Course array[];
  
    //constructor ton initialize the datga members
    public Student(){
        name="unknown";
        id="unknown";
        department="unknown";
        year="unknown";
        email="unknown";
         }
   
    
    //###### Name ######
    //returns the name of the student
    String getName(){
        return name;
    }
    //assigns the name of the student
     public void setName(String Name){
        name=Name;
    }
    //###### Id #######
     //returns the id of the student
    String getId(){
        return id;
    }
    //assigns the id of the student
    public void setId(String Id){
        id=Id;
    }
    
    //######## Department #########
     //returns the department of the student
    String getDepartment(){
        return department;
    }
    //assigns the department of the student
    public void setDepartment(String Department){
        department=Department;
    }
    //#### Year ######
     //returns the year of the student
    public String getYear(){
        return year;
    }
    //assigns the year of the student
    public void setYear(String Year){
       year=Year;
    }
    //####### E-mail #######
    //assigns the E-mail of the student
    public void setEmail(String email){
       this.email=email;
    }
    //returns the E-mail of the student
    public String getEmail(){
        return email;}
     //assigns GPA
    public void setGpa(double gpa, double sum){
        GPA=gpa/sum;
        
    }
    
    //returns GPA
    public double getGpa(){
        return GPA;
    }
    
    //FOR OUTPUTING
    public void output(String NAME,String ID,String DEP,String YEAR,String EMAIL,String COname,String COcode,double ECTS,String GRADE,double GPA){
      //we use 1$,2$...n$ to rank which will be displayed first 
       System.out.printf("%2$-25s %1$-25s %3$-35s %5$-25s %4$-25s %6$-25s %7$-25s %8$-25f %9$-25s\n",NAME,ID,DEP,YEAR,EMAIL,COname,COcode,ECTS,GRADE,GPA);
    }
}
