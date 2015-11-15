/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.entities.subject;

import gt.enmiguate.entities.UserProfile;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ELIUDNORIEGA
 */
@Entity
@Table(name="subject")
public class Subject implements Serializable{
    private int idSubject;
    private UserProfile uerProfiles;
    private int punteo;
    
    public Subject() {
    }
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)

    /**
     * @return the idSubject
     */
    public int getIdSubject() {
        return idSubject;
    }

    /**
     * @param idSubject the idSubject to set
     */
    public void setIdSubject(int idSubject) {
        this.idSubject = idSubject;
    }

    /**
     * @return the uerProfiles
     */
    public UserProfile getUerProfiles() {
        return uerProfiles;
    }

    /**
     * @param uerProfiles the uerProfiles to set
     */
    public void setUerProfiles(UserProfile uerProfiles) {
        this.uerProfiles = uerProfiles;
    }

    /**
     * @return the punteo
     */
    public int getPunteo() {
        return punteo;
    }

    /**
     * @param punteo the punteo to set
     */
    public void setPunteo(int punteo) {
        this.punteo = punteo;
    }
}
