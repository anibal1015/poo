package inicio;

import Salud.Persona;
import Salud.empleado;

public class Ejecucion {
    public static void main(String[] args) {
        double resultado=0;

       //RETO1
       //crear un objeto-> Instancia una clase
         Persona doc=new Persona(null, 0, null, null, 0, resultado, 0, null);
        //invocando un metodo
        doc.pedirdatos();
        doc.mostrarDocuments();
        //doc.calcularimc();
        //doc.mostrarResultados();
        
       //RETO2
        doc.imc(resultado);
        resultado=doc.imc(resultado);

         //Reto 3
        empleado trabajo=new empleado(null, 0, null, null, 0, resultado, 0, null, null, null, resultado, resultado);
        trabajo.pedirhoras();
       trabajo.pedirdatos();
        trabajo.mostrarhoras();
        trabajo.calcularHonorarios();       



        
    }


}
