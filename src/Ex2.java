import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int x = scn.nextInt();
        int sum =0;
        for (int i = 2; i <=x ; i++){
            if (x % i == 0){
                sum++;
            }
        }if (sum == 1){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
}
