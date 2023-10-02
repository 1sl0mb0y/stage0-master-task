package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        switch (year % 4) {
            case 0 -> {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        switch (month) {
                            case 1 -> System.out.println("31");
                            case 2 -> System.out.println("29");
                            case 3 -> System.out.println("31");
                            case 4 -> System.out.println("30");
                            case 5 -> System.out.println("31");
                            case 6 -> System.out.println("30");
                            case 7 -> System.out.println("31");
                            case 8 -> System.out.println("31");
                            case 9 -> System.out.println("30");
                            case 10 -> System.out.println("31");
                            case 11 -> System.out.println("30");
                            case 12 -> System.out.println("31");
                            default -> System.out.println("invalid date");
                        }
                    } else {
                        switch (month) {
                            case 1 -> System.out.println("31");
                            case 2 -> System.out.println("28");
                            case 3 -> System.out.println("31");
                            case 4 -> System.out.println("30");
                            case 5 -> System.out.println("31");
                            case 6 -> System.out.println("30");
                            case 7 -> System.out.println("31");
                            case 8 -> System.out.println("31");
                            case 9 -> System.out.println("30");
                            case 10 -> System.out.println("31");
                            case 11 -> System.out.println("30");
                            case 12 -> System.out.println("31");
                            default -> System.out.println("invalid date");
                        }
                    }
                } else {
                    switch (month) {
                        case 1 -> System.out.println("31");
                        case 2 -> System.out.println("29");
                        case 3 -> System.out.println("31");
                        case 4 -> System.out.println("30");
                        case 5 -> System.out.println("31");
                        case 6 -> System.out.println("30");
                        case 7 -> System.out.println("31");
                        case 8 -> System.out.println("31");
                        case 9 -> System.out.println("30");
                        case 10 -> System.out.println("31");
                        case 11 -> System.out.println("30");
                        case 12 -> System.out.println("31");
                        default -> System.out.println("invalid date");
                    }
                }
            }
            default -> {
                switch (month) {
                    case 1 -> System.out.println("31");
                    case 2 -> System.out.println("28");
                    case 3 -> System.out.println("31");
                    case 4 -> System.out.println("30");
                    case 5 -> System.out.println("31");
                    case 6 -> System.out.println("30");
                    case 7 -> System.out.println("31");
                    case 8 -> System.out.println("31");
                    case 9 -> System.out.println("30");
                    case 10 -> System.out.println("31");
                    case 11 -> System.out.println("30");
                    case 12 -> System.out.println("31");
                    default -> System.out.println("invalid date");
                }
            }
        }
    }

}
