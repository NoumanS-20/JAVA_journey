import java .util.Scanner;
class starpattern{
    public static void main(String[] args){
    Scanner number = new Scanner(System.in);
    System.out.println("Enter the number of rows: ");
    int n = number.nextInt();
    for(int i = n  ;i>0;i--){ //nested loop
        System.out.println("\n"); //for new line
        for(int j = i; j>0;j-- ){
            System.out.print("* ");
        }
    }
}}