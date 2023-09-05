package com.test.map;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.xerces.parsers.DOMParser;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import com.opencsv.CSVWriter;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class XMLToCSVConverter {
    public static void main(String args[]) throws Exception {
        //usingXSLS();
        usingDomParser("/Users/bkarmarkar/Downloads/burp_1_report.xml", "/Users/bkarmarkar/Downloads/burp_1_report.csv");
    }

    private static void usingXSLS() throws ParserConfigurationException, SAXException, IOException, TransformerException {
        File stylesheet = new File("samples/src/main/resources/style.xsl");
        File xmlSource = new File("/Users/bkarmarkar/Downloads/burp_1_report.xml");

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(xmlSource);

        StreamSource stylesource = new StreamSource(stylesheet);
        Transformer transformer = TransformerFactory.newInstance()
                .newTransformer(stylesource);
        Source source = new DOMSource(document);
        Result outputTarget = new StreamResult(new File("/Users/bkarmarkar/Downloads/burp_1_report.csv"));
        transformer.transform(source, outputTarget);
    }

    private static void usingDomParser(String inputFilePath, String outputFilePath) {
        /*
         * We assume that we know the structure and the column names of the CSV file
         */
        String[] csvHeaders = new String[]{"serialNumber", "type", "name", "host", "path", "location", "severity", "confidence", "issueBackground", "remediationBackground", "references", "vulnerabilityClassifications"};
        /*
         * Using Xerces DOM parser directly"," same can also be achieved through JAXP
         */
        DOMParser parser = new DOMParser();
        try (FileInputStream fis = new FileInputStream(inputFilePath);
             CSVWriter writer = new CSVWriter(new FileWriter(outputFilePath));) {
            writer.writeNext(csvHeaders);

            InputSource source = new InputSource(fis);
            parser.parse(source);

            Element documentElement = parser.getDocument().getDocumentElement();
            NodeList elementBList = documentElement.getElementsByTagName("issue");
            for (int i = 0; i < elementBList.getLength(); i++) {
                Element elementB = (Element) elementBList.item(i);
                Element serialNumber = (Element) elementB.getElementsByTagName("serialNumber").item(0);
                Element type = (Element) elementB.getElementsByTagName("type").item(0);
                Element name = (Element) elementB.getElementsByTagName("name").item(0);
                Element host = (Element) elementB.getElementsByTagName("host").item(0);
                Element path = (Element) elementB.getElementsByTagName("path").item(0);
                Element location = (Element) elementB.getElementsByTagName("location").item(0);
                Element severity = (Element) elementB.getElementsByTagName("severity").item(0);
                Element confidence = (Element) elementB.getElementsByTagName("confidence").item(0);
                Element issueBackground = (Element) elementB.getElementsByTagName("issueBackground").item(0);
                Element remediationBackground = (Element) elementB.getElementsByTagName("remediationBackground").item(0);
                Element references = (Element) elementB.getElementsByTagName("references").item(0);
                Element vulnerabilityClassifications = (Element) elementB.getElementsByTagName("vulnerabilityClassifications").item(0);

                String[] line = new String[]{serialNumber.getFirstChild().getNodeValue(),
                        type == null? "" : type.getFirstChild().getNodeValue(),
                        name == null? "" : name.getFirstChild().getNodeValue(),
                        host == null? "" : host.getFirstChild().getNodeValue(),
                        path == null? "" : path.getFirstChild().getNodeValue(),
                        location == null? "" : location.getFirstChild().getNodeValue(),
                        severity == null? "" : severity.getFirstChild().getNodeValue(),
                        confidence == null? "" : confidence.getFirstChild().getNodeValue(),
                        issueBackground == null? "" : issueBackground.getFirstChild().getNodeValue(),
                        remediationBackground == null? "" : remediationBackground.getFirstChild().getNodeValue(),
                        references == null? "" : references.getFirstChild().getNodeValue(),
                        vulnerabilityClassifications == null? "" : vulnerabilityClassifications.getFirstChild().getNodeValue()
                };

                writer.writeNext(line);
            }

            writer.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
