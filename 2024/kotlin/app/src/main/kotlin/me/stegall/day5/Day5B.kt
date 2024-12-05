package me.stegall.day5

import me.stegall.utils.AOCProblem

class Day5B(val input: String = day5Input) : AOCProblem {
  private fun splitToTwoSegments(input: String): List<String> = input.split("\n\n")

  private fun formattedRowFailsRules(formattedRow: List<String>, rules: List<Pair<String, String>>): Boolean {
    var passes = false
    for (rule in rules) {
      if (formattedRow.contains(rule.first) && formattedRow.contains(rule.second)) {
        val rule1Idx = formattedRow.indexOf(rule.first)
        val rule2Idx = formattedRow.indexOf(rule.second)
        if (rule.first.toInt() > rule.second.toInt()) {
          // Page # decreases.
          if (rule2Idx < rule1Idx) {
            passes = true
          }
        } else {
          // Page # increases.
          if (rule1Idx > rule2Idx) {
            passes = true
          }
        }
      }
    }
    return passes
  }

  private fun fixFailingRowForRules(failingRow: List<String>, rules: List<Pair<String, String>>): List<String> {
    var rowToModify = failingRow.toMutableList()
    for (i in 0 until rowToModify.size) {
      for (rule in rules) {
        if (rowToModify.contains(rule.first) && rowToModify.contains(rule.second)) {
          val rule1Idx = rowToModify.indexOf(rule.first)
          val rule2Idx = rowToModify.indexOf(rule.second)
          if (rule.first.toInt() > rule.second.toInt()) {
            // Page # decreases.
            if (rule2Idx < rule1Idx) {
              // Swap.
              val temp = rowToModify[rule1Idx]
              rowToModify[rule1Idx] = rowToModify[rule2Idx]
              rowToModify[rule2Idx] = temp
            }
          } else {
            // Page # increases.
            if (rule1Idx > rule2Idx) {
              // Swap.
              val temp = rowToModify[rule1Idx]
              rowToModify[rule1Idx] = rowToModify[rule2Idx]
              rowToModify[rule2Idx] = temp
            }
          }
        }
      }
    }
    return rowToModify
  }

  override fun evaluate(): String {
    var counter = 0
    val segments = splitToTwoSegments(input)
    val rules = segments[0]
      .split("\n")
      .map {
        val s = it.split("|")
        Pair(s[0], s[1])
      }
    val bookRows = segments[1].split("\n")
    val failingRows = mutableListOf<String>()
    for (row in bookRows) {
      val formattedRow = row.split(",")
      if (formattedRowFailsRules(formattedRow, rules)) {
        failingRows.add(row)
      }
    }
    for (row in failingRows) {
      val fixedRow = fixFailingRowForRules(row.split(","), rules)
      counter += fixedRow[fixedRow.size / 2].toInt()
    }
    return "$counter"
  }
}
