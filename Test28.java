public class Test28 {
    public static void main(String[] args) {
        int[] iArray = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int index = 0, workTime = 0;
        for (int i = iArray.length/2; i < iArray.length;){
            System.out.printf("%d",i);
            workTime++;
            if(iArray[i] > 2){
                i++;
            }if(iArray[i] < 2){
                i--;
            }if(iArray[i]==2){
                index = i;
                break;
            }
        }
        System.out.printf("%nindex:%d count time:%d%n",index,workTime);
    }
}
