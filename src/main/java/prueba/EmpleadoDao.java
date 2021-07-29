/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import prueba.EmpleadoModelo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author k-rol
 */
public interface EmpleadoDao extends CrudRepository<EmpleadoModelo, String> {
@Query(value = "SELECT * FROM empleado WHERE nombre = :nombre", nativeQuery = true)
    public EmpleadoModelo readNombre(@Param("nombre")String nombre);


}
