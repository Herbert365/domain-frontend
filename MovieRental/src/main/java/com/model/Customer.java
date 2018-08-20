package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

    @Id
    private String id;
    private String name;
    private String surname;
    private String userName;
    private String password;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    private Customer()
    {

    }

    public Customer(Builder builder)
    {
        this.id=builder.id;
        this.name=builder.name;
        this.surname=builder.surname;
        this.userName=builder.userName;
        this.password=builder.password;
    }

    public static class Builder
    {
        private String id;
        private String name;
        private String surname;
        private String userName;
        private String password;



        public Builder id(String value){
            this.id = value;
            return this;
        }

        public Builder name(String value)
        {

            this.name=value;
            return this;

        }
        public Builder surname(String value)
        {

            this.surname=value;
            return this;


        }

        public Builder userName(String value)
        {

            this.userName=value;
            return this;

        }

        public Builder password(String value)
        {
            this.password=value;
            return this;

        }

        public Customer build()
        {
            return new Customer(this);
        }
    }
}
