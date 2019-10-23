package lambdasinaction.appa;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(Authors.class) // Authors注解必须要有Author数组
@Retention(RetentionPolicy.RUNTIME)
public @interface Author {

    String name();

}
