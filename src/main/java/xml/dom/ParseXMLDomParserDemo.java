package xml.dom;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class ParseXMLDomParserDemo {


    public static void main(String[] args) {

        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document d = (Document) db.parse(new File("/home/joker/IdeaProjects/JavaAPI/src/main/java/xml/demo.xml"));
            d.getDocumentElement().normalize();
            NodeList nodeList = d.getElementsByTagName("family");
            for(int i=0; i < nodeList.getLength();i++){
                Element element = (Element) nodeList.item(i);
                System.out.println("<" + element.getTagName() +">");
                NodeList nl = element.getElementsByTagName("person");
                for(int j=0; j < nl.getLength();j++) {
                    System.out.println("    <" + nl.item(j).getNodeName() + ">");
                    NodeList nl1 = ((Element)nl.item(j)).getElementsByTagName("name");
                    for(int j1=0; j1 < nl1.getLength();j1++) {
                        System.out.println("        <" + nl1.item(j1).getNodeName() + ">");
                        System.out.println("            " + nl1.item(j1).getFirstChild().getTextContent());
                        System.out.println("        </" + nl1.item(j1).getNodeName() + ">");
                    }
                    System.out.println("    </" + nl.item(j).getNodeName() + ">");
                }
                System.out.println("</" + element.getTagName() +">");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }



}
