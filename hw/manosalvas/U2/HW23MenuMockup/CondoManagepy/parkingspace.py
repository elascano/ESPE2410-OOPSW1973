
class ParkingSpace:
    def __init__(self, budget_id="", year=0, total_fee_collected=0.0, maintenance_fund=0.0, monthly_fee=0.0, balance=0.0, description=""):
        self.budget_id = budget_id
        self.year = year
        self.total_fee_collected = total_fee_collected
        self.maintenance_fund = maintenance_fund
        self.monthly_fee = monthly_fee
        self.balance = balance
        self.description = description