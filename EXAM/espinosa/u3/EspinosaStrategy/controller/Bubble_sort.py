import Sorting_strategy

class Bubble_sort(Sorting_strategy):

    def __init__ (self):
        self
        
    
    def Sort(mylist):
 
        for i in range(len(mylist)):
            for j in range(len(mylist)-1):
                if mylist[j+1] < mylist[j]:
                    mylist[j],mylist[j+1] = mylist[j+1],mylist[j]
        return mylist


