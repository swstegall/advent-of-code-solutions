package me.stegall.day6

import me.stegall.utils.AOCProblem

enum class Direction {
  NORTH,
  SOUTH,
  EAST,
  WEST
}

class Day6A(val input: String = day6Input) : AOCProblem {
  var done = false
  private var map = createMapFromInput(input)

  // 1. Find starting indexes of the guard.
  private var guardPosition = findGuardStartingPosition(map)
  private var guardDirection = Direction.NORTH
  private var guardSteps = mutableSetOf(guardPosition!!)

  val guardIsInValidPosition
    get() = guardPosition!!.first >= 0
        && guardPosition!!.first < map.size
        && guardPosition!!.second >= 0
        && guardPosition!!.second < map[0].size

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

  private fun getPositionOfNextPossibleStep(): Pair<Int, Int> = when (guardDirection) {
    Direction.NORTH -> Pair(guardPosition!!.first - 1, guardPosition!!.second)
    Direction.SOUTH -> Pair(guardPosition!!.first + 1, guardPosition!!.second)
    Direction.EAST -> Pair(guardPosition!!.first, guardPosition!!.second + 1)
    Direction.WEST -> Pair(guardPosition!!.first, guardPosition!!.second - 1)
  }

  private fun canTakeNextStep(): Boolean {
    val nextStepPair = getPositionOfNextPossibleStep()
    try {
      return map[nextStepPair.first][nextStepPair.second] == "."
          || map[nextStepPair.first][nextStepPair.second] == "^"
    } catch (e: Exception) { }
    done = true
    return false
  }

  private fun takeStep() {
    if (canTakeNextStep()) {
      val nextStep = getPositionOfNextPossibleStep()
      guardPosition = nextStep
//      var mapCopy = map.toMutableList()
//        .map {
//          it.toMutableList()
//        }
//      mapCopy[guardPosition!!.first][guardPosition!!.second] = "X"
//      for (maplet in mapCopy) {
//        for (value in maplet) {
//          print(value)
//        }
//        println()
//      }
//      println()
      guardSteps.add(nextStep)
    } else {
      when (guardDirection) {
        Direction.NORTH -> guardDirection = Direction.EAST
        Direction.SOUTH -> guardDirection = Direction.WEST
        Direction.EAST -> guardDirection = Direction.SOUTH
        Direction.WEST -> guardDirection = Direction.NORTH
      }
    }
  }

  override fun evaluate(): String {
    while (guardIsInValidPosition && !done) {
      takeStep()
    }
    // 2. Move the guard North until the next position will cause the guard to bump.
    // Check to see if next move would hit a wall.
    // If next move would hit a wall, turn 90 degrees.
    // Else, update guard position and increase
    // 3. Turn the guard 90 degrees.
    // 4. Repeat Steps 2 and 3 until the guard steps out of bounds.
    return "${guardSteps.size}"
  }
}
