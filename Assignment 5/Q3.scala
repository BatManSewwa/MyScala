class account(id:String,aNumber:Int,balance:Double)
{
	var nic=id
	var accountNumber=aNumber
	var accountBalance=balance
	
	//money transaction process

	def transfer(acc:List[account],amount:Double)=
	{
		if(accountBalance>amount)
		{
			accountBalance=accountBalance-amount
			acc.head.accountBalance=acc.head.accountBalance+amount
		}
		else
		{
			println("Your account balnce is not sufficient.")
		}
	}	
}

object Q3
{
	def main(args: Array[String])
	{
		println ("\n\nBank Transaction \n\n")
		var Acc1=new account("A101",5001,200000)
		var Acc2=new account("A102",5002,1000000)
		var Acc3=new account("A103",5003,125000)
		val bank:List[account]=List(Acc1,Acc2,Acc3)
		
		val p=seek(5002,bank)
		Acc1.transfer(p,15000)

		println("Transfered account balance : "+Acc1.accountBalance)
		println("Received account balance  : "+p.head.accountBalance)
		println("\n\nTransaction Successful!!!")
	}

	val seek=(accountNumber:Int,list:List[account])=>list.filter(p=>p.accountNumber.equals(accountNumber))

}
