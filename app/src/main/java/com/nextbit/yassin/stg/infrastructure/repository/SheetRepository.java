package com.nextbit.yassin.stg.infrastructure.repository;

import com.nextbit.yassin.stg.domain.entity.Sheet;
import com.nextbit.yassin.stg.domain.repository.IGenericRepositoryEntity;
import com.nextbit.yassin.stg.infrastructure.repository.datasource.EntityDataStoreFactory;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by yassin on 9/11/17.
 */

public class SheetRepository extends Repository<Sheet> implements IGenericRepositoryEntity<Sheet> {
    public SheetRepository(EntityDataStoreFactory userDataStoreFactory) {
        super(userDataStoreFactory);
    }

    @Override
    public Observable<List<Sheet>> getAllOfEntiny() {
        return null;
    }

    @Override
    public Observable<Sheet> getOfEntiny(int userId)
    {get(userId);
        return null;
    }

    @Override
    public void addOfEntiny(Sheet entity) {

    }

    @Override
    public void deleteOfEntiny(Sheet entity) {

    }

    @Override
    public void updateOfEntiny(Sheet entity) {

    }
}
