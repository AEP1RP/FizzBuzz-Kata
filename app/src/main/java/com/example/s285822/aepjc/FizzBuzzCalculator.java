package com.example.s285822.aepjc;

class FizzBuzzCalculator {

    private boolean isValidInput(Object input) {
        boolean isValid = false;
        if (input != null) {
            if (input instanceof Integer) {
                isValid = true;
            }
        }
        return isValid;
    }

    String checkFizzBuzz(int n) {
        String valueToReturn = "";

        if (isValidInput(n)) {
            if (n % 3 == 0 && n % 5 == 0) {
                valueToReturn = "fizzbuzz";
            } else if (n % 3 == 0) {
                valueToReturn = "fizz";
            } else if (n % 5 == 0) {
                valueToReturn = "buzz";
            } else {
                valueToReturn = String.valueOf(n);
            }
        }
        return valueToReturn;
    }


}
