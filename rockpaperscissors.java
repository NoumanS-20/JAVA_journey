import java.util.Random;
public class rockpaperscissors {

    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(3);
        int b = random.nextInt(3);
        //0 = rock
        //1 = paper
        //2 = scissors
        if(a==b){
            System.out.println("It's a tie");
        }
        else if(a == 0 && b == 1){
            System.out.println("Paper covers rock, B wins!");
        }
        else if(a == 0 && b == 2){
            System.out.println("Rock crushes scissors, A wins!");
        }
        else if(a == 1 && b == 0){
            System.out.println("Paper covers rock, A wins !");
        }
        else if(a == 1 && b == 2){
            System.out.println("Scissors cuts paper, A wins!");
        }
        else if(a == 2 && b == 0){
            System.out.println("Rock crushes scissors, B wins!");
        }
        else if(a == 2 && b == 1){
            System.out.println("Scissors cuts paper, B wins!");
        }
    }
}