package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {

    @Id
    private String id;
    private String name;
    private String genre;
    private String category;


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public String getCategory() {
        return category;
    }

    private Movie(){

    }

    public Movie(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.genre = builder.genre;
        this.category = builder.category;

    }

    public static class Builder{

        private String id;
        private String name;
        private String genre;
        private String category;

        public Builder id(String value){
            this.id = value;
            return this;
        }
        public Builder name(String value) {
            this.name = value;
            return this;
        }

        public Builder genre(String value) {
            this.genre = value;
            return this;
        }
        public Builder category(String value) {
            this.category = value;
            return this;
        }
        public Movie build(){
            return new Movie(this);
        }
    }
}
