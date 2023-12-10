public class BankCard implements Show {
    int id;
    String owner;
    String bank;

    public BankCard(String owner, String bank , int id ){
        this.owner = owner;
        this.bank = bank;
        this.id = id ;
    }

    @Override
    public void show() {
        System.out.println("ID de la carte bancaire : " + this.id);
        System.out.println("Propriétaire : " + this.owner);
        System.out.println("Banque : " + this.bank);
    }
    
}
