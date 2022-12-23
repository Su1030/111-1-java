import java.util.Scanner;
public class Test32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] iArray = {7, 5, 4, 9, 8, 1, 2};
        float avg_range = input.nextFloat(),avg = 0;
        for (int i = 0; i < iArray.length; i += avg_range){
            if(i+avg_range-1 <= iArray.length-1){
                avg = (iArray[i]+iArray[i+1])/avg_range;
                System.out.printf("%.1f ",avg);
            }else{
                System.out.printf("%d ", iArray[i]);
            }
        }
    }
}