object Q4
{
    def main(args: Array[String])=
    {
        print(" Enter the number : ")
        var n = scala.io.StdIn.readInt()
        println(OddEven(n))
    }

    def OddEven(a: Int) : String =
    {
        if (a%2==0)
        {
            "Even number"
        }
        else "odd number"
    }
}