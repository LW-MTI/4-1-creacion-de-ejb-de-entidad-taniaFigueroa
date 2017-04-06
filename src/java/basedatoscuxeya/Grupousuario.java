/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basedatoscuxeya;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Befita
 */
@Entity
@Table(name = "grupousuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Grupousuario.findAll", query = "SELECT g FROM Grupousuario g")
    , @NamedQuery(name = "Grupousuario.findByIdgrupousuario", query = "SELECT g FROM Grupousuario g WHERE g.grupousuarioPK.idgrupousuario = :idgrupousuario")
    , @NamedQuery(name = "Grupousuario.findByNombregrupo", query = "SELECT g FROM Grupousuario g WHERE g.nombregrupo = :nombregrupo")
    , @NamedQuery(name = "Grupousuario.findByNumusuario", query = "SELECT g FROM Grupousuario g WHERE g.numusuario = :numusuario")
    , @NamedQuery(name = "Grupousuario.findByUsuarioIdusuario", query = "SELECT g FROM Grupousuario g WHERE g.grupousuarioPK.usuarioIdusuario = :usuarioIdusuario")
    , @NamedQuery(name = "Grupousuario.findByUsuarioActividadIdactividad", query = "SELECT g FROM Grupousuario g WHERE g.grupousuarioPK.usuarioActividadIdactividad = :usuarioActividadIdactividad")})
public class Grupousuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GrupousuarioPK grupousuarioPK;
    @Size(max = 45)
    @Column(name = "nombregrupo")
    private String nombregrupo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numusuario")
    private int numusuario;
    @JoinColumns({
        @JoinColumn(name = "usuario_idusuario", referencedColumnName = "idusuario", insertable = false, updatable = false)
        , @JoinColumn(name = "usuario_actividad_idactividad", referencedColumnName = "actividad_idactividad", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Usuario usuario;

    public Grupousuario() {
    }

    public Grupousuario(GrupousuarioPK grupousuarioPK) {
        this.grupousuarioPK = grupousuarioPK;
    }

    public Grupousuario(GrupousuarioPK grupousuarioPK, int numusuario) {
        this.grupousuarioPK = grupousuarioPK;
        this.numusuario = numusuario;
    }

    public Grupousuario(int idgrupousuario, int usuarioIdusuario, int usuarioActividadIdactividad) {
        this.grupousuarioPK = new GrupousuarioPK(idgrupousuario, usuarioIdusuario, usuarioActividadIdactividad);
    }

    public GrupousuarioPK getGrupousuarioPK() {
        return grupousuarioPK;
    }

    public void setGrupousuarioPK(GrupousuarioPK grupousuarioPK) {
        this.grupousuarioPK = grupousuarioPK;
    }

    public String getNombregrupo() {
        return nombregrupo;
    }

    public void setNombregrupo(String nombregrupo) {
        this.nombregrupo = nombregrupo;
    }

    public int getNumusuario() {
        return numusuario;
    }

    public void setNumusuario(int numusuario) {
        this.numusuario = numusuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (grupousuarioPK != null ? grupousuarioPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Grupousuario)) {
            return false;
        }
        Grupousuario other = (Grupousuario) object;
        if ((this.grupousuarioPK == null && other.grupousuarioPK != null) || (this.grupousuarioPK != null && !this.grupousuarioPK.equals(other.grupousuarioPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "basedatoscuxeya.Grupousuario[ grupousuarioPK=" + grupousuarioPK + " ]";
    }
    
}
