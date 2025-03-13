package src.Model;

import java.sql.SQLException;
import java.util.ArrayList;

public class OficinaDeTrabajo extends Conexion{

    //#region Constructores
    public OficinaDeTrabajo() {
        super();
    }
    //#endregion

    //#region Atributos
    private int id;
    private Integer FK_idSecretaria;
    private Integer FK_idDepartamento;
    //#endregion

    //#region Getters y Setters
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Integer getFK_idSecretaria() {
        return this.FK_idSecretaria;
    }
    public void setFK_idSecretaria(Integer FK_idSecretaria) {
        this.FK_idSecretaria = FK_idSecretaria;
    }
    public Integer getFK_idDepartamento() {
        return this.FK_idDepartamento;
    }
    public void setFK_idDepartamento(Integer FK_idDepartamento) {
        this.FK_idDepartamento = FK_idDepartamento;
    }
    //#endregion

    //#region Metodos
    public ArrayList<String[]> obtenerOficinasDeTrabajo() {
        ArrayList<String[]> oficinasDeTrabajo = null;
        try {
            String sql = "SELECT * FROM OficinaDeTrabajo";
            oficinasDeTrabajo = this.executeSearch(sql);
        } catch (Exception e) {
            System.out.println("Error en el metodo para optener datos" + e.getMessage());
        }
        return oficinasDeTrabajo;
    }

    public boolean insertarOficinaDeTrabajo() {
        try {
            String sql = "INSERT INTO OficinaDeTrabajo (id, FK_idSecretaria, FK_idDepartamento) VALUES (" + this.id + ", " + this.FK_idSecretaria + ", " + this.FK_idDepartamento + ")";
            this.executeUpdate(sql);
            return true;
        } catch (Exception e) {
            System.out.println("Error en el metodo para insertar datos" + e.getMessage());
            return false;
        }
    }

    public boolean actualizarOficinaDeTrabajo() {
        try {
            String sql = "UPDATE OficinaDeTrabajo SET FK_idSecretaria = " + this.FK_idSecretaria + ", FK_idDepartamento = " + this.FK_idDepartamento + " WHERE id = " + this.id;
            this.executeUpdate(sql);
            return true;
        } catch (Exception e) {
            System.out.println("Error en el metodo para actualizar datos" + e.getMessage());
            return false;
        }
    }

    public boolean eliminarOficinaDeTrabajo() {
        try {
            String sql = "DELETE FROM OficinaDeTrabajo WHERE id = " + this.id;
            this.executeUpdate(sql);
            return true;
        } catch (Exception e) {
            System.out.println("Error en el metodo para eliminar datos" + e.getMessage());
            return false;
        }
    }
    //#endregion

}