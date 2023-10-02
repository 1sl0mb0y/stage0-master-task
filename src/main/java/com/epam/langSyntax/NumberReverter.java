package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int first = number / 100;
        int second = (number / 10) % 10;
        int third = number % 10;
        int revertedResult = third*100 + second * 10 + first;
        System.out.println(revertedResult);
    }

}
