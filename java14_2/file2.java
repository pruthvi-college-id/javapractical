class fun {
    // public static void generateRandom() {
    //     int n = 1000000;
    //     long arr[] = new long[n];
    //     for (int i = 0; i < 7; i++) {
    //         arr[i] = generateDigit();
    //     }
    //     System.out.println(countPrime(arr, n));
    // }

    // public static int countPrime(long arr[], int n) {
    //     int countP = 0;
    //     int countN = 0;
    //     for (int i = 0; i < n; i++) {
    //         if (is7Digit(arr[i]) && isPrime(arr[i])) {
    //             countP++;
    //         } else if (is7Digit(arr[i]) && isPrime(arr[i]) == false) {
    //             countN++;
    //         } else {
    //             continue;
    //         }
    //     }
    //     return countP;
    // }

    // public static boolean isPrime(long x) {
    //     for (int j = 2; j * j < x; j++) {
    //         if (x % j == 0) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    // public static boolean is7Digit(long x) {
    //     int count = 0;
    //     while (x > 0) {
    //         x = x / 10;
    //         count++;
    //     }
    //     if (count == 7) {
    //         return true;
    //     }
    //     return false;
    // }

    // public static long generateDigit() {
    //     return ((System.currentTimeMillis()) % 10);
    // }

    public static void main(String[] args) {
        // generateRandom();
        System.out.println(System.currentTimeMillis());
    }
}