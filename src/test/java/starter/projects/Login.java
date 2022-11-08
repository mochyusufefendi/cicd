package starter.projects;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.*;
import static net.serenitybdd.rest.SerenityRest.then;

public class Login {
    private String url, body;

    public void setUrl() { url = "https://alta-shop.herokuapp.com/api/auth/login";}

    public JSONObject inputBody(){
        JSONObject body = new JSONObject();
        body.put("email", "someone@mail.com");
        body.put("password", "123123");
        return body;
    }

    public JSONObject inputValidBody(){
        JSONObject body = new JSONObject();
        body.put("email", "mochyusufefendi25@gmail.com");
        body.put("password", "123123");
        return body;
    }

    public JSONObject inputWrongPassword(){
        JSONObject body = new JSONObject();
        body.put("email", "someone@mail.com");
        body.put("password", "123456");
        return body;
    }

    public void requestLogin(){
        given().body(inputBody());
        when().post(url);
    }

    public void inputValidbody(){
        given().body(inputValidBody());
        given().header("Content-Type", "application/json");
        when().post(url);
    }

    public void inputWrongpassword(){
        given().body(inputWrongPassword());
        given().header("Content-Type", "application/json");
        when().post(url);
    }

    public void statusCode200() {
        then().statusCode(200);
    }
    public void validateErorMessage400() { then().statusCode(400);}
}
