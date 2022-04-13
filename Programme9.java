import java.util.Scanner;
public class Programme9 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

    double reel = 0.0;
    int nbre = 0;
    String str = "";

    System.out.println("entrez un reel svp:");
    reel = clavier.nextDouble();

    System.out.println("entrez un nombre svp:");
    nbre = clavier.nextInt();
    clavier.nextLine();

    System.out.println("entrez une chaine de caractère svp:");
    str = clavier.nextLine(); 

    System.out.println("reel = " +reel);
    System.out.println("entier = " +nbre);
    System.out.println("texte = " +str);
    }
}
