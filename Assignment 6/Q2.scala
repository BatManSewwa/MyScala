case class Point(a:Int, b:Int)
{
    def x = a
    def y = b

    def move(dx: Int, dy: Int) = Point( this.x+dx, this.y+dy )
}

object Q2
{
    def main(args: Array[String])
    {
        val p = Point(1,2)

        println(p)
        println("Moved by dx=3, dy=5")

        println(p.move(3,5))
    }
}