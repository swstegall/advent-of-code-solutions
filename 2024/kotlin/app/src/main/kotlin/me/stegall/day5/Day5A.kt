package me.stegall.day5

import me.stegall.utils.AOCProblem

class Day5A(val input: String = day5Input) : AOCProblem {
  private fun splitToTwoSegments(input: String): List<String> = input.split("\n\n")

  private fun formattedRowPassesRules(formattedRow: List<String>, rules: List<Pair<String, String>>): Boolean {
    var passes = true
    for (rule in rules) {
      if (formattedRow.contains(rule.first) && formattedRow.contains(rule.second)) {
        val rule1Idx = formattedRow.indexOf(rule.first)
        val rule2Idx = formattedRow.indexOf(rule.second)
        if (rule.first.toInt() > rule.second.toInt()) {
          // Page # decreases.
          if (rule2Idx < rule1Idx) {
            passes = false
          }
        } else {
          // Page # increases.
          if (rule1Idx > rule2Idx) {
            passes = false
          }
        }
      }
    }
    return passes
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
    for (row in bookRows) {
      val formattedRow = row.split(",")
      if (formattedRowPassesRules(formattedRow, rules)) {
        counter += formattedRow[formattedRow.size / 2].toInt()
      }
    }
    return "$counter"
  }
}
