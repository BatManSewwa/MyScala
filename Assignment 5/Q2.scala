class Rational(p: Int, q: Int)
{
    def numer = p
    def denom = q

    def sub(r: Rational) = new Rational( numer*r.denom-r.numer*denom, denom*r.denom)

    override def toString = numer+"/"+denom
}

object Q2
{
    def main(args: Array[String])
    {
        val x = new Rational(3,4)
        val y = new Rational(5,8)
        val z = new Rational(2,7)

        println(x)
        println(y)
        println(z)

        val p = x.sub(y)
        println(p)

        println(p.sub(z))
    }
}