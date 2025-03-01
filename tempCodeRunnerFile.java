import java.util.*;

class CHESSBOARD {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] str = s.toCharArray();
        if(str[0]=='a' || str[0]=='c' ||str[0]=='e' ||str[0]=='g' && str[1]=='1' ||str[1]=='3' ||str[1]=='5' ||str[1]=='7'){
            System.out.println("Black");
        }
        else if(str[0]=='b' || str[0]=='d' ||str[0]=='f' ||str[0]=='h' && str[1]=='2' ||str[1]=='4' ||str[1]=='6' ||str[1]=='8'){
            System.out.println("Black");
        }
        else{
            System.out.println("White");
        }
        sc.close();
    }
}