package org.api;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;
public class TestApi {

    private static final String BASE_URL = "https://jsonplaceholder.typicode.com";


    @Test
    public void testGet() {
        String execPath = "/posts";


        System.out.println("Execute: " + BASE_URL + execPath);

        JsonPath resp = RestAssured.given()
                .baseUri(BASE_URL)
                .when()
                .get(execPath)
                .then()
                .log().body(true)
                .assertThat()
                .statusCode(200)
                .extract()
                .jsonPath();

        Assertions.assertThat(resp.getList("id")).isNotEmpty();
        Assertions.assertThat(resp.getList("userId")).allMatch(userId -> userId != null);
        Assertions.assertThat(resp.getList("title")).allMatch(title -> title != null);
        Assertions.assertThat(resp.getList("body")).allMatch(body -> body != null);

       // Assertions.assertThat(resp.getInt("[0].id")).isGreaterThan(0);
       // Assertions.assertThat(resp.getInt("[0].userId")).isGreaterThan(0);

    }

}
