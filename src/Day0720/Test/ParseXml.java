package Day0720.Test;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

public class ParseXml {
        private List<Element> list;

        public ParseXml(String path){
                SAXReader read = new SAXReader();

                try {
                        Document doc = read.read(new File("src/"+path));
                        Element root = doc.getRootElement();
                        this.list=root.elements();
                } catch (DocumentException e) {
                        e.printStackTrace();
                }
        }
        public List<Element> getList(){
                return list;
        }
}
