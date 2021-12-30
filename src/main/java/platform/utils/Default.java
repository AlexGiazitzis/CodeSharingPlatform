package platform.utils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Custom annotation that's used to define the default constructor used
 * by mapstruct mappings code generation.
 *
 * @author Alex Giazitzis
 * @link https://mapstruct.org/documentation/stable/reference/html/#non-shipped-annotations
 */
@Target(ElementType.CONSTRUCTOR)
@Retention(RetentionPolicy.CLASS)
public @interface Default {

}
