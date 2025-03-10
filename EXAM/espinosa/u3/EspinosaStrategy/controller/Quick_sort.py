import Sorting_strategy

class Quick_sort(Sorting_strategy):

    def __init__ (self):
        self.self = self
        
    
    def Sort(self, mylist):
        less = []
        equal = []
        greater = []
        if len(mylist) > 1:
            pivot = mylist[0]
            for x in mylist:
                if x < pivot:
                    less.append(x)
                if x == pivot:
                    equal.append(x)
                if x > pivot:
                    greater.append(x)
            return self.Sort(less) + equal + self.Sort(greater) 
        else:
            return mylist

