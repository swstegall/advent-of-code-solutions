package me.stegall.day4

import me.stegall.utils.AOCProblem

class Day4B(val input: String = day4Input) : AOCProblem {
  private fun createListsFromInput(input: String): List<List<String>> {
    val result = mutableListOf<MutableList<String>>()
    val lines = input.lines()
    for (line in lines) {
      result.add(
        line
          .trim()
          .split("")
          .toMutableList()
      )
    }
    return result
  }

  private fun isRightFacingXMAS(i: Int, j: Int, linesOfStrings: List<List<String>>): Boolean {
    var isValid = false
    try {
      if (
        linesOfStrings[i][j] == "A"
        && linesOfStrings[i + 1][j + 1] == "S"
        && linesOfStrings[i - 1][j + 1] == "S"
        && linesOfStrings[i - 1][j - 1] == "M"
        && linesOfStrings[i + 1][j - 1] == "M"
      ) {
        isValid = true
      }
    } catch (e: Exception) { }
    return isValid
  }

  private fun isLeftFacingXMAS(i: Int, j: Int, linesOfStrings: List<List<String>>): Boolean {
    var isValid = false
    try {
      if (
        linesOfStrings[i][j] == "A"
        && linesOfStrings[i + 1][j + 1] == "M"
        && linesOfStrings[i - 1][j + 1] == "M"
        && linesOfStrings[i - 1][j - 1] == "S"
        && linesOfStrings[i + 1][j - 1] == "S"
      ) {
        isValid = true
      }
    } catch (e: Exception) { }
    return isValid
  }

  private fun isUpFacingXMAS(i: Int, j: Int, linesOfStrings: List<List<String>>): Boolean {
    var isValid = false
    try {
      if (
        linesOfStrings[i][j] == "A"
        && linesOfStrings[i + 1][j + 1] == "M"
        && linesOfStrings[i - 1][j + 1] == "S"
        && linesOfStrings[i - 1][j - 1] == "S"
        && linesOfStrings[i + 1][j - 1] == "M"
      ) {
        isValid = true
      }
    } catch (e: Exception) { }
    return isValid
  }

  private fun isDownFacingXMAS(i: Int, j: Int, linesOfStrings: List<List<String>>): Boolean {
    var isValid = false
    try {
      if (
        linesOfStrings[i][j] == "A"
        && linesOfStrings[i + 1][j + 1] == "S"
        && linesOfStrings[i - 1][j + 1] == "M"
        && linesOfStrings[i - 1][j - 1] == "M"
        && linesOfStrings[i + 1][j - 1] == "S"
      ) {
        isValid = true
      }
    } catch (e: Exception) { }
    return isValid
  }

  override fun evaluate(): String {
    val linesOfStrings = createListsFromInput(input)
    var counter = 0
    for (i in 0 until linesOfStrings.size) {
      for (j in 0 until linesOfStrings[i].size) {
        if (linesOfStrings[i][j] == "A") {
          when {
            isRightFacingXMAS(i, j, linesOfStrings)
                || isLeftFacingXMAS(i, j, linesOfStrings)
                || isUpFacingXMAS(i, j, linesOfStrings)
                || isDownFacingXMAS(i, j, linesOfStrings) -> {
              counter++
            }
          }
        }
      }
    }
    return "$counter"
  }
}
