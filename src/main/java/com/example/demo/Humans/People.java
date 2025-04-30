package com.example.demo.Humans;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People <PersonType extends Person> implements Iterable<PersonType>{
    private ArrayList<PersonType> personList;

    public People(PersonType...people){
        this.personList=new ArrayList<>();
        for(PersonType person :people){
            personList.add(person);
        }
    }
    public void addPerson(PersonType person){
        personList.add(person);
    }
    public void remove(PersonType person){
        personList.remove(person);
    }
    public void clearPersonList(){
        personList.clear();
    }
    public ArrayList<PersonType> personListSize(PersonType person){
        personList.size();
        return personList;
    }

    public void addAll (Iterable<PersonType> people){
        for(PersonType person: people){
            personList.add(person);
        }
    }

    public PersonType findById(Long id) {
        for (PersonType person : personList) {
            if (person.getId().equals(id)) {
                return person;
            }
        }
        return null;
    }
    public List<PersonType> findAll() {
        return personList;
    }
    @Override
    public Iterator<PersonType> iterator() {
        return personList.iterator();
    }

}