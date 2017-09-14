package com.nextbit.yassin.stg.domain.repository;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by yassin on 9/11/17.
 */

public interface IGenericRepositoryEntity<T> extends IGenericRepository<T>{

    Observable<List<T>> getAllOfEntiny();
    Observable<T> getOfEntiny(final int userId);


    void addOfEntiny(T entity);
    void deleteOfEntiny(T entity);
    void updateOfEntiny(T entity);




}