package utils.listeners;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;


public class RetryListener implements IAnnotationTransformer, ISuiteListener {

    @SuppressWarnings("rawtypes")
    @Override
    public void transform(ITestAnnotation testannotation, Class testClass, Constructor testConstructor,
	    Method testMethod) {
	IRetryAnalyzer retry = testannotation.getRetryAnalyzer();

	if (retry == null) {
	    testannotation.setRetryAnalyzer(RetryAnalyzer.class);
	}

    }

    @Override
    public void onStart(ISuite suite) {
    }

    @Override
    public void onFinish(ISuite suite) {

    }
}
