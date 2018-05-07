/*Copyright (c) 2017-2018 vanenburgsoftware.com All Rights Reserved.
 This software is the confidential and proprietary information of vanenburgsoftware.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with vanenburgsoftware.com*/
package com.vg.emp.heroku_292ea0bd78efe9c.dao;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.wavemaker.runtime.data.dao.WMGenericDaoImpl;

import com.vg.emp.heroku_292ea0bd78efe9c.Employee;

/**
 * Specifies methods used to obtain and modify Employee related information
 * which is stored in the database.
 */
@Repository("heroku_292ea0bd78efe9c.EmployeeDao")
public class EmployeeDao extends WMGenericDaoImpl<Employee, Integer> {

    @Autowired
    @Qualifier("heroku_292ea0bd78efe9cTemplate")
    private HibernateTemplate template;


    @Override
    public HibernateTemplate getTemplate() {
        return this.template;
    }
}

