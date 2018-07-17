public class nestedforloop {
    public static void main(String[] args) {


        int rows;

        for (rows = 1; 9 >= rows; ++rows) {
            for (int p = 1; p <= rows; p++) {
                System.out.print(rows);
            }
            System.out.println("");
        }
    }
}