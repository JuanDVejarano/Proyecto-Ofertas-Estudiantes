package src.Model;

import java.sql.SQLException;
import java.util.ArrayList;


public class Empleado extends Conexion {

    //#region Constructores
    public Empleado() {
        super();
    }
    //#endregion

    //#region Atributos
    private int cedula;
    private String nombre;
    private String apellido;
    private String celular;
    private String correo;
    private int idCargo;
    //#endregion

    //#region Getters y Setters
    public int getCedula() {
        return this.cedula;
    }
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getCelular() {
        return this.celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public String getCorreo() {
        return this.correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public int getIdCargo() {
        return this.idCargo;
    }
    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }
    //#endregion

    //#region Metodos

    public boolean insertarEmpleados() {
        try {
            String sql = "INSERT INTO Empleado (Cedula, Nombre, Apellido, Celular, Correo, FK_IdCargo) VALUES (" + this.cedula + ", '" + this.nombre + "', '" + this.apellido + "', '" + this.celular + "', '" + this.correo + "', " + this.idCargo + ")";
            this.executeUpdate(sql);
            return true;
        } catch (Exception e) {
            System.out.println("Error en el metodo para insertar datos" + e.getMessage());
            return false;
        }
    }

    public boolean actualizarEmpleados() {
        try {
            String sql = "UPDATE Empleado SET Nombre = '" + this.nombre + "', Apellido = '" + this.apellido + "', Celular = '" + this.celular + "', Correo = '" + this.correo + "', FK_IdCargo = " + this.idCargo + " WHERE Cedula = " + this.cedula;
            this.executeUpdate(sql);
            return true;
        } catch (Exception e) {
            System.out.println("Error en el metodo para actualizar datos" + e.getMessage());
            return false;
        }
    }

    public boolean eliminarEmpleados() {
        try {
            String sql = "DELETE FROM Empleado WHERE Cedula = " + this.cedula;
            this.executeUpdate(sql);
            return true;
        } catch (Exception e) {
            System.out.println("Error en el metodo para eliminar datos" + e.getMessage());
            return false;
        }
    }

    public ArrayList<String[]> obtenerEmpleados() {
            ArrayList<String[]> empleados = null;
        try {
            String sql = "SELECT TE.Cedula, TE.Nombre, TE.Apellido, TE.Celular, TE.Correo, TC.Nombre FROM Empleado as TE INNER JOIN Cargo as TC ON TE.FK_IdCargo = TC.Id";
            empleados = this.executeSearch(sql);
        } catch (Exception e) {
            System.out.println("Error en el metodo para optener datos" + e.getMessage());
        }
        return empleados;
    }

    public ArrayList<String[]> obtenerDecano() {
            ArrayList<String[]> empleados = null;
        try {
            String sql = "SELECT TE.Cedula, TE.Nombre || ' ' || TE.Apellido, TE.Celular, TE.Correo FROM Empleado as TE where TE.FK_IdCargo = 1";
            empleados = this.executeSearch(sql);
        } catch (Exception e) {
            System.out.println("Error en el metodo para optener datos" + e.getMessage());
        }
        return empleados;
    }

    public ArrayList<String[]> obtenerDecanoNombre(String nombre) {
        ArrayList<String[]> empleados = null;
        try {
            String sql = "SELECT TE.Cedula, TE.Nombre || ' ' || TE.Apellido, TE.Celular, TE.Correo FROM Empleado as TE where TE.FK_IdCargo = 1 and TE.Nombre like '%" + nombre + "%'";
            empleados = this.executeSearch(sql);
        } catch (Exception e) {
            System.out.println("Error en el metodo para optener datos" + e.getMessage());
        }
        return empleados;
    }
    //#endregion
}