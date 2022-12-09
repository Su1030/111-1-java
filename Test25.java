public class Test25 {
    public static void main(String[] args) {
        int[] iArray = {1, 2, 3, 4, 5};
        int saveT = 0;
        int oldVaule = 0, workTime = 0;
        for (int i = 0;i < iArray.length-1;){
            System.out.printf("%d+%d>>", i, saveT);
            if (iArray[i] > iArray[i+1]) {
                saveT++;
                oldVaule = iArray[i+1];
                iArray[i+1] = iArray[i];
                iArray[i] = oldVaule;
                if(i>0){
                    i--;
                }else{
                    i+=saveT;
                    saveT=0;
                }
            }else{
                if(saveT>0){
                    i+=saveT;
                    saveT= 0;
                }else{
                    i++;
                }
            }
            for(int i2 = 0 ;i2 < iArray.length; i2++){
                System.out.print( iArray[i2]);
            }
            workTime++;
            System.out.printf(" %d%n",workTime);
        }
        
    }
}
