package com.nextbit.yassin.stg.infrastructure.repository;

import com.nextbit.yassin.stg.domain.entity.Shipment;
import com.nextbit.yassin.stg.domain.repository.IGenericRepositoryEntity;
import com.nextbit.yassin.stg.infrastructure.repository.datasource.EntityDataStoreFactory;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by yassin on 9/11/17.
 */

public class ShipmentRepository extends Repository<Shipment> implements IGenericRepositoryEntity<Shipment> {
    public ShipmentRepository(EntityDataStoreFactory userDataStoreFactory) {
        super(userDataStoreFactory);
    }

    @Override
    public Observable<List<Shipment>> getAllOfEntiny() {
        return null;
    }

    @Override
    public Observable<Shipment> getOfEntiny(int userId) {
        get(userId);
        return null;
    }

    @Override
    public void addOfEntiny(Shipment entity) {

    }

    @Override
    public void deleteOfEntiny(Shipment entity) {

    }

    @Override
    public void updateOfEntiny(Shipment entity) {

    }
}
