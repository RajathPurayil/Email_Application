import java.util.Scanner;

public class Email {
   private final String FirstName;
   private final String LastName;
   private String password;
    private final String Department;
    private int mailBoxCapacity;
    int DefaultPasswordlength=10;

    private String altermativeEmail;
    private String companySuffix;


    // Constructor to receive the first and last name

    public Email(String firstName,String lastName){

        this.FirstName= firstName;
        this.LastName=lastName;

        System.out.println("EMIAL IS CREATED "+this.FirstName+this.LastName);

    // Call method asking for department

        this.Department=setDepartment();
        System.out.println("Department"+this.Department);
    }
    //Call a method asking for a random password

    // Ask for the department

    private  String setDepartment() {

        System.out.println("DEPARTMENT CODE :\n1 for sale \n2 for Development \n3 for None \n4  for Accounting \nEnter thr department ");
        Scanner in = new Scanner(System.in);
       int Deptchoice=in.nextInt();

       if (Deptchoice==1) {
           return "sale";
       } else if (Deptchoice==2){

           return "Development";
       } else if (Deptchoice==3) {

           return "Accounting";
           
       }else
        {
            return "Nothing";

        }

    }

    //generate a random password

    private  String randompassword(int length) {

        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*";
        char[] password = new char[length];
        for (int i = 0; i <= length; i++) {
            int rand = (int) (Math.random()) * passwordSet.length();

            this.password=randompassword(8);
            password[i] = passwordSet.charAt(rand);

        }

        return new String(password);
        //Alternate Email
    }

    }
