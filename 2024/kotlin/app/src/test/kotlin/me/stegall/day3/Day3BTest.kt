package me.stegall.day3

import me.stegall.utils.AOCTest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Day3BTest : AOCTest {
  @Test
  override fun evaluate_sample() {
    val sampleInput = "xmul(2,4)&mul[3,7]!^don't()_mul(5,5)+mul(32,64](mul(11,8)undo()?mul(8,5))"
    val day3B = Day3B(sampleInput)
    Assertions.assertEquals("48", day3B.evaluate())
  }

  @Test
  override fun evaluate_actual() {
    val day3B = Day3B()
    println(day3B.evaluate())
  }
}
