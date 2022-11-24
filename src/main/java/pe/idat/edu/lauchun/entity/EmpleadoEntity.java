package pe.idat.edu.lauchun.entity;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="EmpleadoEntity")
@Table(name="empleado")
public class EmpleadoEntity implements Serializable {

    private static final long serialVersionUID=1L;
    
    @Id
    @Column(name="IDempleado")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long IDempleado;
    
    @ManyToOne
    @JoinColumn(name="IDrol",nullable = false)
    private RolEntity idrol;
        
    @Column(name="Nombre")
    private String nombre;
    
    @Column(name="Apellido")
    private String apellido;
    
    @Column(name="Sexo")
    private String sexo;
    
    @Column(name="Email")
    private String email;
    
    @Column(name="Fecha_Nacimiento")
    private Date nacimiento;
    
    @Column(name="Documento")
    private String documento;
    
    @Column(name="Username")
    private String usuario;
    
    @Column(name="Password")
    private String contrasena;
    
    @Column(name="Estado")
    private boolean estado;
}
