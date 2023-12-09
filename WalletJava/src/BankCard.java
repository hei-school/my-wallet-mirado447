public class BankCard implements Show {
    String owner;
    String bank;

    public BankCard(String owner, String bank){
        this.owner = owner;
        this.bank = bank;
    }

    @Override
    public void show() {
        System.out.println("Propriétaire : " + this.owner);
        System.out.println("Banque : " + this.bank);
    }
    
}
