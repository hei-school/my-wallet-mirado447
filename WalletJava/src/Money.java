import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Money {
    private double money;
    private double saving;
    private List<Transaction> transactions;

    Scanner scanner = new Scanner(System.in);

    public Money(){
        this.money = 0;
        this.transactions = new ArrayList<>();
    }

    public void deposit(double amount){
        money = money + amount;
        transactions.add( new Transaction("Versement",amount));
        System.out.println("Versement de "+ amount +" éffectué. Nouveau solde : "+ money + " Ariary");
    }

    public void withdraw(double amount){
        if(money >= amount){
            money -= amount;
            transactions.add(new Transaction("Retrait", amount));
            System.out.println("Retrait de "+ amount +" éffectué. Nouveau solde : "+ money + " Ariary" );
        }else{
            System.out.println("Solde insuffisant pour effectuer le retait");
        }
    }

    public void savingOperation(double amount){
        if(money >= amount){
            money -= amount;
            saving += amount;
            transactions.add(new Transaction("Epargne", amount));
            System.out.println("Epargne de "+ amount +" éffectué. Nouveau solde : "+ money + " Ariary" );
        }else{
            System.out.println("Solde insuffisant pour effectuer l'épargne");
        }
    }

    public void transactionHistoty(){
        System.out.println("\nHistoriaue des transactions : ");
        for(Transaction transaction : transactions){
            System.out.println(transaction.type + " de " + transaction.amount);
        }
        System.out.println("Solde final : " + money + " Ariary");
        System.out.println("Argent epargné : " + saving + " Ariary" );
    }

    public void currencyConversion(double currency , double amount){
        double amountConverted;
        if(currency == 1){
            amountConverted = amount / 4582;
            System.out.println( amount + " Ariary en dollar : "+ amountConverted + " $ ");
        }if(currency == 2){
            amountConverted = amount / 4933;
            System.out.println( amount +" Ariary en Euro : "+ amountConverted + " € " );
        }if(currency == 3){
            amountConverted = amount / 31;
            System.out.println( amount +"Ariary en Yen : "+ amountConverted + " ¥ ");
        }
    }

    public void operations(){
        boolean exit = false;
        
        while (!exit) {
            System.out.println("\nChoisiser l'operation à effectuer : \n1-Ajout \n2-Retrait \n3-Epargner \n4-Historique \n5-Devise \n6-Quiter" );
            double option = scanner.nextDouble();
            if (option == 1) {
                System.out.println("Veuillez saisir le montant à ajouter : ");
                double amountAdd = scanner.nextDouble();
                deposit(amountAdd);
            }
            if (option == 2) {
                System.out.println("Veuillez saisir le montant à retirer : ");
                double amountGet = scanner.nextDouble();
                withdraw(amountGet);
            }if (option == 3) {
                System.out.println("Veuillez saisir le montant à épargner : ");
                double amount = scanner.nextDouble();
                savingOperation(amount);
            }if (option == 4) {
                transactionHistoty();
            }if (option == 5) {
                System.out.println("Veuillez choisir la devise : \n1-dollar \n2-Euro \n3-Yen ");
                double device = scanner.nextDouble();
                System.out.println("Veuillez saisir le monatant à convertire : ");
                double amount = scanner.nextDouble();
                currencyConversion(device, amount);
            }if (option == 6) {
                exit = true;
            }
        }
    }

}
