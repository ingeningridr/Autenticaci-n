package com.example.springboot.telefonia;

//import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class XMLDeserialize {
    public void whenJavaGotFromXmlFile_thenCorrect() throws IOException {
        File file = new File("src/main/resources/wsdl/test.xml");
        //XmlMapper xmlMapper = new XmlMapper();
        //String xml = inputStreamToString(new FileInputStream(file));
        //Test value = xmlMapper.readValue(xml, Test.class);
        
    }
}

