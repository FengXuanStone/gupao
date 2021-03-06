package com.fengxuan.testrefactoring.first;

import lombok.Data;

@Data
public class Rental {
    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public double getChange() {
        double result = 0;

        switch (getMovie().getPriceCode()) {
            case Movie.REGULAR:
                result += 2;
                if(getDaysRented() > 2) {
                    result += (getDaysRented() - 2) * 1.5;
                }
                break;
            case Movie.NEW_RELEASE:
                result += getDaysRented() * 3;
                break;
            case Movie.CHILDRENS:
                result += 1.5;
                if(getDaysRented() > 3) {
                    result += (getDaysRented() - 3) * 1.5;
                }
                break;
            default:
                break;
        }
        return result;
    }
}
