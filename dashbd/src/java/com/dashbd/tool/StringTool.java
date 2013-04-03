/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dashbd.tool;

/**
 *
 * @author I301095
 */
public class StringTool {
    
    static public int[] parseString(String str) {
        String[] strArr = null;
        if (str.length() != 0) {
            strArr = str.split(",");
        }
        int[] intArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        return intArr;
    }
    
    static public String parseArray(String[] arr) {
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            str += arr[i];
            if (i != (arr.length - 1)) {
                str += ",";
            }
        }
        return str;
    }
}
