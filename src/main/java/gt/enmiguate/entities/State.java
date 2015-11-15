/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.enmiguate.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author Dario Calderon
 */
@Entity
@Table(name = "STATE", schema = "dbo", catalog = "COLEGIOS")
public class State implements java.io.Serializable {

    private int idState;
    private String txtName;
    private Country country;

    public State() {
    }

    public State(int idState) {
        this.idState = idState;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "idState", unique = true, nullable = false)
    public int getIdState() {
        return idState;
    }

    public void setIdState(int idState) {
        this.idState = idState;
    }

    @Column(name = "txtName", nullable = false)
    public String getTxtName() {
        return txtName;
    }

    public void setTxtName(String txtName) {
        this.txtName = txtName;
    }

    @ManyToOne
    @JoinColumn(name = "idCountry", referencedColumnName = "idCountry", nullable = false)
    @Cascade(CascadeType.PERSIST)
    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

}
