package com.company.autotaxi.screen.order;

import com.company.autotaxi.entity.Order;
import com.company.planner.Status;
import io.jmix.ui.screen.*;

@UiController("Order_.edit")
@UiDescriptor("order-edit.xml")
@EditedEntityContainer("orderDc")
public class OrderEdit extends StandardEditor<Order> {
    @Subscribe
    public void onInitEntity(InitEntityEvent<Order> event) {
        event.getEntity().setStatus(Status.Accepted);
    }
}