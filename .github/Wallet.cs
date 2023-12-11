using System;
using System.Collections.Generic;

public class Wallet
{
    private double money;
    private double saving;
    private List<(string type, double amount)> transactions;

    public Wallet()
    {
        money = 0;
        saving = 0;
        transactions = new List<(string type, double amount)>();
    }

    public void Deposit(double amount)
    {
        money += amount;
        transactions.Add(("Deposit", amount));
        Console.WriteLine($"Deposit of {amount} done. New balance: {money} Ariary");
    }

    public void Withdraw(double amount)
    {
        if (money >= amount)
        {
            money -= amount;
            transactions.Add(("Withdrawal", amount));
            Console.WriteLine($"Withdrawal of {amount} done. New balance: {money} Ariary");
        }
        else
        {
            Console.WriteLine("Insufficient funds to make the withdrawal");
        }
    }

    public void SavingOperation(double amount)
    {
        if (money >= amount)
        {
            money -= amount;
            saving += amount;
            transactions.Add(("Saving", amount));
            Console.WriteLine($"Saving of {amount} done. New balance: {money} Ariary");
        }
        else
        {
            Console.WriteLine("Insufficient funds to make the saving");
        }
    }

    public void TransactionHistory()
    {
        Console.WriteLine("\nTransaction history: ");
        foreach (var transaction in transactions)
        {
            Console.WriteLine($"{transaction.type} of {transaction.amount}");
        }
        Console.WriteLine($"Final balance: {money} Ariary");
        Console.WriteLine($"Saved money: {saving} Ariary");
    }

    public void CurrencyConversion(double currency, double amount)
    {
        double amountConverted = 0;
        if (currency == 1)
        {
            amountConverted = amount / 4582;
            Console.WriteLine($"{amount} Ariary in dollars: {amountConverted} $");
        }
        else if (currency == 2)
        {
            amountConverted = amount / 4933;
            Console.WriteLine($"{amount} Ariary in Euro: {amountConverted} €");
        }
        else if (currency == 3)
        {
            amountConverted = amount / 31;
            Console.WriteLine($"{amount} Ariary in Yen: {amountConverted} ¥");
        }
    }

    public void Operations()
    {
        bool exit = false;

        while (!exit)
        {
            Console.WriteLine("\nChoose the operation to perform: \n1-Deposit \n2-Withdrawal \n3-Save \n4-History \n5-Currency Conversion \n6-Exit");
            double option;
            if (double.TryParse(Console.ReadLine(), out option))
            {
                switch (option)
                {
                    case 1:
                        Console.WriteLine("Enter the amount to deposit: ");
                        double depositAmount;
                        if (double.TryParse(Console.ReadLine(), out depositAmount))
                        {
                            Deposit(depositAmount);
                        }
                        else
                        {
                            Console.WriteLine("Invalid input. Please enter a valid number.");
                        }
                        break;
                    case 2:
                        Console.WriteLine("Enter the amount to withdraw: ");
                        double withdrawalAmount;
                        if (double.TryParse(Console.ReadLine(), out withdrawalAmount))
                        {
                            Withdraw(withdrawalAmount);
                        }
                        else
                        {
                            Console.WriteLine("Invalid input. Please enter a valid number.");
                        }
                        break;
                    case 3:
                        Console.WriteLine("Enter the amount to save: ");
                        double savingAmount;
                        if (double.TryParse(Console.ReadLine(), out savingAmount))
                        {
                            SavingOperation(savingAmount);
                        }
                        else
                        {
                            Console.WriteLine("Invalid input. Please enter a valid number.");
                        }
                        break;
                    case 4:
                        TransactionHistory();
                        break;
                    case 5:
                        Console.WriteLine("Choose the currency: \n1-Dollar \n2-Euro \n3-Yen ");
                        double currencyType;
                        if (double.TryParse(Console.ReadLine(), out currencyType))
                        {
                            Console.WriteLine("Enter the amount to convert: ");
                            double conversionAmount;
                            if (double.TryParse(Console.ReadLine(), out conversionAmount))
                            {
                                CurrencyConversion(currencyType, conversionAmount);
                            }
                            else
                            {
                                Console.WriteLine("Invalid input. Please enter a valid number.");
                            }
                        }
                        else
                        {
                            Console.WriteLine("Invalid input. Please enter a valid number.");
                        }
                        break;
                    case 6:
                        exit = true;
                        break;
                    default:
                        Console.WriteLine("Invalid choice. Please choose a valid option.");
                        break;
                }
            }
            else
            {
                Console.WriteLine("Invalid input. Please enter a valid number.");
            }
        }
    }
}

class Program
{
    static void Main()
    {
        Wallet wallet = new Wallet();
        wallet.Operations();
    }
}