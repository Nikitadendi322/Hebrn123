package jbcd;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import model.City;
import model.Employee;
import service.CityDao;
import service.CityDaoImpl;
import service.EmployeeDao;
import service.EmployeeDaoImpl;

import java.util.List;
@Getter
@Setter



public class Application {
    static CityDao cityDao=new CityDaoImpl();
    static EmployeeDao employeeDao=new EmployeeDaoImpl();

     public static void main(String[]args){

         City city=City.builder().city_name("Tomsk").employees(List.of()).build();
         cityDao.add(city);
         System.out.println("cities contains all entities:"+cityDao.getAllCity().contains(city));

         Employee employee1=Employee.builder()
                 .first_name("Nikita")
                 .last_name("Pavlov")
                 .gender("m")
                 .city(city)
                 .age(26)
                 .build();
         Employee employee2=Employee.builder()
                 .first_name("Pasha")
                 .last_name("Pupkin")
                 .gender("m")
                 .city(city)
                 .age(28)
                 .build();
         city.getEmployees(List.of(employee1,employee2));
         City updatedCity=CityDao.updateCity(city);

         System.out.println("All employees were saved:"+employeeDao.getAllEmployee().containsAll(updatedCity.getEmployees()));
         cityDao.getById(updatedCity.getCity_id());

    }


}
