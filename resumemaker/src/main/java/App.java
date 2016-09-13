
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("resume", request.session().attribute("resume"));
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/resume", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();

      ArrayList<Resume> resumes = request.session().attribute("resumes");
      if (resumes == null) {
        resumes = new ArrayList<Resume>();
        request.session().attribute("resumes", resumes);
      }

      String jobTitle = request.queryParams("position");
      String companyName = request.queryParams("companyName");
      String companyLocation = request.queryParams("companyLocation");
      String description = request.queryParams("description");
      String datesOfEmployment = request.queryParams("datesOfEmployment");
      Resume newJob = new Resume(jobTitle, companyName, companyLocation, description, datesOfEmployment);
      resumes.add(newJob);
      model.put("template", "templates/resume.vtl");
      model.put("resumes", resumes);
      return new ModelAndView(model, layout);
   }, new VelocityTemplateEngine());

  }
}
