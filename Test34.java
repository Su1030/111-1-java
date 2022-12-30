public class Test34 {
    public static void main(String[] args) {
        int[][] intSecArr = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        for (int i=0; i<intSecArr.length; i++) {
            for (int j=0; j<intSecArr[i].length; j++) {
                System.out.printf("%d%n", intSecArr[i][j]);
            }
        } 
    }
}
