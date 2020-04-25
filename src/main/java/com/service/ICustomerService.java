package com.service;

import com.github.pagehelper.PageInfo;
import com.pojo.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ICustomerService {

    List<Customer> queryCustomerList();

    int addCustomer(Customer classroom);

    PageInfo<Customer> queryCustomerListByResult(Integer pageNum, Integer pageSize,String result,String companyName);

    List<Customer> getAllCustomer();

    Customer getCustomerById(Integer id);

    int updateCustomer(Customer classroom);

    int removeCustomerById(Integer classroomId);

}
