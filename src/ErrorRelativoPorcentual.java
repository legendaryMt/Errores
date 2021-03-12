
package errores;
import static java.lang.Math.abs;
import java.util.Scanner;
public class Errores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
   int a,b;
     System.out.println("Ingrese el valor real");
     a=teclado.nextInt();
     System.out.println("Ingrese el valor aproximado");
     b=teclado.nextInt();
     errores1 e1 = new errores1(a,b);
     System.out.println("El valor real es "+a+" y el aproximado es "+b);
     System.out.println("El error absoluto es: "+e1.ErrorA());
     System.out.println("El error relativo es: "+e1.ErrorR());
     System.out.println("El error relativo porcentual es es: "+e1.ErrorRP()+"%");

    }
    }
 
    
class errores1 {
private int valorReal, valorAproximado;
double e,e_abs,er,er_abs,erp,erp_abs;

public errores1 (int a, int b){
valorReal=a;
valorAproximado=b;
}
public double ErrorA(){
    e=(valorReal-valorAproximado);
    e_abs= abs(e);
  return e_abs;  
}
public double ErrorR(){
er=e/valorReal;
er_abs= abs(er);
return er_abs;
}
public double ErrorRP(){
erp=er*100;
erp_abs = abs(erp);
return erp_abs;
}
}
