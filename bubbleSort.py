def bubbleSort(arr):
    n = len(arr)

    for i in range(n):
        swapped = False
        for j in range(0, n - 1 - i):
            # print(arr)
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]
                swapped = True

        if swapped == False:
            break


arr = [90, 64, 25, 34, 22, 11]

bubbleSort(arr)

print(*arr)