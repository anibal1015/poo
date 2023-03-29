package Salud;

import java.util.Scanner;

public class empleado extends Persona {
    private String cargo;
    private double valorHora;
    private double horasTrabajadas;
    private String departamento;

    public empleado( String tipoDoc, int documento, String nombre, String apellido, int peso, double estatura, int edad, String sexo, String cargo, String departamento, double valorHora, double horasTrabajadas) {
        super(tipoDoc, nombre, apellido, peso, estatura, edad, sexo,documento,cargo, valorHora);
        this.cargo = cargo;
        this.departamento = departamento;
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void pedirhoras(){
        Scanner lectuScanner=new Scanner(System.in);
        System.out.println("Digite su cargo");
        cargo=lectuScanner.next();
        System.out.println("Digite sus horas trabajadas");
        horasTrabajadas=lectuScanner.nextDouble();
        System.out.println("Digite el valor de la hora");
        valorHora=lectuScanner.nextDouble();
}

public void mostrarhoras(){
    System.out.println("El numero de documento es: "+getTipoDoc());
    System.out.println("El documento es "+getDocumento());
    System.out.println("El nombre completo es "+ getNombre()+" " + getApellido());
    System.out.println("El cargo es " + getCargo());
    System.out.println("Las horas trabajadas son " +getHorasTrabajadas());
    }

public void calcularHonorarios(){
    double reteica;
    double total;
    total=valorHora*horasTrabajadas;
    reteica=(0.966*total);
    total=(-reteica);
    System.out.println("El total a pagar es "+ total);
}
}
