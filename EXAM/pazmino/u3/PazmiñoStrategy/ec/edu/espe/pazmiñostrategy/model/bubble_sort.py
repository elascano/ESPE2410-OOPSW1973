class BubbleSort:
    
    def sort(self, data):
        if data is None or len(data) < 2:
            return data

        size = len(data)
        for i in range(size - 1):
            swapped = False
            for j in range(size - i - 1):
                if data[j] > data[j + 1]:
                    data[j], data[j + 1] = data[j + 1], data[j]
                    swapped = True
            if not swapped:
                break

        return data
