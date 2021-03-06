package com.FangBianMian.service;

import java.util.List;
import java.util.Map;

import com.FangBianMian.domain.Orders;
import com.FangBianMian.domain.OrdersItem;
import com.FangBianMian.domain.OrdersLog;

public interface IOrderService {

	/**
	 * 查询订单
	 * @param param
	 * @return
	 */
	List<Orders> queryOrdersByParam(Map<String, Object> param);

	/**
	 * 查询订单总数
	 * @param param
	 * @return
	 */
	int queryOrdersByParamTotal(Map<String, Object> param);

	/**
	 *	更新订单状态
	 */
	void updateOrderStatus(Map<String, Object> param);

	/**
	 * 通过订单ID查询订单
	 * @param id
	 * @return
	 */
	Orders queryOrdersByOid(Integer id);

	/**
	 * 保存订单
	 * @param o
	 */
	void insertOrder(Orders o);

	/**
	 * 保存订单商品条目
	 * @param oi
	 */
	void insertOrderItem(OrdersItem oi);

	/**
	 * 保存订单日志
	 * @param ol
	 */
	void insertOrderLog(OrdersLog ol);

	/**
	 * 删除订单
	 * @param oid
	 */
	void deleteOrderById(Integer oid);

}
