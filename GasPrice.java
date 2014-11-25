/* */

public class GasPrice {
    public static void main(String[] args) {
        int[] year = new int[] { 1975, 1980, 1985, 1990, 1995, 2000, 2005, 2010 };
        int[] priceInt = new int[] { 14, 27, 51, 59, 56, 77, 82, 104 };

        System.out.print("year  | ");
        for (int printYear : year) {
            System.out.print("  " + printYear);
        }
        System.out.println();
        System.out.println("------+-------------------------------------------------");
        System.out.print("price |$");
        for (int printPrice : priceInt) {
            System.out.print("  " + ((double) printPrice /100));
        }
    }
}
