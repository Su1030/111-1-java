import java.util.Scanner;

public class Test7{
    public static void main(String[] args){
        int countWhileloop = 0;
        String ari = "";
        
        while (countWhileloop < 10){
            System.out.print(ari);
            System.out.printf("%d%n", countWhileloop);
            countWhileloop = countWhileloop + 1;
            ari = ari + " ";
            
        }
    }
    public static void printStr(String str) {
        System.out.println(str);
    }
}