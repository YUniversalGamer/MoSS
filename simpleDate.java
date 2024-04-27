public class SimpleDate 
{
    private int month;
    private int day;
    private int year;

    public SimpleDate(int m, int d, int y)
    {
        month = m;
        day = d;
        year = y;
    }

    /**
     * Assigns the object a new date
     * @param m The month to assign
     * @param d The day to assign
     * @param y The year to assign
     */
    public void setDate(int m, int d, int y)
    {
        month = m;
        day = d;
        year = y;
    }

    /**
     * Returns the month assigned to the object
     * @return The assigned month
     */
    public int getMonth()
    {
        return month;
    }

    /**
     * Returns the name of the month assigned to the object rather than the number
     * @return The name of the assigned month
     */
    public String getMonthName()
    {
        String monthName = "Error";
        switch (month)
        {

            case (1):
            {
                monthName = "January";
                break;
            }

            case (2):
            {
                monthName = "February";
                break;
            }

            case (3):
            {
                monthName = "March";
                break;
            }

            case (4):
            {
                monthName = "April";
                break;
            }

            case (5):
            {
                monthName = "May";
                break;
            }

            case (6):
            {
                monthName = "June";
                break;
            }

            case (7):
            {
                monthName = "July";
                break;
            }

            case (8):
            {
                monthName = "August";
                break;
            }

            case (9):
            {
                monthName = "September";
                break;
            }

            case (10):
            {
                monthName = "October";
                break;
            }

            case (11):
            {
                monthName = "November";
                break;
            }

            case (12):
            {
                monthName = "December";
                break;
            }
        }

        return monthName;
    }

    public int getDay()
    {
        return day;
    }

    public int getYear()
    {
        return year;
    }
}
