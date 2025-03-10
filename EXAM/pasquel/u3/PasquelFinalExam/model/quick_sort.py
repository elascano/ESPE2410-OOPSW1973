def quick_sort(new_array):
    if len(new_array) <= 1:
        return new_array
    pivot = new_array[len(new_array) // 2]
    left = [x for x in new_array if x < pivot]
    middle = [x for x in new_array if x == pivot]
    right = [x for x in new_array if x > pivot]
    return quick_sort(left) + middle + quick_sort(right)
