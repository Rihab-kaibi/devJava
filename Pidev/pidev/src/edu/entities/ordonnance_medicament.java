/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.entities;

/**
 *
 * @author SAHLI
 */
public class ordonnance_medicament {
    int ordonnance_id,medicament_id ;

    public ordonnance_medicament() {
    }

    public ordonnance_medicament(int ordonnance_id, int medicament_id) {
        this.ordonnance_id = ordonnance_id;
        this.medicament_id = medicament_id;
    }

    public int getOrdonnance_id() {
        return ordonnance_id;
    }

    public int getMedicament_id() {
        return medicament_id;
    }

    public void setOrdonnance_id(int ordonnance_id) {
        this.ordonnance_id = ordonnance_id;
    }

    public void setMedicament_id(int medicament_id) {
        this.medicament_id = medicament_id;
    }

    @Override
    public String toString() {
        return "ordonnance_medicament{" + "ordonnance_id=" + ordonnance_id + ", medicament_id=" + medicament_id + '}';
    }
    
}
