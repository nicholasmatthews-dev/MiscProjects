public class Holiday {

    private String  name;
    private int     day;
    private int     month;
    private boolean national;


    public Holiday(String inName, int inMonth, int inDay) {
        name = inName;
        if (inMonth >= 1 && inMonth <= 12){
            month = inMonth;
        }
        else {
             month = -1;
        }
        if (inDay >= 1 && inDay <= 31){
             day = inDay;
        }
        else {
             day = -1;
        }
        national = false;
    }


    public Holiday(String inName, int inMonth, int inDay, boolean inNational) {
        name = inName;
        if (inMonth >= 1 && inMonth <= 12){
            month = inMonth;
        }
        else {
             month = -1;
        }
        if (inDay >= 1 && inDay <= 31){
             day = inDay;
        }
        else {
             day = -1;
        }
        national = inNational;
    }

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public boolean isNational() {
        return national;
    }

    private String monthAsString() {
        String months[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        if (month >= 1 && month <= 12){
            return months[month-1];
        }
        else {
           return "Invalid Month";
        }
    }

    private String dayAsString() {
        if (day >= 1 && day <= 31){
           if (day == 1 || day == 21 || day == 31) {
             return day+"st";
           }
           else if (day == 2 || day == 22) {
             return day+"nd";
           }
           else if (day == 3 || day == 23) {
             return day+"rd";
           }
           else {
             return day+"th";
           }
        }
        else {
           return "Invalid Day";
        }
    }

    @Override
    public String toString() {
        if (national){
             return name+" is on "+monthAsString()+" "+dayAsString()+" (A national holiday)";
        }
        else {
             return name+" is on "+monthAsString()+" "+dayAsString()+" (A global holiday)";
        }
    }

    public static void main(String[] args) {
        Holiday july4 = new Holiday("Independence Day",7,4,true);
        System.out.println(july4.toString());
    }
}