package com.Hotpot.dao;

import com.example.ggq.restaurant.com.Hotpot.entity.Customer;

public interface CustomerDao {
	//����һ���û�
	public void insertCustomer(Customer customer);
	//����һ���û�
	public void updateCustomer(Customer customer);
	//�����˺Ų�ѯ�û�
	public Customer queryCustomerAsNumber(String customerNumber);
	//����������ѯ�û�
	public Customer quertCustomerAsName(String customerName);
	public void updateCustomerPass(Customer customer);
}