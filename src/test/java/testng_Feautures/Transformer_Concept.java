package testng_Feautures;

import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;

public class Transformer_Concept implements IAnnotationTransformer {
	@Override

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor,Method testMethod) {

		annotation.setRetryAnalyzer(Rerun.class);

	}
}
