def insertion_sort(new_array):
    for i in range(1, len(new_array)):
        key = new_array[i]
        j = i - 1
        while j >= 0 and new_array[j] > key:
            new_array[j + 1] = new_array[j]
            j -= 1
        new_array[j + 1] = key
    return new_array
