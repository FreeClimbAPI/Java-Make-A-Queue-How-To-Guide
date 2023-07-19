/* 
 * AFTER RUNNING PROJECT WITH COMMAND: 
 * `gradle build && java -Dserver.port=0080 -jar build/libs/gs-spring-boot-0.1.0.jar`
 * RUN CURL COMMAND:
 * `curl {baseUrl}/makeQueue`
 */

package main.java.make_queue;

import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class MakeQueueController {
  // Get accountID and apiKey from environment variables
  public static void main(String[] args) {
    String accountId = System.getenv("ACCOUNT_ID");
    String apiKey = System.getenv("API_KEY");
    // Options payload to set alias and maximum size when creating the queue
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId(accountId);
    defaultClient.setApiKey(apiKey);

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    QueueRequest queueRequest = new QueueRequest();
    queueRequest.setAlias("example_queue");
    try {
      QueueResult response = apiInstance.createAQueue(queueRequest);
      System.out.println(response.getQueueId());
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#sendAnSmsMessage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}