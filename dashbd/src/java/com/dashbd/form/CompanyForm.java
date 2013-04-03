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
public class CompanyForm extends ActionForm {
    private int ID;
    private String CoName;

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
     * @return the CoName
     */
    public String getCoName() {
        return CoName;
    }

    /**
     * @param CoName the CoName to set
     */
    public void setCoName(String CoName) {
        this.CoName = CoName;
    }
}
