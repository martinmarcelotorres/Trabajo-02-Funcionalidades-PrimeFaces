package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import modelo.Persona;

public class PersonaImpl extends Conexion implements ICRUD<Persona> {

    @Override
    public void registrar(Persona per) throws Exception {
        this.conectar();
        String sql = "INSERT INTO PERSONA (NOMPER,APEPER,CELPER) values (?,?,?)";
        try {
            PreparedStatement ps = this.getCn().prepareStatement(sql);
            ps.setString(1, per.getNombre());
            ps.setString(2, per.getApellidos());
            ps.setString(3, per.getCelular());

            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            System.out.println("ERROR EN REGISTRAR" + e);
        } finally {
            this.Cerrar();
        }
    }

    public List<Persona> listarTodo() throws Exception {
        this.conectar();
        Persona per;
        String sql = "SELECT * FROM PERSONA order by IDPER desc";
        try {
            List<Persona> list = new ArrayList<>();
            Statement st = this.getCn().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                per = new Persona();
                per.setId(rs.getInt("IDPER"));
                per.setNombre(rs.getString("NOMPER"));
                per.setApellidos(rs.getString("APEPER"));
                per.setCelular(rs.getString("CELPER"));
                list.add(per);
            }
            rs.close();
            st.close();
            return list;
        } catch (SQLException e) {
            System.out.println("ERROR EN LISTAR"+e);
            return Collections.emptyList();
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public void modificar(Persona obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(Persona obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Persona> listarTodos() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
