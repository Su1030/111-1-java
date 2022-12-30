import java.util.Scanner;
public class Test33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] iArray = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int searchNum = input.nextInt(), index = iArray.length/2,delta = iArray.length/2, workTime = 0;
        for (int i = 0; i < iArray.length;i++){
            workTime++;
            delta -= delta/2;
            if(iArray[index] == searchNum){
                break;
            }else if(iArray[index] > searchNum){
                index+=delta;
            }else if(iArray[index] < searchNum){
                index-=delta;
            }
        }
        System.out.printf("index:%d count time:%d%n",index,workTime);
        input.close();
    }
}