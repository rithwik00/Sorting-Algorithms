def bubbleSort(arr, n):
    if n == 1:
        return
    
    for i in range(n - 1):
        if arr[i] > arr[i + 1]:
            arr[i], arr[i + 1] = arr[i + 1], arr[i]

    bubbleSort(arr, n - 1)

arr = [90, 64, 25, 34, 22, 11]
n = len(arr)
bubbleSort(arr, n)

print(*arr)