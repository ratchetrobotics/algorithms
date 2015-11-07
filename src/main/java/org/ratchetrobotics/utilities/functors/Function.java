package org.ratchetrobotics.utilities.functors;

/**
 * Created by liam on 11/7/15.
 */
public interface Function<T, R> {
  R apply(T t);
}
