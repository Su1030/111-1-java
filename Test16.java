import java.util.Scanner;
public class Test16{
    
    public static void main(String[] args) {

        int i = 1;

        for(; i<=100000;i=i*10){
            int x = 123456;
            for(;x>i*10;x=x/10){
                System.out.printf("*");
            }
            System.out.println(x);
        }
    }
    
    public static void printStr(String str) {
        System.out.println(str);
    }
}