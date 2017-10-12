package sample;

import java.util.List;


/**
 * Created by arnoe on 2017/10/12.
 */
public class StringUtil {

    public static String join(List<String> strings, String delimeter) {
        return String.join(delimeter ,strings);
    }
}
