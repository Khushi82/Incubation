package com.epam.selenium.dataproviders;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestNGMethod;
import org.testng.xml.XmlSuite;

public class ReportListener implements IReporter {
	@Override
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		
		ISuite suite = suites.get(0);
        Map<String, Collection<ITestNGMethod>> methodsByGroup = suite.getMethodsByGroups();
		Map<String, ISuiteResult> result = suite.getResults();
		for(String k : result.keySet())
		{
			System.out.println(k+"   "+ result.get(k));
		}
	}
	

}
