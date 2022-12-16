public class Test29 {
    public static void main(String[] args) {
        int[] iArray = {7, 5, 4, 8, 1, 2};
        int arrayLong = iArray.length -1;
        int[] index = new int[arrayLong + 1];
        for (int i = arrayLong; i >=0;i--){
            index[arrayLong - i] = iArray[i];
        }
        for (int a = 0; a <= arrayLong; a++){
            System.out.printf("%d",index[a]);
        }
    }
}
