import java.util.*;

class BucketSort {
    static void bucketSort(float arr[], int n)
    {
        if (n <= 0)
            return;
 
        // 1) Create n empty buckets
        @SuppressWarnings("unchecked")
        Vector<Float>[] buckets = new Vector[n];
 
        for (int i = 0; i < n; i++) {
            buckets[i] = new Vector<Float>();
        }
 
        // 2) Put array elements in different buckets
        for (int i = 0; i < n; i++) {
            float idx = arr[i] * n;
            buckets[(int)idx].add(arr[i]);
        }
 
        // 3) Sort individual buckets
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }
 
        // 4) Concatenate all buckets into arr[]
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                arr[index++] = buckets[i].get(j);
            }
        }
    }

    public static void main(String args[])
    {
        float arr[] = { 0.897f, 0.565f, 0.656f, 0.1234f, 0.665f, 0.3434f };
 
        int n = arr.length;
        bucketSort(arr, n);
 
        for (float el : arr) 
            System.out.print(el + " ");
    
    }
}
