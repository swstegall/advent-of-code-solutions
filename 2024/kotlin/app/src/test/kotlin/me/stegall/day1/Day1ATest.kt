package me.stegall.day1

import me.stegall.utils.AOCTest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Day1ATest : AOCTest {
  @Test
  override fun evaluate_sample() {
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
  override fun evaluate_actual() {
    val day1A = Day1A()
    println(day1A.evaluate())
  }
}
