from sorting_strategies import SortingStrategy

class SortingContext:
    def __init__(self, strategy: SortingStrategy):
        self.strategy = strategy
    
    def set_strategy(self, strategy: SortingStrategy):
        self.strategy = strategy
    
    def sort(self, data):
        return self.strategy.sort(data)