package src.Model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;

public class Estudiante extends Conexion{

    //#region Constructores
    public Estudiante() {
        super();
    }
    //#endregion

    //#region Atributos
    private int Codigo_Estudiante;
    private String Nombre;
    private String Apellidos;
    private Date Fecha_Nacimiento;
    private String email;
    private String curriculum;
    private String gradoDeAvance;
    //#endregion

    //#region Getters y Setters
    public int getCodigo_Estudiante() {
        return this.Codigo_Estudiante;
    }
    public void setCodigo_Estudiante(int Codigo_Estudiante) {
        this.Codigo_Estudiante = Codigo_Estudiante;
    }
    public String getNombre() {
        return this.Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public String getApellidos() {
        return this.Apellidos;
    }
    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }
    public Date getFecha_Nacimiento() {
        return this.Fecha_Nacimiento;
    }
    public void setFecha_Nacimiento(Date Fecha_Nacimiento) {
        this.Fecha_Nacimiento = Fecha_Nacimiento;
    }
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCurriculum() {
        return this.curriculum;
    }
    public void setCurriculum(String curriculum) {
        this.curriculum = curriculum;
    }
    public String getGradoDeAvance() {
        return this.gradoDeAvance;
    }
    public void setGradoDeAvance(String gradoDeAvance) {
        this.gradoDeAvance = gradoDeAvance;
    }
    //#endregion

    //#region Metodos
    public ArrayList<String[]> obtenerEstudiantes() {
        ArrayList<String[]> estudiantes = null;
        try {
            String sql = "SELECT * FROM Estudiante";
            estudiantes = this.executeSearch(sql);
        } catch (Exception e) {
            System.out.println("Error en el metodo para optener datos" + e.getMessage());
        }
        return estudiantes;
    }

    public boolean insertarEstudiante() {
        try {
            String sql = "INSERT INTO Estudiante (Codigo_Estudiante, Nombre, Apellidos, Fecha_Nacimiento, email, curriculum, gradoDeAvance) VALUES (" + this.Codigo_Estudiante + ", '" + this.Nombre + "', '" + this.Apellidos + "', '" + this.Fecha_Nacimiento + "', '" + this.email + "', '" + this.curriculum + "', '" + this.gradoDeAvance + "')";
            this.executeUpdate(sql);
            return true;
        } catch (Exception e) {
            System.out.println("Error en el metodo para insertar datos" + e.getMessage());
            return false;
        }
    }

    public boolean actualizarEstudiante() {
        try {
            String sql = "UPDATE Estudiante SET Nombre = '" + this.Nombre + "', Apellidos = '" + this.Apellidos + "', Fecha_Nacimiento = '" + this.Fecha_Nacimiento + "', email = '" + this.email + "', curriculum = '" + this.curriculum + "', gradoDeAvance = '" + this.gradoDeAvance + "' WHERE Codigo_Estudiante = " + this.Codigo_Estudiante;
            this.executeUpdate(sql);
            return true;
        } catch (Exception e) {
            System.out.println("Error en el metodo para actualizar datos" + e.getMessage());
            return false;
        }
    }

    public boolean eliminarEstudiante() {
        try {
            String sql = "DELETE FROM Estudiante WHERE Codigo_Estudiante = " + this.Codigo_Estudiante;
            this.executeUpdate(sql);
            return true;
        } catch (Exception e) {
            System.out.println("Error en el metodo para eliminar datos" + e.getMessage());
            return false;
        }
    }

    public boolean agregarOficinaEstudiante(int FK_idOficina){
        try {
            String sql = "INSERT INTO Estudiante_Oficina (FK_Codigo_Estudiante, FK_idOficina) VALUES (" + this.Codigo_Estudiante + ", " + FK_idOficina + ")";
            this.executeUpdate(sql);
            return true;
        } catch (Exception e) {
            System.out.println("Error en el metodo para insertar datos" + e.getMessage());
            return false;
        }
    }

    public ArrayList<String[]> obtenerOficinasInscritasDelEstudiante(){
        ArrayList<String[]> oficinasEstudiante = null;
        try {
            String sql = "select TOF.id as CodigoOficina, TD.Nombre as NombreDepartamento, TEM.Nombre || ' ' || TEM.Apellido as Decano  from Estudiante TE inner join Estudiante_Oficina TEO on TE.Codigo_Estudiante = TEO.FK_Codigo_Estudiante inner join Oficina_de_trabajo TOF on TEO.FK_idOficina = TOF.Id inner join Departamento TD on TOF.FK_idDepartamento = TD.Id inner join Empleado TEM on TD.FK_idDecano = TEM.Cedula where TE.Codigo_Estudiante = " + this.Codigo_Estudiante;
            oficinasEstudiante = this.executeSearch(sql);
        } catch (Exception e) {
            System.out.println("Error en el metodo para optener datos" + e.getMessage());
        }
        return oficinasEstudiante;
    }
    //#endregion
}