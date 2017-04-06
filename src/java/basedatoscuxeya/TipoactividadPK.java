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
public class TipoactividadPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "idtipoactividad")
    private int idtipoactividad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "actividad_idactividad")
    private int actividadIdactividad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "areaconocimiento_idareaconocimiento")
    private int areaconocimientoIdareaconocimiento;

    public TipoactividadPK() {
    }

    public TipoactividadPK(int idtipoactividad, int actividadIdactividad, int areaconocimientoIdareaconocimiento) {
        this.idtipoactividad = idtipoactividad;
        this.actividadIdactividad = actividadIdactividad;
        this.areaconocimientoIdareaconocimiento = areaconocimientoIdareaconocimiento;
    }

    public int getIdtipoactividad() {
        return idtipoactividad;
    }

    public void setIdtipoactividad(int idtipoactividad) {
        this.idtipoactividad = idtipoactividad;
    }

    public int getActividadIdactividad() {
        return actividadIdactividad;
    }

    public void setActividadIdactividad(int actividadIdactividad) {
        this.actividadIdactividad = actividadIdactividad;
    }

    public int getAreaconocimientoIdareaconocimiento() {
        return areaconocimientoIdareaconocimiento;
    }

    public void setAreaconocimientoIdareaconocimiento(int areaconocimientoIdareaconocimiento) {
        this.areaconocimientoIdareaconocimiento = areaconocimientoIdareaconocimiento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idtipoactividad;
        hash += (int) actividadIdactividad;
        hash += (int) areaconocimientoIdareaconocimiento;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoactividadPK)) {
            return false;
        }
        TipoactividadPK other = (TipoactividadPK) object;
        if (this.idtipoactividad != other.idtipoactividad) {
            return false;
        }
        if (this.actividadIdactividad != other.actividadIdactividad) {
            return false;
        }
        if (this.areaconocimientoIdareaconocimiento != other.areaconocimientoIdareaconocimiento) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "basedatoscuxeya.TipoactividadPK[ idtipoactividad=" + idtipoactividad + ", actividadIdactividad=" + actividadIdactividad + ", areaconocimientoIdareaconocimiento=" + areaconocimientoIdareaconocimiento + " ]";
    }
    
}
