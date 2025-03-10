import Sorting_strategy

class Insertion_sort(Sorting_strategy):

    def __init__ (self):
        self
        
    def Sort(mylist):
        '''
        Time complexity: O(n)
        worst case : n*n
        Space Complexity :o(1)
        :param mylist:
        :return:
        '''
        for i in range(1,len(mylist)):
            if mylist[i-1] > mylist[i]:
                for j in range(0,i):
                    if mylist[j] > mylist[i]:
                        mylist[i],mylist[j] =mylist[j],mylist[i]
            return mylist