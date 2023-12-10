public class IdPhoto implements Show{
    int id;
    String owner;

    public IdPhoto(String owner, int id){
        this.id = id ;
        this.owner = owner;
    }

    @Override
    public void show() {
        System.out.println("ID de photo d'identitée : "+ this.id);
        System.out.println("Propriétaire : " + this.owner);
    }
}