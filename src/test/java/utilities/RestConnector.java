package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// TODO: Auto-generated Javadoc
/**
 * The Class RestConnector.
 */
public class RestConnector {

	/** The logger. */
	final Logger logger = LoggerFactory.getLogger(RestConnector.class);

	/**
	 * Load JSON.
	 *
	 * @param fileName
	 *            the file name
	 * @return the string
	 */
	private String loadJSON(String fileName) {
		StringBuffer sb = new StringBuffer();
		if (fileName != null && !fileName.isEmpty()) {
			try (FileReader fr = new FileReader(fileName); BufferedReader br = new BufferedReader(fr)) {

				String line = br.readLine();
				while (line != null) {
					sb.append(line);
					line = br.readLine();
				}
			} catch (FileNotFoundException e) {
				logger.error("The file could not be found '{}'", fileName);
			} catch (IOException e) {
				logger.error("An error occurred while accessing the file", e);
			}

		} else {
			logger.info("No file specified");
		}
		return sb.toString();
	}

	/**
	 * Push results.
	 *
	 * @param host
	 *            the host
	 * @param user
	 *            the user
	 * @param pass
	 *            the pass
	 * @throws InterruptedException
	 *             the interrupted exception
	 * @throws Exception
	 *             the exception
	 */
	public void PushResults(String host, String user, String pass) throws InterruptedException, Exception {

		String jsonData = loadJSON("./target/cucumber-json-reports/cucumber.json");

		if (jsonData.isEmpty()) {
			logger.error("cucumber.json file is empty, so skipping the push result method");
			return;
		}

		try {
			String credentials = user + ":" + pass;
			byte[] encoding = Base64.encodeBase64(credentials.getBytes());

			HttpClient client = HttpClientBuilder.create().build();

			HttpPost postSet = new HttpPost(host + "/rest/raven/1.0/import/execution/cucumber");
			postSet.setHeader("Authorization", "Basic " + new String(encoding));
			// String JSON_STRING = arr.toString();
			StringEntity requestEntity = new StringEntity(jsonData, ContentType.APPLICATION_JSON);
			postSet.setEntity(requestEntity);
			HttpResponse rawResponse = client.execute(postSet);
			logger.info("Results pushed to jira");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
