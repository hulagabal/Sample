package sample;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlInclude;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class TestngExample {

	public static void main(String[] args) {
		XmlSuite suite = new XmlSuite();
		suite.setName("MySuite");
		suite.setParallel("true");
		suite.setVerbose(3);
		suite.addListener("sample.MyListener"); // add listener class

		XmlTest test1 = new XmlTest(suite);//Pass suite
		test1.setName("Test1");
		test1.setPreserveOrder("true");
		test1.setParallel("true");
		test1.setThreadCount(5);

		XmlTest test2 = new XmlTest(suite);
		test2.setName("Test2");
		test2.setPreserveOrder("true");

		XmlClass class1 = new XmlClass(Sample.class);
		
		List<XmlInclude> methods=new ArrayList<XmlInclude>();
		
		
		class1.setIncludedMethods(methods);
		XmlClass class2 = new XmlClass(Sample2.class);
		// Array list to add classes
		List<XmlClass> classes = new ArrayList<XmlClass>();
		classes.add(class1);
		classes.add(class2);

		test1.setClasses(classes);
		test2.setClasses(classes);

		TestNG testng = new TestNG();
		// array list to add suites
		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		suites.add(suite);

		testng.setXmlSuites(suites);

		testng.run();
	}

}
