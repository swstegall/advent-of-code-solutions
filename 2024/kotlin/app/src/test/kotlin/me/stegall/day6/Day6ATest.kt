package me.stegall.day6

import me.stegall.utils.AOCTest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Day6ATest : AOCTest {
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
    val day6A = Day6A(sampleInput)
    Assertions.assertEquals("41", day6A.evaluate())
  }

  @Test
  override fun evaluate_actual() {
    val day6A = Day6A()
    println(day6A.evaluate())
  }
}
