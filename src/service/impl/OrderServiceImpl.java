package service.impl;

import model.entity.Order;
import model.enums.OrderStatus;
import repository.OrderRepository;
import repository.impl.OrderRepositoryImpl;
import service.ClientService;
import service.OrderService;

import java.time.LocalDateTime;

public class OrderServiceImpl {
    private OrderRepository repository = new OrderRepositoryImpl();
    private ClientService clientService = new ClientServiceImpl();
    public  void  swndOrder(int senderId, int recipiendId){
        Order order = new Order();
        order.setCreatedDate(LocalDateTime.now());
        order.setUpdatedDate(LocalDateTime.now());
        order.setOrderStatus(OrderStatus.PENDING);
        order.setSender(clientService.getdById(senderId));
        order.setRecipient(clientService.getdById(recipiendId));
        repository.save(order);

    }

}
