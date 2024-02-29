
package com.mycompany.hospital.logica;

import com.mycompany.hospital.persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class ControladoraLogica {
    
    ControladoraPersistencia persis = new ControladoraPersistencia();

   public void guardar(String nombre, String apellidoPaterno, String apllidoMaterno, 
                       int edad,String signos, String alergias, String enferCronica,Date fecha) {
           Paciente pac = new Paciente();
     
                   pac.setNombre(nombre);
                   pac.setApellidoPaterno(apellidoPaterno);
                   pac.setApllidoMaterno(apllidoMaterno);
                   pac.setEdad(edad);
                   
                   pac.setSignos(signos);
                   pac.setAlergias(alergias);                 
                   pac.setEnferCronica(enferCronica);
                   pac.setFecha(fecha);
                   
        
        persis.guardar(pac);
        
        
    } 


    public List<Paciente> traerPacientes() {
       
     return persis.traerPacientes();   
    }

    public void borrarPaciente(int idEliminar) {
      persis.borrarPaciente( idEliminar);
        
    }   

    public Paciente buscarPaciente(int id_buscar) {
        return persis.buscarPaciente( id_buscar);
    }

    public Paciente traerDatosPaciente(int id_paciente) {
       return persis.traerDatosPaciente( id_paciente);
    }
    public void actualizar(Paciente pac, String nombre, String apellidoPaterno, String apllidoMaterno, 
                           int edad, String signos, String alergias, String enferCronica) {
        pac.setNombre(nombre);
        pac.setApellidoPaterno(apellidoPaterno);
        pac.setApllidoMaterno(apllidoMaterno);
        pac.setEdad(edad);
        pac.setSignos(signos);
        pac.setAlergias(alergias);
        pac.setEnferCronica(enferCronica);
        //EclipseLink cuante con su propio metodo "Actualizar" para relizar las modificaciones
        persis.actualizar(pac);
        
    }

 
    
}
