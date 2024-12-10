package app;

import app.anno.Author;
import app.anno.MethodInfo;

public class Main {
    public static void main(String[] args) {
        try {
            MethodInfo methodInfoLength = ArrayUtils.class
                    .getDeclaredMethod("length", Object[].class)
                    .getAnnotation(MethodInfo.class);

            System.out.println("Method name: " + methodInfoLength.name());
            System.out.println("Return type: " + methodInfoLength.returnType());
            System.out.println("Description: " + methodInfoLength.description());

            Author authorInfoStr = ArrayUtils.class
                    .getDeclaredMethod("toString", Object[].class)
                    .getAnnotation(Author.class);

            System.out.println("Author of toString: " + authorInfoStr.firstName() + " " + authorInfoStr.lastName());

        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }

    }
}
