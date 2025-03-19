
public class Course {
String coursename,
            grade,
       coursecode;
double gradePoint,
             ECTS;




//returns the name of the course
    String getCoursename(){
        return coursename;
    }
    //assigns the name of the course
     public void setCoursename(String Name){
        coursename=Name;
    }
     //returns the coursecode of the course
     String getCoursecode(){
        return coursecode;
    }
    //assigns the coursecode of the course
     public void setCoursecode(String Name){
        coursecode=Name;
    }
     
     //returns the ECTS of the course
    double getECTS(){
        return ECTS;
    }
    //assigns the ECTS of the course
     public void setECTS(double Name){
        ECTS=Name;}
     
//returns the grade of the student
    String getGrade(){
        return grade;
    }
    double getGradepoint(){
        return gradePoint;
    }
 //assigns the grade of the course and its gradePoint
     public void setGrade(double mid, double Final){
         double total=(mid+Final);
         
         if(total>=85)
         {grade="A";
             gradePoint=4.0;}
         else  if(80<=total && total<85)
         {grade="A-";
                 gradePoint=3.75;}
         else  if(75<=total && total<80)
         {grade="B+";
                 gradePoint=3.5;}
         else  if(70<=total && total<75)
         {grade="B";
                 gradePoint=3.0;}
         else  if(65<=total && total<70)
         { grade="B-";
                 gradePoint=2.75;}
         else  if(60<=total && total<65)
         {grade="C+";
                 gradePoint=2.5;}
         else  if(55<=total && total<60)
         {grade="C";
                 gradePoint=2.0;}
         else  if(50<=total && total<55)
         {grade="D";
                 gradePoint=1.75;}
         else if(0<=total && total<=49)
         {grade="F";
                 gradePoint=0.0;}
         else grade="NG";
    }
//returns the ECTS of the course
     public double getGradePoint(){
     return gradePoint;
    }
     
    
        
}
