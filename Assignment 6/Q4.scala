case class Point(a:Int, b:Int)
{
    def x = a
    def y = b

    def invert = Point( this.y, this.x )
}

object Q4
{
    def main(args: Array[String])
    {
        val p = Point(2,3)

        println(p)

        println(p.invert)
    }
}