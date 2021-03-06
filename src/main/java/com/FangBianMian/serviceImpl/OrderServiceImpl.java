package com.FangBianMian.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FangBianMian.dao.IOrderDao;
import com.FangBianMian.domain.Orders;
import com.FangBianMian.domain.OrdersItem;
import com.FangBianMian.domain.OrdersLog;
import com.FangBianMian.service.IOrderService;

@Service
public class OrderServiceImpl implements IOrderService {

	@Autowired
	private IOrderDao orderDao;

	@Override
	public List<Orders> queryOrdersByParam(Map<String, Object> param) {
		return orderDao.queryOrdersByParam(param);
	}

	@Override
	public int queryOrdersByParamTotal(Map<String, Object> param) {
		return orderDao.queryOrdersByParamTotal(param);
	}

	@Override
	public void updateOrderStatus(Map<String, Object> param) {
		orderDao.updateOrderStatus(param);
	}

	@Override
	public Orders queryOrdersByOid(Integer id) {
		return orderDao.queryOrdersByOid(id);
	}

	@Override
	public void insertOrder(Orders o) {
		orderDao.insertOrder(o);
	}
	
	@Override
	public void insertOrderItem(OrdersItem oi) {
		orderDao.insertOrderItem(oi);
	}
	
	@Override
	public void insertOrderLog(OrdersLog ol) {
		orderDao.insertOrderLog(ol);
	}
	
	@Override
	public void deleteOrderById(Integer oid) {
		orderDao.deleteOrderById(oid);
	}
}
