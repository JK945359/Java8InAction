package lambdasinaction.appa;

import java.util.Arrays;

@Author(name = "Raoul")
@Author(name = "Mario")
@Author(name = "Alan")
public class Book {

    public static void main(String[] args) {
        Author[] authors = Book.class.getAnnotationsByType(Author.class);
        Arrays.asList(authors).stream().forEach(a -> {
            System.out.println(a.name());
        });
        // 获取注解
        Author[] value = Book.class.getAnnotation(Authors.class).value();
        for (Author author : value) {
            System.out.println(author);
        }
    }

}
