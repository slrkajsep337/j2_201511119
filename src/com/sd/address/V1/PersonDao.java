package com.sd.address.V0;

import java.util.List;

public interface PersonDao {
    public void insert(Person p);
    public List<Person> findAll();
    public Person findByName(String name);
    public void update(Person p);
    public void delete(int id);
    //public void delete(Person p);
}