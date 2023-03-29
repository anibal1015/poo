package figurasgeometricas;
import java.util.Scanner;
public class ejecucion {
    public static void main(String[] args) {
        float lado, base, altura, radio;
        int cualquier, i=1;
        Scanner lectuScanner = new Scanner(System.in);


        do{
            
        System.out.println("DIGITE EL NUMERO, SEGUN LA FIGURA LA CUAL DESEE CALCULAR EL AREA");
        System.out.println("1 SI SU FIGURA ES RECTANGULO");
        System.out.println("2 SI SU FIGURA ES TRIANGULO");
        System.out.println("3 SI SU FIGURA ES CIRCULO");
        cualquier=lectuScanner.nextInt();

    
        switch(cualquier){
            case 1:
            System.out.println("Ingrese el valor de la base del rectangulo");
        base=lectuScanner.nextInt();
        System.out.println("Ingrese el valor de la altura del rectangulo");
        altura=lectuScanner.nextInt();
        rectangulo r1=new rectangulo(base, altura);
        r1.calcularArea();
        break;
        case 2:
        System.out.println("Ingrese el valor de la base del triangulo");
        base=lectuScanner.nextInt();
        System.out.println("Ingrese el valor de la altura del triangulo");
        altura=lectuScanner.nextInt();
        triangulo t1=new triangulo(base, altura);
        t1.calcularArea();
        break;

        case 3:
        System.out.println("Ingrese el valor del radio del circulo");
        radio=lectuScanner.nextFloat();
        circulo C1=new circulo(radio);
        C1.calcularArea();
        }
        
          System.out.println("¿Desea calcular otra area?, digite 0 si si o cualquier otro numero si no");
    i=lectuScanner.nextInt();
    } while(i<1);
    lectuScanner.close();  

  

    if(i!=1){
        System.out.println("GRACIAS POR USAR EL PROGRAMA");
    }
    }
     
}