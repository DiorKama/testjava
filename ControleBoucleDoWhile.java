import java.util.Scanner;
public class ControleBoucleDoWhile {
    public static void main(String[] args) { 
        int nbre = 1;
        do{
            Scanner clavier = new Scanner(System.in);
            System.out.println("entrez un nombre svp:");
            nbre = clavier.nextInt();
        }
        while( nbre <0);

        System.out.println("le nombre que vous avez entré est :"+nbre);
  
  }
}
