import java.io.Console;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        /*
        int n;
        Scanner scanner = new Scanner(System.in);
        n= scanner.nextInt();
        scanner.nextLine();
        String[] m = new String[n];
        for(int i=0;i<n;i++){
            m[i] = scanner.nextLine();
        }
        int max =0, max_num=0;
        for(int i=0;i<n;i++) {
            if(m[i].length()>=max){
                max = m[i].length();
                max_num=i;
            }
        }
        System.out.println(m[max_num]);*/
        ToLine a = new ToLine(new int[][] {{1, 2}, {3, 4}, {5, 6}});
        int[] arr = a.resize();
        System.out.println("hi");


    }
}
