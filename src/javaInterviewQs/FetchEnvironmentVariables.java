package javaInterviewQs;

import java.util.Map;

public class FetchEnvironmentVariables {

	public static void main(String[] args) {

        // Get the map of environment variables
        Map<String, String> envVars = System.getenv();
        
        // Iterate over the map and print each environment variable
        for (Map.Entry<String, String> entry : envVars.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }
    
	}

}


