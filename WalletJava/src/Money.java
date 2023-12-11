import java.util.Scanner;

public class Money {
    
    private double money;

    Scanner scanner = new Scanner(System.in);

    public Money(){
        this.money = 0;
    }

    public void deposit(double amount){
        money = money + amount;
        System.out.println("Versement de "+ amount +" éffectué. Nouveau solde : "+ money + " Ariary");
    }

    public void withdraw(double amount){
        if(money >= amount){
            money -= amount;
            System.out.println("Retrait de "+ amount +" éffectué. Nouveau solde : "+ money + " Ariary" );
        }else{
            System.out.println("Solde insuffisant pour effectuer le retait. Votre solde est : "+ money + "Ariary");
        }
    }

    public void totalAmount(){
        System.out.println("Votre solde est : "+ money + "Ariary");
    }

}