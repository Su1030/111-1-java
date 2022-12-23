import java.util.Scanner;
public class Test31 {
    public static void main(String[] args) {
        int[] iArray = {7, 5, 4, 9, 8, 1, 2};
        int maxValue = iArray[0], minValue = iArray[0], midValue = 0, flagMinIndex = 0,flag_Min = 1000, arrayLen = iArray.length, searchVaule = 0, time=0;
        int[] flag = new int[arrayLen];
        float averageValue = 0;
        Scanner input = new Scanner(System.in);
        searchVaule = input.nextInt();
        for(int i = 0; i < searchVaule; i++){
            time++;
            flag_Min = maxValue;
            for (int j = 0; j < arrayLen; j++) {
                if(iArray[j]<flag_Min && flag[j] == 0){
                    flagMinIndex = j;
                    midValue = iArray[j];
                    flag_Min = midValue;
                }
                if(i==0){
                    averageValue += iArray[j];
                    minValue = iArray[flagMinIndex];
                    if(iArray[j]>maxValue){
                        maxValue = iArray[j];
                    }
                }
            }
            flag[flagMinIndex]=i+1;
        }
        System.out.printf("max = %d%nmin = %d%nSearch value = %d%naverage = %.4f%ntime = %d%n", maxValue, minValue, midValue, averageValue/arrayLen,time);
        for (int k = 0; k < arrayLen; k++){
            System.out.print(flag[k]);
        }
    }
}
