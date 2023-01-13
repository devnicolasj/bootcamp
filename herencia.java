import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente();
        cliente.setEdad(23);
        cliente.setNombre("Nicolas");
        cliente.setTelefono(123456789);
        cliente.setCredito(100000);
        System.out.println("Cliente Modificado.");
        System.out.println("Mostrando cliente...");
        System.out.println(cliente.getEdad());
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getTelefono());
        System.out.println(cliente.getCredito());
        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(15);
        trabajador.setNombre("Santiago");
        trabajador.setTelefono(123456789);
        trabajador.setSalario(5000);
        System.out.println("Trabajador modificado.");
        System.out.println("Mostrando Trabajador...");
        System.out.println(trabajador.getEdad());
        System.out.println(trabajador.getNombre());
        System.out.println(trabajador.getTelefono());
        System.out.println(trabajador.getSalario());
    }
}

class Persona{
    int edad;
    String nombre;
    int telefono;
    
    public int getEdad(){
        return this.edad; 
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getTelefono(){
        return this.telefono;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
}

class Cliente extends Persona{
    private int credito;
    
    public int getCredito(){
        return this.credito;
    }
    public void setCredito(int credito){
        this.credito = credito;
    }
}

class Trabajador extends Persona{
    private int salario;
    
    public int getSalario(){
        return this.salario;
    }
    public void setSalario(int salario){
        this.salario = salario;
    }
}