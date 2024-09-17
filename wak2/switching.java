/**
 * exaple2
 */

 import java.util.Scanner;
public class switching {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        
        System.out.println("Select numbers To your Problem");
        System.out.println("1  >> Register");
        System.out.println("2  >> Get Thanks"); 


        System.out.println("ENter Selection");
        Integer selection = Integer.parseInt(scanner.nextLine());
         String CorrectPassword;
         
        switch (selection) {
            case 1:
            //Entering Prompt for names
            System.out.println("Enter your Name::");
            String Name = scanner.nextLine();
            //PAssword scanner
            System.out.println("Enter Password::");
            String Password = scanner.nextLine();
            //confirmation password
            System.out.println("Enter Password::");
            CorrectPassword = scanner.nextLine();
            //conditions compare
           if (Password.equals(CorrectPassword)){
            System.out.println("your name is "+Name + " your Password is "+Password);
           }else{
            System.out.println("Please Try again with the correct Password");
           }
                break;
             case 2:
                System.out.println("Enter your Name");
                String Names =scanner.nextLine(); 
                System.out.println("Enter the Age");
                Integer age = Integer.parseInt(scanner.nextLine()); 

                System.out.println(Names + " Thank you for Visiting Us  :) \n  and You of grate age " + age);
                break;
            default:
                 System.out.println("What you doing !!??");
 
                break;
        }

    }
}