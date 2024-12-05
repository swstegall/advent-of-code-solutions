package me.stegall.day5

import me.stegall.utils.AOCTest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Day5BTest : AOCTest {
  @Test
  override fun evaluate_sample() {
    val sampleInput = """
      47|53
      97|13
      97|61
      97|47
      75|29
      61|13
      75|53
      29|13
      97|29
      53|29
      61|53
      97|53
      61|29
      47|13
      75|47
      97|75
      47|61
      75|61
      47|29
      75|13
      53|13

      75,47,61,53,29
      97,61,53,29,13
      75,29,13
      75,97,47,61,53
      61,13,29
      97,13,75,29,47
    """.trimIndent()
    val day5B = Day5B(sampleInput)
    Assertions.assertEquals("123", day5B.evaluate())
  }

  @Test
  override fun evaluate_actual() {
    val day5B = Day5B()
    println(day5B.evaluate())
  }
}
