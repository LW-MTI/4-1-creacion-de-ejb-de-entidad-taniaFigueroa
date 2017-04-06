/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basedatoscuxeya;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Befita
 */
@Embeddable
public class GrupousuarioPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "idgrupousuario")
    private int idgrupousuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "usuario_idusuario")
    private int usuarioIdusuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "usuario_actividad_idactividad")
    private int usuarioActividadIdactividad;

    public GrupousuarioPK() {
    }

    public GrupousuarioPK(int idgrupousuario, int usuarioIdusuario, int usuarioActividadIdactividad) {
        this.idgrupousuario = idgrupousuario;
        this.usuarioIdusuario = usuarioIdusuario;
        this.usuarioActividadIdactividad = usuarioActividadIdactividad;
    }

    public int getIdgrupousuario() {
        return idgrupousuario;
    }

    public void setIdgrupousuario(int idgrupousuario) {
        this.idgrupousuario = idgrupousuario;
    }

    public int getUsuarioIdusuario() {
        return usuarioIdusuario;
    }

    public void setUsuarioIdusuario(int usuarioIdusuario) {
        this.usuarioIdusuario = usuarioIdusuario;
    }

    public int getUsuarioActividadIdactividad() {
        return usuarioActividadIdactividad;
    }

    public void setUsuarioActividadIdactividad(int usuarioActividadIdactividad) {
        this.usuarioActividadIdactividad = usuarioActividadIdactividad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idgrupousuario;
        hash += (int) usuarioIdusuario;
        hash += (int) usuarioActividadIdactividad;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GrupousuarioPK)) {
            return false;
        }
        GrupousuarioPK other = (GrupousuarioPK) object;
        if (this.idgrupousuario != other.idgrupousuario) {
            return false;
        }
        if (this.usuarioIdusuario != other.usuarioIdusuario) {
            return false;
        }
        if (this.usuarioActividadIdactividad != other.usuarioActividadIdactividad) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "basedatoscuxeya.GrupousuarioPK[ idgrupousuario=" + idgrupousuario + ", usuarioIdusuario=" + usuarioIdusuario + ", usuarioActividadIdactividad=" + usuarioActividadIdactividad + " ]";
    }
    
}
