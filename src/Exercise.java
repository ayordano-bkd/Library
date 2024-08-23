import java.text.NumberFormat;

public class Exercise {

    public static void main(String[] args) {
        int age=32;
        if (age>=0 && age<=12){
            System.out.println("Child 0-12 years");
        }
        else if (age>=13 && age<=19)
            System.out.println("Teenager 13-19");
        else if (age>=20 && age<=64)
            System.out.println("Adult 20-64");
        else if (age>=65)
            System.out.println("Senior 65+");
        else
            System.out.println("Age is unknown");

        double celsius=20;
        double fahrenheit=(celsius*9/5)+32;
        System.out.println("Temperature in fahrenheit  " + fahrenheit);

        if (fahrenheit<32){
            System.out.println("It's freezing");
        }
        else if (fahrenheit>=32 && fahrenheit<=60)
            System.out.println("Outside is cold");
        else if (fahrenheit>=61 && fahrenheit<=80)
            System.out.println("The weather is mild");
        else
            System.out.println("It's hot");

    }


}
}
