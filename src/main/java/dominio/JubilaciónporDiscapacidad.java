
package dominio;


public class JubilaciónporDiscapacidad extends Personas {

protected float porcentajeDiscapacidad;
    private int porcentaJubilaciónporDiscapacidad;

public JubilaciónporDiscapacidad(float porcentajeDiscapacidad) {
    this.porcentajeDiscapacidad = porcentajeDiscapacidad;
}

public JubilaciónporDiscapacidad(float porcentajeDiscapacidad, String cedula, String nombres, float salarioBase, int aniosAporte) {
    super(cedula, nombres, salarioBase, aniosAporte);
        this.porcentajeDiscapacidad = porcentajeDiscapacidad;
}

@Override
public float calcularJubilacion() {
float total;
total = (float)(super.calcularJubilacion()+(super.getSalarioBase()*(this.porcentaJubilaciónporDiscapacidad/100)));
return total;
}

@Override
    public String toString() {
    return super.toString()+ "\nPorcentaje de discapacidad=" + porcentajeDiscapacidad +"\nJubilacion: "+this.calcularJubilacion();
}
    
}



