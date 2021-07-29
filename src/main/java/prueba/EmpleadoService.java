/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import prueba.EmpleadoModelo;
import prueba.EmpleadoService;
import prueba.EmpleadoServiceImp;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 *
 * @author k-rol
 */

@Controller
@CrossOrigin
@RequestMapping(path = "/empleado")
public class EmpleadoService {
    
        private static Logger logger = LogManager.getLogger(EmpleadoService.class);

    @Autowired
    private EmpleadoServiceImp emp;
  
    
    @PostMapping
    public @ResponseBody
        ResponseEntity createEmpleado(@RequestBody EmpleadoModelo empleado) {
        try {
            return new ResponseEntity(emp.createEmpleado(empleado), HttpStatus.OK);
        } catch (Exception e) {
            logger.error("", e);
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
