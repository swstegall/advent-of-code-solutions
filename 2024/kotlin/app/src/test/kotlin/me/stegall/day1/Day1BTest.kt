package me.stegall.day1

import me.stegall.utils.AOCTest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Day1BTest : AOCTest {
  override fun evaluate_sample() {
    val sampleInput = """
      3   4
      4   3
      2   5
      1   3
      3   9
      3   3
    """.trimIndent()
    val day1B = Day1B(sampleInput)
    Assertions.assertEquals("31", day1B.evaluate())
  }

  override fun evaluate_actual() {
    val day1B = Day1B()
    println(day1B.evaluate())
  }
}
