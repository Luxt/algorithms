public class QuickSort {
    public static void main(String[] args) {

        int[] a = {
                7, 0, 5, 4, 9, 3, 6, 2, 8, 1
        };

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();

        quickSort(a, 0, a.length - 1);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
    }

    public static void quickSort(int[] a, int low, int high) {


        if (a != null && a.length > 1 && low < high) {

            int index = sift(a, low, high);
            quickSort(a, low, index - 1);

            quickSort(a, index + 1, high);

        }
    }

    public static int sift(int[] a, int low, int high) {
        int temp = a[low];
        while (low < high) {
            while (low < high && a[high] > temp)
                high--;
            a[low] = a[high];
            while (low < high && a[low] < temp)
                low++;
            a[high] = a[low];
        }
        a[low] = temp;

        return low;
    }

}
