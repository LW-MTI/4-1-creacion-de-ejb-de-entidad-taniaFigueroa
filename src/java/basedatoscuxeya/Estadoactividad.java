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
@Table(name = "estadoactividad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estadoactividad.findAll", query = "SELECT e FROM Estadoactividad e")
    , @NamedQuery(name = "Estadoactividad.findByIdestadoactividad", query = "SELECT e FROM Estadoactividad e WHERE e.estadoactividadPK.idestadoactividad = :idestadoactividad")
    , @NamedQuery(name = "Estadoactividad.findByNombreestadoact", query = "SELECT e FROM Estadoactividad e WHERE e.nombreestadoact = :nombreestadoact")
    , @NamedQuery(name = "Estadoactividad.findByActividadIdactividad", query = "SELECT e FROM Estadoactividad e WHERE e.estadoactividadPK.actividadIdactividad = :actividadIdactividad")})
public class Estadoactividad implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EstadoactividadPK estadoactividadPK;
    @Size(max = 45)
    @Column(name = "nombreestadoact")
    private String nombreestadoact;
    @JoinColumn(name = "actividad_idactividad", referencedColumnName = "idactividad", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Actividad actividad;

    public Estadoactividad() {
    }

    public Estadoactividad(EstadoactividadPK estadoactividadPK) {
        this.estadoactividadPK = estadoactividadPK;
    }

    public Estadoactividad(int idestadoactividad, int actividadIdactividad) {
        this.estadoactividadPK = new EstadoactividadPK(idestadoactividad, actividadIdactividad);
    }

    public EstadoactividadPK getEstadoactividadPK() {
        return estadoactividadPK;
    }

    public void setEstadoactividadPK(EstadoactividadPK estadoactividadPK) {
        this.estadoactividadPK = estadoactividadPK;
    }

    public String getNombreestadoact() {
        return nombreestadoact;
    }

    public void setNombreestadoact(String nombreestadoact) {
        this.nombreestadoact = nombreestadoact;
    }

    public Actividad getActividad() {
        return actividad;
    }

    public void setActividad(Actividad actividad) {
        this.actividad = actividad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (estadoactividadPK != null ? estadoactividadPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estadoactividad)) {
            return false;
        }
        Estadoactividad other = (Estadoactividad) object;
        if ((this.estadoactividadPK == null && other.estadoactividadPK != null) || (this.estadoactividadPK != null && !this.estadoactividadPK.equals(other.estadoactividadPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "basedatoscuxeya.Estadoactividad[ estadoactividadPK=" + estadoactividadPK + " ]";
    }
    
}
