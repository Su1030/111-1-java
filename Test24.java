public class Test24 {
    public static void main(String[] args) {
        int[] iArray = {7, 3, 4, 9, 6};
        int saveT = 0;
        for (int i = 0;i < iArray.length-1;){
            System.out.printf("%d+%d>>", i, saveT);
            if (iArray[i]<iArray[i+1]) {
                saveT++;
                int oldVaule = iArray[i+1];
                iArray[i+1] = iArray[i];
                iArray[i] = oldVaule;
                if(i>0){
                    i--;
                }
            }else{
                if(saveT>0){
                    i+=saveT;
                    saveT=0; 
                }else{
                    i++;
                }
                
            }
            for(int i2 = 0 ;i2 < iArray.length; i2++){
            System.out.print( iArray[i2]);
            }
            System.out.println("");
        }
        
    }
}
