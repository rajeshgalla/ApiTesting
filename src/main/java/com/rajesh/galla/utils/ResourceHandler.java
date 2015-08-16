package com.rajesh.galla.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by rajeshgalla on 8/10/15.
 */
public class ResourceHandler {

    public static String getResource(String resourceName) throws IOException {

        Properties prop = new Properties();
        InputStream input = null;
        input = new FileInputStream("src/main/resources/resource.properties");

        // load a properties file
        prop.load(input);
        return prop.getProperty(resourceName);
    }
}
