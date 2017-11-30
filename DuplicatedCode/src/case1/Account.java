package case1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Account {
    
    private double balance;
    private Date lastTransactionDate;
    private ArrayList<Transaction> transactionList;

    public Account() {
		this.balance = 0;
        setLatTransactionDate(null);
        this.transactionList = new ArrayList<Transaction>();
    }

    public double getBalance() {
        return balance;
    }

    public Date getLastTransactionDate() {
        return lastTransactionDate;
    }
    
    public void credit(double amount) {
        balance = balance - amount;
        Date date = getDate();
        transactionList.add(new Transaction(date, -amount));
        setLatTransactionDate(date);
    }

    public void debit(double amount) {
        balance = balance + amount;
        Date date = getDate();
        transactionList.add(new Transaction(date, amount));
        setLatTransactionDate(date);
    }

    private void setLatTransactionDate(Date date) {
        lastTransactionDate = date;
    }

    private Date getDate() {
        Calendar calendar = Calendar.getInstance();
        return calendar.getTime();
    }

}
