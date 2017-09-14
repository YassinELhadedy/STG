package com.nextbit.yassin.stg.infrastructure.repository;

import com.nextbit.yassin.stg.domain.entity.Runner;
import com.nextbit.yassin.stg.domain.repository.IGenericRepositoryEntity;
import com.nextbit.yassin.stg.infrastructure.repository.datasource.EntityDataStoreFactory;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by yassin on 9/11/17.
 */

public class RunnerRepository extends Repository<Runner> implements IGenericRepositoryEntity<Runner> {

    public RunnerRepository(EntityDataStoreFactory userDataStoreFactory) {
        super(userDataStoreFactory);
    }

    @Override
    public Observable<List<Runner>> getAllOfEntiny() {
        return null;
    }

    @Override
    public Observable<Runner> getOfEntiny(int userId) {
        get(userId);
        return null;
    }

    @Override
    public void addOfEntiny(Runner entity) {

    }

    @Override
    public void deleteOfEntiny(Runner entity) {

    }

    @Override
    public void updateOfEntiny(Runner entity) {

    }
}
