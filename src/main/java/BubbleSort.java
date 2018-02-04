//冒泡排序：比较两个相邻的数据，如果大于就交换位置
public class BubbleSort {
    public static void main(String[] arge) {
        int[] a = {
                7, 0, 5, 4, 9, 3, 6, 2, 8, 1
        };

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();

        bubbleSort(a);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();

    }

    public static void bubbleSort(int[] a) {

        int temp = 0;

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

    }

}
