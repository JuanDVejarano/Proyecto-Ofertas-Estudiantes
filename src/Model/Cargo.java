package src.Model;
import java.sql.SQLException;
import java.util.ArrayList;

public class Cargo extends Conexion {

    //#region Constructores
    public Cargo() {
        super();
    }
    //#endregion

    //#region Atributos
    private int id;
    private String nombre;
    //#endregion

    //#region Getters y Setters
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //#endregion

    //#region Metodos
    public ArrayList<String[]> obtenerCargos() {
        ArrayList<String[]> cargos = null;
        try {
            String sql = "SELECT * FROM Cargo";
            cargos = this.executeSearch(sql);
        } catch (Exception e) {
            System.out.println("Error en el metodo para optener datos" + e.getMessage());
        }
        return cargos;
    }
    //#endregion

}