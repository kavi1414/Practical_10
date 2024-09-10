object Q5 {

  def countLetterOccurrences(words: List[String]): Int = {

    val wordLengths = words.map(_.length)

    val totalLetters = wordLengths.reduce(_ + _)

    totalLetters
  }

  def main(args: Array[String]): Unit = {
    val words = List("apple", "banana", "cherry", "Orange")

    val totalCount = countLetterOccurrences(words)

    println("Total count of letter occurrences: " + totalCount)
  }
}
