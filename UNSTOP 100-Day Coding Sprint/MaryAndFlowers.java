import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) { 
                if (arr[i] + arr[j] == t) {
                    System.out.println(i + " " + j); 
                    sc.close();
                    return; 
                }
            }
        }

        System.out.println("-1 -1"); 
        sc.close();
    }
}