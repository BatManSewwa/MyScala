object Q5
{
    def main(args: Array[String])=
    {
        print(" Enter the number : ")
        var n = scala.io.StdIn.readInt()
        println(EvenSum(n))
    }

    def EvenSum(n: Int): Int = 
    {
        if (n==0) 0
        else if (n%2==0)
        {
            n+EvenSum(n-1)
        }
        else
        {
            EvenSum(n-1)
        }
    }
}