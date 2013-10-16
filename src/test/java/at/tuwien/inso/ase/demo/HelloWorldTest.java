package at.tuwien.inso.ase.demo;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {

    HelloWorld helloWorld;

    @Before
    public void setUp() throws Exception {
        helloWorld = new HelloWorld();
    }

    @Test
    public void testHello() throws Exception {
        String user = "John";

        String result = helloWorld.hello(user);

        Assert.assertTrue(result.contains(user));
    }
}
