package org.ratchetrobotics.algorithms.utilities;

import org.ratchetrobotics.algorithms.ai.ResponseCurve;

/**
 * Created by liam on 10/8/15.
 */
public class JoystickScaler {
  private ResponseCurve responseCurve;

  public JoystickScaler() {
    responseCurve = new ResponseCurve(new double[]{0.0, 0.25, 0.75, 1.0},
      new double[]{0.0, 0.3, 0.8, 1});
  }

  public double in(double input) {
    double response = Math.abs(responseCurve.respond(Math.abs(input)));
    return (input > 0) ? (response) : (-response);
  }
}
