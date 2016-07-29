package bootwildfly;

import org.junit.*;
/*import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;*/
//import org.hamcrest.Matchers.*;
//import restassured.module.jsv.JsonSchemaValidator.*;

import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static com.jayway.restassured.module.jsv.JsonSchemaValidator.*;

public class TestDirlididi {
	
	public TestDirlididi(){
		baseURI = "http://localhost/";
		port = 8080;
		authentication = basic("dirli", "dirli");
		
	}
	
	@Test
	public void testarRotasApi(){
		//given().param("nome", "bernard");
		//given().when().post("/admin/cadastro");
		//given().then().statusCode(200);
		//given().then().body("status", is("success"));
		//given().then().body("mensage",containsString("bernard"));
		//given()
		  //    .then().body("mensage",containsString("administradores"));
		
		given()
		      .when().get("/admin");		
		given()
	      .then().get("admnistradores");
		given()
	      .then().statusLine("200");
		
		given()
	      .when().get("/user/login");
		given()
		   .then().get("login do usuario");
		
		given()
	      .when().post("/usuarios/cadastro?name=bernard");
		given()
		   .then().get("epaa");
		
		given()
	      .when().get("/admin/cadastro?name=bernard");
		given()
		   .then().get("bernard");
		
		given()
	      .when().get("/usuarios");
		given()
		   .then().get("usuarios");
		
		given()
	      .when().post("/problemas/problemaID/submit");
		given()
		   .then().get("bsubmetendo uma solucao");	
		
		given()
	      .when().post("/problemas/problemaID/edit");
		given()
		   .then().get("editando uma solucao");
		
		given()
	      .when().get("/problemas/problemaID");
		given()
		   .then().get("mostra detalhes do problema escolhido");
		
		given()
	      .when().post("/problemas/create");
		given()
		   .then().get("tela de criar um problema");
		
		given()
	      .when().get("/problemas");
		given()
		   .then().get("deve mostra uma tela cheio de problemas");
		
		
		given()
	      .when().get("/home");
		given()
		   .then().get("Bem vindo!!");
		
		
	}
	
	//get("/admin").then().body("admin", equals("administradores"));



}
