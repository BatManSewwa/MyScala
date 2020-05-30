object Q6
{
    def main(args: Array[String])=
    {
        print(" Enter the number : ")
        var n = scala.io.StdIn.readInt()
        FibbonacciSeq(n)
    }

    def Fibbonacci(n: Int):Int= n match
    {
        case 0 => 0
        case x if x==1 => 1
        case _=> Fibbonacci(n-1)+Fibbonacci(n-2)
    }

    def FibbonacciSeq(n: Int) :Unit= 
    {
        if (n>0) FibbonacciSeq(n-1)
        println(Fibbonacci(n))
    }
}