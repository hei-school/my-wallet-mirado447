import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Wallet implements Show {

    private String ownerName;
    private String[] listPlace = {"CIN","Carte bancaire","Carte de visite","Permis De Conduire","Photo d'identitée","Argent"};
    private ArrayList<Cin> cinList = new ArrayList<>(5);
    private ArrayList<BankCard> bankCardList = new ArrayList<>(5);
    private ArrayList<DrivingLicense> drivingLicenseList = new ArrayList<>(5);
    private ArrayList<VisitCard> visitCardList = new ArrayList<>(5);
    private ArrayList<IdPhoto> idPhotoList = new ArrayList<>(10);
    private Money money;

    private Boolean exit = false;
    Scanner scanner = new Scanner(System.in);

    public Wallet(String ownerName){
        this.ownerName = ownerName; 
    }

    @Override
    public void show() {
        System.out.println("Ce portefeuilleest sous le nom de " + ownerName);
    }

    public void showPlace(){
        for (String place : listPlace) {
            System.out.println(place);
        }
    }
    
    public void espacePlace(){
        System.out.println("L'éspace libre pour CIN est " + (5 - cinList.size()));
        System.out.println("L'éspace libre pour carte bancaire est " + (5 - bankCardList.size()));
        System.out.println("L'éspace libre pour carte de visite est " + (5 - visitCardList.size()));
        System.out.println("L'éspace libre pour permis de conduire est " + (5 - drivingLicenseList.size()));
        System.out.println("L'éspace libre pour photo d'identitée est " + (5 - idPhotoList.size()));
    }

    public void addCin(Cin cin){
        if (cinList.size() < 5) {
            cinList.add(cin);
            System.out.println("L'objet à été ajouter avec succès.\nNombre de place de CIN restante : " + (5 - cinList.size()) );
        }else{
            System.out.println("La taille limite est atteinte. Impossible d'ajouter l'élement.");
        }
    }

    public void getCin(int id){
        Iterator<Cin> iterator = cinList.iterator();
        while (iterator.hasNext()) {
            Cin cin = iterator.next();
            if (cin.id == id) {
                iterator.remove();
                System.out.println("Vous avez pris le CIN : " + cin.cinNumber + "\nNombre de CIN restante : " + cinList.size() );
            }
        }
    }

     public void addBankCard(BankCard bankCard){
        if (bankCardList.size() < 5) {
            bankCardList.add(bankCard);
            System.out.println("L'objet à été ajouter avec succès.\nNombre de place de carte bancaire restante : " + (5 - bankCardList.size()));
        }else{
            System.out.println("La taille limite est atteinte. Impossible d'ajouter l'élement.");
        }
    }

    public void getBankCard(int id){
        Iterator<BankCard> iterator = bankCardList.iterator();
        while (iterator.hasNext()) {
            BankCard bankCard = iterator.next();
            if (bankCard.id == id) {
                iterator.remove();
                System.out.println("Vous avez pris le Carte bancaire de : " + bankCard.bank + "\nNombre de carte bancaire restante : " + bankCardList.size());
            }
        }
    }

    public void addVisitCard(VisitCard visitCard){
        if (visitCardList.size() < 5) {
            visitCardList.add(visitCard);
            System.out.println("L'objet à été ajouter avec succès.\nNombre de place de carte de visite restante : " + ( 5 - visitCardList.size()));
        }else{
            System.out.println("La taille limite est atteinte. Impossible d'ajouter l'élement.");
        }
    }

    public void getVisiteCard(int id){
        Iterator<VisitCard> iterator = visitCardList.iterator();
        while (iterator.hasNext()) {
            VisitCard visitCard = iterator.next();
            if (visitCard.id == id) {
                iterator.remove();
                System.out.println("Vous avez pris la Carte de visite de : " + visitCard.societyName + "\nNombre de carte de visite restante : " + visitCardList.size());
            }
        }
    }

    public void addDrivingLicense(DrivingLicense drivingLicense){
        if (drivingLicenseList.size() < 5) {
            drivingLicenseList.add(drivingLicense);
            System.out.println("L'objet à été ajouter avec succès.Nombre de place de permis de conduire restante : " + (5 - drivingLicenseList.size()));
        }else{
            System.out.println("La taille limite est atteinte. Impossible d'ajouter l'élement.");
        }
    }

    public void getDrivingLicense(int id){
        Iterator<DrivingLicense> iterator = drivingLicenseList.iterator();
        while (iterator.hasNext()) {
            DrivingLicense drivingLicense = iterator.next();
            if (drivingLicense.id == id) {
                iterator.remove();
                System.out.println("Vous avez pris le permis de conduire." + "\nNombre de permis de conduire restant : " + drivingLicenseList.size());
            }
        }
    }

    public void addIdPhoto(IdPhoto idPhoto){
        if (idPhotoList.size() < 10) {
            idPhotoList.add(idPhoto);
            System.out.println("L'objet à été ajouter avec succès.Nombre de place de Photo d'identitée restante : " + (10 - idPhotoList.size()));
        }else{
            System.out.println("La taille limite est atteinte. Impossible d'ajouter l'élement.");
        }
    }

    public void getIdPhoto(int id){
        Iterator<IdPhoto> iterator = idPhotoList.iterator();
        while (iterator.hasNext()) {
            IdPhoto idPhoto = iterator.next();
            if (idPhoto.id == id) {
                iterator.remove();
                System.out.println("Vous avez pris la photo d'identitée de " + idPhoto.owner + "\nNombre de photo d'identitée restante : " + idPhotoList.size());
            }
        }
    }

    public void operation(){
        int option;
        while (!exit) {
            System.out.println("Bienvenue"+ ownerName +", votre portefeuille à été crée avec succès.\nVoici les action que vous pouvez éffectuer avec: \n1-Regarder ces informations \n2-Regarder les places \n3-Regarder l'éspace restant\n4-Faire de operation");
            
        }
    }

}
