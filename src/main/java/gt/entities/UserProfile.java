/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author dc
 */
@Entity
@Table(name = "USER_PROFILE")
public class UserProfile implements Serializable {

    private Long idUserProfile;
    private Profile profile;
    private User user;
    private School school;

    public UserProfile() {
    }

    public UserProfile(Long idUserProfile) {
        this.idUserProfile = idUserProfile;
    }

    public UserProfile(Long idUserProfile, Profile profile, User user, School school) {
        this.idUserProfile = idUserProfile;
        this.profile = profile;
        this.user = user;
        this.school = school;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idUserProfile", unique = true, nullable = false)
    public Long getIdUserProfile() {
        return idUserProfile;
    }

    public void setIdUserProfile(Long idUserProfile) {
        this.idUserProfile = idUserProfile;
    }

    @ManyToOne
    @JoinColumn(name = "idProfile", referencedColumnName = "idProfile", nullable = false)
    @Cascade(CascadeType.ALL)
    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idUser", referencedColumnName = "idUser", nullable = false)
    @Cascade(CascadeType.ALL)
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @ManyToOne
    @JoinColumn(name = "idSchool", referencedColumnName = "idSchool", nullable = false)
    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

}

