package org.acme;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author GERARDO
 */
public class Inicio {

    public static void main(String args[]) {
        try {

            Map<String, String> dbParamsMap = new HashMap<String, String>();
            dbParamsMap.put("dbms", "mysqL");
            dbParamsMap.put("serverName", "localhost");
            dbParamsMap.put("database", "reto");
            dbParamsMap.put("portNumber", "3306");
            dbParamsMap.put("userName", "root");
            dbParamsMap.put("password", "12345678");
            dbParamsMap.put("logFileFolder", "C:\\Logs");
            
            Demo demo = new Demo(true, true, true, true, true, true, dbParamsMap);
            demo.LogMessage("PROCESO", true, true, true);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
