package co.edu.uniquindio.poo;

import java.util.Collection;

public class Registro {
    private int tarifaHora;
    private Collection<Puesto> puestos;
    public Registro(int tarifaHora, Collection<Puesto> puestos) {
        this.tarifaHora = tarifaHora;
        this.puestos = puestos;
    }
    public int getTarifaHora() {
        return tarifaHora;
    }
    public void setTarifaHora(int tarifaHora) {
        this.tarifaHora = tarifaHora;
    }
    public Collection<Puesto> getPuestos() {
        return puestos;
    }
    public void setPuestos(Collection<Puesto> puestos) {
        this.puestos = puestos;
    }

    


}
