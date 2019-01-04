def curry[A,B,C](f: (A, B) => C): A => (B => C) =
  a => (b => f(a,b))


// A: Int B: String, C: String

def printFancy(number: Int, name: String) =
  "Hello %s, your number is %d".format(name, number)

curry(printFancy)(10)("Emma")