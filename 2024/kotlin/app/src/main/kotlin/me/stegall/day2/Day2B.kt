package me.stegall.day2

import me.stegall.utils.AOCProblem
import kotlin.math.abs

class Day2B(val input: String = day2Input) : AOCProblem {
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

  fun lineIsValid(line: List<Int>): Boolean {
    // Check to see if that distance is >= 1 && <= 3. If not, break early.
    var isValid = true
    val firstDistanceInRow = line[0] - line[1]
    if (abs(firstDistanceInRow) < 1 || abs(firstDistanceInRow) > 3) {
      isValid = false
    }
    // Check to see if elem1 - elem2 is positive (list should be decreasing) or negative (list should be increasing).
    val rowIsIncreasing = firstDistanceInRow < 0
    for (i in 1 until line.count() - 1) {
      // If the whole line matches this pattern before breaking early, increase counter by 1.
      val a = line[i]
      val b = line[i + 1]
      if (rowIsIncreasing) {
        if (!(b - a >= 1 && b - a <= 3)) {
          isValid = false
        }
      } else {
        if (!(b - a <= -1 && b - a >= -3)) {
          isValid = false
        }
      }
    }
    return isValid
  }

  fun getPermutationsOfLine(line: List<Int>): List<List<Int>> {
    val result = mutableListOf<MutableList<Int>>()
    for (i in 0 until line.count()) {
      result.add(line.filterIndexed { index, _ -> i != index }.toMutableList())
    }
    return result
  }

  override fun evaluate(): String {
    // Parse lines into lists of ints.
    val lines = createListsFromInput(input)

    var counter = 0
    for (line in lines) {
      val isValid = lineIsValid(line)
      if (isValid) {
        counter++
      } else {
        val allPermsOfLine = getPermutationsOfLine(line)
        var containsValidPermutation = false
        for (perm in allPermsOfLine) {
          if (lineIsValid(perm)) {
            containsValidPermutation = true
          }
        }
        if (containsValidPermutation) {
          counter++
        }
      }
    }

    // Return counter as a string.
    return "$counter"
  }
}
