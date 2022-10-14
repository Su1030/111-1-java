import java.util.Scanner;
public class Test9{
    
    public static void main(String[] args) {
        
        int row = 1;
        String star = "*";
        String[] starArray = new String[10];
        
        while(row <= 9) {
            if (row <= 5){
                printStr(star);
                starArray[(row-1)] = star;
            }
            else{
                printStr(starArray[(9-row)]);
            }
            star += "*";
            row += 1;
        }
    }
    
    public static void printStr(String str) {
        System.out.println(str);
    }
}