package src.Model;

import java.sql.SQLException;
import java.util.ArrayList;

public class Empresa extends Conexion{


    //#region Constructores
    public Empresa() {
        super();
    }
    //#endregion

    //#region Atributos
    private int nit;
    private String nombre;
    //#endregion

    //#region Getters y Setters
    public int getNit() {
        return this.nit;
    }
    public void setNit(int nit) {
        this.nit = nit;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //#endregion

    //#region Metodos
    public ArrayList<String[]> obtenerEmpresas() {
        ArrayList<String[]> empresas = null;
        try {
            String sql = "SELECT * FROM Empresa";
            empresas = this.executeSearch(sql);
        } catch (Exception e) {
            System.out.println("Error en el metodo para optener datos" + e.getMessage());
        }
        return empresas;
    }

    public boolean insertarEmpresa() {
        try {
            String sql = "INSERT INTO Empresa (Nit, Nombre) VALUES (" + this.nit + ", '" + this.nombre + "')";
            this.executeUpdate(sql);
            return true;
        } catch (Exception e) {
            System.out.println("Error en el metodo para insertar datos" + e.getMessage());
            return false;
        }
    }

    public boolean actualizarEmpresa() {
        try {
            String sql = "UPDATE Empresa SET Nombre = '" + this.nombre + "' WHERE Nit = " + this.nit;
            this.executeUpdate(sql);
            return true;
        } catch (Exception e) {
            System.out.println("Error en el metodo para actualizar datos" + e.getMessage());
            return false;
        }
    }

    public boolean eliminarEmpresa() {
        try {
            String sql = "DELETE FROM Empresa WHERE Nit = " + this.nit;
            this.executeUpdate(sql);
            return true;
        } catch (Exception e) {
            System.out.println("Error en el metodo para eliminar datos" + e.getMessage());
            return false;
        }
    }
    //#endregion
}