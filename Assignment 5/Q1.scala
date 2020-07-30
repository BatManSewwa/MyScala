class Rational(x: Int, y: Int)
{
    def numer = x
    def denom = y

    def neg = new Rational( -this.numer,this.denom)

    override def toString = numer+"/"+denom
}

object Q1
{
    def main(args: Array[String])=
    {
        val r1 = new Rational(1,3)
        println(r1)
        println (r1.neg)
    }
}
    