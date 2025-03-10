def bubble_sort(new_array):
    n = len(new_array)
    for i in range(n):
        swapped = False
        for j in range(0, n - i - 1):
            if new_array[j] > new_array[j + 1]:
                new_array[j], new_array[j + 1] = new_array[j + 1], new_array[j]
                swapped = True
        if not swapped:
            break
    return new_array
