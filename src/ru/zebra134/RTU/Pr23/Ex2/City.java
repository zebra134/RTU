package ru.zebra134.RTU.Pr23.Ex2;

public class City {
    private String town;
    private String country;

    public City(String town, String country) {
        this.town = town;
        this.country = country;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "City{" +
                "town='" + town + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

}