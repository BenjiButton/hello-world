package sample;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


/**
 * Created by arnoe on 2017/10/12.
 */
public class StringUtilTest {

    @Test
    public void join() throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Benji");
        strings.add("Arnoe");
        strings.add("Francois");
        strings.add("Matthew");
        assertEquals("Benji,Arnoe,Fracois,Matthew", StringUtil.join(strings, ","));
    }
}
