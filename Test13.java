import java.util.Scanner;
public class Test13{
    public static void main(String[] args) {
        
        int count = 1;
        int len = 5;
        for(int i = 0; i < 9; i++){
            for(int x = 0; x < len; x++){
                if(x<len-count){
                    System.out.printf(" ");
                }else{
                    System.out.printf("*");
                }
            }
            printStr("");
            if(i<4){
                count+=2;
                len++;
            }else{
                count-=2;
                len--;
            }
        }
    }
    
    public static void printStr(String str) {
        System.out.println(str);
    }
}