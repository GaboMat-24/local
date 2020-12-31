package com.desarrollo.local.model;
public class LocalModel {

    
    private String   fecha;
    private int      id;
    private String   local_nombre;
    private String   comuna_nombre;
    private String   localidad_nombre;
    private String   local_direccion;
    private String   funcionamiento_hora_apertura;
    private String   funcionamiento_hora_cierre;
    private String   local_telefono;
    private String   local_lat;
    private String   local_lng;
    private String   funcionamiento_dia;
    private int      fk_region;
    private int      fk_comuna;

    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocal_nombre() {
        return this.local_nombre;
    }

    public void setLocal_nombre(String local_nombre) {
        this.local_nombre = local_nombre;
    }

    public String getComuna_nombre() {
        return this.comuna_nombre;
    }

    public void setComuna_nombre(String comuna_nombre) {
        this.comuna_nombre = comuna_nombre;
    }

    public String getLocalidad_nombre() {
        return this.localidad_nombre;
    }

    public void setLocalidad_nombre(String localidad_nombre) {
        this.localidad_nombre = localidad_nombre;
    }

    public String getLocal_direccion() {
        return this.local_direccion;
    }

    public void setLocal_direccion(String local_direccion) {
        this.local_direccion = local_direccion;
    }

    public String getFuncionamiento_hora_apertura() {
        return this.funcionamiento_hora_apertura;
    }

    public void setFuncionamiento_hora_apertura(String funcionamiento_hora_apertura) {
        this.funcionamiento_hora_apertura = funcionamiento_hora_apertura;
    }

    public String getFuncionamiento_hora_cierre() {
        return this.funcionamiento_hora_cierre;
    }

    public void setFuncionamiento_hora_cierre(String funcionamiento_hora_cierre) {
        this.funcionamiento_hora_cierre = funcionamiento_hora_cierre;
    }

    public String getLocal_telefono() {
        return this.local_telefono;
    }

    public void setLocal_telefono(String local_telefono) {
        this.local_telefono = local_telefono;
    }

    public String getLocal_lat() {
        return this.local_lat;
    }

    public void setLocal_lat(String local_lat) {
        this.local_lat = local_lat;
    }

    public String getLocal_lng() {
        return this.local_lng;
    }

    public void setLocal_lng(String local_lng) {
        this.local_lng = local_lng;
    }

    public String getFuncionamiento_dia() {
        return this.funcionamiento_dia;
    }

    public void setFuncionamiento_dia(String funcionamiento_dia) {
        this.funcionamiento_dia = funcionamiento_dia;
    }

    public int getFk_region() {
        return this.fk_region;
    }

    public void setFk_region(int fk_region) {
        this.fk_region = fk_region;
    }

    public int getFk_comuna() {
        return this.fk_comuna;
    }

    public void setFk_comuna(int fk_comuna) {
        this.fk_comuna = fk_comuna;
    }


    public LocalModel() {
    }


    public LocalModel(String fecha, int id, String local_nombre, String comuna_nombre, String localidad_nombre, String local_direccion, String funcionamiento_hora_apertura, String funcionamiento_hora_cierre, String local_telefono, String local_lat, String local_lng, String funcionamiento_dia, int fk_region, int fk_comuna) {
        this.fecha = fecha;
        this.id = id;
        this.local_nombre = local_nombre;
        this.comuna_nombre = comuna_nombre;
        this.localidad_nombre = localidad_nombre;
        this.local_direccion = local_direccion;
        this.funcionamiento_hora_apertura = funcionamiento_hora_apertura;
        this.funcionamiento_hora_cierre = funcionamiento_hora_cierre;
        this.local_telefono = local_telefono;
        this.local_lat = local_lat;
        this.local_lng = local_lng;
        this.funcionamiento_dia = funcionamiento_dia;
        this.fk_region = fk_region;
        this.fk_comuna = fk_comuna;
    }

   @Override
    public String toString() {
        return "{" +
            " fecha='" + getFecha() + "'" +
            ", id='" + getId() + "'" +
            ", local_nombre='" + getLocal_nombre() + "'" +
            ", comuna_nombre='" + getComuna_nombre() + "'" +
            ", localidad_nombre='" + getLocalidad_nombre() + "'" +
            ", local_direccion='" + getLocal_direccion() + "'" +
            ", funcionamiento_hora_apertura='" + getFuncionamiento_hora_apertura() + "'" +
            ", funcionamiento_hora_cierre='" + getFuncionamiento_hora_cierre() + "'" +
            ", local_telefono='" + getLocal_telefono() + "'" +
            ", local_lat='" + getLocal_lat() + "'" +
            ", local_lng='" + getLocal_lng() + "'" +
            ", funcionamiento_dia='" + getFuncionamiento_dia() + "'" +
            ", fk_region='" + getFk_region() + "'" +
            ", fk_comuna='" + getFk_comuna() + "'" +
            "}";
    }



}