import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int n;

        while(a != 0){
            for(int i = 1; i <= a; i++){
                n = sc.nextInt();
                if(n%2 != 0){
                    n = (n*2)-1;
                }else if(n%2 == 0){
                    n = (n*2)-2;
                }
                System.out.println(n);
            }

            a =sc.nextInt();
        }

        sc.close();
    }
}
