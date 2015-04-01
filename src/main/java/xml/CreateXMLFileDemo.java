package xml;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class CreateXMLFileDemo {

    public static void main(String[] args) {

        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.newDocument();

            Element car = doc.createElement("cars");
            doc.appendChild(car);

            Element supercar = doc.createElement("supercars");
            car.appendChild(supercar);
            Attr atrCom = doc.createAttribute("company");
            atrCom.setValue("Ferrari");
            supercar.setAttributeNode(atrCom);

            Element carname = doc.createElement("carname");
            Attr atrCar = doc.createAttribute("type");
            atrCar.setValue("formula 1");
            carname.setAttributeNode(atrCar);
            carname.appendChild(doc.createTextNode("Ferrari 101"));
            supercar.appendChild(carname);

            Element carname1 = doc.createElement("carname");
            Attr atrCar1 = doc.createAttribute("type");
            atrCar1.setValue("sports");
            carname1.setAttributeNode(atrCar1);
            carname1.appendChild(doc.createTextNode("Ferrari 202"));
            supercar.appendChild(carname1);

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult streamResult = new StreamResult(new File("/home/joker/IdeaProjects/JavaAPI/src/main/java/xml/cars.xml"));
            transformer.transform(source,streamResult);

            StreamResult streamResultOut = new StreamResult(System.out);
            transformer.transform(source,streamResultOut);

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}

//<?xml version="1.0" encoding="UTF-8" standalone="no"?>
//<cars><supercars company="Ferrari">
//   <carname type="formula 1">Ferrari 101</carname>
//   <carname type="sports">Ferrari 202</carname>
//</supercars></cars>
