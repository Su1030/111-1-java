import java.lang.Math;
public class Test20{
    public static void main(String[] args){

        for(int high = -4; high <= 4; high++){

            int rowNumber = 4 - Math.abs(high);

            for(int row = -5; row <= 5; row++){

                int airRange = Math.abs(row);

                if(airRange>rowNumber){
                    printStr("*");
                }else{
                    printStr(" ");
                }
                
            }
            printStr("%n");
        }
    }
    
    public static void printStr(String str) {
        System.out.printf(str);
    }
}