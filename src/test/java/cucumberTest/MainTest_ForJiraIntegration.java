package cucumberTest;

import org.junit.runner.JUnitCore;

import utilities.TestListener;

// TODO: Auto-generated Javadoc
/**
 * The Class MainTest_ForJiraIntegration.
 */
public class MainTest_ForJiraIntegration {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {

		JUnitCore jcore = new JUnitCore();
		jcore.addListener(new TestListener());
		jcore.run(TestRunner.class);

	}
}
