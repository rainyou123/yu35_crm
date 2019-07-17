package com.weichuang.service;

import com.weichuang.pojo.Customer;
import com.weichuang.utils.Page;
import com.weichuang.vo.QueryVo;

public interface CustomerService {
    Page<Customer> getPageByQueryVo(QueryVo vo);

    Customer getCustomerById(Integer id);

    void updateCustomer(Customer customer);

    void deleteCustomer(Integer id);

    void addCustomer(Customer customer);
}
