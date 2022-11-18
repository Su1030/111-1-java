public class Test18 {

    public static void main(String[] args) {
        int a = 0;
        int k = 3;

        int returnVauld = add( a, k );

        System.out.print(returnVauld);
    }

    public static int add(int x, int y) {
        x+=y;
        return x;
    } 
}