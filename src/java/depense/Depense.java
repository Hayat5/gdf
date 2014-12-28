/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depense;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Imadbourji
 */
@Entity
@Table(name = "depense")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Depense.findAll", query = "SELECT d FROM Depense d"),
    @NamedQuery(name = "Depense.findByIdDepense", query = "SELECT d FROM Depense d WHERE d.idDepense = :idDepense"),
    @NamedQuery(name = "Depense.findByIdCategory", query = "SELECT d FROM Depense d WHERE d.idCategory = :idCategory"),
    @NamedQuery(name = "Depense.findByIdUser", query = "SELECT d FROM Depense d WHERE d.idUser = :idUser"),
    @NamedQuery(name = "Depense.findByDepense", query = "SELECT d FROM Depense d WHERE d.depense = :depense")})
public class Depense implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_depense")
    private Integer idDepense;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_category")
    private int idCategory;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_user")
    private int idUser;
    @Basic(optional = false)
    @NotNull
    @Column(name = "depense")
    private int depense;

    public Depense() {
    }

    public Depense(Integer idDepense) {
        this.idDepense = idDepense;
    }

    public Depense(Integer idDepense, int idCategory, int idUser, int depense) {
        this.idDepense = idDepense;
        this.idCategory = idCategory;
        this.idUser = idUser;
        this.depense = depense;
    }

    public Integer getIdDepense() {
        return idDepense;
    }

    public void setIdDepense(Integer idDepense) {
        this.idDepense = idDepense;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getDepense() {
        return depense;
    }

    public void setDepense(int depense) {
        this.depense = depense;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDepense != null ? idDepense.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Depense)) {
            return false;
        }
        Depense other = (Depense) object;
        if ((this.idDepense == null && other.idDepense != null) || (this.idDepense != null && !this.idDepense.equals(other.idDepense))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "depense.Depense[ idDepense=" + idDepense + " ]";
    }
    
}
