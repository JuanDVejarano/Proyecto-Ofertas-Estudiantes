package src.Model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;

public class OfertaEmpelo extends Conexion{
    //#region Constructores\
    public OfertaEmpelo() {
        super();
    }
    //#endregion

    //#region Atributos
    private int Codigo_Oferta;
    private String Descripcion;
    private boolean publicacion;
    private String fechaDeApertura;
    private String fechaDeCierre;
    private int FK_idOficina;
    private int FK_idDepartamento;
    private int FK_idEmpresa;
    private boolean figuraNombre;
    //#endregion

    //#region Getters y Setters
    public int getCodigo_Oferta() {
        return this.Codigo_Oferta;
    }
    public void setCodigo_Oferta(int Codigo_Oferta) {
        this.Codigo_Oferta = Codigo_Oferta;
    }
    public String getDescripcion() {
        return this.Descripcion;
    }
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    public boolean isPublicacion() {
        return this.publicacion;
    }
    public boolean getPublicacion() {
        return this.publicacion;
    }
    public void setPublicacion(boolean publicacion) {
        this.publicacion = publicacion;
    }
    public String getFechaDeApertura() {
        return this.fechaDeApertura;
    }
    public void setFechaDeApertura(String fechaDeApertura) {
        this.fechaDeApertura = fechaDeApertura;
    }
    public String getFechaDeCierre() {
        return this.fechaDeCierre;
    }
    public void setFechaDeCierre(String fechaDeCierre) {
        this.fechaDeCierre = fechaDeCierre;
    }
    public int getFK_idOficina() {
        return this.FK_idOficina;
    }
    public void setFK_idOficina(int FK_idOficina) {
        this.FK_idOficina = FK_idOficina;
    }
    public int getFK_idDepartamento() {
        return this.FK_idDepartamento;
    }
    public void setFK_idDepartamento(int FK_idDepartamento) {
        this.FK_idDepartamento = FK_idDepartamento;
    }
    public int getFK_idEmpresa() {
        return this.FK_idEmpresa;
    }
    public void setFK_idEmpresa(int FK_idEmpresa) {
        this.FK_idEmpresa = FK_idEmpresa;
    }
    public boolean isFiguraNombre() {
        return this.figuraNombre;
    }
    public boolean getFiguraNombre() {
        return this.figuraNombre;
    }
    public void setFiguraNombre(boolean figuraNombre) {
        this.figuraNombre = figuraNombre;
    }
    //#endregion

    //#region Metodos

}