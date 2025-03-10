from model.bubble_sort import bubble_sort
from model.insertion_sort import insertion_sort
from model.quick_sort import quick_sort

def decide_sort(new_array):
    if len(new_array) <= 5:
        return bubble_sort(new_array), "Bubble Sort"
    elif len(new_array) <= 10:
        return insertion_sort(new_array), "Insertion Sort"
    else:
        return quick_sort(new_array), "Quick Sort"
