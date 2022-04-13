import java.util.Scanner;
public class Programme8 {
  public static void main(String[] args) {
    Scanner clavier = new Scanner(System.in);

    int nbre = 0;
    System.out.println("entrez un nombre svp:");
    nbre = clavier.nextInt();
    for(int i = 0; i<=nbre; i++){
       System.out.println(i+1);
    }
  }  
}
