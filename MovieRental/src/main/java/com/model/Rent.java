package com.model;

import javax.persistence.*;

@Entity
public class Rent {

    @Id
    private String id;
    private String rentDate;
    private String returnDate;
    private double paymentAmountDue;
    private Boolean available;

    @ManyToOne
    private Customer customer;

    private Rent()
    {

    }

    @OneToOne
    @JoinColumn(name = "movieId")
    private Movie movie;

    public String getId(){
        return id;
    }


    public String getRentDate() {
        return rentDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public double getPaymentAmountDue() {
        return paymentAmountDue;
    }

    public Boolean getAvailable() {
        return available;
    }

    public Rent(Builder builder)
    {
        this.id=builder.id;
        this.rentDate=builder.rentDate;
        this.returnDate=builder.returnDate;
        this.paymentAmountDue=builder.paymentAmountDue;
        this.available=builder.available;
        this.customer=builder.customer;
        this.movie=builder.movie;

    }
    public static class Builder
    {


        private String id;
        private String rentDate;
        private String returnDate;
        private double paymentAmountDue;
        private Boolean available;
        private Movie movie;
        private Customer customer;


        public Builder id(String value)
        {
            this.id=value;
            return this;


        }

        public Builder rentDate(String value)
        {

            this.rentDate=value;
            return this;

        }
        public Builder returnDate(String value)
        {

            this.returnDate=value;
            return this;

        }
        public Builder paymentAmountDue(double value)
        {

            this.paymentAmountDue=value;
            return this;

        }

        public Builder available(Boolean value)
        {
            this.available=value;
            return this;

        }

        public Builder movie(Movie value)
        {

            this.movie=value;
            return this;

        }
        public Builder customer(Customer value)
        {

            this.customer=value;
            return this;

        }

        public Rent build()
        {
            return new Rent(this);
        }
    }
}
