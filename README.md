# Scala Exercises

1. Use a trait to define a generic queue of strings with 'put' and 'get' methods, and create a class that implements it using an array. Include tests.
2. Starting from the previous exercise, use a stackable trait to modify the behavior of 'put' so it reverses each string (e.g. hello to olleh) before adding it to the queue. Include tests.
3. Write the ~= operator for comparing doubles. The operator should return true iff 2 doubles are equal up to a small constant. The constant should be configurable but also have a default. (hint: use implicit parameter) Include tests.
4. Implement GCD in Scala (hint: use pattern matching and tail recursion)
5. Write a clause that measures the run time of a block of code and prints it (also needs to return the original output of the block):
   ```
   timeit {
   ...
   ...
   }
   ```
6. Given a string containing words separated by space, find:
   - The longest word
   - The most common word
   - The most common letter
   - Create a map from letter to a set of words it appears in
7. Convert a list of strings to a list of all the characters in all the strings
8. Given the following code:

   ```scala
   trait IntSet {
       def incl(x: Int): IntSet
       def contains(x: Int): Boolean
   }
   class EmptySet extends IntSet {
       def contains(x: Int): Boolean = false
       def incl(x: Int): IntSet = new NonEmptySet(x, new EmptySet, new EmptySet)
   }
   class NonEmptySet(elem: Int, left: IntSet, right: IntSet) extends IntSet {
       def contains(x: Int): Boolean =
               if (x < elem) left contains x
               else if (x > elem) right contains x
               else true
       def incl(x: Int): IntSet =
               if (x < elem) new NonEmptySet(elem, left incl x, right)
               else if (x > elem) new NonEmptySet(elem, left, right incl x)
               else this
   }
   ```

   Write methods union and intersection to form the union and intersection between two sets.

   ```scala
   trait IntSet {
       ...
       def union(x: IntSet): IntSet
       def intersect(x: IntSet): IntSet
   }
   ```

   Add a method

   ```
   def excl(x: Int)
   ```

   to return the given set without the element x. To accomplish this, it is useful to also implement a test method

   ```
   def isEmpty: Boolean
   ```

   for sets.

9. Consider the following definitions representing trees of integers (Binary Search Tree). These definitions can be seen as an alternative representation of IntSet:
   ```scala
   abstract class IntTree
   case object EmptyTree extends IntTree
   case class Node(elem: Int, left: IntTree, right: IntTree) extends IntTree
   ```
   Complete the following implementations of function contains and insert for IntTree’s by using pattern matching on case classes.
   ```scala
   def contains(v: Int): Boolean = ...
   def insert(v: Int): IntTree = ...
   ```
10. Consider a function which squares all elements of a list and returns a list with the results. Complete the following two equivalent definitions of squareList.
    ```scala
    def squareList(xs: List[Int]): List[Int] = xs match {
        case List() => ??
        case y :: ys => ??
    }
    def squareList(xs: List[Int]): List[Int] = {
        xs map ??
    }
    ```
11. Write the following functions:
    - A function that gets optional x, y, and z and returns the first that is not None
    - A function that gets optional Ints x, y, and z and if all are defined (Some(...)), returns their product.
    - A function that gets a sequence of optional elements and returns the first that is not None.
12. Given a list:List[Int] and map:Map[Int, Double], multiply all the numbers in the list with their corresponding value in the map, and drop if don't exists
    For example, list = [1,2,3,4], map = {1 -> 3, 3-> 5} ==> res = [3, 15]
13. Write a retry method that converts a method to a retry-able method.
    The syntax should look like:

    `retry { ... }`

    However, you also need some way to specify how many times to retry and support sleep between retries (hint: implicit arguments)

14. Design a class that is given a vector of numbers in the constructor and exposes:
    x: a vector with the square of all elements in the input vector
    y: the sum of x
    z: the square root of y
    Nothing should be calculated in the constructor of the class assume the calculation of x, y, z can take a lot of time, and should only be done once (at most)
15. Add a method "median" to a Seq of integers so that s.median is the media of s for s of type Seq[Int]
    How can you add the same method for a sequence of doubles with minimal code duplication?
16. Basic scalalab exercises https://github.com/scala-labs/scala-labs/tree/master/labs/src/test/scala/org/scalalabs/basic
