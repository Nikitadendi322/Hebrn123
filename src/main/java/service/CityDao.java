package service;


import model.City;

import java.util.List;



public interface CityDao {

    City add(City city);

    City getById(int id);

    List<City>getAllCity();

    static City updateCity(City city) {
        return null;
    }

    void deletedCity(City city);
}
