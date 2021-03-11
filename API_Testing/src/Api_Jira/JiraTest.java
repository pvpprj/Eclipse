package Api_Jira;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import java.io.File;

public class JiraTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI = "http://localhost:8080";
		SessionFilter session=new SessionFilter();
		
	String response = given().header("Content-Type","application/json").body("{ \"username\": \"pvpprj@gmail.com\",\r\n" + 
			"\"password\": \"LALbahadur@902\" }").log().all().filter(session)
			.when().post("/rest/auth/1/session").then().log().all().extract().response().asString();
		
	//Add Comment
	String addCommentResponse =	given().pathParam("id", "10300").header("Content-Type","application/json").body("{\r\n" + 
				"    \"body\": \"I have Commented the BugID\",\r\n" + 
				"    \"visibility\": {\r\n" + 
				"        \"type\": \"role\",\r\n" + 
				"        \"value\": \"Administrators\"\r\n" + 
				"    }\r\n" + 
				"}").filter(session).when().post("/rest/api/2/issue/{id}/comment").then().log().all().assertThat().statusCode(201).extract().response().asString();
		
	JsonPath js=new JsonPath(addCommentResponse);
String commentId =js.getString("id");
		     		
   // Add Attachement
		given().header("X-Atlassian-Token", "no-check").filter(session).pathParam("id", "10300")
	.header("Content-Type","multipart/form-data")
	.multiPart("file", new File("C:\\Users\\Vishal\\eclipse-workspace\\API_Testing\\src\\Api_Jira\\jira.txt"))
	.when().post("rest/api/2/issue/{id}/attachments")
	.then().log().all().assertThat().statusCode(200);
		
		//Get Issure
		
	String issueDetails =	given().filter(session).pathParam("id", "10300").queryParam("fields", "comment").log().all()
		.when().get("rest/api/2/issue/{id}")
		.then().log().all().extract().response().asString();
	System.out.println(issueDetails);
		
	JsonPath js1=new JsonPath(issueDetails);
	int commentCount =js1.getInt("fields.comment.comments.size()");
	
	}
}