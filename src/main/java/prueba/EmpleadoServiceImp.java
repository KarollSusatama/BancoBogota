/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author k-rol
 */
@Service 
public class EmpleadoServiceImp {
    
    @Autowired
    private EmpleadoDao emple;
    
    public EmpleadoModelo createEmpleado (EmpleadoModelo e) {
        return emple.save(e);
    }    
    
    public EmpleadoModelo readEmpleado (String nombre) {
        return emple.readNombre(nombre);
    } 
    
    public EmpleadoModelo updateEmpleado (EmpleadoModelo u) {
        return emple.save(u);
    } 
    

}
