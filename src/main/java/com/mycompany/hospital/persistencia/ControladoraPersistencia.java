package com.mycompany.hospital.persistencia;

import com.mycompany.hospital.logica.Paciente;
import com.mycompany.hospital.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    
    PacienteJpaController jpa = new PacienteJpaController();

    public void guardar(Paciente pac) {
       jpa.create(pac);
        
    }

    public List<Paciente> traerPacientes() {
     return jpa.findPacienteEntities();
        
    }

    public void borrarPaciente(int idEliminar) {
        try {
            jpa.destroy(idEliminar);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
   
        
    }

    public Paciente buscarPaciente(int id_buscar) {
       return jpa.findPaciente(id_buscar);
        
    }

    public Paciente traerDatosPaciente(int id_paciente) {
        return jpa.findPaciente(id_paciente);
        
    }

    
    //Metodo ACTUALIZAR en jpa con EclipseLink
    public void actualizar(Paciente pac) {
        try {
            jpa.edit(pac);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }   

    

    

   
 
    
}
