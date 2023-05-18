public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(3659));
        System.out.println(getDurationString(-1));
        System.out.println(getDurationString(3600));
        System.out.println(getDurationString(60));
        System.out.println(getDurationString(61));
        System.out.println(getDurationString(59));
        System.out.println(getDurationString(600, 100));
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) return "Invalid data for seconds(" + seconds + "), mus be a positive integer value";

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0) return "Second couldn't be a negative number";

        if (seconds < 0 || seconds > 59)
            return "Invalid data for seconds(" + seconds + "), mus be a positive integer value";

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }
}