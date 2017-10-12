package sample;

import lombok.Getter;
import lombok.Setter;


/**
 * Created by arnoe on 2017/10/12.
 */
@Getter
@Setter
public class Person {

    private String firstName;
    private String lastName;

    public String getFullName() {
        return String.format("%s %s", firstName, lastName);
    }
}
