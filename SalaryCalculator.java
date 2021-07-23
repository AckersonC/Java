public class SalaryCalculator {
    public static double SalaryCalculator(double hoursperweek, double ammountperhour, int vacationdays) {
        if (hoursperweek < 0 ) {
            return -1;
        }
        if (ammountperhour < 0 ){
            return -1;
        }
        double weeklypaycheck = hoursperweek * ammountperhour;
        double unpaidtime = vacationdays*ammountperhour*8;
        return weeklypaycheck *52 - unpaidtime;



    }

    public static void main(String[] args) {
        double salary = SalaryCalculator(40,15,8);
        System.out.println(salary);
    }
}
