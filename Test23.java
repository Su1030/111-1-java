public class Test23 {
    public static void main(String[] args) {
        Test22[] x = new Test22[24];
        for (int i = 0; i < 30; i++){
            x[i] = new Test22();

            int a = x[i].lanuch(i);
            System.out.printf("%d%n",a);
        }
    }
}
