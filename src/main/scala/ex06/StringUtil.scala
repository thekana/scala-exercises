package ex06

object StringUtil {
  def longestWord(s: String): String = {
    s.split(' ').maxBy(_.length)
  }

  def mostCommonWord(s: String): String = {
    //    val words = s.split(' ')
    //    words.groupMapReduce(identity)(_ => 1)(_ + _).maxBy(_._2)._1
    // or
    s.split(' ').groupBy(identity).maxBy(_._2.length)._1
  }

  def mostCommonLetter(s: String): Char = {
    s.toLowerCase.split(' ').flatten.groupMapReduce(identity)(_ => 1)(_ + _).maxBy(_._2)._1
  }

  def toLetterWordMap(s: String): Map[Char, Seq[String]] = {
    val words = s.split(' ')
    val distinctChar = words.flatten.toSeq.distinct
    var m = Map.empty[Char, Seq[String]]
    distinctChar.foreach(c => {
      m += (c -> words.filter(_.contains(c)).toSeq.distinct)
    })
    m
  }

  def betterToLetterWordMap(s: String): Map[Char, Seq[String]] = {
    s.split(' ').toSeq
      .flatMap(w => w.toCharArray.map(c => (c, w)))
      .groupMap(_._1)(_._2).transform((_, value) => value.distinct)
  }
}
