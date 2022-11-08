package starter.projects;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;

public class Categori {
    private String url;

    public void getUrl() { url = "https://alta-shop.herokuapp.com/api/categories";}

    public void reqGetcategories() {
        given().when().get(url);
    }

    public void message200(){
        then().statusCode(200);
    }
}
