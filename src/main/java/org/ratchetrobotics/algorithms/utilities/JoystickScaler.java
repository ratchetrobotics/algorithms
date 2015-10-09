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
    // there is a good reason for all the Math.abs on the next line.
    // we clamp the input to [0, 1] from the joystick. then we clamp the output of .respond to [0, 1] as well.
    // this is to not have to manually mirror the response curve on [-1, 0].
    double response = Math.abs(responseCurve.respond(Math.abs(input)));
    // this line re-adds the correct sign. this makes it impossible for a screwy interpolation
    // to run motors in the wrong direction
    return (input > 0) ? (response) : (-response);
  }
}
