package com.realize.rest.webservices.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {
    //url versioning - eg : twitter
    @GetMapping("/v1/person")
    public PersonV1 getFirstVersionOfPerson() {
        return new PersonV1("Steeve Jobs");
    }

    @GetMapping("/v2/person")
    public PersonV2 getSecondVersionOfPerson() {
        return new PersonV2(new Name("Naresh", "Nunna"));
    }


    //http://localhost:8080/person?version=1 -> request parameter versioning - eg : Amazon
    @GetMapping(path = "/person", params = "version=1")
    public PersonV1 getFirstVersionOfPersonReqParam() {
        return new PersonV1("Steeve Jobs");
    }
    @GetMapping(path = "/person", params = "version=2")
    public PersonV2 getSecondVersionOfPersonReqParam() {
        return new PersonV2(new Name("Naresh", "Nunna"));
    }

    //http://localhost:8080/person/header in headers give key as "X-API-VERSION" and value "1" / "2" - eg : Microsoft

    @GetMapping(path = "/person/header", headers = "X-API-VERSION=1")
    public PersonV1 getFirstVersionOfPersonReqHeader() {
        return new PersonV1("Steeve Jobs");
    }
    @GetMapping(path = "/person/header", headers = "X-API-VERSION=2")
    public PersonV2 getSecondVersionOfPersonReqHeader() {
        return new PersonV2(new Name("Naresh", "Nunna"));
    }


}
