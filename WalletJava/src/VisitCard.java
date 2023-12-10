public class VisitCard implements Show {
    int id;
    String societyName;
    String owner;

    public VisitCard(String societyName, String owner , int id){
        this.societyName = societyName;
        this.owner = owner;
        this.id = id;
    }

    @Override
    public void show() {
        System.out.println("ID de la carte de visite : " + this.id);
        System.out.println("Propriétaire : " + this.owner);
        System.out.println("Carte de viste de " + this.societyName );
    }
}