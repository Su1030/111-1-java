import java.util.Scanner;
public class Test16{
    
    public static void main(String[] args) {

        int i = 1;
        int x = 0;
        int count = 0;
        
        for(i = 1; i<=6;i++){
            count=count*10+i;
            for(x=0;x<6-i;x++){
                    System.out.printf("*");
            }
            System.out.println(count);
        }
    }
    
    public static void printStr(String str) {
        System.out.println(str);
    }
}