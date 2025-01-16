import java.util.Scanner;
public class PercentageCalculator {
    public static void main(String[] args) {
        int percentage,science,maths,english,history,geography;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of Science");
        science = sc.nextInt();
        System.out.println("Enter marks of Maths");
        maths = sc.nextInt();
        System.out.println("Enter marks of English");
        english = sc.nextInt();
        System.out.println("Enter marks of History");
        history = sc.nextInt();
        System.out.println("Enter marks of Geography");
        geography = sc.nextInt();
        percentage = (maths + english + geography + history + science)/5;
        System.out.println(percentage);
    }

    
}