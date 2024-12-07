package me.stegall.day6

import me.stegall.utils.AOCTest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Day6BTest : AOCTest {
  @Test
  override fun evaluate_sample() {
    val sampleInput = """
      ....#.....
      .........#
      ..........
      ..#.......
      .......#..
      ..........
      .#..^.....
      ........#.
      #.........
      ......#...
    """.trimIndent()
    val day6B = Day6B(sampleInput)
    Assertions.assertEquals("6", day6B.evaluate())
  }

  @Test
  override fun evaluate_actual() {
    val day6B = Day6B()
    println(day6B.evaluate())
  }
}
