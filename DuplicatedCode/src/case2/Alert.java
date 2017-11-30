package case2;

import java.util.Date;

public class Alert {
    public final static int HIGH = 1;
    public final static int NORMAL = 0;
    public final static int LOW = -1;

    private double average;
    private int rating;
    private Date expiry;
    private Date maturity;
    private int level;

    public Alert(double average, int rating, Date expiry) {
        constructAlert(average, rating, expiry, null);
    }

    public Alert(double average, int rating, Date expiry, Date maturity) {
        constructAlert(average, rating, expiry, maturity);
    }

    public Alert(double average, int rating, Date expiry, Date maturity, int level) {
        constructAlert(average, rating, expiry, maturity);
        setLevel(level);
    }

    private void constructAlert(double average, int rating, Date expiry, Date maturity) {
        setAverage(average);
        setRating(rating);
        setExpiry(expiry);
        setMaturity(maturity);
        setLevel(level);
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setExpiry(Date expiry) {
        this.expiry = expiry;
    }

    public void setMaturity(Date maturity) {
        this.maturity = maturity;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getAverage() {
        return average;
    }

    public int getRating() {
        return rating;
    }

    public Date getExpiry() {
        return expiry;
    }

    public Date getMaturity() {
        return maturity;
    }

    public boolean isHighLevel() {
        return level == HIGH;
    }

    public boolean isNormalLevel() {
        return level == NORMAL;
    }

    public boolean isLowLevel() {
        return level == LOW;
    }


}
