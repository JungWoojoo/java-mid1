package lang.immutable.test;

public class ImmutableMyData {
    private int year;
    private int month;
    private int day;

    public ImmutableMyData(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public ImmutableMyData withYear(int newYear) {
        return new ImmutableMyData(newYear, month, day);
    }

    public ImmutableMyData withMonth(int newMonth) {
        return new ImmutableMyData(year, newMonth, day);

    }

    public ImmutableMyData withDay(int newDay) {
        return new ImmutableMyData(year, month, newDay);

    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
