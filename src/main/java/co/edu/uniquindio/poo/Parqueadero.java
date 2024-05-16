package co.edu.uniquindio.poo;

import java.util.Collection;

public class Parqueadero {
    private String nombre;
    private Collection<TipoVehiculo> vehiculos;
    private Puesto [][] puestos ;
    private Collection<Registro> registros;
    

    public Parqueadero(String nombre, Collection<TipoVehiculo> vehiculos, Puesto[][] puestos,
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
    public Collection<TipoVehiculo> getVehiculos() {
        return vehiculos;
    }
    public void setVehiculos(Collection<TipoVehiculo> vehiculos) {
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
        return "Parqueadero [nombre=" + nombre + ", vehiculos=" + vehiculos + ", puestos=" + puestos + ", registros="
                + registros + "]";
    } 

}
