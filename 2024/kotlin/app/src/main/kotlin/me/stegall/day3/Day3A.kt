package me.stegall.day3

import me.stegall.utils.AOCProblem

class Day3A(val input: String = day3Input) : AOCProblem {
  private fun charIsDigitSeperatorOrCloser(c: Char): Boolean = when (c) {
    in '0'..'9' -> true
    ',' -> true
    ')' -> true
    else -> false
  }

  override fun evaluate(): String {
    var counter = 0
    // Iterate through the string to find an instance of the predicate "mul(".
    for (i in 0 until input.length - 4) {
      val currentPredicate = input.substring(i, i + 4)
      if (currentPredicate == "mul(") {
        var invalid = false
        for (j in i + 4 until input.length) {
          if (!charIsDigitSeperatorOrCloser(input[j])) {
            invalid = true
          } else if (!invalid && input[j] == ')') {
            if (!input.substring(i, j).contains(')')) {
              val mul = input.substring(i + 4, j).split(',')
              counter += (mul[0].toInt() * mul[1].toInt())
            }
          }
        }
      }
    }
    return "$counter"
  }
}
