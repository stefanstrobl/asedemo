package at.tuwien.inso.ase.demo;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {

    public String helloWorld() {
        return "Hello World, man!";
    }

    public String hello(String user) {
        return "Hello " + user + "!";
    }
}
