package mailosaur.com;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

import com.mailosaur.MailosaurClient;
import com.mailosaur.MailosaurException;
import com.mailosaur.models.Message;
import com.mailosaur.models.MessageSearchParams;
import com.mailosaur.models.SearchCriteria;

public class EmailAutomation {
  @Test
  public void testExample() throws IOException, MailosaurException {
    // Available in the API tab of a server
    String apiKey = "y9INKiZOGx9TpW68OaZR3GA0cyrYNsqU";
    String serverId = "0ruv8zhj";
    String serverDomain = "0ruv8zhj.mailosaur.net";

    MailosaurClient mailosaur = new MailosaurClient(apiKey);

    MessageSearchParams params = new MessageSearchParams();
    params.withServer(serverId);

    SearchCriteria criteria = new SearchCriteria();
    criteria.withSentTo("anything@" + serverDomain);

    Message message = mailosaur.messages().get(params, criteria);
    System.out.println("******************   The Subject*****************");
    System.out.println(message.subject());
    System.out.println("******************   The To address  *****************");
    System.out.println(message.to().get(0).email());
    System.out.println("******************   The From adress   *****************");
    System.out.println(message.from().get(0).email());
    
    //OTP Fetching
    System.out.println("******************   The message body   *****************");
    System.out.println(message.text().body()); 
    Pattern pattern = Pattern.compile(".*([0-9]{6}).*");
    Matcher matcher = pattern.matcher(message.text().body());
    matcher.find();
    System.out.println("******************   The OTP Is   *****************");
    System.out.println(matcher.group(1));
    
    //Second way OTP Fetching
//    System.out.println(message.html().codes().size());
//    Code firstCode = message.html().codes().get(0);
//    System.out.println("******************   The OTP Is   *****************");
//    System.out.println(firstCode.value());


    


  }
}
