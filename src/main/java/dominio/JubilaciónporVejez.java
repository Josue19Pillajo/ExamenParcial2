
package dominio;


public class JubilaciónporVejez 
        extends Personas  {
public JubilaciónporVejez() {
    }

public JubilaciónporVejez(String cedula, String nombres, float salarioBase, int aniosAporte) {
   super(cedula, nombres, salarioBase, aniosAporte);
}

    public JubilaciónporVejez(String cedula, String nombre, float salario, int anios) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
@Override
public float calcularJubilacion( ) {
    float total;
        total = (float)(super.calcularJubilacion()+(super.getSalarioBase()*0.15));
            return total;
}

@Override
    public String toString() {
        return super.toString()+"\nJubilacion: "+this.calcularJubilacion();
}
}
