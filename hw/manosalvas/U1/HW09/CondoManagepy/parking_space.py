# parking_space.py
class ParkingSpace:
    def __init__(self, budget_id, year, total_fee_collected, maintenance_fund, monthly_fee, balance, description):
        self.budget_id = budget_id
        self.year = year
        self.total_fee_collected = total_fee_collected
        self.maintenance_fund = maintenance_fund
        self.monthly_fee = monthly_fee
        self.balance = balance
        self.description = description
    
    def __str__(self):
        return f"ParkingSpace(budget_id={self.budget_id}, year={self.year}, total_fee_collected={self.total_fee_collected}, maintenance_fund={self.maintenance_fund}, monthly_fee={self.monthly_fee}, balance={self.balance}, description={self.description})"
