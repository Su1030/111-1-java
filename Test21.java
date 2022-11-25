import java.util.Scanner;
public class Test21{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        printStr("請輸入乘坐公里數：");
        int roadLong = input.nextInt() ;
        int money = 0;
        if(roadLong <= 7){
            money = 85;
        }
        else{
            money = (roadLong - 7) * 5 + 85;
        }
        System.out.printf("%d公里的車資為: %d", roadLong, money);
        
    }
    
    public static void printStr(String str) {
        System.out.printf(str);
    }
}