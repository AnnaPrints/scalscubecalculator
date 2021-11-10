package my.project

import org.scalatest.FunSuite

class CubeCalculatorTest extends FunSuite {
  test("CubeCalculator.cube") {
    assert(CubeCalculator.cube(3) === 27)
  }
  test("CubeCalculator.cube.failing") {
    assert(CubeCalculator.cube(3) === 26)
  }
}
