import java.util.Scanner;
public class Programme6 {
     public static void main(String[] args) {
         System.out.println("saisir le premier nombre");
         Scanner nombre1=new Scanner(System.in);
         int n=nombre1.nextInt();

         System.out.println("saisir le deuxième nombre");
         Scanner nombre2=new Scanner(System.in);
         int m=nombre2.nextInt();

         System.out.println("saisir le troisième nombre");
         Scanner nombre3=new Scanner(System.in);
         int p=nombre3.nextInt();

         System.out.println("saisir le quatrième nombre");
         Scanner nombre4=new Scanner(System.in);
         int s=nombre4.nextInt();

         System.out.println("saisir le cinquième nombre");
         Scanner nombre5=new Scanner(System.in);
         int t=nombre5.nextInt() ;

         if(n >0 && m >0 && p >0 && s >0 && t >0){

            int resultat = (n+ m + p + s + t)/5;
            System.out.println("La moyenne des nombres est :" +resultat );
         }else{
             System.out.println("saisir des valeurs positifs");
         }
         
        
    }
    
}
