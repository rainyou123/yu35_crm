package com.weichuang.service;

import com.weichuang.dao.CustomerDao;
import com.weichuang.pojo.Customer;
import com.weichuang.utils.Page;
import com.weichuang.vo.QueryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;

    @Override
    public Page<Customer> getPageByQueryVo(QueryVo vo) {
        Page<Customer> page =new Page<>();
        if(vo != null){
            vo.setMaxCount(6);
            if(null != vo.getPage() && !vo.getPage().equals("")){
                page.setPage(Integer.valueOf(vo.getPage()));
                vo.setStartIndex((Integer.valueOf(vo.getPage())-1)*vo.getMaxCount());
            }
            page.setSize(5);
            page.setTotal(customerDao.getCustomerTotal(vo));
            page.setRows(customerDao.getCustomerlist(vo));
        }
        return page;
    }

    @Override
    public Customer getCustomerById(Integer id) {
        return customerDao.getCustomerById(id);
    }

    @Override
    public void updateCustomer(Customer customer) {
        customerDao.updateCustomer(customer);
    }

    @Override
    public void deleteCustomer(Integer id) {
        customerDao.deleteCustomer(id);
    }

    @Override
    public void addCustomer(Customer customer) {
        customerDao.addCustomer(customer);
    }
}
