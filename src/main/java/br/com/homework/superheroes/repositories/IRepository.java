package br.com.homework.superheroes.repositories;

import java.util.List;

public interface IRepository<T> {

    T save(T t);

    void delete(T t);

    List<T> listAll();

    T update(T t);
}
