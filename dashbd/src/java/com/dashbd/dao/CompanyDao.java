/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dashbd.dao;

import com.dashbd.conf.TextConf;

/**
 *
 * @author I301095
 */
public class CompanyDao {
    public String getCoNameByCode(int code)
    {
        String name = "undefined";
        if (code == TextConf.COMPANY_CODE_SAP_CHINA)
        {
            name = "SAP China";
        }
        else if (code == TextConf.COMPANY_CODE_SYBASE_SOFTWARE_CHINA)
        {
            name = "SYBASE SOFTWARE (CHINA)";
        }
        else if (code == TextConf.COMPANY_CODE_BUSINESS_OBJECTS_SOFTWARE)
        {
            name = "BUSINESS OBJECTS SOFTWARE";
        }
        return name;
    }
}
