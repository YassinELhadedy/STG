package com.nextbit.yassin.stg.infrastructure.repository.datasource;

import android.content.Context;

import com.google.gson.Gson;
import com.nextbit.yassin.stg.domain.service.RestApi;
import com.nextbit.yassin.stg.infrastructure.cache.implement.EntityCache;
import com.nextbit.yassin.stg.infrastructure.mapper.SheetJsonMapper;
import com.nextbit.yassin.stg.infrastructure.service.RestApiImpl;

/**
 * Created by yassin on 9/11/17.
 */

public class EntityDataStoreFactory {
    private final Context context;
    private final EntityCache entityCashe;//must be declare this of interfacetype and creation of one of implemented

    public EntityDataStoreFactory(Context context, EntityCache entityCashe) {
        this.context = context.getApplicationContext();
        this.entityCashe = entityCashe;
    }

    public IDataStoreRepository create(int userId) {

        //entityCashe.get(11);
       // return new DiskEntityDataStore(this.entityCashe);
//        return new CloudEntityDataStore();



        if (!this.entityCashe.isExpired() && this.entityCashe.isCached(userId)) {


            return new DiskEntityDataStore(this.entityCashe);
        } else {

            createCloudDataStore();


        }
        return null;



    }

    public IDataStoreRepository createCloudDataStore(){

        Gson gson=new Gson();

        SheetJsonMapper sheetJsonMapper=new SheetJsonMapper(gson);

        final RestApi restApi = new RestApiImpl(this.context, sheetJsonMapper);
        return new CloudEntityDataStore(restApi,entityCashe);


    }


}
