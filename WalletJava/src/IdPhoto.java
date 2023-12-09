public class IdPhoto implements Show{
    int id;
    String owner;

    public IdPhoto(int id, String owner){
        this.id = id ;
        this.owner = owner;
    }

    @Override
    public void show() {
        System.out.println("Propriétaire : " + this.owner);
    }
}
