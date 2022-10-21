import java.util.Scanner;
public class Test15{
    
    public static void main(String[] args) {

        int i = 1;
        int x = 0;
        
        for(i = 1; i<=6;i++){
            int count = 1;
            for(x=0;x<6;x++){
                if(x < 6-i){
                    System.out.printf("*");
                }else{
                    System.out.print(count);
                    count++;
                }
            }
            printStr("");
        }
    }
    
    public static void printStr(String str) {
        System.out.println(str);
    }
}