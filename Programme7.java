import java.util.Scanner;

public class Programme7 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        int nbre = 0;
        System.out.println("entrez un nombre svp:");
        nbre = clavier.nextInt();
        if(nbre >0){
            System.out.println("le nombre entré est positif");
        }else if(nbre == 0){
            System.out.println("le nombre saisi est null");
        }else{
            System.out.println("le nombre saisi est négatif");
        }
    }
    
}

