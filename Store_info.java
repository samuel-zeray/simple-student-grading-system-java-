import java.util.Scanner;
public class Store_info {
  public  Student arr[];
  //public  Course array[];
      String name,NAME,id,ID,email,EMAIL,dep,DEP,code,Cname,Ccode,Grade,
                                                              year,YEAR;
            double ects,mid,Final,Ects,GpA;
            Scanner input=new Scanner(System.in);
        
            //#####  INPUT TO STORE STUDENT INFORMATION   #####
            public void register(){    
  System.out.println("How many students do you want to register?");
  int a=input.nextInt();
  input.nextLine();
    if(a<1)
    {
        System.out.println("you entered invalid number, valid >= 1.");
        Main.menu();
    }

     arr=new Student[a];
      for(int i=0;i<arr.length;i++){
          arr[i]=new Student();
          System.out.println("register student "+(i+1));
          System.out.print("NAME: ");
          name=input.nextLine();
         arr[i].setName(name);
         
         boolean found=true;
          System.out.print("ID: ");
          id=input.nextLine();
         
          
          if(i>=1){
          boolean fnd = isExist(id);
          while(fnd==true){
              System.out.println("The ID has TOKEN!!\n TRY ANOTHER");
         id=input.nextLine();
          fnd = isExist(id);}}
   
          arr[i].setId(id);
  
          System.out.println("How many courses do the student enroll?");
  int c=input.nextInt();
  input.nextLine();
    arr[i].array=new Course[c];
     for(int z=0;z<c;z++){
  
         { arr[i].array[z]=new Course();
          System.out.println("Accepting information for course "+(z+1));
          System.out.print("COURSE NAME: ");
          name=input.nextLine();
         arr[i].array[z].setCoursename(name);
         
          System.out.print("COURSE CODE: ");
          code=input.nextLine();
         arr[i].array[z].setCoursecode(code);
          
          System.out.print("ECTS: ");
          ects=input.nextDouble();
             input.nextLine();
         arr[i].array[z].setECTS(ects);
          
          System.out.print("MID SCORE: ");
          mid=input.nextDouble();
             input.nextLine();
          System.out.print("FINAL SCORE: ");
          Final=input.nextDouble();
          input.nextLine();
         arr[i].array[z].setGrade(mid,Final);
            }
         }
        
      
        System.out.print("E-mail: ");
          email=input.nextLine();
         arr[i].setEmail(email);
    
          System.out.print("DEPARTMENT: ");
          dep=input.nextLine();
         arr[i].setDepartment(dep);
         
         System.out.print("YEAR: ");
          year=input.nextLine();
          
         arr[i].setYear(year);
         if(i>0)
             arr[i].setGpa(setGpa(),setSum());}


    System.out.println(" You have succesfully Registered "+a+" students.");
          }
          
            //### UPDATE Student info
            public void update(){
                int i=0;
  System.out.println("ENTER the id you want to update");
    String upd=input.nextLine();
      while(i<arr.length && !arr[i].getId().equals(upd)){
                           i++;
                                                        }
     if(i==arr.length)
         System.out.println("NOOOOH! The id doesn't exist.");                 
        else{
    
 
    System.out.println("           1. NAME");
    System.out.println("           2. ID");
    System.out.println("           3. E-MAIL");
    System.out.println("           4. DEPARTMENT");
    System.out.println("           5. YEAR");
    System.out.println("           6. COURSE INFO");
    System.out.println("           7. ALL INFORMATION");
 System.out.println("which information do you want to change");
             boolean found=false;
             int choice=input.nextInt();
                 input.nextLine();             
                   while(found==false){
                      if(1<=choice && choice<=7){
  switch(choice){
      case 1:
         System.out.print("NAME: ");
          name=input.nextLine();
         arr[i].setName(name);

         break;
      case 2:
         System.out.print("ID: ");
          id=input.nextLine();
         arr[i].setId(id);

         break;
      case 3: 
          System.out.print("E-mail: ");
          email=input.nextLine();
         arr[i].setEmail(email);

         break;
      case 4:
          System.out.print("DEPARTMENT: ");
          dep=input.nextLine();
         arr[i].setDepartment(dep);

         break;
      case 5:
         System.out.print("YEAR: ");
          year=input.nextLine();
          
         arr[i].setYear(year);

          break;
         
          
        case 6:
            for(int k=0;k<arr[i].array.length;k++){
         Cname=arr[i].array[k].getCoursename();
         System.out.println((k+1)+" "+Cname);   
                                                         }
                System.out.println("which course do you want to change");
               int z=input.nextInt();
                   
                System.out.println("          1. COURSE NAME");
                  System.out.println("        2. COURSE CODE");
                  System.out.println("        3. ECTS");
                  System.out.println("        4. SCORE");
              
System.out.println("what type of information do you want to change for course "+arr[i].array[z-1].getCoursename());
              int p=input.nextInt();
                 
                   switch(p){
            case 1:
                      System.out.print("COURSE NAME: ");
                      name=input.nextLine();
                      arr[i].array[z-1].setCoursename(name);
      
                      break;
        case 2:
          System.out.print("COURSE CODE: ");
          code=input.nextLine();
         arr[i].array[z-1].setCoursecode(code);

          break;
        case 3:
          System.out.print("ECTS: ");
          ects=input.nextDouble();
            input.nextLine();
         arr[i].array[z-1].setECTS(ects);
         arr[i].setGpa(setGpa(),setSum());
          break;
        case 4:
          System.out.print("MID SCORE: ");
          mid=input.nextDouble();
            input.nextLine();
          System.out.print("FINAL SCORE: ");
          Final=input.nextDouble();
          input.nextLine();
         arr[i].array[z-1].setGrade(mid,Final);
              arr[i].setGpa(setGpa(),setSum());
          break;
                   }

           break;
            
      case 7:
        System.out.print("NAME: ");
          name=input.nextLine();
         arr[i].setName(name);
         
          System.out.print("ID: ");
          id=input.nextLine();
          if(i>=1){
          boolean fnd = isExist(id);
          while(fnd==true){
              System.out.println("The ID has TOKEN!!\n TRY ANOTHER");
         id=input.nextLine();
          fnd = isExist(id);}}
   
          arr[i].setId(id);
  
          System.out.println("How many courses do the student enroll?");
  int c=input.nextInt();
  input.nextLine();
    arr[i].array=new Course[c];
 
     for( z=0;z<c;z++){
  
         { arr[i].array[z]=new Course();
          System.out.println("Accepting information for course "+(z+1));
          System.out.print("COURSE NAME: ");
          name=input.nextLine();
         arr[i].array[z].setCoursename(name);
         
          System.out.print("COURSE CODE: ");
          code=input.nextLine();
         arr[i].array[z].setCoursecode(code);
          
          System.out.print("ECTS: ");
          ects=input.nextDouble();
             input.nextLine();
         arr[i].array[z].setECTS(ects);
        
          System.out.print("MID SCORE: ");
          mid=input.nextDouble();
             input.nextLine();
          System.out.print("FINAL SCORE: ");
          Final=input.nextDouble();
          input.nextLine();
         arr[i].array[z].setGrade(mid,Final);
         
    arr[i].setGpa(setGpa(),setSum());}
        
      
        System.out.print("E-mail: ");
          email=input.nextLine();
         arr[i].setEmail(email);
    
          System.out.print("DEPARTMENT: ");
          dep=input.nextLine();
         arr[i].setDepartment(dep);
         
         System.out.print("YEAR: ");
          year=  input.nextLine();
        
         arr[i].setYear(year);}}
         
                      found=true;} 
                      else{
          System.out.println("WRONG ENTRY!! TRY AGAIN");
            found=false;}
                   }
             System.out.println("SUCCESSFULLY UPDATED!!");}  }       

            
            //### DELETE Student info
        public void delete(){
        int j=0;
  System.out.println("ENTER the id you want to delete");
    String del=input.nextLine();
int i=0;
  while(i<arr.length && !arr[i].getId().equals(del)){
     i++;
  }
  if(i==arr.length)
      System.out.println("NOOOOH! The name doesn't exist.");
else
    {

      //arr[j]=arr[arr.length-1];
      //arr[arr.length-1]=null;
      arr[i]=null;
     for(int k=i;k<arr.length-1;k++)
         arr[k]=arr[k+1];
         arr[arr.length-1]=null;
      
      
      System.out.println("SUCCESSFULLY DELETED!!");
  }
      }
//###### OUTPUT INFORMATION OF ALL STUDENTS  ######
     public void display(){
        System.out.printf("%2$-25s %1$-25s %3$-35s %5$-25s %4$-25s %6$-25s %7$-25s %8$-25s %9$-25s\n","NAME","ID","DEPARTMENT","YEAR","E-mail","Course Name","course Code","ECTS","Grade");
            
  for(int i=0;i<arr.length;i++){
if(arr[i]==null)
    break;
else
   {
      NAME=arr[i].getName();
       ID=arr[i].getId();
        EMAIL=arr[i].getEmail();
        YEAR=arr[i].getYear();
         DEP=arr[i].getDepartment();

         int a=0;
       for(int z=0;z<arr[i].array.length;z++){ 
           
         Cname=arr[i].array[z].getCoursename();
         Ccode=arr[i].array[z].getCoursecode();
         Ects=arr[i].array[z].getECTS();
         Grade=arr[i].array[z].getGrade();
        GpA=arr[i].getGpa();
 
         if(a==0)
         { arr[i].output(NAME,ID,DEP,YEAR,EMAIL,Cname,Ccode,Ects,Grade,GpA);
         a++;}
         else
         {NAME=" ";       ID=" "; EMAIL=" "; YEAR=" "; DEP=" ";
              arr[i].output(NAME,ID,DEP,YEAR,EMAIL,Cname,Ccode,Ects,Grade,GpA);
                     }   
                                           }
    }
                              }
     }
     
  //##### SEARCH BY NAME OR ID ###
  public void search(){

  System.out.println("ENTER id you want to search");
    String Search=input.nextLine();
     int i=0;
  while(i<arr.length && !arr[i].getId().equals(Search)){
     i++;
  }
  if(i==arr.length)
      System.out.println("NOOOOH! The ID doesn't exist.");
else
    { System.out.println("YAP!! There is..at position "+i);
     System.out.printf("%2$-25s %1$-25s %3$-35s %5$-25s %4$-25s %6$-25s %7$-25s %8$-25s %9$-25s\n","NAME","ID","DEPARTMENT","YEAR","E-mail","Course Name","course Code","ECTS","Grade");
      NAME=arr[i].getName();
       ID=arr[i].getId();
        EMAIL=arr[i].getEmail();
        YEAR=arr[i].getYear();
         DEP=arr[i].getDepartment();

         int a=0;
       for(int z=0;z<arr[i].array.length;z++){

         Cname=arr[i].array[z].getCoursename();
         Ccode=arr[i].array[z].getCoursecode();
         Ects=arr[i].array[z].getECTS();
         Grade=arr[i].array[z].getGrade();
        GpA=arr[i].getGpa();
 
         if(a==0)
         { arr[i].output(NAME,ID,DEP,YEAR,EMAIL,Cname,Ccode,Ects,Grade,GpA);
         a++;}
         else
         {NAME=" ";       ID=" "; EMAIL=" "; DEP=" "; YEAR=" ";
              arr[i].output(NAME,ID,DEP,YEAR,EMAIL,Cname,Ccode,Ects,Grade,GpA);
                     }   
                                           }
    }}
  
  public void GPA(){
    System.out.println("ENTER id you want to show its GPA");
    String Search=input.nextLine();
     int i=0;
  while(i<arr.length && !arr[i].getId().equals(Search)){
     i++;
  }
  if(i==arr.length)
      System.out.println("NOOOOH! The name doesn't exist.");
else
    { 
     System.out.printf("%2$-25s %1$-25s %3$-35s\n","NAME","ID","GPA");
       NAME=arr[i].getName();
       ID=arr[i].getId();       
       
       GpA=arr[i].getGpa();
         System.out.printf("%2$-25s %1$-25s %3$-35s\n",NAME,ID,GpA);
}}
  
  
  
  //max GPA
  public void maxGPA(){
      double max=arr[0].getGpa();
      for(int i=0;i<arr.length;i++){
          if(max<arr[i].getGpa())
              max=arr[i].getGpa();}
          System.out.println("The maximum GPA is "+max);
                                   
  }
  
  
  
//is exist method
public boolean isExist(String search){
    int i=0;
    boolean found=false;
    while(i<arr.length && !arr[i].getId().equals(search)){
     i++;
  }
  if(i==arr.length)
     return found;
      
  else
  { 
      found=true;
      return found;}
      
}


public double setSum(){
double sum=0;
for(int i=0;i<arr.length;i++)
for(int z=0;z<arr[i].array.length;z++){  
  sum+=arr[i].array[z].getECTS(); 
       }return sum;}


public double setGpa(){
double gpa=0;
for(int i=0;i<arr.length;i++)
for(int z=0;z<arr[i].array.length;z++){  
 gpa+=(arr[i].array[z].getECTS()*arr[i].array[z].getGradepoint());
       }
return gpa;
}

}

