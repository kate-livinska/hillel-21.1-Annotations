package app;

import app.anno.Author;
import app.anno.MethodInfo;

import java.util.Arrays;

public class ArrayUtils {
    @MethodInfo(name = "toString", returnType = "String", description = "Returns array as String")
    @Author(firstName = "Kate", lastName = "L")
    public static String toString(Object[] array) {
        return Arrays.toString(array);
    }

    @MethodInfo(name = "length", returnType = "int", description = "Returns array length")
    @Author(firstName = "Kate", lastName = "L")
    public static int length(Object[] array) {
        return array.length;
    }
}
