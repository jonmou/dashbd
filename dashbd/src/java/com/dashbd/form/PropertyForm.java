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
public class PropertyForm extends ActionForm {
    private int ID;
    private String DomainGroup;

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
     * @return the DomainGroup
     */
    public String getDomainGroup() {
        return DomainGroup;
    }

    /**
     * @param DomainGroup the DomainGroup to set
     */
    public void setDomainGroup(String DomainGroup) {
        this.DomainGroup = DomainGroup;
    }
}
