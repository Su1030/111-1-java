import java.util.Scanner;
public class Test17{
    
    public static void main(String[] args) {
        float a = 0.0f;
        float b = 0.8f;

        a+=0.8;

        if(a==b){
            printStr("a==b");
        }
        else{
            printStr("a!=b");
        }
    }
    
    public static void printStr(String str) {
        System.out.println(str);
    }
}