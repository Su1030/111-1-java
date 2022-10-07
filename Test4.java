import java.util.Scanner;

public class Test4{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int scare = 0;
        
        System.out.print("Enter your scare:");
        scare = input.nextInt();
        printStr("");
        switch(scare / 10){
            case 10:
            case 9:
                printStr("A");
                break;
            
            case 8:
                printStr("B");
                break;
            
            case 7:
                printStr("C");
                break;
            
            case 6:
                printStr("D");
                break;
            
            default:
                printStr("E");
                break;
        }
    }
    public static void printStr(String str) {
        System.out.println(str);
    }
}