class Bank {
    long[] Balance;
    public Bank(long[] balance) {
        Balance=balance.clone();
    }
     private boolean isValid(int account) {
        return account >= 1 && account <= Balance.length;
    }
    public boolean transfer(int account1, int account2, long money) {

        if(!isValid(account1) || !isValid(account2) )
        return false;
        if(Balance[account1-1]<money)
        return false;
        else
        {
            Balance[account1-1]=Balance[account1-1]-money;
            Balance[account2-1]=Balance[account2-1]+money;
            return true;
        }
    }
    
    public boolean deposit(int account, long money) {
         if(!isValid(account) )
         return false;

        Balance[account-1]=Balance[account-1]+money;
        return true;
    }
    
    public boolean withdraw(int account, long money) {

         if(!isValid(account) )
           return false;

         if(Balance[account-1]<money)
        return false;
        else
        {
            Balance[account-1]=Balance[account-1]-money;
            return true;
        }
    }
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */