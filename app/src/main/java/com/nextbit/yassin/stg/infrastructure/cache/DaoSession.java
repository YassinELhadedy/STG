package com.nextbit.yassin.stg.infrastructure.cache;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.nextbit.yassin.stg.domain.entity.Sheet;
import com.nextbit.yassin.stg.domain.entity.Shipment;
import com.nextbit.yassin.stg.domain.entity.Runner;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig sheetDaoConfig;
    private final DaoConfig shipmentDaoConfig;
    private final DaoConfig runnerDaoConfig;

    private final SheetDao sheetDao;
    private final ShipmentDao shipmentDao;
    private final RunnerDao runnerDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        sheetDaoConfig = daoConfigMap.get(SheetDao.class).clone();
        sheetDaoConfig.initIdentityScope(type);

        shipmentDaoConfig = daoConfigMap.get(ShipmentDao.class).clone();
        shipmentDaoConfig.initIdentityScope(type);

        runnerDaoConfig = daoConfigMap.get(RunnerDao.class).clone();
        runnerDaoConfig.initIdentityScope(type);

        sheetDao = new SheetDao(sheetDaoConfig, this);
        shipmentDao = new ShipmentDao(shipmentDaoConfig, this);
        runnerDao = new RunnerDao(runnerDaoConfig, this);

        registerDao(Sheet.class, sheetDao);
        registerDao(Shipment.class, shipmentDao);
        registerDao(Runner.class, runnerDao);
    }
    
    public void clear() {
        sheetDaoConfig.clearIdentityScope();
        shipmentDaoConfig.clearIdentityScope();
        runnerDaoConfig.clearIdentityScope();
    }

    public SheetDao getSheetDao() {
        return sheetDao;
    }

    public ShipmentDao getShipmentDao() {
        return shipmentDao;
    }

    public RunnerDao getRunnerDao() {
        return runnerDao;
    }

}
