package com.aplicacionmovil.gestion.consult;

import com.aplicacionmovil.gestion.dto.PermisosDTO;
import com.aplicacionmovil.gestion.dto.ResponseG;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;

@Service
public class PermisosService extends GeneralConnection{

    public ResponseG getPermisos() throws SQLException {
        Connection con = getConnection();
        ResponseG responseG = new ResponseG();
        List<PermisosDTO> permisos = new ArrayList<>();
    try{
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from permisos");
        while(rs.next()){
            PermisosDTO permiso = new PermisosDTO();
            permiso.setCodigo(rs.getInt(1));
            permiso.setEstado(rs.getString(2));
            permiso.setRespuesta(rs.getString(3));
            permiso.setObservaciones(rs.getString(4));
            permiso.setTipoDePermiso(rs.getString(5));
            permiso.setFechaDesde(rs.getDate(6));
            permiso.setHastaFecha(rs.getDate(7));
            permiso.setReferencia(rs.getString(8));
            permisos.add(permiso);
        }
        responseG.setSuccess(true);
        responseG.setMensaje("Ok");
        responseG.setObject(permisos);
        return responseG;
    }catch (SQLException e){
        throw e;
    } finally {
        con.close();
    }
    }

    public ResponseG addPermiso(PermisosDTO permisosDTO) throws SQLException {
        Connection con = getConnection();
        try {
            PreparedStatement st = con.prepareStatement("INSERT INTO permisos(codigo,estado,respuesta,observaciones,tipo_de_permiso,fecha_desde,hasta_fecha,referencia) VALUES (?,?,?,?,?,?,?,?)");
            st.setInt(1, permisosDTO.getCodigo());
            st.setString(2, permisosDTO.getEstado());
            st.setString(3, permisosDTO.getRespuesta());
            st.setString(4, permisosDTO.getObservaciones());
            st.setString(5, permisosDTO.getTipoDePermiso());
            st.setDate(6, new Date(permisosDTO.getFechaDesde().getTime()));
            st.setDate(7, new Date(permisosDTO.getHastaFecha().getTime()));
            st.setString(8, permisosDTO.getReferencia());

            // execute the preparedstatement insert
            int created = st.executeUpdate();
            return new ResponseG(true,"OK", created);
        }catch (SQLException e){
           throw e;
        }
    }
}
