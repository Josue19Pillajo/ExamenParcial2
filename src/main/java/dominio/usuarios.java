
package dominio;
import java.util.ArrayList;
import java.util.Iterator;

public class usuarios {
ArrayList <Personas> listaP;

public usuarios() {
    listaP = new ArrayList <> ();
}
    
public void adicionarPersona(Personas at)
{
    listaP.add(at);
}
public int definirTamanioLista()
{
        return listaP.size();
}
public Personas obtenerPersona(int indice)
{
return listaP.get(indice);
}
public void borrarPersona(Personas at)
{
    listaP.remove(at);
}
    
public void mostrarLista()
{
Iterator <Personas> it = listaP.iterator();
    while (it.hasNext())
{
    Personas at = it.next();
System.out.println(at);
}
}

    public void mostrarusuarios() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void adicionarPersonas(Personas personas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


    
