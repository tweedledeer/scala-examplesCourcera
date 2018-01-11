package example


object Lists {

  def recursiveSum(args: Int*):Int={
    if (args.length == 0) 0
    else
      args.head + recursiveSum(args.tail : _*)

  }

  /**
    * This method computes the sum of all elements in the list xs. There are
    * multiple techniques that can be used for implementing this method, and
    * you will learn during the class.
    *
    * For this example assignment you can use the following methods in class
    * `List`:
    *
    *  - `xs.isEmpty: Boolean` returns `true` if the list `xs` is empty
    *  - `xs.head: Int` returns the head element of the list `xs`. If the list
    * is empty an exception is thrown
    *  - `xs.tail: List[Int]` returns the tail of the list `xs`, i.e. the the
    * list `xs` without its `head` element
    *
    * ''Hint:'' instead of writing a `for` or `while` loop, think of a recursive
    * solution.
    *
    * @param xs A list of natural numbers
    * @return The sum of all elements in `xs`
    */
  def sum(xs: List[Int]): Int = {
    if (xs.isEmpty) {
      throw new IllegalArgumentException("List should not be empty")
    } else {
      implSum(xs, 0);
    }
  }

  def implSum(list: List[Int], currentSum: Int): Int = {
    if (list.isEmpty) {
      return currentSum
    } else {
      var sum = currentSum
      sum += list.head;
      implSum(list.tail, sum)
    }
  }

  /**
    * This method returns the largest element in a list of integers. If the
    * list `xs` is empty it throws a `java.util.NoSuchElementException`.
    *
    * You can use the same methods of the class `List` as mentioned above.
    *
    * ''Hint:'' Again, think of a recursive solution instead of using looping
    * constructs. You might need to define an auxiliary method.
    *
    * @param xs A list of natural numbers
    * @return The largest element in `xs`
    * @throws java.util.NoSuchElementException if `xs` is an empty list
    */
  def max(xs: List[Int]): Int = {
    if (xs.isEmpty) {
      println("Your xs is empty, silly.")
      throw new NoSuchElementException("List is empty")
    } else
      maxImpl(xs.tail, xs.head);
  }


  //  @tailrec
  def maxImpl(xs: List[Int], currentMax: Int): Int = {
    if (xs.isEmpty) {
      return currentMax
    }
    else {
      var max: Int = currentMax
      if (xs.head > currentMax)
        max = xs.head
      maxImpl(xs.tail, max)
    }

  }
}
