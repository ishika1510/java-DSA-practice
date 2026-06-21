public class SelectionSortFunction {

    // selection sort function
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i <= n - 2; i++) {
            int min = i;

            for (int j = i ; j <= n-1; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            // swap
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    // main function
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        selectionSort(arr);  // function call

        // print sorted array
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}