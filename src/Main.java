import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        if (a<=100 && a>=0){
            if (a>=90) {
                System.out.println("A");
            }if (a<90 && a>=80){
                System.out.println("B");
            }if (a < 80 && a >=70){
                System.out.println("C");
            }if (a <70 && a >=60){
                System.out.println("D");
            }if (a < 60){
                System.out.println("Fail");
            }
        }else {
            System.out.println("輸入錯誤");
        }
    }
}
