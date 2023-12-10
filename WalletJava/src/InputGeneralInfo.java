import java.util.Scanner;

public class InputGeneralInfo {
    
    Scanner scannerId = new Scanner(System.in);
    Scanner scannerOwner = new Scanner(System.in);
    Scanner scannerOther = new Scanner(System.in);

    public InputGeneralInfo(){}

    public int id(){
        System.out.println("Veuillez saisir l'ID de l'objet : ");
        int id = scannerId.nextInt();
        return id;
    }

    public String ownerName(){
        System.out.println("Veuillez saisir le propriétaire de l'objet : ");
        String ownerName = scannerOwner.nextLine();
        return ownerName;
    }

    public String otherInfo(){
        String otherInfo = scannerOther.nextLine();
        return otherInfo;
    }
    
}