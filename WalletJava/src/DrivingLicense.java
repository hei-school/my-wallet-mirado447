public class DrivingLicense implements Show{
    int id;
    String owner;
    String type;

    public DrivingLicense(String owner, String type ,int id){
        this.owner = owner;
        this.type = type;
        this.id = id; 
    }

    @Override
    public void show() {
        System.out.println("ID de permis de conduire : " + this.id);
        System.out.println("Propriétaire : " + this.owner);
        System.out.println("Permis de type : " + this.type);
    }
}
