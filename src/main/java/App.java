import Models.Squad;
import Models.Hero;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class App {


    public static void main(String[] args) {

        staticFileLocation("/public");

        // Route to our index/home page
        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "first-view.hbs");
        }, new HandlebarsTemplateEngine());

        // Route to retrieve content inputted by the user*/
        get("/squads/new", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "new-squad.hbs");
        }, new HandlebarsTemplateEngine());




    }

}
