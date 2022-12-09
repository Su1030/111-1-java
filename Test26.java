public class Test26 {
    public static void main(String[] args) {
        int[] iArray = {7, 3, 4, 9, 6};
        int oldVaule = 0, workTime = 0;
        for (int i = 0;i < iArray.length-1;i++){
            for(int i2 = 0 ;i2 < iArray.length-i-1; i2++){
                System.out.printf("%d>>", i2);
                if (iArray[i2] > iArray[i2+1]) {
                oldVaule = iArray[i2+1];
                iArray[i2+1] = iArray[i2];
                iArray[i2] = oldVaule;
                }
                for(int i3 = 0; i3 < iArray.length;i3++){
                System.out.print( iArray[i3]);
                }
                workTime++;
                System.out.printf(" %d%n",workTime);
            }
            
        }
      
    }
}
