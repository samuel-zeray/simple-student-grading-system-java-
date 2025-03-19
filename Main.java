import java.util.Scanner;
public class Main {
    public static void main(String[] args){

    menu();
                                        }


    public static void menu(){

        // declare object here
        Store_info stud = new Store_info();
        Scanner input = new Scanner(System.in);
            while(true){
                System.out.println();
                System.out.println();
                System.out.println("Student Database MENU");
                System.out.println("---------------------");
                System.out.println("1. Register new student");
                System.out.println("2. Update Student info");
                System.out.println("3. Delete Student from the database");
                System.out.println("4. Search Student");
                System.out.println("5. Show GPA of Student");
                System.out.println("6. Show The highest score (Maximum GPA)");
                System.out.println("7. Display all info in the Database");
                System.out.println("0. Exit");

                int choice=input.nextInt();
                input.nextLine();
                switch(choice){
                    case 1:
                        stud.register();
                        break;
                    case 2:
                        stud.update();
                        break;
                    case 3:
                        stud.delete();
                        break;
                    case 4:
                        stud.search();
                        break;
                    case 5:
                        stud.GPA();
                        break;
                    case 6:
                        stud.maxGPA();
                        break;
                    case 7:
                        stud.display();
                        break;
                    case 0:
                        System.out.println("Exiting...");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Enter another choice");
                }
            }}

    }




