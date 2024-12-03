package me.stegall.day1

import me.stegall.utils.AOCProblem

class Day1B(val input: String = day1Input) : AOCProblem {
  private fun createListsFromInput(input: String): Pair<List<String>, List<String>> {
    val list1 = mutableListOf<String>()
    val list2 = mutableListOf<String>()
    val lines = input.lines()
    for (line in lines) {
      val elems = line.trim().split("\\s+".toRegex())
      list1.add(elems[0])
      list2.add(elems[1])
    }
    return Pair(list1, list2)
  }

  private fun getCountOfNumInList(num: Int, list: List<Int>): Int {
    return list.fold(0) { sum, element -> if (num == element) sum + 1 else sum }
  }

  override fun evaluate(): String {
    // Create two lists from the input.
    val lists = createListsFromInput(input)

    // Sort them.
    val list1 = lists.first.toMutableList().map { it.toInt() }.sorted()
    val list2 = lists.second.toMutableList().map { it.toInt() }.sorted()

    // Find the distance between smallest element in list1 and list2.
    var counter = 0
    for (i in list1.indices) {
      // Sum the distances.
      counter += list1[i] * getCountOfNumInList(list1[i], list2)
    }

    return "$counter"
  }
}
