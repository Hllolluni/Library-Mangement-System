/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "Library")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Library.findAll", query = "SELECT l FROM Library l"),
    @NamedQuery(name = "Library.findByLibraryID", query = "SELECT l FROM Library l WHERE l.libraryID = :libraryID"),
    @NamedQuery(name = "Library.findByDescription", query = "SELECT l FROM Library l WHERE l.description = :description")})
public class Library implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LibraryID")
    private Integer libraryID;
    @Basic(optional = false)
    @Column(name = "Description")
    private String description;

    public Library() {
    }

    public Library(Integer libraryID) {
        this.libraryID = libraryID;
    }

    public Library(Integer libraryID, String description) {
        this.libraryID = libraryID;
        this.description = description;
    }

    public Integer getLibraryID() {
        return libraryID;
    }

    public void setLibraryID(Integer libraryID) {
        this.libraryID = libraryID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (libraryID != null ? libraryID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Library)) {
            return false;
        }
        Library other = (Library) object;
        if ((this.libraryID == null && other.libraryID != null) || (this.libraryID != null && !this.libraryID.equals(other.libraryID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.Library[ libraryID=" + libraryID + " ]";
    }
}