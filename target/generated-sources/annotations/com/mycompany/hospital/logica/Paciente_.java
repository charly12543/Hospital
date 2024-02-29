package com.mycompany.hospital.logica;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-02-22T14:19:52", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Paciente.class)
public class Paciente_ { 

    public static volatile SingularAttribute<Paciente, String> apellidoPaterno;
    public static volatile SingularAttribute<Paciente, Date> fecha;
    public static volatile SingularAttribute<Paciente, String> enferCronica;
    public static volatile SingularAttribute<Paciente, String> signos;
    public static volatile SingularAttribute<Paciente, String> apllidoMaterno;
    public static volatile SingularAttribute<Paciente, Integer> id_paciente;
    public static volatile SingularAttribute<Paciente, String> nombre;
    public static volatile SingularAttribute<Paciente, Integer> edad;
    public static volatile SingularAttribute<Paciente, String> alergias;

}