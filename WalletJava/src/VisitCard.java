public class VisitCard implements Show {
    String societyName;
    String owner;

    public VisitCard(String societyName, String owner){
        this.societyName = societyName;
        this.owner = owner;
    }

    @Override
    public void show() {
        System.out.println("Propriétaire : " + this.owner);
        System.out.println("Carte de viste de " + this.societyName );
    }
}
