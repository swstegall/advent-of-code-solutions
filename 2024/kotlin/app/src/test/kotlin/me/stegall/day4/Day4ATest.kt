package me.stegall.day4

import me.stegall.utils.AOCTest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Day4ATest : AOCTest {
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
    val day4A = Day4A(sampleInput)
    Assertions.assertEquals("18", day4A.evaluate())
  }

  @Test
  override fun evaluate_actual() {
    val day4A = Day4A()
    println(day4A.evaluate())
  }
}
