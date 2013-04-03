/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dashbd.conf;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author I301095
 */
public class TextConf {
    /*视图类型*/

    public static int VIEW_NO_GENERAL = 10001;
    public static int VIEW_NO_LABS_CHINA = 10002;
    public static int VIEW_NO_FIELD_AGS = 10003;
    public static int VIEW_NO_SLN = 10004;
    public static int VIEW_NO_EMPLOYEE = 10005;
    
    /*性别*/
    public static int GENDER_FEMALE = 10201;
    public static int GENDER_MALE   = 20202;
    
    /*公司Code*/
    public static int COMPANY_CODE_SAP_CHINA = 211;
    public static int COMPANY_CODE_BUSINESS_OBJECTS_SOFTWARE = 606;
    public static int COMPANY_CODE_SYBASE_SOFTWARE_CHINA = 727;

    
    
    
    public HashMap<Integer, String> confInfo = new HashMap<Integer, String>();
    public TextConf() {
        confInfo.put(VIEW_NO_GENERAL, "General View");
        confInfo.put(VIEW_NO_LABS_CHINA, "Labs China View");
        confInfo.put(VIEW_NO_FIELD_AGS, "Field/AGS View");
        confInfo.put(VIEW_NO_SLN, "SLN View");
        confInfo.put(VIEW_NO_EMPLOYEE, "Employee View");
    }

    static public String getNameByID(int ID) {
        TextConf conf = new TextConf();
        String str = "undefined";
        Integer _ID = new Integer(ID);
        if (conf.confInfo.containsKey(_ID)) {
            str = conf.confInfo.get(_ID);
        }
        return str;
    }
}
