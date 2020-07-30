class account(id:String, n:Int, b:Double)
{
	val nic:String = id
	val accnumber:Int = n
	var balance:Double = b 

	def neg() = 
	{
		if ( this.balance < 0 ) 
		println(" "+ this.nic +"   "+ this.accnumber +"  "+ this.balance+ " ")
	}
	
	def sum() = 
	{
		this.balance 
	}

	def interest() = new account(this.nic,this.accnumber,if(this.balance>0) this.balance*0.05 + this.balance else this.balance*0.1 + this.balance)
	

	override def toString =  nic +"   "+ accnumber +"   "+ balance 
}

object Q4
{

	def main(args: Array[String])
	{
		var Acc1 = new account( "A101", 5001, 200000 )
		var Acc2 = new account( "A102", 5002, 1000000 )
		var Acc3 = new account( "A103", 5003, -1000 )
		var Acc4 = new account( "A104", 5004, -100 )
	
	
		var banklist:List[account] = List(Acc1, Acc2, Acc3,Acc4)

		println("\n Accounts with negative balances: ")
		for (man <- banklist) 
		{
			man.neg();
		}

		//sum of the balances
		var sumOf:Double  = 0
		for (man <- banklist) 
		{
			sumOf = sumOf + man.sum().asInstanceOf[Double]
		}
		println("\n2 Calculate the sum of all account balances: "+sumOf)
	
		println("\nCalculate the final balances of all accounts after apply the interest: ")
		for (man <- banklist) 
		{
			println(man.interest())
		}
	}
}

