case class Point(a:Int, b:Int)
{
    def x = a
    def y = b

    def distance(that: Point):Double = scala.math.sqrt(scala.math.pow((this.y-that.y),2)/scala.math.pow(this.x-that.x,2))
               
}

object Q3
{
    def main(args: Array[String])
    {
        val p = Point(1,2)
        val q = Point(6,4)

        println(p)
        println(q)
        println(" The distance between these two point is " + p.distance(q))

    }
}