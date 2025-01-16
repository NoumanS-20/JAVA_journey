import java.util.Scanner;
public class PercentageCalculator {
    public static void main(String[] args) {
        int percentage,science,maths,english,history,geography;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of Science");//Taking science marks as input from user
        science = sc.nextInt();
        System.out.println("Enter marks of Maths");//Taking maths marks as input from user
        maths = sc.nextInt();
        System.out.println("Enter marks of English");//Taking english marks as input from user
        english = sc.nextInt();
        System.out.println("Enter marks of History");//Taking history marks as input from user
        history = sc.nextInt();
        System.out.println("Enter marks of Geography");//Taking geography marks as input from user
        geography = sc.nextInt();
        percentage = (maths + english + geography + history + science)/5;//Calculating percentage
        System.out.println(percentage);
    }

    
}