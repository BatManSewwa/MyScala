object Q1
{
    def main(args: Array[String])=
    {
        println(" Enter the number of normal working hours : ")
        var x = scala.io.StdIn.readInt()
        println(" Enter the number of OT hours : ")
        var y = scala.io.StdIn.readInt()

        printf(" The total takehome income is : Rs. %.2f",TotalIncome(x,y))
    }

    def NormalHours(x:Int)=
    {
        var normalpay = 150*x                          //payment for normal working hours
        normalpay
    }

    def OThours(y:Int)=
    {
        var OTpay = 75*y                               //payment for OT hours
        OTpay
    }

    def Income(x:Int , y:Int)=
    {
        var Income = NormalHours(x)+OThours(y)         //total income without tax
        Income
    }

    def Tax(x:Int , y:Int)=
    {
        var TaxValue = Income(x,y)*0.1                //tax for given inputs
        TaxValue
    }

    def TotalIncome(x:Int , y:Int)=
    {
        var Total = Income(x,y) - Tax(x,y)           //final takehome income
        Total
    }


}