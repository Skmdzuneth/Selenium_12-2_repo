package Extentreports;

import java.time.LocalDateTime;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LearnExtentReport {
	
	@Test
	
	public void createReport() {
		
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		
		//step 1 :Create ExtentSparkReporter object
		ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_reports/extentreport_"+timestamp+".html");
		
		//step 2: Attach ExtentReports object
		ExtentReports eReport=new ExtentReports();
		
		//step 3: Attach ExtentSparkReporter to ExtentReports
		eReport.attachReporter(spark);
		
		//step 4:Create ExtentTest object (abstract class)
		ExtentTest test = eReport.createTest("createReport");
		
		//step 5:Call log(Status,"Message")
		test.log(Status.PASS, "log message added to report");
		
		//step 6:call flush()
		eReport.flush();
		
	}

}
