
package Interfaces;

import Modelo.Personas;
import java.util.List;


public interface CRUD {
    
    public List Listar();
    public Personas List(int id);
    public boolean Add(Personas per);
    public boolean Edit(Personas per);
    public boolean Eliminar(int id);
    
}
