class Wallet:
    def __init__(self):
        self.money = 0
        self.saving = 0
        self.transactions = []

    def deposit(self, amount):
        self.money += amount
        self.transactions.append(("Deposit", amount))
        print(f"Deposit of {amount} done. New balance: {self.money} Ariary")

    def withdraw(self, amount):
        if self.money >= amount:
            self.money -= amount
            self.transactions.append(("Withdrawal", amount))
            print(f"Withdrawal of {amount} done. New balance: {self.money} Ariary")
        else:
            print("Insufficient funds to make the withdrawal")

    def saving_operation(self, amount):
        if self.money >= amount:
            self.money -= amount
            self.saving += amount
            self.transactions.append(("Saving", amount))
            print(f"Saving of {amount} done. New balance: {self.money} Ariary")
        else:
            print("Insufficient funds to make the saving")

    def transaction_history(self):
        print("\nTransaction history: ")
        for transaction in self.transactions:
            print(f"{transaction[0]} of {transaction[1]}")
        print(f"Final balance: {self.money} Ariary")
        print(f"Saved money: {self.saving} Ariary")

    def currency_conversion(self, currency, amount):
        amount_converted = 0
        if currency == 1:
            amount_converted = amount / 4582
            print(f"{amount} Ariary in dollars: {amount_converted} $")
        elif currency == 2:
            amount_converted = amount / 4933
            print(f"{amount} Ariary in Euro: {amount_converted} €")
        elif currency == 3:
            amount_converted = amount / 31
            print(f"{amount} Ariary in Yen: {amount_converted} ¥")

    def operations(self):
        exit_flag = False
        while not exit_flag:
            print("\nChoose the operation to perform: \n1-Deposit \n2-Withdrawal \n3-Save \n4-History \n5-Currency Conversion \n6-Exit")
            option = int(input("Enter your choice: "))
            if option == 1:
                deposit_amount = float(input("Enter the amount to deposit: "))
                self.deposit(deposit_amount)
            elif option == 2:
                withdrawal_amount = float(input("Enter the amount to withdraw: "))
                self.withdraw(withdrawal_amount)
            elif option == 3:
                saving_amount = float(input("Enter the amount to save: "))
                self.saving_operation(saving_amount)
            elif option == 4:
                self.transaction_history()
            elif option == 5:
                currency_type = int(input("Choose the currency: \n1-Dollar \n2-Euro \n3-Yen "))
                conversion_amount = float(input("Enter the amount to convert: "))
                self.currency_conversion(currency_type, conversion_amount)
            elif option == 6:
                exit_flag = True
            else:
                print("Invalid choice. Please choose a valid option.")


wallet = Wallet()
wallet.operations()