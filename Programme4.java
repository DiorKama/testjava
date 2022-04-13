import java.util.Scanner;
public class Programme4 {
     public static void main(String[] args) {
         System.out.println("saisir le premier nombre");
         Scanner nombre1=new Scanner(System.in);
         float n=nombre1.nextInt();

         System.out.println("saisir le deuxième nombre");
         Scanner nombre2=new Scanner(System.in);
         float m=nombre2.nextInt();
         
         float resultat = n / m ;
         System.out.println("La division de"+ n + "et de" + m + "est :" +resultat );
        
    }
    
}