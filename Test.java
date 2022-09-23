public class Test{
    public static void main(String[] args){
        System.out.println(args[0]);
        countNumber("ouo");
    }
    public static void countNumber(String str){
        for(var i = 0; i <= 10; i++){
            System.out.println(str + i);
        }
    }
}