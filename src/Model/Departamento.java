package src.Model;

import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Departamento extends Conexion{

    
    //#region Constructores
    public Departamento() {
        super();
    }
    //#endregion

    //#region Atributos
    private int idDepartamento;
    private String nombre;
    private int FK_idDecano;
    //#endregion

    //#region Getters y Setters
    public int getIdDepartamento() {
        return this.idDepartamento;
    }
    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getFK_idDecano() {
        return this.FK_idDecano;
    }
    public void setFK_idDecano(int FK_idDecano) {
        this.FK_idDecano = FK_idDecano;
    }
    //#endregion

    //#region Metodos
    public boolean insertarDepartamento() {
        try {
            this.executeUpdate("INSERT INTO Departamento (nombre, FK_idDecano) VALUES ('" + this.getNombre() + "', " + this.getFK_idDecano() + ")");
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return false;
        }
    }

    public boolean actualizarDepartamento() {
        try {
            this.executeUpdate("UPDATE Departamento SET nombre = '" + this.getNombre() + "', FK_idDecano = " + this.getFK_idDecano() + " WHERE Id = " + this.getIdDepartamento());
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return false;
        }
    }

    public ArrayList<String[]> obtenerDepartamentos() {
        ArrayList<String[]> resultList = null;
        try {
            String sql = "SELECT TD.Id, TD.Nombre, TE.Cedula,  TE.Nombre || ' ' || TE.Apellido FROM Departamento TD inner join Empleado TE on TD.FK_idDecano = TE.cedula";
            resultList = this.executeSearch(sql);
        } catch (Exception e) {
            System.out.println("Error en el metodo para optener datos" + e.getMessage());
        }
        return resultList;
    }

    public ArrayList<String[]> obtenerDepartamentoNombre(String nombre){
        ArrayList<String[]> resultList = null;
        try {
            String sql = "SELECT TD.Id, TD.Nombre, TE.Cedula, TE.Nombre || ' ' || TE.Apellido FROM Departamento TD inner join Empleado TE on TD.FK_idDecano = TE.cedula where TD.Nombre like '%" + nombre + "%'";
            resultList = this.executeSearch(sql);
        } catch (Exception e) {
            System.out.println("Error en el metodo para optener datos" + e.getMessage());
        }
        return resultList;
    }

    public boolean eliminarDepartamento() {
        try {
            this.executeUpdate("DELETE FROM Departamento WHERE Id = " + this.getIdDepartamento());
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return false;
        }
    }
    //#endregion
}
