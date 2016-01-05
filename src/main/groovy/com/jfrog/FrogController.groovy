package com.jfrog

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by alexistual on 05/01/2016.
 */
@RestController
@CrossOrigin(origins = "http://localhost:8000")
class FrogController {

    @Autowired
    FrogRepository frogRepository

    @RequestMapping('/frogs')
    List<Frog> frogs() {
        frogRepository.allFrogs
    }

}
