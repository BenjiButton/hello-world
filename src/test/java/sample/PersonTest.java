package sample;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by arnoe on 2017/10/12.
 */
public class PersonTest {

    @Test
    public void settingFirstname() throws Exception {
        Person person = new Person();
        person.setFirstName("Benji");
        assertEquals("Benji", person.getFirstName());
        person.setFirstName("Arnoe");
        assertEquals("Arnoe", person.getFirstName());
    }
}
