package com.sxq.eurekaclientservicehello.web.utils;


public class ConvertUtil {

    /**
     * convert String array into int array
     * @param strArr
     * @return
     */
    public static int[] convertToIntArr(String[] strArr) {
        int[] res = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            res[i] = Integer.parseInt(strArr[i]);
        }
        return res;
    }
}
