package me.stegall.day6

import me.stegall.utils.AOCProblem

class Day6B(val input: String = day6Input) : AOCProblem {
  private fun createMapFromInput(input: String): List<List<String>> {
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

  private fun evaluateAllPossibleMapVariations(map: List<List<String>>): Int {
    var counter = 0
    for (i in 0 until map.size) {
      for (j in 0 until map[i].size) {
        if (map[i][j] == ".") {
          var mapCopy = map.toMutableList()
            .map {
              it.toMutableList()
            }
          mapCopy[i][j] = "#"
          if (subMapIsInfinite(mapCopy)) {
            counter++
          }
        }
      }
    }
    return counter
  }

  private fun findGuardStartingPosition(map: List<List<String>>): Pair<Int, Int>? {
    for (i in map.indices) {
      for (j in map[i].indices) {
        if (map[i][j] == "^") {
          return Pair(i, j)
        }
      }
    }
    return null
  }

  private fun getPositionOfNextPossibleStep(guardPosition: Pair<Int, Int>, guardDirection: Direction): Pair<Int, Int> = when (guardDirection) {
    Direction.NORTH -> Pair(guardPosition!!.first - 1, guardPosition!!.second)
    Direction.SOUTH -> Pair(guardPosition!!.first + 1, guardPosition!!.second)
    Direction.EAST -> Pair(guardPosition!!.first, guardPosition!!.second + 1)
    Direction.WEST -> Pair(guardPosition!!.first, guardPosition!!.second - 1)
  }

  private fun subMapIsInfinite(map: List<List<String>>): Boolean {
    val steps = mutableMapOf<String, Int>()
    val guardStartingPosition = findGuardStartingPosition(map)
    var guardPosition = guardStartingPosition!!
    var guardDirection = Direction.NORTH
    var done = false
    fun canTakeNextStep(guardPosition: Pair<Int, Int>, guardDirection: Direction): Boolean {
      val nextStepPair = getPositionOfNextPossibleStep(guardPosition, guardDirection)
      try {
        return map[nextStepPair.first][nextStepPair.second] == "."
            || map[nextStepPair.first][nextStepPair.second] == "^"
      } catch (e: Exception) { }
      done = true
      return false
    }
    fun takeNextStep() {
      if (canTakeNextStep(guardPosition, guardDirection)) {
        val nextStep = getPositionOfNextPossibleStep(guardPosition, guardDirection)
        guardPosition = nextStep
        val key = "${guardDirection}${guardPosition!!.first},${guardPosition!!.second}"
        if (steps.containsKey(key)) {
          steps[key] = steps[key]!! + 1
        } else {
          steps[key] = 1
        }
      } else {
        when (guardDirection) {
          Direction.NORTH -> guardDirection = Direction.EAST
          Direction.SOUTH -> guardDirection = Direction.WEST
          Direction.EAST -> guardDirection = Direction.SOUTH
          Direction.WEST -> guardDirection = Direction.NORTH
        }
      }
    }
    while (
      guardPosition.first >= 0
      && guardPosition.first < map.size
      && guardPosition.second >= 0
      && guardPosition.second < map[0].size
      && !done
    ) {
      takeNextStep()
      if (
        steps.values.size > 0
        && steps.values.max() >= 2
      ) {
        return true
      }
    }
    return false
  }

  override fun evaluate(): String {
    val map = createMapFromInput(input)
    var counter = evaluateAllPossibleMapVariations(map)
    return "$counter"
  }
}
