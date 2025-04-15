import java.util.Scanner;

class Person {
    private String AccountName;
    private int Id;

    public Person(String AccountName, int Id) {
        this.AccountName = AccountName;
        this.Id = Id;
    }

    public String getAccountName() {
        return this.AccountName;
    }

    public int getId() {
        return this.Id;
    }

    public void displayInfo() {
        System.out.println("Account Name: " + AccountName);
        System.out.println("ID: " + Id);           
    }

}

public class SchMng {
    public static void main(String[]Args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Student Name: "); 
        String StudentName = scan.nextLine(); 

        System.out.print("ID: ");  
        int StudentId = scan.nextInt(); 
        scan.nextLine();
        System.out.print("Grade Level: ");
        String gradeLevel = scan.nextLine();

        

        System.out.print("\nEnter Teacher Name: "); 
        String teacherName = scan.nextLine();       
        System.out.print("ID: ");  
        int teacherId = scan.nextInt();  
        scan.nextLine();

        System.out.print("Subject: ");
        String teachersubject = scan.nextLine();

        System.out.print("\nEnter Staff Name: "); 
        String StaffName = scan.nextLine();       
        System.out.print("ID: ");  
        int StaffId = scan.nextInt();

        scan.nextLine(); 

        System.out.print("Department: ");
        String StaffDepartment = scan.nextLine();
         

        Student student = new Student(StudentName, StudentId, gradeLevel);
        Teacher teacher = new Teacher(teacherName, teacherId, teachersubject);
        Staff staff = new Staff(StaffName, StaffId, StaffDepartment);

        System.out.println("\nStudent Information ");
        student.displayInfo();

        System.out.println("\nTeacher Information");
        teacher.displayInfo();

        System.out.println("\nStaff Information");
        staff.displayInfo();

       scan.close();
    }
}