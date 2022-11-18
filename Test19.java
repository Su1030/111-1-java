public class Test19{
    public static void main(String[] args) {

        int airL = 6;
        int airR = 6;
        int deltaLimit = 1;

        for(int high = 1;high<=9;high++){

            for(int row = 1; row <= 11; row++){
                if(row < airL || row > airR){
                    System.out.print('*');
                }else{
                    System.out.print(" ");
                }
            }
            printStr("%n");
            if(high<5){
                deltaLimit=1;
            }else{
                deltaLimit=-1;
            }
            airL-=deltaLimit;
            airR+=deltaLimit;
        }
    }
    
    public static void printStr(String str) {
        System.out.printf(str);
    }
}