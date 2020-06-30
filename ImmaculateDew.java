import java.util.*;
public class ImmaculateDew {
    public static void main(String args[]) {
        int grades[] = new int[6];
        int i;
        float total=0, avg;
        Scanner scanner = new Scanner(System.in);
        for(i=0; i<6; i++) { 
           System.out.print("Enter Numerical Grade of Class "+(i+1)+": ");
           grades[i] = scanner.nextInt();
           System.out.println("\n");
           total = total + grades[i];
        }
        scanner.close();
        avg = total/6;
        System.out.print("The Student Letter Grade is: ");
        if(avg>=90) {
            System.out.print("A");
        }
        else if(avg>=80 && avg<90){
           System.out.print("B");
        } 
        else if(avg>=70 && avg<80) {
            System.out.print("C");
        }
        else if(avg>=60 && avg<70) {
            System.out.print("D");
        }
        else {
            System.out.print("F");
        }
    }
}