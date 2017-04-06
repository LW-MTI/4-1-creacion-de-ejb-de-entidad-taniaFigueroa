/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basedatoscuxeya;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Befita
 */
@Entity
@Table(name = "actividad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Actividad.findAll", query = "SELECT a FROM Actividad a")
    , @NamedQuery(name = "Actividad.findByIdactividad", query = "SELECT a FROM Actividad a WHERE a.idactividad = :idactividad")
    , @NamedQuery(name = "Actividad.findByNombreactividad", query = "SELECT a FROM Actividad a WHERE a.nombreactividad = :nombreactividad")
    , @NamedQuery(name = "Actividad.findByDescripcionactiv", query = "SELECT a FROM Actividad a WHERE a.descripcionactiv = :descripcionactiv")
    , @NamedQuery(name = "Actividad.findByFechacreacionact", query = "SELECT a FROM Actividad a WHERE a.fechacreacionact = :fechacreacionact")
    , @NamedQuery(name = "Actividad.findByFechaterminoact", query = "SELECT a FROM Actividad a WHERE a.fechaterminoact = :fechaterminoact")})
public class Actividad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idactividad")
    private Integer idactividad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombreactividad")
    private String nombreactividad;
    @Size(max = 45)
    @Column(name = "descripcionactiv")
    private String descripcionactiv;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechacreacionact")
    @Temporal(TemporalType.DATE)
    private Date fechacreacionact;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaterminoact")
    @Temporal(TemporalType.DATE)
    private Date fechaterminoact;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "actividad")
    private Collection<Estadoactividad> estadoactividadCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "actividad")
    private Collection<Usuario> usuarioCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "actividad")
    private Collection<Tipoactividad> tipoactividadCollection;

    public Actividad() {
    }

    public Actividad(Integer idactividad) {
        this.idactividad = idactividad;
    }

    public Actividad(Integer idactividad, String nombreactividad, Date fechacreacionact, Date fechaterminoact) {
        this.idactividad = idactividad;
        this.nombreactividad = nombreactividad;
        this.fechacreacionact = fechacreacionact;
        this.fechaterminoact = fechaterminoact;
    }

    public Integer getIdactividad() {
        return idactividad;
    }

    public void setIdactividad(Integer idactividad) {
        this.idactividad = idactividad;
    }

    public String getNombreactividad() {
        return nombreactividad;
    }

    public void setNombreactividad(String nombreactividad) {
        this.nombreactividad = nombreactividad;
    }

    public String getDescripcionactiv() {
        return descripcionactiv;
    }

    public void setDescripcionactiv(String descripcionactiv) {
        this.descripcionactiv = descripcionactiv;
    }

    public Date getFechacreacionact() {
        return fechacreacionact;
    }

    public void setFechacreacionact(Date fechacreacionact) {
        this.fechacreacionact = fechacreacionact;
    }

    public Date getFechaterminoact() {
        return fechaterminoact;
    }

    public void setFechaterminoact(Date fechaterminoact) {
        this.fechaterminoact = fechaterminoact;
    }

    @XmlTransient
    public Collection<Estadoactividad> getEstadoactividadCollection() {
        return estadoactividadCollection;
    }

    public void setEstadoactividadCollection(Collection<Estadoactividad> estadoactividadCollection) {
        this.estadoactividadCollection = estadoactividadCollection;
    }

    @XmlTransient
    public Collection<Usuario> getUsuarioCollection() {
        return usuarioCollection;
    }

    public void setUsuarioCollection(Collection<Usuario> usuarioCollection) {
        this.usuarioCollection = usuarioCollection;
    }

    @XmlTransient
    public Collection<Tipoactividad> getTipoactividadCollection() {
        return tipoactividadCollection;
    }

    public void setTipoactividadCollection(Collection<Tipoactividad> tipoactividadCollection) {
        this.tipoactividadCollection = tipoactividadCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idactividad != null ? idactividad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Actividad)) {
            return false;
        }
        Actividad other = (Actividad) object;
        if ((this.idactividad == null && other.idactividad != null) || (this.idactividad != null && !this.idactividad.equals(other.idactividad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "basedatoscuxeya.Actividad[ idactividad=" + idactividad + " ]";
    }
    
}
