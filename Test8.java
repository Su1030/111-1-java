import java.util.Scanner;
public class Test8{
    
    public static void main(String[] args) {
        
        int countTime = 0;
        String star = "";
        
        while(countTime < 5) {
            countTime = countTime + 1;
            star = star + "*";
            
            System.out.print(star);
            printStr("");
        }
    }
    
    public static void printStr(String str) {
        System.out.println(str);
    }
}