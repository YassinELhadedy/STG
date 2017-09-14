package com.nextbit.yassin.stg.infrastructure.test;

import com.nextbit.yassin.stg.infrastructure.cache.implement.RunnerCache;
import com.nextbit.yassin.stg.infrastructure.cache.implement.SheetCache;
import com.nextbit.yassin.stg.infrastructure.repository.RunnerRepository;
import com.nextbit.yassin.stg.infrastructure.repository.SheetRepository;
import com.nextbit.yassin.stg.infrastructure.repository.datasource.EntityDataStoreFactory;

/**
 * Created by yassin on 9/11/17.
 */

public class Main {
    public static void main(String...args){

//        EntityDataStoreFactory entityDataStoreFactory=new EntityDataStoreFactory(null,new RunnerCashe());
//        RunnerRepository runnerRepository=new RunnerRepository(entityDataStoreFactory);
//        runnerRepository.getOfEntiny(11);
//        EntityDataStoreFactory e=new EntityDataStoreFactory(null,new ShipmentCashe());
//            ShipmentRepository shipmentRepository=new ShipmentRepository(e);
//        shipmentRepository.getOfEntiny(11);
        EntityDataStoreFactory dataStoreFactory=new EntityDataStoreFactory(null,new RunnerCache());
        RunnerRepository repository=new RunnerRepository(dataStoreFactory);
        repository.getOfEntiny(11);


    }
}
