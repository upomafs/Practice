/**
 * Created
 * by Upoma on 1/19/2017.
 */
public class Date {
private int month;
private int date;
private int year;
public  Date(int m,int d,int y) {
    if (0 < m && m <= 12) {
        month = m;
    } else month = 01;
    if (0 < d && d <= 31) {
        date = d;
    } else date = 01;
    if (1990 < y && y <= 2017) {
        year = y;
    } else year = 2000;
}

    public void setMonth(int m) {
        month = m;
    }

    public int getMonth() {
        return month;
    }

    public void setDate(int d) {
        date = d;
    }

    public int getDate() {
        return date;
    }

    public void setYear(int y) {
        year = y;
    }

    public int getYear() {
        return year;
    }

}