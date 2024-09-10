object Q3 {

  class Account(var accountHolder: String, var balance: Double) {

    def deposit(amount: Double): Unit = {
      if (amount >0) {
        balance = balance + amount
        println("Successfully deposited! ," + "R.s : " + amount + "," + "New balance: " + "R.s : " + balance)
      } else {
        println("Deposit amount must be positive.")
      }
    }

    def withdraw(amount: Double): Unit = {
      if (amount > 0 && balance >= amount) {
        balance = balance - amount
        println("Successfully withdrew! ," + amount + "," + "New balance: " + balance)
      } else if (amount > balance) {
        println("Insufficient balance! Current balance: " + "R.s : " + balance)
      } else {
        println("Withdrawal amount must be positive.")
      }
    }

    def transfer(amount: Double, toAccount: Account): Unit = {
      if (amount > 0 && balance >= amount) {
        this.withdraw(amount)
        toAccount.deposit(amount)
        println("Successfully transferred! ," +  amount + "to" +  toAccount.accountHolder)
      } else if (amount > balance) {
        println("Transfer failed! Insufficient balance to transfer" + amount)
      } else {
        println("Transfer amount must be positive.")
      }
    }

    def checkBalance(): Unit = {
      println("Account holder: " + accountHolder + "," + "Balance:  " + "R.s : " + balance)
    }
  }

  def main(args: Array[String]): Unit = {

    val account1 = new Account("Kavishka", 100000.0)
    val account2 = new Account("Yasanga", 700000.0)

    account1.checkBalance()
    account2.checkBalance()

    account1.deposit(20000.0)

    account2.withdraw(10000.0)

    account1.transfer(25000.0, account2)

    account1.checkBalance()
    account2.checkBalance()
  }
}