package me.stegall.day2

import me.stegall.utils.AOCProblem
import kotlin.math.abs

class Day2A(val input: String = day2Input) : AOCProblem {
  private fun createListsFromInput(input: String): List<List<Int>> {
    val result = mutableListOf<MutableList<Int>>()
    val lines = input.lines()
    for (line in lines) {
      result.add(
        line
          .trim()
          .split("\\s+".toRegex())
          .map { it.toInt() }
          .toMutableList()
      )
    }
    return result
  }

  override fun evaluate(): String {
    // Parse lines into lists of ints.
    val lines = createListsFromInput(input)

    var counter = 0
    for (line in lines) {
      // Check to see if that distance is >= 1 && <= 3. If not, break early.
      var increaseForLine = true
      val firstDistanceInRow = line[0] - line[1]
      if (abs(firstDistanceInRow) < 1 || abs(firstDistanceInRow) > 3) {
        increaseForLine = false
      }
      // Check to see if elem1 - elem2 is positive (list should be decreasing) or negative (list should be increasing).
      val rowIsIncreasing = firstDistanceInRow < 0
      for (i in 1 until line.count() - 1) {
        // If the whole line matches this pattern before breaking early, increase counter by 1.
        val a = line[i]
        val b = line[i + 1]
        if (rowIsIncreasing) {
          if (!(b - a >= 1 && b - a <= 3)) {
            increaseForLine = false
          }
        } else {
          if (!(b - a <= -1 && b - a >= -3)) {
            increaseForLine = false
          }
        }
      }
      if (increaseForLine) {
        counter++
      }
    }

    // Return counter as a string.
    return "$counter"
  }
}
