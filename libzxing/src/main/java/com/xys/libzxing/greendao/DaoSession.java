package com.xys.libzxing.greendao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.xys.libzxing.zxing.Bean.ActionCustomersBean;
import com.xys.libzxing.zxing.Bean.ActivityBean;
import com.xys.libzxing.zxing.Bean.CustomersBean;

import com.xys.libzxing.greendao.ActionCustomersBeanDao;
import com.xys.libzxing.greendao.ActivityBeanDao;
import com.xys.libzxing.greendao.CustomersBeanDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig actionCustomersBeanDaoConfig;
    private final DaoConfig activityBeanDaoConfig;
    private final DaoConfig customersBeanDaoConfig;

    private final ActionCustomersBeanDao actionCustomersBeanDao;
    private final ActivityBeanDao activityBeanDao;
    private final CustomersBeanDao customersBeanDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        actionCustomersBeanDaoConfig = daoConfigMap.get(ActionCustomersBeanDao.class).clone();
        actionCustomersBeanDaoConfig.initIdentityScope(type);

        activityBeanDaoConfig = daoConfigMap.get(ActivityBeanDao.class).clone();
        activityBeanDaoConfig.initIdentityScope(type);

        customersBeanDaoConfig = daoConfigMap.get(CustomersBeanDao.class).clone();
        customersBeanDaoConfig.initIdentityScope(type);

        actionCustomersBeanDao = new ActionCustomersBeanDao(actionCustomersBeanDaoConfig, this);
        activityBeanDao = new ActivityBeanDao(activityBeanDaoConfig, this);
        customersBeanDao = new CustomersBeanDao(customersBeanDaoConfig, this);

        registerDao(ActionCustomersBean.class, actionCustomersBeanDao);
        registerDao(ActivityBean.class, activityBeanDao);
        registerDao(CustomersBean.class, customersBeanDao);
    }
    
    public void clear() {
        actionCustomersBeanDaoConfig.clearIdentityScope();
        activityBeanDaoConfig.clearIdentityScope();
        customersBeanDaoConfig.clearIdentityScope();
    }

    public ActionCustomersBeanDao getActionCustomersBeanDao() {
        return actionCustomersBeanDao;
    }

    public ActivityBeanDao getActivityBeanDao() {
        return activityBeanDao;
    }

    public CustomersBeanDao getCustomersBeanDao() {
        return customersBeanDao;
    }

}
