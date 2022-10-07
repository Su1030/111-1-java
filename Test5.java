import java.util.Scanner;

public class Test5{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int score = 0;
        
        System.out.print("Enter your score:");
        score = input.nextInt();
        printStr("");
        
        if( score <= 100 & score >= 0){
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
        else{
        printStr("error:Please enter a number in range 100 ~ 0.");
        }
    }
    public static void printStr(String str) {
        System.out.println(str);
    }
}