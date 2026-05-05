public class OOPSBannerApp {
    public static void main(String[] args) {

        String[] banner = {
            String.join(" ", "*****", "*****", "*****", "*****"),
            String.join(" ", "*     *", "*     *", "*     *", "*     *"),
            String.join(" ", "*     *", "*     *", "*     *", "*     *"),
            String.join(" ", "*     *", "*****", "*****", "*****"),
            String.join(" ", "*     *", "*", "*", "*"),
            String.join(" ", "*     *", "*", "*", "*"),
            String.join(" ", "*****", "*", "*****", "*****")
        };

        // loop to print
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
