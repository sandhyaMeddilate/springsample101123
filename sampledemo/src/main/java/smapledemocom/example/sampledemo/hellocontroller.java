package smapledemocom.example.sampledemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellocontroller {
    @GetMapping("/Hello")
    public ResponseEntity Helloworld(){
        person p = new person("Sandhya",23,"Hey! What's up?");
        return ResponseEntity.ok(p);
    }
}
