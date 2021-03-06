package org.squirrelframework.foundation.fsm.annotation;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Replaced by OnBeforeActionExecuted
 * @author kailianghe
 *
 */
@Target({METHOD})
@Retention(RUNTIME)
@Deprecated
public @interface OnActionExecute {
    String when() default "";
}
