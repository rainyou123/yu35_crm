package com.weichuang.dao;

import com.weichuang.pojo.Customer;
import com.weichuang.utils.Page;
import com.weichuang.vo.QueryVo;

import java.util.List;

public interface CustomerDao {

    int getCustomerTotal(QueryVo vo);

    List<Customer> getCustomerlist(QueryVo vo);


    Customer getCustomerById(Integer id);

    void updateCustomer(Customer customer);

    void deleteCustomer(Integer id);

    void addCustomer(Customer customer);
}
