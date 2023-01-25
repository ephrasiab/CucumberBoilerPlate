package com.trello.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class EnvironmentReader {

    static{
        Properties properties = null;
        String environment = System.getProperty("environment") != null ? environment = System.getProperty("environment") : ConfigurationReader.getProperty("environment");
        try {
                //current working directory is "user.dir" which means "/Users/mac/IdeaProjects/Bookit" (write pwd on terminal)
            String path = System.getProperty("user.dir") + "/src/test/resources/Environments/" + environment + ".properties";

            FileInputStream input = new FileInputStream(path);
            properties = new Properties();
            properties.load(input);
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
