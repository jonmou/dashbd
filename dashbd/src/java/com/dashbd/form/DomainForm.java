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
public class DomainForm extends ActionForm {

    private int ID;
    private String DomainName;
    private String Value;
    private String Comments;
    private String CreateTime;
    private String UpdateTime;
    private int IsDel;
    private String OperUserID;
    private String ResUserID;
    private String ViewGroup;
    private String PropertyGroup;

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
     * @return the DomainName
     */
    public String getDomainName() {
        return DomainName;
    }

    /**
     * @param DomainName the DomainName to set
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * @return the Value
     */
    public String getValue() {
        return Value;
    }

    /**
     * @param Value the Value to set
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * @return the Comments
     */
    public String getComments() {
        return Comments;
    }

    /**
     * @param Comments the Comments to set
     */
    public void setComments(String Comments) {
        this.Comments = Comments;
    }

    /**
     * @return the CreateTime
     */
    public String getCreateTime() {
        return CreateTime;
    }

    /**
     * @param CreateTime the CreateTime to set
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * @return the UpdateTime
     */
    public String getUpdateTime() {
        return UpdateTime;
    }

    /**
     * @param UpdateTime the UpdateTime to set
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * @return the IsDel
     */
    public int getIsDel() {
        return IsDel;
    }

    /**
     * @param IsDel the IsDel to set
     */
    public void setIsDel(int IsDel) {
        this.IsDel = IsDel;
    }

    /**
     * @return the OperUserID
     */
    public String getOperUserID() {
        return OperUserID;
    }

    /**
     * @param OperUserID the OperUserID to set
     */
    public void setOperUserID(String OperUserID) {
        this.OperUserID = OperUserID;
    }

    /**
     * @return the ResUserID
     */
    public String getResUserID() {
        return ResUserID;
    }

    /**
     * @param ResUserID the ResUserID to set
     */
    public void setResUserID(String ResUserID) {
        this.ResUserID = ResUserID;
    }

    /**
     * @return the ViewGroup
     */
    public String getViewGroup() {
        return ViewGroup;
    }

    /**
     * @param ViewGroup the ViewGroup to set
     */
    public void setViewGroup(String ViewGroup) {
        this.ViewGroup = ViewGroup;
    }

    /**
     * @return the PropertyGroup
     */
    public String getPropertyGroup() {
        return PropertyGroup;
    }

    /**
     * @param PropertyGroup the PropertyGroup to set
     */
    public void setPropertyGroup(String PropertyGroup) {
        this.PropertyGroup = PropertyGroup;
    }
}
