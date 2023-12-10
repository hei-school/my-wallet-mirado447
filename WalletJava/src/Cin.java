public class Cin implements Show {
    int id;
    String cinNumber;
    String owner;
    
    public Cin(String cinNumber, String owner, int id){
        this.cinNumber = cinNumber;
        this.owner = owner;
        this.id = id;
    }

    @Override
    public void show() {
        System.out.println("CIN ID : " + this.id );
        System.out.println("Numero de CIN : " + this.cinNumber);
        System.out.println("Propriétaire : " + this.owner);
    }

}