package argentina_programa.claseQuince;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class XmlFile {

    public static void main(String[] args) throws ParserConfigurationException {

        Producto producto = new Producto();
        producto.setPrecio(52.0f);
        producto.setNombre("Plancha");
        producto.setStock(5);

        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

        Document doc = docBuilder.newDocument();
        Element rootElement = doc.createElement("producto");
        doc.appendChild(rootElement);

        Element laboratorio = doc.createElement("precio");
        rootElement.appendChild(laboratorio);
        laboratorio.appendChild(doc.createTextNode(String.valueOf(producto.getPrecio())));

        System.out.println(doc);




    }

}
