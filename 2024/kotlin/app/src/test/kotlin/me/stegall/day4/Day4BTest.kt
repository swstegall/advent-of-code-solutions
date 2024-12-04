package me.stegall.day4

import me.stegall.utils.AOCTest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Day4BTest : AOCTest {
  @Test
  override fun evaluate_sample() {
    val sampleInput = """
      MMMSXXMASM
      MSAMXMSMSA
      AMXSXMAAMM
      MSAMASMSMX
      XMASAMXAMM
      XXAMMXXAMA
      SMSMSASXSS
      SAXAMASAAA
      MAMMMXMMMM
      MXMXAXMASX
    """.trimIndent()
    val day4B = Day4B(sampleInput)
    Assertions.assertEquals("9", day4B.evaluate())
  }

  @Test
  override fun evaluate_actual() {
    val day4B = Day4B()
    println(day4B.evaluate())
  }
}
