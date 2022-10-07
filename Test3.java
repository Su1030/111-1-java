import java.util.Scanner;

public class Test3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int score = 0;
        boolean contiCheck = true;
        String[] levelOfScore = {"A", "B", "C", "D"};
        
        System.out.print("Enter your score:");
        score = input.nextInt();
        printStr("");
        
        if(score<=100 & score >= 0){
            for(var level = 9; level >= 6; level --){
                if (score/10 >= level & contiCheck){
                    printStr(levelOfScore[9 - level]);
                    contiCheck = false;
                }
                else if(score < 60 & contiCheck){
                    printStr("E");
                    contiCheck = false;
                }
            }
        }
        else{
        printStr("error:Please enter a number in range 100~0.");
        }
    }
    public static void printStr(String str) {
        System.out.println(str);
    }
}