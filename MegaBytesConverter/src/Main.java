public class Main {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
        printMegaBytesAndKiloBytes(1024);
    }

    public static void printMegaBytesAndKiloBytes( int kiloBytes) {
        final int KILOBYTES_TO_MEGABYTES = 1024;

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int megaBytes = kiloBytes / KILOBYTES_TO_MEGABYTES;
        int remainderKiloBytes = kiloBytes % KILOBYTES_TO_MEGABYTES;
        System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainderKiloBytes +" KB");
    }
}