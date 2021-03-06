package net.data.technology.jraft.extensions;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class ExtensionsTestRunner {

	public static void main(String[] args) {
		 Result result = JUnitCore.runClasses(BinaryUtilTests.class);
		 for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
		 System.out.println(result.wasSuccessful());
		 
		 result = JUnitCore.runClasses(FileBasedSequentialLogStoreTests.class);
		 for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
		 System.out.println(result.wasSuccessful());

		 result = JUnitCore.runClasses(FileBasedServerStateManagerTests.class);
		 for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
		 System.out.println(result.wasSuccessful());
		 
		 result = JUnitCore.runClasses(GsonSerializationTests.class);
		 for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
		 System.out.println(result.wasSuccessful());
		 
		 result = JUnitCore.runClasses(H2LogStoreTests.class);
		 for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
		 System.out.println(result.wasSuccessful());
	}
}
