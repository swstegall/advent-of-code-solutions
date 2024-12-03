package me.stegall.day3

import me.stegall.utils.AOCProblem

enum class ActionType {
  DO,
  DONT,
  MUL
}

class Day3B(val input: String = day3Input) : AOCProblem {
  private fun charIsDigitSeperatorOrCloser(c: Char): Boolean = when (c) {
    in '0'..'9' -> true
    ',' -> true
    ')' -> true
    else -> false
  }

  private fun collectActions(): List<Pair<ActionType, Int?>> {
    val result = mutableListOf<Pair<ActionType, Int?>>()
    // Iterate through the string to find an instance of the predicate "mul(".
    for (i in 0 until input.length - 4) {
      val possibleDo = input.substring(i, i + 4)
      if (possibleDo == "do()") {
        result.add(Pair(ActionType.DO, null))
      }
      try {
        val possibleDont = input.substring(i, i + 7)
        if (possibleDont == "don't()") {
          result.add(Pair(ActionType.DONT, null))
        }
      } catch (e: Exception) {}
      val currentPredicate = input.substring(i, i + 4)
      if (currentPredicate == "mul(") {
        var invalid = false
        for (j in i + 4 until input.length) {
          if (!charIsDigitSeperatorOrCloser(input[j])) {
            invalid = true
          } else if (!invalid && input[j] == ')') {
            if (!input.substring(i, j).contains(')')) {
              val mul = input.substring(i + 4, j).split(',')
              result.add(Pair(ActionType.MUL, (mul[0].toInt() * mul[1].toInt())))
            }
          }
        }
      }
    }
    return result
  }

  override fun evaluate(): String {
    var counter = 0
    var mulActive = true
    val actions = collectActions()
    for (action in actions) {
      when {
        mulActive && action.first == ActionType.MUL -> {
          counter += action.second ?: 0
        }
        action.first == ActionType.DO -> {
          mulActive = true
        }
        action.first == ActionType.DONT -> {
          mulActive = false
        }
      }
    }
    return "$counter"
  }
}
