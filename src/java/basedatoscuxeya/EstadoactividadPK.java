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
public class EstadoactividadPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "idestadoactividad")
    private int idestadoactividad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "actividad_idactividad")
    private int actividadIdactividad;

    public EstadoactividadPK() {
    }

    public EstadoactividadPK(int idestadoactividad, int actividadIdactividad) {
        this.idestadoactividad = idestadoactividad;
        this.actividadIdactividad = actividadIdactividad;
    }

    public int getIdestadoactividad() {
        return idestadoactividad;
    }

    public void setIdestadoactividad(int idestadoactividad) {
        this.idestadoactividad = idestadoactividad;
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
        hash += (int) idestadoactividad;
        hash += (int) actividadIdactividad;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstadoactividadPK)) {
            return false;
        }
        EstadoactividadPK other = (EstadoactividadPK) object;
        if (this.idestadoactividad != other.idestadoactividad) {
            return false;
        }
        if (this.actividadIdactividad != other.actividadIdactividad) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "basedatoscuxeya.EstadoactividadPK[ idestadoactividad=" + idestadoactividad + ", actividadIdactividad=" + actividadIdactividad + " ]";
    }
    
}
