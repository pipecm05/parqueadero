package co.edu.uniquindio.poo;

import java.util.Arrays;
import java.util.Collection;

public class Parqueadero {
    private String nombre;
    private Collection<Vehiculo> vehiculos;
    private Puesto [][] puestos ;
    private Collection<Registro> registros;
    private Double tarifaHora;
    

    public Parqueadero(String nombre, Collection<Vehiculo> vehiculos, Puesto[][] puestos,
            Collection<Registro> registros) {
        this.nombre = nombre;
        this.vehiculos = vehiculos;
        this.puestos = puestos;
        this.registros = registros;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Collection<Vehiculo> getVehiculos() {
        return vehiculos;
    }
    public void setVehiculos(Collection<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
    public Puesto[][] getPuestos() {
        return puestos;
    }
    public void setPuestos(Puesto[][] puestos) {
        this.puestos = puestos;
    }
    public Collection<Registro> getRegistros() {
        return registros;
    }
    public void setRegistros(Collection<Registro> registros) {
        this.registros = registros;
    }
    
    @Override
    public String toString() {
        return "Parqueadero [nombre=" + nombre + ", vehiculos=" + vehiculos + ", puestos=" + Arrays.toString(puestos)
                + ", registros=" + registros + ", tarifaHora=" + tarifaHora + "]";
    }
    public Double getTarifaHora() {
        return tarifaHora;
    }
    public void setTarifaHora(Double tarifaHora) {
        this.tarifaHora = tarifaHora;
    } 
    

}
