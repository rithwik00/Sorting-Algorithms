def insertion():
    n = len(arr)

    for i in range(1, n):
        current = arr[i]
        j = i - 1

        while j >= 0 and current < arr[j]:
            arr[j + 1] = arr[j]
            j -= 1

        arr[j + 1] = current
        
        
arr = [90, 64, 25, 34, 22, 11]

insertion()

print(*arr)