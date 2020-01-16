package example

object Learning {

  def findLast(list: List[Int]): Int = {
    val last = list(list.length - 1)
    return last
  }

  def main(args: Array[String]) {
    println(Learning.findLast(List(1, 1, 2, 3, 5, 8)))
  }
}
