package com.nextbit.yassin.stg.infrastructure.repository;

import com.nextbit.yassin.stg.domain.repository.IGenericRepository;
import com.nextbit.yassin.stg.infrastructure.repository.datasource.EntityDataStoreFactory;
import com.nextbit.yassin.stg.infrastructure.repository.datasource.IDataStoreRepository;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by yassin on 9/6/17.
 */

public class Repository<T>implements IGenericRepository<T> {

    private final  EntityDataStoreFactory entityDataStoreFactory;

    public Repository(EntityDataStoreFactory userDataStoreFactory) {
        this.entityDataStoreFactory = userDataStoreFactory;
    }

    @Override
    public Observable<List<T>> getAll() {
        return null;
    }

    @Override
    public Observable<T> get(int userId) {
        final IDataStoreRepository<T> iDataStoreRepository = this.entityDataStoreFactory.create(userId);


        return iDataStoreRepository.get(userId);
    }

    @Override
    public void add(T entity) {

        //code implementation


    }

    @Override
    public void delete(T entity) {
        //code implementation

    }

    @Override
    public void update(T entity) {
        //code implementation

    }
}
