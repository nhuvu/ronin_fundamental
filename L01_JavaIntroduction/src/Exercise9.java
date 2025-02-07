public class Exercise9 {
    public static void main(String[] args) {
        System.out.println("Dân số trong 5 năm tới: " +
                        (long) (312032486 + 5 * ((365*24*3600)/6 + (365*24*3600)/40 - (365*24*3600)/15))
                );
    }
}
