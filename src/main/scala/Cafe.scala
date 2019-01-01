class CreditCard()
class Coffee()
case class Charge(creditCard: CreditCard, amount: Double) {
  def combine(other: Charge): Charge =
    if (creditCard == other.creditCard) {
      Charge(creditCard, amount + other.amount)
    } else {
      throw new Exception("Cannot combine charges to different credit cards!")
    }

}

object Cafe {

  def buyCoffee(creditCard: CreditCard): (Coffee, Charge) = ???

  def buyCoffees(creditCard: CreditCard, number: Int): (List[Coffee], Charge) = {
    val purchases = List.fill(number)(buyCoffee(creditCard))
    val (coffees, charges) = purchases.unzip
    (coffees, charges.reduce((c1, c2) => c1.combine(c2))
  }
}