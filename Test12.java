import java.util.Scanner;
public class Test12{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int high = 0;
        int width = 0;
        int i, x =0;
        
        System.out.print("請輸入乘法表高度：");
        high = input.nextInt();
        printStr("");
        
        System.out.print("請輸入乘法表寬度：");
        width = input.nextInt();
        printStr("");
        
        for(i = 1; i <= high; i++){
            for(x = 1; x <= width; x++){
                System.out.printf("%dx%d=%3d  ", i, x, i*x);
            }
            printStr("");
        }
    }
    public static void printStr(String str) {
        System.out.println(str);
    }
}