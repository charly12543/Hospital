package com.mycompany.hospital.logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
public class Paciente implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_paciente;
    @Basic
    private String nombre;
    private String apellidoPaterno;
    private String apllidoMaterno; 
    private int edad;
    //Cuadro de texto
    private String signos;
    private String alergias;
    //Cuadro de texto
    private String enferCronica;
    
    @Temporal(TemporalType.DATE)
    private Date fecha;

    public Paciente() {
    }

    public Paciente(int id_paciente, String nombre, String apellidoPaterno, String apllidoMaterno, int edad, String signos, String alergias, String enferCronica, Date fecha) {
        this.id_paciente = id_paciente;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apllidoMaterno = apllidoMaterno;
        this.edad = edad;
        this.signos = signos;
        this.alergias = alergias;
        this.enferCronica = enferCronica;
        this.fecha = fecha;
    }

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApllidoMaterno() {
        return apllidoMaterno;
    }

    public void setApllidoMaterno(String apllidoMaterno) {
        this.apllidoMaterno = apllidoMaterno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSignos() {
        return signos;
    }

    public void setSignos(String signos) {
        this.signos = signos;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getEnferCronica() {
        return enferCronica;
    }

    public void setEnferCronica(String enferCronica) {
        this.enferCronica = enferCronica;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Paciente{" + "id_paciente=" + id_paciente + ", nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno + ", apllidoMaterno=" + apllidoMaterno + ", edad=" + edad + ", signos=" + signos + ", alergias=" + alergias + ", enferCronica=" + enferCronica + ", fecha=" + fecha + '}';
    }

    
    
    

 
    
    
    
}
