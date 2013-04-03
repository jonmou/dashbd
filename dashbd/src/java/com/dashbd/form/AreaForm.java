/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dashbd.form;

import org.apache.struts.action.ActionForm;

/**
 *
 * @author I301095
 */
public class AreaForm extends ActionForm {

    private int ID;
    private String AreaName;
    private int CoID;

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the AreaName
     */
    public String getAreaName() {
        return AreaName;
    }

    /**
     * @param AreaName the AreaName to set
     */
    public void setAreaName(String AreaName) {
        this.AreaName = AreaName;
    }

    /**
     * @return the CoID
     */
    public int getCoID() {
        return CoID;
    }

    /**
     * @param CoID the CoID to set
     */
    public void setCoID(int CoID) {
        this.CoID = CoID;
    }
}
