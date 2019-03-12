package utilities;

import org.junit.runner.Result;
import org.junit.runner.notification.RunListener;

// TODO: Auto-generated Javadoc
/**
 * The listener interface for receiving test events. The class that is
 * interested in processing a test event implements this interface, and the
 * object created with that class is registered with a component using the
 * component's <code>addTestListener<code> method. When the test event occurs,
 * that object's appropriate method is invoked.
 *
 * @see TestEvent
 */
public class TestListener extends RunListener {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.junit.runner.notification.RunListener#testRunFinished(org.junit.runner.
	 * Result)
	 */
	@Override
	public void testRunFinished(Result result) throws Exception {

		/***
		 * @param host
		 *            - base URL of your jira instance (e.g. "http://localhost:8080")
		 * @param user
		 *            - username of the upload user
		 * @param pass
		 *            - password of the upload user
		 */

		String host = "http://localhost:8082";
		String user = "priyrai";
		String pass = "jira@123";
		Thread.sleep(4000);
		RestConnector rs = new RestConnector();
		try {
			rs.PushResults(host, user, pass);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
