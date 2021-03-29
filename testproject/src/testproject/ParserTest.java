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

public class ParserTest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		try {
			//File f=
			DocumentBuilder builder=factory.newDocumentBuilder();
			//Document document=builder.parse(new File("D:\\laptops.xml"));
			Document document=builder.parse(new File("src/testproject/laptops.xml"));
			document.getDocumentElement().normalize();
			Element r=document.getDocumentElement();
			System.out.println("ROOT : "+r.getNodeName());
			NodeList laptopList=document.getElementsByTagName("laptop");
			for(int i=0; i<laptopList.getLength();i++)
			{
				Node laptop=laptopList.item(i);
				if(laptop.getNodeType()==Node.ELEMENT_NODE)
				{
					Element laptopElement=(Element) laptop;
					System.out.println("Laptop Name : "+laptopElement.getAttribute("name"));
					NodeList laptopDetails=laptop.getChildNodes();
					for(int j=0;j<laptopDetails.getLength();j++)
					{
						Node detail=laptopDetails.item(j);
						if(detail.getNodeType()==Node.ELEMENT_NODE)
						{
							Element detailElement=(Element) detail;
							System.out.println(" "+detailElement.getTagName()+ ":" +detailElement.getAttribute("value"));
						}
					}
				}
			}
			
			
		} catch (ParserConfigurationException | SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("HI");
	}

}
