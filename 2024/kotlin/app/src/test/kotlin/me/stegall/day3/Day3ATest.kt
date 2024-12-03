package me.stegall.day3

import me.stegall.utils.AOCTest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Day3ATest : AOCTest {
  @Test
  override fun evaluate_sample() {
    val sampleInput = "xmul(2,4)%&mul[3,7]!@^do_not_mul(5,5)+mul(32,64]then(mul(11,8)mul(8,5))"
    val day3A = Day3A(sampleInput)
    Assertions.assertEquals("161", day3A.evaluate())
  }

  @Test
  override fun evaluate_actual() {
    val day3A = Day3A()
    println(day3A.evaluate())
  }
}
