//Exercise 2.1
// 0, 1, 1, 2, 3, 5, 8
def fib(n: Int): Int = {
  @annotation.tailrec
  def follow(remaining: Int, acc: Int, next: Int): Int = {
    if (remaining < 0) acc
    else follow(remaining-1, next, acc+next)
  }
  follow(n-1,0,1)
}

assert((0 to 6).map(fib).equals(Vector(0,1,1,2,3,5,8)))


def formatResult(name: String, input: Int, f: Int => Int) =
  "The %s of %d is %d".format(name, input, f(input))

formatResult("fibonnaci number", 4, fib)
