
import java.util.Scanner;


public class EJERCICIO01 {

    public static void main(String[] args) {
    
       Scanner input = new Scanner(System.in);
        int num,num2,producto=0;
        
        System.out.println("INGRESE NUMERO A MULTIPLICAR");
        num=input.nextInt();        
        System.out.println("INGRESE NUMERO A MULPLICADOR");
        num2=input.nextInt();
        for(int x=num2;num2>0;num2--)
        {
            producto=producto+num;
        
        }
        System.out.println("EL PRODUCTO ES: "+producto);
    }
    
}
