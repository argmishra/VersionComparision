package com.task;

public class MainApplication {

    public static void main (String args[]){

        // When first parameter is smaller version as compare to second parameter
        System.out.println("Version check result = "+compareVersions("1.10.3.2","1.11"));

        // When first parameter is greater version as compare to second parameter
        System.out.println("Version check result = "+compareVersions("1.3","1.2.9.9"));

        // When both parameters are equal
        System.out.println("Version check result = "+compareVersions("1.2","1.2"));
    }

    public static int compareVersions(String version1, String version2) throws NumberFormatException {
        String[] v1Array = version1.trim().split("\\.");
        String[] v2Array = version2.trim().split("\\.");
        int length = Integer.max(v1Array.length, v2Array.length);
        int val1 = 0;
        int val2 = 0;

        for (int i = 0; i < length; i++) {
            val1 = Integer.parseInt(i == v1Array.length ? "0" : v1Array[i]);
            val2 = Integer.parseInt(i == v2Array.length ? "0" : v2Array[i]);
            if (val1 != val2) break;
        }

        return Integer.signum(val1 - val2);
    }

}