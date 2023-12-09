public class DrivingLicense implements Show{
    String owner;
    String type;

    public DrivingLicense(String owner, String type){
        this.owner = owner;
        this.type = type;
    }

    @Override
    public void show() {
        System.out.println("Propriétaire : " + this.owner);
        System.out.println("Permis de type : " + this.type);
    }
}
