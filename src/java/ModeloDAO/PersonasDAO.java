
package ModeloDAO;


import Interfaces.CRUD;
import Modelo.Personas;
import config.Coneccion;
import java.sql.ResultSet;
import java.sql.Connection;
import  java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;


public class PersonasDAO implements CRUD{
    
    Coneccion cn=new Coneccion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Personas p=new Personas();
    
    
    @Override
    public List Listar() {
        ArrayList<Personas>List=new ArrayList<>();
        String sql= "select * from personas";
        
        try {
            con=cn.getConnecion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Personas per=new Personas();
                per.setId(rs.getInt("id"));
                per.setDocumento(rs.getInt("documento"));
                per.setNombres(rs.getString("nombres"));
                per.setApellidos(rs.getString("apellidos"));
                per.setEdad(rs.getInt("edad"));
                
                List.add(per);
            }
        } catch (Exception e) {
        }
            
        return List;
    }

    @Override
    public Personas List(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Add(Personas per) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Edit(Personas per) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
    
}
