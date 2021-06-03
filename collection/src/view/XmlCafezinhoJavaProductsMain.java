package view;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class XmlCafezinhoJavaProductsMain {

    public static void main(String[] args) throws Exception {
      DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
      DocumentBuilder builder = factory.newDocumentBuilder();
      Document route = builder.parse("collection/src/produto.xml");
      //---------------------------------------------------------------
      Element e = route.getDocumentElement();

      String n = e.getTextContent();

      System.out.println(n);

    }

}
