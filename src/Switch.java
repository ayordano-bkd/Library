import java.util.Scanner;

public class Switch {
    public static void main(String args[]) {
Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number (1-7): ");
       int day= scanner.nextInt();
        switch (day){
            case 1:
                System.out.println("Print Monday");
                break;
            case 2:
                System.out.println("Print Tuesday");
                break;
            case 3:
                System.out.println("Print Wednesday");
                break;
            case 4:
                System.out.println("Print Thursday");
                break;
            case 5:
                System.out.println("Print Friday");
                break;
            case 6:
                System.out.println("Print Saturday");
                break;
            case 7:
                System.out.println("Print Sunday");
                break;
            default:
                System.out.printf("Failed");
                break;
        }


    }

}
