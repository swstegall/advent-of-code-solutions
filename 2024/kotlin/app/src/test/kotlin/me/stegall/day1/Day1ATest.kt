package me.stegall.day1

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Day1ATest {
  @Test
  fun evaluate_sample() {
    val sampleInput = """
      3   4
      4   3
      2   5
      1   3
      3   9
      3   3
    """.trimIndent()
    val day1A = Day1A(sampleInput)
    Assertions.assertEquals("11", day1A.evaluate())
  }

  @Test
  fun evaluate_actual() {
    val day1A = Day1A()
    println(day1A.evaluate())
  }
}