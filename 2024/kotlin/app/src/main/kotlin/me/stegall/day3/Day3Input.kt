package me.stegall.day3

import java.io.BufferedReader

val inputStream = object {}.javaClass.classLoader.getResourceAsStream("day3Input.txt")
  ?: throw IllegalArgumentException("File not found.")

val day3Input = inputStream.bufferedReader().use(BufferedReader::readText)
