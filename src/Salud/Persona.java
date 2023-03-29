package Salud;

import java.util.Scanner;

public class Persona {
    
    //RETO1
    //Atributos
    public String tipoDoc;
    public String nombre;
    public String apellido;
    public int peso;
    public Double estatura;
    public int edad;
    public String sexo;
    public int documento;
    public double div;

    //RETO3
    public Persona(String tipoDoc2, String nombre2, String apellido2, int peso2, double estatura2, int edad2,
            String sexo2, int documento2, String cargo, double valorHora) {
    }

    public Persona(Object object, int i, Object object2, Object object3, int j, double resultado, int k,
            Object object4) {
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Double getEstatura() {
        return estatura;
    }

    public void setEstatura(Double estatura) {
        this.estatura = estatura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    //Metodos
    public void pedirdatos(){
        Scanner leer=new Scanner(System.in);
        System.out.println(" Por favor ingrese el tipo de documento");
        tipoDoc=leer.next();
        System.out.println("Ingrese su numero de documento");
        documento=leer.nextInt();
        System.out.println("Ingrse su nombre");
        nombre=leer.next();
        System.out.println("Ingrese su apellido");
        apellido=leer.next();
        System.out.println("Ingrese el peso");
        peso=leer.nextInt();
        System.out.println("Ingrese la estatura");
        estatura=leer.nextDouble();
        System.out.println("Ingrese su edad");
        edad=leer.nextInt();
        System.out.println("Ingrese su sexo");
        sexo=leer.next();
        leer.close();
    }
    public void mostrarDocuments(){
        System.out.println("El tipo de documento es "+tipoDoc);
        System.out.println("el numero de documento es ");
        System.out.println("El nombre es "+nombre);
        System.out.println("El apellido es "+apellido);
        System.out.println("El peso es "+peso);
        System.out.println("La estatura es "+estatura);
        System.out.println("La edad es "+edad);
        System.out.println("El tipo de sexo es "+sexo);
    }
   /*  public void calcularimc(){
        div=peso/(estatura*estatura);
        
        
    }
    public void mostrarResultados(){
        System.out.println("si imc es de  "+div);
       if(div<20){
            System.out.println("el peso esta por debajo de lo ideal");
        }else if(div<25){
            System.out.println("el peso es ideal");
        }else{
            System.out.println("tiene sobre peso");
        }
    }*/


    //metodo con parametros
    //metodos con retorno, tipos de retorno depende del dato que se retorne 

    //RETO2
     public double imc(double resultado){
        div=peso/(estatura*estatura);
        if(div<20){
            System.out.println("el peso esta por debajo de lo ideal");
        }else if(div<25){
            System.out.println("el peso es ideal");
        }else{
            System.out.println("tiene sobre peso");
        }

        return resultado ;
  
    }
    
}
