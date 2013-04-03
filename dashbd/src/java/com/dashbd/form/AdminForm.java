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
public class AdminForm extends ActionForm {

    private int ID;
    private String UserID;
    private String UserName;
    private String Password;
    private int Role;
    private String ResDomainGroup;
    private String Ip;
    private String Mail;
    private String Mobile;

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
     * @return the UserID
     */
    public String getUserID() {
        return UserID;
    }

    /**
     * @param UserID the UserID to set
     */
    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    /**
     * @return the UserName
     */
    public String getUserName() {
        return UserName;
    }

    /**
     * @param UserName the UserName to set
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * @return the Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * @return the Role
     */
    public int getRole() {
        return Role;
    }

    /**
     * @param Role the Role to set
     */
    public void setRole(int Role) {
        this.Role = Role;
    }

    /**
     * @return the ResDomainGroup
     */
    public String getResDomainGroup() {
        return ResDomainGroup;
    }

    /**
     * @param ResDomainGroup the ResDomainGroup to set
     */
    public void setResDomainGroup(String ResDomainGroup) {
        this.ResDomainGroup = ResDomainGroup;
    }

    /**
     * @return the Ip
     */
    public String getIp() {
        return Ip;
    }

    /**
     * @param Ip the Ip to set
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * @return the Mail
     */
    public String getMail() {
        return Mail;
    }

    /**
     * @param Mail the Mail to set
     */
    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    /**
     * @return the Mobile
     */
    public String getMobile() {
        return Mobile;
    }

    /**
     * @param Mobile the Mobile to set
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }
}
