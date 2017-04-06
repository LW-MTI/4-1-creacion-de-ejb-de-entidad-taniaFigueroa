/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basedatoscuxeya;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Befita
 */
@Entity
@Table(name = "areaconocimiento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Areaconocimiento.findAll", query = "SELECT a FROM Areaconocimiento a")
    , @NamedQuery(name = "Areaconocimiento.findByIdareaconocimiento", query = "SELECT a FROM Areaconocimiento a WHERE a.idareaconocimiento = :idareaconocimiento")
    , @NamedQuery(name = "Areaconocimiento.findByNombreareaconoc", query = "SELECT a FROM Areaconocimiento a WHERE a.nombreareaconoc = :nombreareaconoc")
    , @NamedQuery(name = "Areaconocimiento.findByNumeroareaconoc", query = "SELECT a FROM Areaconocimiento a WHERE a.numeroareaconoc = :numeroareaconoc")})
public class Areaconocimiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idareaconocimiento")
    private Integer idareaconocimiento;
    @Size(max = 45)
    @Column(name = "nombreareaconoc")
    private String nombreareaconoc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numeroareaconoc")
    private int numeroareaconoc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "areaconocimiento")
    private Collection<Tipoactividad> tipoactividadCollection;

    public Areaconocimiento() {
    }

    public Areaconocimiento(Integer idareaconocimiento) {
        this.idareaconocimiento = idareaconocimiento;
    }

    public Areaconocimiento(Integer idareaconocimiento, int numeroareaconoc) {
        this.idareaconocimiento = idareaconocimiento;
        this.numeroareaconoc = numeroareaconoc;
    }

    public Integer getIdareaconocimiento() {
        return idareaconocimiento;
    }

    public void setIdareaconocimiento(Integer idareaconocimiento) {
        this.idareaconocimiento = idareaconocimiento;
    }

    public String getNombreareaconoc() {
        return nombreareaconoc;
    }

    public void setNombreareaconoc(String nombreareaconoc) {
        this.nombreareaconoc = nombreareaconoc;
    }

    public int getNumeroareaconoc() {
        return numeroareaconoc;
    }

    public void setNumeroareaconoc(int numeroareaconoc) {
        this.numeroareaconoc = numeroareaconoc;
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
        hash += (idareaconocimiento != null ? idareaconocimiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Areaconocimiento)) {
            return false;
        }
        Areaconocimiento other = (Areaconocimiento) object;
        if ((this.idareaconocimiento == null && other.idareaconocimiento != null) || (this.idareaconocimiento != null && !this.idareaconocimiento.equals(other.idareaconocimiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "basedatoscuxeya.Areaconocimiento[ idareaconocimiento=" + idareaconocimiento + " ]";
    }
    
}
