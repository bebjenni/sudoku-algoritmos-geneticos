/*
 * This file is part of JGAP.
 *
 * JGAP offers a dual license model containing the LGPL as well as the MPL.
 *
 * For licensing information please see the file license.txt included with JGAP
 * or have a look at the top of class org.jgap.Chromosome which representatively
 * includes the JGAP license policy applicable for any file delivered with JGAP.
 */
package jgap.examples.src.examples.gp.symbolicRegression;

/*
  hakank: This is my take of the Gaussian function.

  I just copied the org.jgap.gp.function.Log and changed
  accordingly...

 */

import org.jgap.*;
import org.jgap.gp.*;
import org.jgap.gp.impl.*;
import org.jgap.util.*;

/**
 * Returns the natural logarithm (base e) of a double value.
 *
 * @author Klaus Meffert
 * @since 3.5
 */
public class Gaussian
    extends MathCommand implements ICloneable {
  /** String containing the CVS revision. Read out via reflection!*/
  private final static String CVS_REVISION = "$Revision: 1.1 $";

  public Gaussian(final GPConfiguration a_conf, Class a_returnType)
      throws InvalidConfigurationException {
    super(a_conf, 1, a_returnType);
  }

  public String toString() {
    return "gaussian &1";
  }

  /**
   * @return textual name of this command
   *
   * @author Hakan Kjellerstrand (based on Klaus Meffert's Log file)
   */
  public String getName() {
    return "Gaussian";
  }

  public float execute_float(ProgramChromosome c, int n, Object[] args) {
    float f = c.execute_float(n, 0, args);
    return (float) Math.exp( -f * f);
  }

  public double execute_double(ProgramChromosome c, int n, Object[] args) {
    double d = c.execute_double(n, 0, args);
    return Math.exp( -d * d);
  }

  public Object execute_object(ProgramChromosome c, int n, Object[] args) {
    return ( (Compatible) c.execute_object(n, 0, args)).execute_gaussian();
  }

  protected interface Compatible {
    public Object execute_gaussian();
  }
  /**
   * Clones the object. Simple and straight forward implementation here.
   *
   * @return cloned instance of this object
   *
   * @author Hakan Kjellerstrand (based on Klaus Meffert's Log file)
   */
  public Object clone() {
    try {
      Gaussian result = new Gaussian(getGPConfiguration(), getReturnType());
      return result;
    } catch (Exception ex) {
      throw new CloneException(ex);
    }
  }
}
