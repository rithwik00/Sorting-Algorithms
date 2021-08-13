class InsertionSort {
    void sort(int arr[]) {
        int n = arr.length;

        for(int i = 1; i < n; i++) {
            int current = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = current;
        }
    }

    static void printArr(int[] arr) {
        var n = arr.length;
        for(var i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {12,11,13,5,6};
        InsertionSort ob = new InsertionSort();
        ob.sort(arr);
        printArr(arr);
    }
}