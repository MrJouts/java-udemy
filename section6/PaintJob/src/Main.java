public class Main {
    public static void main(String[] args) {
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) return -1;

        int bucketsToBuy = 0;
        double areaToCover = width * height;
        areaToCover = areaToCover - (areaPerBucket * extraBuckets);
        while (areaToCover > 0) {
            areaToCover -= areaPerBucket;
            bucketsToBuy++;
        }
        return bucketsToBuy;
    }
}