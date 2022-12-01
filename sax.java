import java.io.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;
public class Parsing_SAXDemo
{
public static void main(String[] args) throws IOException
{
try
{
System.out.print("Enter the name of XML document ");
BufferedReader input = new BufferedReader(new
InputStreamReader(System.in));
String file_name = input.readLine();
File fp = new File(file_name);
if (fp.exists())
68
{
try
{
SAXParserFactory saxFactory=SAXParserFactory . newInstance();
XMLReader reader = saxFactory.newSAXParser().getXMLReader();
reader.parse(file_name);
System.out.println(file_name + " is well-formed.");
}
catch (Exception e)
{
System.out.println(file_name + " is not well-formed.");
System.exit(1);
}
}
else
{
System.out.println("File is not present: " + file_name);
}
}
catch (IOException ex){ex.printStackTrace();}
}
}
69
Student2.xml
<?xml version="1.0" ?>
<student>
 <Roll_No>10</Roll_No>
<Personal_Info>
 <Name>Parth</Name>
 <Address>Pune</Address>
 <Phone>1234567890</Phone>
 </Personal_Info>
 <class>Second</class>
 <Subject>Mathematics</Subject>
 <Marks>100</Marks>
 </student>
