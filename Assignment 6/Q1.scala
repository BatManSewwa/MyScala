case class Point(a:Int, b:Int)
{
    def x = a
    def y = b

    def add(that: Point) = Point( this.x+that.x, this.y+that.y )
}

object Q1
{
    def main(args: Array[String])
    {
        val p = Point(2,3)
        val q = Point(4,5)

        println(p)
        println(q)

        println(p.add(q))
    }
}