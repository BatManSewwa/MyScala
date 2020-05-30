object Q3
{
    def main(args: Array[String])=
    {
        print(" Enter the number : ")
        var n = scala.io.StdIn.readInt()
        print(" The total is : ")
        println(sum(n))
    }

    def sum(n: Int):Int = n match
    {
        case 1 => 1
        case _=> n+sum(n-1)
    }
}