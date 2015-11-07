package org.ratchetrobotics.utilities.functors;

/**
 * Created by liam on 11/7/15.
 */
public interface BiFunction<T, U, R> {
  R apply(T t, U u);
}
