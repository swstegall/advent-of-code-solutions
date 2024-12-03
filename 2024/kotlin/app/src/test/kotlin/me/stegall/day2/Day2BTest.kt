package me.stegall.day2

import me.stegall.utils.AOCTest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Day2BTest : AOCTest {
  @Test
  override fun evaluate_sample() {
    val sampleInput = """
      7 6 4 2 1
      1 2 7 8 9
      9 7 6 2 1
      1 3 2 4 5
      8 6 4 4 1
      1 3 6 7 9
    """.trimIndent()
    val day2B = Day2B(sampleInput)
    Assertions.assertEquals("4", day2B.evaluate())
  }

  @Test
  override fun evaluate_actual() {
    val day2B = Day2B()
    println(day2B.evaluate())
  }
}
