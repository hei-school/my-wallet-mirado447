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
        System.out.println("Portefeuille de " + this.ownerName);
    }

    public void showPlace(){
        System.out.println("Il y a des place pour :");
        for (String place : listPlace) {
            System.out.println(place);
        }
    }
    
    public void cinShow(){
        if (cinList.size() != 0) {
            for (Cin cin : cinList) {
            cin.show();
        }
        }else{
            System.out.println("La place de CIN est vide.");
        }
    }

    public void bankCardShow(){
        if (bankCardList.size() != 0) {
            for (BankCard bankCard : bankCardList) {
            bankCard.show();
        }
        }else{
            System.out.println("La place de carte banquaire est vide.");
        }
    }

    public void visitCardShow(){
        if (visitCardList.size() != 0) {
            for (VisitCard visitCard : visitCardList ) {
            visitCard.show();
        }
        }else{
            System.out.println("La place de photo d'identitée est vide.");
        }
    }

    public void drivingLicenseShow(){
        if (drivingLicenseList.size() != 0) {
            for (DrivingLicense drivingLicense : drivingLicenseList) {
            drivingLicense.show();
        }
        }else{
            System.out.println("La place de permis de conduire est vide.");
        }
    }

    public void IdPhotoShow(){
        if (idPhotoList.size() != 0) {
            for (IdPhoto idPhoto : idPhotoList) {
            idPhoto.show();
        }
        }else{
            System.out.println("La place de photo d'identitée est vide.");
        }
    }

    public void espacePlace(){
        System.out.println("L'éspace libre pour CIN est " + (5 - cinList.size()));
        System.out.println("L'éspace libre pour carte bancaire est " + (5 - bankCardList.size()));
        System.out.println("L'éspace libre pour carte de visite est " + (5 - visitCardList.size()));
        System.out.println("L'éspace libre pour permis de conduire est " + (5 - drivingLicenseList.size()));
        System.out.println("L'éspace libre pour photo d'identitée est " + (10 - idPhotoList.size()));
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

    public void simulation(){
        String optionActions = "\n1-Regarder \n2-Entrer \n3-Sortir";
        System.out.println("Bienvenue "+ ownerName +", votre portefeuille à été crée avec succès.");
        while (!exit) {
            
            System.out.println("\nVoici les action que vous pouvez éffectuer : \n1-Regarder ces informations \n2-Regarder les places \n3-Regarder l'éspace restant\n4-Faire des operations \n5-Quiter");
            int option = scanner.nextInt();
            
                if (option == 1){
                    show();
                }
                if (option == 2) {
                    showPlace();
                }
                if (option == 3) {
                    espacePlace();
                }
                if (option == 4 ) {
                    while (!exit) {
                        
                        System.out.println("Veuillez selectionner l'objet sur lequel vous voulez faire des operation : \n1-CIN \n2-Carte bancaire \n3-Carte de visite \n4-Permis De Conduire \n5-Photo d'identitée \n6-Argent \n7-Quiter");
                        
                        InputGeneralInfo input = new InputGeneralInfo();

                        int optionOperation = scanner.nextInt();   //les differents option 
                        
                        if (optionOperation == 1) { 
                            System.out.println(optionActions);
                            int optionAction = scanner.nextInt();  //les actions à faire sur l'option choisi
                            if (optionAction == 1) {  //regarder 
                                cinShow();
                            }
                            if (optionAction == 2) {  //entrer
                                int id = input.id();
                                String ownerName = input.ownerName();
                                System.out.println("Veuillez saisir le numero du CIN :");
                                String cinNumber = input.otherInfo();
                                Cin cin = new Cin(cinNumber, ownerName, id );
                                addCin(cin);
                            }
                            if (optionAction == 3) {
                                int id = input.id();
                                getCin(id);
                            }
                        }
                        if (optionOperation == 2) {
                            System.out.println(optionActions);
                            int optionAction = scanner.nextInt();  //les actions à faire sur l'option choisi
                            if (optionAction == 1) {  //regarder 
                                bankCardShow();
                            }
                            if (optionAction == 2) {  //entrer
                                int id = input.id();
                                String ownerName = input.ownerName();
                                System.out.println("Veuillez saisir le nom de la banque :");
                                String bank = input.otherInfo();
                                BankCard bankCard = new BankCard(ownerName, bank, id );
                                addBankCard(bankCard);
                            }
                            if (optionAction == 3) {
                                int id = input.id();
                                getBankCard(id);
                            }
                        }
                        if (optionOperation == 3) {
                            System.out.println(optionActions);
                            int optionAction = scanner.nextInt();  //les actions à faire sur l'option choisi
                            if (optionAction == 1) {  //regarder 
                                visitCardShow();
                            }
                            if (optionAction == 2) {  //entrer
                                int id = input.id();
                                String ownerName = input.ownerName();
                                System.out.println("Veuillez saisir le nom de l'entreprise :");
                                String societyName = input.otherInfo();
                                VisitCard visitCard = new VisitCard(societyName, ownerName, id );
                                addVisitCard(visitCard);
                            }
                            if (optionAction == 3) {
                                int id = input.id();
                                getVisiteCard(id);
                            }
                        }
                        if (optionOperation == 4) {
                           System.out.println(optionActions);
                           int optionAction = scanner.nextInt();  //les actions à faire sur l'option choisi
                           if (optionAction == 1) {  //regarder 
                                drivingLicenseShow();
                            }
                            if (optionAction == 2) {  //entrer
                                int id = input.id();
                                String ownerName = input.ownerName();
                                System.out.println("Veuillez saisir le type de permis :");
                                String type = input.otherInfo();
                                DrivingLicense drivingLicense = new DrivingLicense(ownerName, type, id );
                                addDrivingLicense(drivingLicense);
                            }
                            if (optionAction == 3) {
                                int id = input.id();
                                getDrivingLicense(id);
                            } 
                        }
                        if (optionOperation == 5) {
                            System.out.println(optionActions);
                            int optionAction = scanner.nextInt();  //les actions à faire sur l'option choisi
                            if (optionAction == 1) {  //regarder 
                                IdPhotoShow();
                            }
                            if (optionAction == 2) {  //entrer
                                int id = input.id();
                                String ownerName = input.ownerName();
                                IdPhoto idPhoto = new IdPhoto(ownerName, id );
                                addIdPhoto(idPhoto);
                            }
                            if (optionAction == 3) {
                                int id = input.id();
                                getVisiteCard(id);
                            }
                        }
                        if (optionOperation == 6) {
                            System.out.println("Veuillez choisir l'action : \n1-Déposer \n2-Retirer \n3-Montant total");
                            int optionAction = scanner.nextInt();  //les actions à faire sur l'option choisi
                            if (optionAction == 1) {
                                System.out.println("Veuilles saisir le montant à ajouter : ");
                                Double amount = scanner.nextDouble();  
                                money.deposit(amount);
                            }
                            if (optionAction == 2) {  
                                System.out.println("Veuilles saisir le montant à retirer : ");
                                Double amount = scanner.nextDouble();
                                money.withdraw(amount);
                            }
                            if (optionAction == 3) {
                                money.totalAmount();
                            }
                            
                        }
                        if (optionOperation == 7) {
                            exit = true;
                        }
                    }
                }if (option == 5) {
                    exit = true;
                }
        }
    }

}


// afficher une phrase si  l'optieon entré n'existe pas (id , option , ...)
// resoudre le bug pour l'argent 