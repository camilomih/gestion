package com.aplicacionmovil.gestion.Controller;

import com.aplicacionmovil.gestion.consult.PermisosService;
import com.aplicacionmovil.gestion.dto.PermisosDTO;
import com.aplicacionmovil.gestion.dto.ResponseG;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
public class PermisoController {

    @Autowired
    PermisosService permisosService;

    @GetMapping("/permisos")
    public ResponseG getAllPermisos() {
        try{
            return permisosService.getPermisos();
        }catch (SQLException e){
            return new ResponseG(false,"Error",e.getMessage());
        }

    }

    @PostMapping("/permisos")
    public ResponseG createPermiso(@RequestBody PermisosDTO permisosDTO) throws SQLException {
        try {
            return permisosService.addPermiso(permisosDTO);
        }catch (SQLException e){
            return new ResponseG(false,"Error",e.getMessage());
        }
    }
}
