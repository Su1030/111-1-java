public class Test30 {
    public static void main(String[] args) {
        int[] iArray = {7, 5, 4, 9, 8, 1, 2};
        int maxValue = iArray[0], minValue = iArray[0],saveValue = 0 ;
        float averageValue = 0;
        for(int i = iArray.length-1; i > 0; i--){
            for (int j = 0; j < i;j++) {
                if (iArray[j]>iArray[i]) {
                    saveValue = iArray[i];
                    iArray[i] = iArray[j];
                    iArray[j] = saveValue;
                }
            }
            averageValue += iArray[i];
        }
        maxValue = iArray[iArray.length-1];
        minValue = iArray[0];
        int midValue = iArray[iArray.length/2];
        System.out.printf("%nmax:%d, min:%d, average:%.17f, mid:%d%n", maxValue, minValue, (averageValue+minValue)/iArray.length,midValue);
    }
}
