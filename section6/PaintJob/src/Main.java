public class Main {
    public static void main(String[] args) {
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));

        System.out.println(getBucketCount(-3.4, 2.1, 1.5));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(7.25, 4.3, 2.35));

        System.out.println(getBucketCount(3.4, 1.5));
        System.out.println(getBucketCount(6.26, 2.2));
        System.out.println(getBucketCount(3.26, 0.75));
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

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) return -1;

        int bucketsToBuy = 0;
        double areaToCover = width * height;
        while (areaToCover > 0) {
            areaToCover -= areaPerBucket;
            bucketsToBuy++;
        }
        return bucketsToBuy;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) return -1;

        int bucketsToBuy = 0;
        while (area > 0) {
            area -= areaPerBucket;
            bucketsToBuy++;
        }
        return bucketsToBuy;
    }
}