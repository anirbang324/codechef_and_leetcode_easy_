// qs - https://practice.geeksforgeeks.org/problems/wave-array-1587115621/1?page=1&sprint=ca8ae412173dbd8346c26a0295d098fd&sortBy=submissions

class wave_array {
    public static void convertToWave(int n, int[] a) {
        for (int i = 1; i <= n - 1; i += 2) {
            if (a[i] >= a[i - 1]) {
                int temp = a[i - 1];
                a[i - 1] = a[i];
                a[i] = temp;
            }
        }

        // code here
    }
}
