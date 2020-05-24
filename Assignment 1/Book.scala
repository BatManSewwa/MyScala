object Book extends App
{
    def cost(b:Double) =  
        if ( b<=50 )
        {
           val p: Double = 24.95*0.6*b + 3
        }
        else
        {
            val p: Double = 24.95*0.6*b + 3 + (b-50)*0.75
            println(p) 
        }

    cost(60)
}