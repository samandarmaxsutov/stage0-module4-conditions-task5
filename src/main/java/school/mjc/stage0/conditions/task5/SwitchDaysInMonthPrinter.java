package school.mjc.stage0.conditions.task5;

public class SwitchDaysInMonthPrinter {
    public void amountOfDays(int month) {
        String days =switch (month){
            case 1,3,5,7,8,10,12 -> "31";
            case 2 -> "28";
            case 4,6,9,11->"30";
            default -> "wrong number!";
        };
        System.out.println(days);
    }
}
