package com.bootcoding.dsa.Leetcode;

public class ExcelSheetColumnTitle168 {
    public String convertToTitle(int columnNo) {
        String str= "";
        while(columnNo>0){
            columnNo--;
            str = (char)(columnNo%26+'A')+ str;
            columnNo =columnNo/26;
        }
            return str;
    }
}
