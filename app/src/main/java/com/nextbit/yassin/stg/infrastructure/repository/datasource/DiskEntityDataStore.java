package com.nextbit.yassin.stg.infrastructure.repository.datasource;

import com.nextbit.yassin.stg.infrastructure.cache.implement.EntityCache;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by yassin on 9/11/17.
 */

public class DiskEntityDataStore<T>implements IDataStoreRepository<T> {

    private final EntityCache entityCashe;
    public DiskEntityDataStore(EntityCache entityCashe) {
        this.entityCashe=entityCashe;

    }

    @Override
    public Observable<List<T>> getAll() {
        return null;
    }

    @Override
    public Observable<T> get(int userId) {
        entityCashe.get(11);
        return null;
    }


}
