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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")
    , @NamedQuery(name = "Usuario.findByIdusuario", query = "SELECT u FROM Usuario u WHERE u.usuarioPK.idusuario = :idusuario")
    , @NamedQuery(name = "Usuario.findByPrimapellusuario", query = "SELECT u FROM Usuario u WHERE u.primapellusuario = :primapellusuario")
    , @NamedQuery(name = "Usuario.findBySegundapellusuario", query = "SELECT u FROM Usuario u WHERE u.segundapellusuario = :segundapellusuario")
    , @NamedQuery(name = "Usuario.findByNombreusuario", query = "SELECT u FROM Usuario u WHERE u.nombreusuario = :nombreusuario")
    , @NamedQuery(name = "Usuario.findByEmailusuario", query = "SELECT u FROM Usuario u WHERE u.emailusuario = :emailusuario")
    , @NamedQuery(name = "Usuario.findByFechaaltausuario", query = "SELECT u FROM Usuario u WHERE u.fechaaltausuario = :fechaaltausuario")
    , @NamedQuery(name = "Usuario.findByUsuariodocente", query = "SELECT u FROM Usuario u WHERE u.usuariodocente = :usuariodocente")
    , @NamedQuery(name = "Usuario.findByUsuarioalumno", query = "SELECT u FROM Usuario u WHERE u.usuarioalumno = :usuarioalumno")
    , @NamedQuery(name = "Usuario.findByActividadIdactividad", query = "SELECT u FROM Usuario u WHERE u.usuarioPK.actividadIdactividad = :actividadIdactividad")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UsuarioPK usuarioPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "primapellusuario")
    private String primapellusuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "segundapellusuario")
    private String segundapellusuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombreusuario")
    private String nombreusuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "emailusuario")
    private String emailusuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaaltausuario")
    @Temporal(TemporalType.DATE)
    private Date fechaaltausuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "usuariodocente")
    private String usuariodocente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "usuarioalumno")
    private String usuarioalumno;
    @JoinColumn(name = "actividad_idactividad", referencedColumnName = "idactividad", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Actividad actividad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
    private Collection<Grupousuario> grupousuarioCollection;

    public Usuario() {
    }

    public Usuario(UsuarioPK usuarioPK) {
        this.usuarioPK = usuarioPK;
    }

    public Usuario(UsuarioPK usuarioPK, String primapellusuario, String segundapellusuario, String nombreusuario, String emailusuario, Date fechaaltausuario, String usuariodocente, String usuarioalumno) {
        this.usuarioPK = usuarioPK;
        this.primapellusuario = primapellusuario;
        this.segundapellusuario = segundapellusuario;
        this.nombreusuario = nombreusuario;
        this.emailusuario = emailusuario;
        this.fechaaltausuario = fechaaltausuario;
        this.usuariodocente = usuariodocente;
        this.usuarioalumno = usuarioalumno;
    }

    public Usuario(int idusuario, int actividadIdactividad) {
        this.usuarioPK = new UsuarioPK(idusuario, actividadIdactividad);
    }

    public UsuarioPK getUsuarioPK() {
        return usuarioPK;
    }

    public void setUsuarioPK(UsuarioPK usuarioPK) {
        this.usuarioPK = usuarioPK;
    }

    public String getPrimapellusuario() {
        return primapellusuario;
    }

    public void setPrimapellusuario(String primapellusuario) {
        this.primapellusuario = primapellusuario;
    }

    public String getSegundapellusuario() {
        return segundapellusuario;
    }

    public void setSegundapellusuario(String segundapellusuario) {
        this.segundapellusuario = segundapellusuario;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public String getEmailusuario() {
        return emailusuario;
    }

    public void setEmailusuario(String emailusuario) {
        this.emailusuario = emailusuario;
    }

    public Date getFechaaltausuario() {
        return fechaaltausuario;
    }

    public void setFechaaltausuario(Date fechaaltausuario) {
        this.fechaaltausuario = fechaaltausuario;
    }

    public String getUsuariodocente() {
        return usuariodocente;
    }

    public void setUsuariodocente(String usuariodocente) {
        this.usuariodocente = usuariodocente;
    }

    public String getUsuarioalumno() {
        return usuarioalumno;
    }

    public void setUsuarioalumno(String usuarioalumno) {
        this.usuarioalumno = usuarioalumno;
    }

    public Actividad getActividad() {
        return actividad;
    }

    public void setActividad(Actividad actividad) {
        this.actividad = actividad;
    }

    @XmlTransient
    public Collection<Grupousuario> getGrupousuarioCollection() {
        return grupousuarioCollection;
    }

    public void setGrupousuarioCollection(Collection<Grupousuario> grupousuarioCollection) {
        this.grupousuarioCollection = grupousuarioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usuarioPK != null ? usuarioPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.usuarioPK == null && other.usuarioPK != null) || (this.usuarioPK != null && !this.usuarioPK.equals(other.usuarioPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "basedatoscuxeya.Usuario[ usuarioPK=" + usuarioPK + " ]";
    }
    
}
