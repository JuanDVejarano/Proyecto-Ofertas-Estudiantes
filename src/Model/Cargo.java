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
    public ArrayList<Cargo> obtenerCargos() {
        ArrayList<Cargo> cargos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Cargo";
            ArrayList<String[]> resultList = this.executeSearch(sql);
            for (String[] result : resultList) {
                Cargo cargo = new Cargo();
                cargo.setId(Integer.parseInt(result[0]));
                cargo.setNombre(result[1]);
                cargos.add(cargo);
            }
        } catch (Exception e) {
            System.out.println("Error en el metodo para optener datos" + e.getMessage());
        }
        return cargos;
    }
    //#endregion

}