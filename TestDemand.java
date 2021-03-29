package testproject;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class TestDemand {

	public static void main(String[] args) {
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		DocumentBuilder builder;
		try {
			builder = factory.newDocumentBuilder();
			Document doc=builder.parse(new File("src/testproject/item.xml"));
			doc.getDocumentElement().normalize();
			//System.out.println(doc.toString());
			//create outputDoc
			Document outDoc=builder.newDocument();
			Element rootElement = outDoc.createElement("Items");
			System.out.println("Document : "+outDoc.getNodeType());
			List<Document> dList=new ArrayList<>();        
			NodeList Items=doc.getElementsByTagName("Item");
			for(int i=0;i<Items.getLength();i++)
			{
				Element item=(Element)Items.item(i);
				//dList.add();
				
			}
			
			List<String> l=new ArrayList<>();
			l.add("a");
			if(l.contains("a"))
				System.out.println("String alreday present in List");
			
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
