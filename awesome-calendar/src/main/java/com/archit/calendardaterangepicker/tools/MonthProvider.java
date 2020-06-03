package com.archit.calendardaterangepicker.tools;

public class MonthProvider {

    public String provide(int month) {
        String newMonth = "";
        switch (month) {
            case 0:
                newMonth = "Січень";
                break;
            case 1:
                newMonth = "Лютий";
                break;
            case 2:
                newMonth = "Березент";
                break;
            case 3:
                newMonth = "Квітень";
                break;
            case 4:
                newMonth = "Травень";
                break;
            case 5:
                newMonth = "Червень";
                break;
            case 6:
                newMonth = "Липень";
                break;
            case 7:
                newMonth = "Серпень";
                break;
            case 8:
                newMonth = "Вересень";
                break;
            case 9:
                newMonth = "Жовтень";
                break;
            case 10:
                newMonth = "Листопад";
                break;
            case 11: {
                newMonth = "Гдудень";
                break;
            }
        }
        return newMonth;
    }

}
