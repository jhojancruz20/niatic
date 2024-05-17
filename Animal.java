
/**
 * Write a description of class Animal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Date;
abstract class Animal {
    private String identificador;
    private String nombre;
    private double peso;
    private Date fechaNacimiento;

    // Constructor de la clase Animal
    public Animal(String identificador, String nombre, double peso, Date fechaNacimiento) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.peso = peso;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Métodos getter para obtener los atributos del animal
    public String getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
}
