public class Cin implements Show {
    String cinNumber;
    String owner;
    
    public Cin(String cinNumber, String owner){
        this.cinNumber = cinNumber;
        this.owner = owner;
    }

    @Override
    public void show() {
        System.out.println("Numero de CIN : " + this.cinNumber);
        System.out.println("Propriétaire : " + this.owner);
    }

}
