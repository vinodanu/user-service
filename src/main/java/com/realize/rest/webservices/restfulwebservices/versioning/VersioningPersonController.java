package com.realize.rest.webservices.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {
    //url versioning - eg : twitter
    @GetMapping("/v1/person")
    public PersonV1 getFirstVersionOfPerson() {
        return new PersonV1("Naresh Nunna");
    }

    @GetMapping("/v2/person")
    public PersonV2 getSecondVersionOfPerson() {
        return new PersonV2(new Name("Naresh", "Nunna"));
    }


    //http://localhost:8080/person?version=1 -> request parameter versioning - eg : Amazon
    @GetMapping(path = "/person", params = "version=1")
    public PersonV1 getFirstVersionOfPersonReqParam() {
        return new PersonV1("Naresh Nunna");
    }
    @GetMapping(path = "/person", params = "version=2")
    public PersonV2 getSecondVersionOfPersonReqParam() {
        return new PersonV2(new Name("Naresh", "Nunna"));
    }

}
