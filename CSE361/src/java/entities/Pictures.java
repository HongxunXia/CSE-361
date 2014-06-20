/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
 * @author Sedna
 */
@Entity
@Table(name = "Pictures")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pictures.findAll", query = "SELECT p FROM Pictures p"),
    @NamedQuery(name = "Pictures.findByPictureID", query = "SELECT p FROM Pictures p WHERE p.pictureID = :pictureID"),
    @NamedQuery(name = "Pictures.findByFile", query = "SELECT p FROM Pictures p WHERE p.file = :file"),
    @NamedQuery(name = "Pictures.findByCaption", query = "SELECT p FROM Pictures p WHERE p.caption = :caption"),
    @NamedQuery(name = "Pictures.findByLatitude", query = "SELECT p FROM Pictures p WHERE p.latitude = :latitude"),
    @NamedQuery(name = "Pictures.findByLongitutde", query = "SELECT p FROM Pictures p WHERE p.longitutde = :longitutde")})
public class Pictures implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PictureID")
    private Integer pictureID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "File")
    private String file;
    @Size(max = 255)
    @Column(name = "Caption")
    private String caption;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Latitude")
    private String latitude;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Longitutde")
    private String longitutde;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pictureID")
    private Collection<Comments> commentsCollection;

    public Pictures() {
    }

    public Pictures(Integer pictureID) {
        this.pictureID = pictureID;
    }

    public Pictures(Integer pictureID, String file, String latitude, String longitutde) {
        this.pictureID = pictureID;
        this.file = file;
        this.latitude = latitude;
        this.longitutde = longitutde;
    }

    public Integer getPictureID() {
        return pictureID;
    }

    public void setPictureID(Integer pictureID) {
        this.pictureID = pictureID;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitutde() {
        return longitutde;
    }

    public void setLongitutde(String longitutde) {
        this.longitutde = longitutde;
    }

    @XmlTransient
    public Collection<Comments> getCommentsCollection() {
        return commentsCollection;
    }

    public void setCommentsCollection(Collection<Comments> commentsCollection) {
        this.commentsCollection = commentsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pictureID != null ? pictureID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pictures)) {
            return false;
        }
        Pictures other = (Pictures) object;
        if ((this.pictureID == null && other.pictureID != null) || (this.pictureID != null && !this.pictureID.equals(other.pictureID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Pictures[ pictureID=" + pictureID + " ]";
    }
    
}
