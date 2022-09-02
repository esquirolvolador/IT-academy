package cat.itacademy.barcelonactiva.cognoms.nom.s04.t01.n01.S04T01N01PuigTorreroArianna.Controllers;
import org.springframework.web.bind.annotation.*;


@RestController

public class HelloWorldController {


  @GetMapping("/HelloWorld")
  @ResponseBody
  public String saluda(@RequestParam(value = "nom", defaultValue = "UNKNOWN") String nom){

    return String.format("Hola, " + nom + ". Estàs executant un projecte Maven");
  }

  @GetMapping({"/HelloWorld2", "/HelloWorld2/{nom}"})
  @ResponseBody
  public String saluda2(@PathVariable(required = false) String nom){

   return String.format("Hola, " + nom + ". Estàs executant un projecte Maven");
  }
}
