package me.stegall.day4

import me.stegall.utils.AOCProblem

class Day4A(val input: String = day4Input) : AOCProblem {
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

  private fun isUpLeftValidXMAS(i: Int, j: Int, linesOfStrings: List<List<String>>): Boolean {
    var isValid = false
    try {
      val candidate = "${linesOfStrings[i][j]}${linesOfStrings[i - 1][j - 1]}${linesOfStrings[i - 2][j - 2]}${linesOfStrings[i - 3][j - 3]}"
      if (candidate == "XMAS") {
        isValid = true
      }
    } catch (e: Exception) { }
    return isValid
  }

  private fun isUpRightValidXMAS(i: Int, j: Int, linesOfStrings: List<List<String>>): Boolean {
    var isValid = false
    try {
      val candidate = "${linesOfStrings[i][j]}${linesOfStrings[i - 1][j + 1]}${linesOfStrings[i - 2][j + 2]}${linesOfStrings[i - 3][j + 3]}"
      if (candidate == "XMAS") {
        isValid = true
      }
    } catch (e: Exception) { }
    return isValid
  }

  private fun isDownLeftValidXMAS(i: Int, j: Int, linesOfStrings: List<List<String>>): Boolean {
    var isValid = false
    try {
      val candidate = "${linesOfStrings[i][j]}${linesOfStrings[i + 1][j - 1]}${linesOfStrings[i + 2][j - 2]}${linesOfStrings[i + 3][j - 3]}"
      if (candidate == "XMAS") {
        isValid = true
      }
    } catch (e: Exception) { }
    return isValid
  }

  private fun isDownRightValidXMAS(i: Int, j: Int, linesOfStrings: List<List<String>>): Boolean {
    var isValid = false
    try {
      val candidate = "${linesOfStrings[i][j]}${linesOfStrings[i + 1][j + 1]}${linesOfStrings[i + 2][j + 2]}${linesOfStrings[i + 3][j + 3]}"
      if (candidate == "XMAS") {
        isValid = true
      }
    } catch (e: Exception) { }
    return isValid
  }

  private fun isUpValidXMAS(i: Int, j: Int, linesOfStrings: List<List<String>>): Boolean {
    var isValid = false
    try {
      val candidate = "${linesOfStrings[i][j]}${linesOfStrings[i - 1][j]}${linesOfStrings[i - 2][j]}${linesOfStrings[i - 3][j]}"
      if (candidate == "XMAS") {
        isValid = true
      }
    } catch (e: Exception) { }
    return isValid
  }

  private fun isDownValidXMAS(i: Int, j: Int, linesOfStrings: List<List<String>>): Boolean {
    var isValid = false
    try {
      val candidate = "${linesOfStrings[i][j]}${linesOfStrings[i + 1][j]}${linesOfStrings[i + 2][j]}${linesOfStrings[i + 3][j]}"
      if (candidate == "XMAS") {
        isValid = true
      }
    } catch (e: Exception) { }
    return isValid
  }

  private fun isLeftValidXMAS(i: Int, j: Int, linesOfStrings: List<List<String>>): Boolean {
    var isValid = false
    try {
      val candidate = "${linesOfStrings[i][j]}${linesOfStrings[i][j - 1]}${linesOfStrings[i][j - 2]}${linesOfStrings[i][j - 3]}"
      if (candidate == "XMAS") {
        isValid = true
      }
    } catch (e: Exception) { }
    return isValid
  }

  private fun isRightValidXMAS(i: Int, j: Int, linesOfStrings: List<List<String>>): Boolean {
    var isValid = false
    try {
      val candidate = "${linesOfStrings[i][j]}${linesOfStrings[i][j + 1]}${linesOfStrings[i][j + 2]}${linesOfStrings[i][j + 3]}"
      if (candidate == "XMAS") {
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
        if (linesOfStrings[i][j] == "X") {
          if (isUpLeftValidXMAS(i, j, linesOfStrings)) {
            counter++
          }
          if (isUpRightValidXMAS(i, j, linesOfStrings)) {
            counter++
          }
          if (isDownLeftValidXMAS(i, j, linesOfStrings)) {
            counter++
          }
          if (isDownRightValidXMAS(i, j, linesOfStrings)) {
            counter++
          }
          if (isUpValidXMAS(i, j, linesOfStrings)) {
            counter++
          }
          if (isDownValidXMAS(i, j, linesOfStrings)) {
            counter++
          }
          if (isLeftValidXMAS(i, j, linesOfStrings)) {
            counter++
          }
          if (isRightValidXMAS(i, j, linesOfStrings)) {
            counter++
          }
        }
      }
    }
    return "$counter"
  }
}
