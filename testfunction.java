package testproject;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class testfunction {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder=factory.newDocumentBuilder();
			Document document=builder.newDocument();
			
			Element rootElement=document.createElement("cars");
			document.appendChild(rootElement);
			
			Element supercarElement=document.createElement("supercar");
			rootElement.appendChild(supercarElement);
			
			Attr a1=document.createAttribute("company");
			a1.setValue("Ferrari");
			supercarElement.setAttributeNode(a1);
			
			Element carnameElement=document.createElement("carname");
			Attr a2=document.createAttribute("type");
			a2.setValue("sports");
			carnameElement.setAttributeNode(a2);
			carnameElement.appendChild(document.createTextNode("Ferrari 202"));
			supercarElement.appendChild(carnameElement);
			
			TransformerFactory f=TransformerFactory.newInstance();
			Transformer t=f.newTransformer();
			DOMSource s=new DOMSource(document);
			StreamResult result=new StreamResult(new File("D:\\car.xml"));
			t.transform(s, result);
			
			StreamResult result1=new StreamResult(System.out);
			t.transform(s, result1);
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
