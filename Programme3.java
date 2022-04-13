import java.util.Scanner;
public class Programme3 {
     public static void main(String[] args) {
         System.out.println("saisir le premier nombre");
         Scanner nombre1=new Scanner(System.in);
         int n=nombre1.nextInt();

         System.out.println("saisir le deuxième nombre");
         Scanner nombre2=new Scanner(System.in);
         int m=nombre2.nextInt();
         
         int resultat = n- m;
         System.out.println("La difference de"+ n + "et de" + m + "est :" +resultat );
        
    }
    
}
