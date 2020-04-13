package webdev;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/entities")
public class DemoController {

  @GetMapping(value = "/{id}")
  public ResponseEntity<String> findEntity(@PathVariable String id) {
    //String entity = this.someBusinessService.findEntity(id);
    return new ResponseEntity<>("Akriti", HttpStatus.OK);
  }
  
  
}