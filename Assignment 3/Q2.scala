object Q2
{
    def main(args: Array[String]): Unit=
    {
        print(" Enter the number : ")
        var n = scala.io.StdIn.readInt()
        primeSeq(n)
    }

    def primeSeq(n:Int):Any=
    {
        if(prime(n)==true) println(n)
        if(n>0)primeSeq(n-1)
        
    }

    def gcd(p: Int, q: Int):Int = q match
    {
        case 0 => p
        case q if(q>p) => gcd(q,p)
        case _=> gcd(q,p%q)
    }

    def prime(a: Int, n: Int=2) : Boolean = n match
    {
        case x if (x==a) => true
        case x if(gcd(x,a))>1 => false
        case x => prime(a,n+1)
    }
}