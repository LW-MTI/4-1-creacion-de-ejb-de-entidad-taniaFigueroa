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
public class UsuarioPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "idusuario")
    private int idusuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "actividad_idactividad")
    private int actividadIdactividad;

    public UsuarioPK() {
    }

    public UsuarioPK(int idusuario, int actividadIdactividad) {
        this.idusuario = idusuario;
        this.actividadIdactividad = actividadIdactividad;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public int getActividadIdactividad() {
        return actividadIdactividad;
    }

    public void setActividadIdactividad(int actividadIdactividad) {
        this.actividadIdactividad = actividadIdactividad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idusuario;
        hash += (int) actividadIdactividad;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioPK)) {
            return false;
        }
        UsuarioPK other = (UsuarioPK) object;
        if (this.idusuario != other.idusuario) {
            return false;
        }
        if (this.actividadIdactividad != other.actividadIdactividad) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "basedatoscuxeya.UsuarioPK[ idusuario=" + idusuario + ", actividadIdactividad=" + actividadIdactividad + " ]";
    }
    
}
