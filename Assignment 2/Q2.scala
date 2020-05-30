object Q2
{
    def main(args: Array[String])=
    {
        print(" Enter the price of the ticket : ")
        var price = scala.io.StdIn.readInt()
        print(" Total profit : Rs.")
        println(Profit(price))
    }

    def Attendees(price: Int)=
    {
        var attendees = (15 - price)/5*20 + 120
        attendees
    }

    def Income(price: Int)=
    {
        var income = Attendees(price)*price
        income
    }

    def Cost(price: Int)=
    {
        var cost = 500 + Attendees(price)*3
        cost
    }

    def Profit(price: Int)=
    {
        var profit = Income(price) - Cost(price)
        profit
    }
}