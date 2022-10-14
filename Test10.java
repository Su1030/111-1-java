import java.util.Scanner;
public class Test10{
    
    public static void main(String[] args) {
        
        int row = 1;
        String star = "*";
        
        while(row <= 5) {
            int air = 0;
            String airStr = "";
            while(air < 5-row){
                airStr += " ";
                air += 1;
            }
            System.out.print(airStr);
            System.out.print(star);
            printStr("");
            
            star = star + "**";
            row += 1;
        }
    }
    
    public static void printStr(String str) {
        System.out.println(str);
    }
}