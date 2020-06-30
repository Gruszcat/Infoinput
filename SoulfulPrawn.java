import java.util.*; 
public class SoulfulPrawn {
 
  public static void main(String[] args) {
   
    Scanner user_input = new Scanner(System.in);
  
    System.out.println("SoulfulPrawn\n\n");

    System.out.println("What is your full first name?");
    String firstname = user_input.nextLine();
    System.out.println("\n");

    System.out.println("What is your middle name?");
    String middlename = user_input.nextLine();
    System.out.println("\n");

    System.out.println("What is your last name?");
    String lastname = user_input.nextLine();
    System.out.println("\n");

    System.out.println("What is your birth month?");
    String birthmonth = user_input.nextLine();
    System.out.println("\n");

    System.out.println("What is your birth year?");
    String birthyear = user_input.nextLine();
    System.out.println("\n\n");
 
    System.out.println("Full Name: " + firstname + " " + middlename + " " + lastname);

    System.out.println("Born: " + birthmonth + " " + birthyear);
  }
}
