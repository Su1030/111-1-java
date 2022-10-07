import java.util.Scanner;

public class Test6{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int score = 0;
        int countWhileLoop = 0
        
        System.out.print("Enter your score:");
        score = input.nextInt();
        printStr("______________________________________");
        
        while (countWhileLoop < 10 & (score > 100 | score < 0)){
            System.out.print("Please enter a number in range 100 ~ 0:");
            score = input.nextInt();
            printStr("______________________________________");
            countWhileLoop += 1
        }
        switch(score / 10){
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