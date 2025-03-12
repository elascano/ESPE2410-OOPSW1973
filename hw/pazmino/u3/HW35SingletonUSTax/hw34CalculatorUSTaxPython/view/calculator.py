from model.us_tax import USTax

def main():
    tax = USTax.get_instance()
    subtotal = 10.0
    total = tax.sales_total(subtotal)
    print(f"The total is --> {total}")

    new_tax_instance = USTax(0.14)
    total = new_tax_instance.sales_total(subtotal)
    print(f"The total IVA is --> {total}%")

if __name__ == "__main__":
    main()
