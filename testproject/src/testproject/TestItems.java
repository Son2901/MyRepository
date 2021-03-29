package testproject;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class TestItems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		DocumentBuilder builder;
		try {
			builder = factory.newDocumentBuilder();
			Document doc=builder.parse(new File("src/testproject/itemList.xml"));
			doc.getDocumentElement().normalize();
			System.out.println("ItemID: "+doc.getDocumentElement().getNodeName()		);	/*
			 * NodeList Items=doc.getElementsByTagName("Item"); for(int
			 * i=0;i<Items.getLength();i++) { Node item=Items.item(i);
			 * if(item.getNodeType()==Node.ELEMENT_NODE) { Element itemElement=(Element)
			 * item; if("NS".equals(itemElement.getAttribute("ItemType"))) {
			 * System.out.println("ItemID is " +itemElement.getAttribute("ItemID")); } } }
			 */
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
