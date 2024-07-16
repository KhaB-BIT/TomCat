package com.example.TomCat;


import org.springframework.web.bind.annotation.*;

@RestController
public class TomCatController {

    @RequestMapping(value = "/api/test", method = RequestMethod.POST)
    public @ResponseBody String test() {
        return "Hello world";
    }

    @RequestMapping(value = "/api/test1", method = RequestMethod.POST)
    public @ResponseBody String test1(@RequestBody MyRequest request) {
        return request.toString();
    }

    public static class MyRequest {
        private String name;
        private String address;

        public MyRequest() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        @Override
        public String toString() {
            return "MyRequest{" +
                    "name='" + name + '\'' +
                    ", address='" + address + '\'' +
                    '}';
        }
    }
}
