package com.imc.model_attribute.controller;


import com.imc.model_attribute.dto.StudentSearchDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * Assume an api with many  query params
 * Ex : /api/students?class=9&section=B&branch=hyd&state=telangana&country=in
 *  class
 *  section
 *  branch
 *  state
 *  country
 *  etc etc
 *  Having more query params makes the code ugly and unmaintainable
 *  Solution : CustomDTO and @ModelAttribute annotation
 *
 */

@RestController
@RequestMapping("/api/students/")
@Slf4j
public class TestController {

    // BAD CODE
    // ASSUME THERE ARE MORE PARAMS.. LIKE 9-10

    @GetMapping("v1/")
    public ResponseEntity<String> badCodeExample(
            @RequestParam(name = "class") String className,
            @RequestParam String section,
            @RequestParam String branch,
            @RequestParam String state,
            @RequestParam String country
    ) {

        log.info("Request received with Params : class : {}, section : {}, branch : {}, state : {}, country, {}",className,section,branch,state, country);

        return  ResponseEntity.ok("OKK");

    }

    // GOOD CODE

    @GetMapping("v2/")
    public ResponseEntity<String> goodCodeExample(@ModelAttribute StudentSearchDTO studentSearchDTO) {
        log.info("Request received with Params : class : {}, section : {}, branch : {}, state : {}, country, {}",
                studentSearchDTO.className(),
                studentSearchDTO.section(),
                studentSearchDTO.branch(),
                studentSearchDTO.state(),
                studentSearchDTO.country());
        return  ResponseEntity.ok("OKK");
    }
}
