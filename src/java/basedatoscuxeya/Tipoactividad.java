/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basedatoscuxeya;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Befita
 */
@Entity
@Table(name = "tipoactividad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipoactividad.findAll", query = "SELECT t FROM Tipoactividad t")
    , @NamedQuery(name = "Tipoactividad.findByIdtipoactividad", query = "SELECT t FROM Tipoactividad t WHERE t.tipoactividadPK.idtipoactividad = :idtipoactividad")
    , @NamedQuery(name = "Tipoactividad.findByNombretipoact", query = "SELECT t FROM Tipoactividad t WHERE t.nombretipoact = :nombretipoact")
    , @NamedQuery(name = "Tipoactividad.findByActividadIdactividad", query = "SELECT t FROM Tipoactividad t WHERE t.tipoactividadPK.actividadIdactividad = :actividadIdactividad")
    , @NamedQuery(name = "Tipoactividad.findByAreaconocimientoIdareaconocimiento", query = "SELECT t FROM Tipoactividad t WHERE t.tipoactividadPK.areaconocimientoIdareaconocimiento = :areaconocimientoIdareaconocimiento")})
public class Tipoactividad implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TipoactividadPK tipoactividadPK;
    @Size(max = 45)
    @Column(name = "nombretipoact")
    private String nombretipoact;
    @JoinColumn(name = "actividad_idactividad", referencedColumnName = "idactividad", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Actividad actividad;
    @JoinColumn(name = "areaconocimiento_idareaconocimiento", referencedColumnName = "idareaconocimiento", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Areaconocimiento areaconocimiento;

    public Tipoactividad() {
    }

    public Tipoactividad(TipoactividadPK tipoactividadPK) {
        this.tipoactividadPK = tipoactividadPK;
    }

    public Tipoactividad(int idtipoactividad, int actividadIdactividad, int areaconocimientoIdareaconocimiento) {
        this.tipoactividadPK = new TipoactividadPK(idtipoactividad, actividadIdactividad, areaconocimientoIdareaconocimiento);
    }

    public TipoactividadPK getTipoactividadPK() {
        return tipoactividadPK;
    }

    public void setTipoactividadPK(TipoactividadPK tipoactividadPK) {
        this.tipoactividadPK = tipoactividadPK;
    }

    public String getNombretipoact() {
        return nombretipoact;
    }

    public void setNombretipoact(String nombretipoact) {
        this.nombretipoact = nombretipoact;
    }

    public Actividad getActividad() {
        return actividad;
    }

    public void setActividad(Actividad actividad) {
        this.actividad = actividad;
    }

    public Areaconocimiento getAreaconocimiento() {
        return areaconocimiento;
    }

    public void setAreaconocimiento(Areaconocimiento areaconocimiento) {
        this.areaconocimiento = areaconocimiento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tipoactividadPK != null ? tipoactividadPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipoactividad)) {
            return false;
        }
        Tipoactividad other = (Tipoactividad) object;
        if ((this.tipoactividadPK == null && other.tipoactividadPK != null) || (this.tipoactividadPK != null && !this.tipoactividadPK.equals(other.tipoactividadPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "basedatoscuxeya.Tipoactividad[ tipoactividadPK=" + tipoactividadPK + " ]";
    }
    
}
