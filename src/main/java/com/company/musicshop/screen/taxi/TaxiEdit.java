package com.company.musicshop.screen.taxi;

import com.company.musicshop.entity.Taxi;
import io.jmix.ui.screen.*;

@UiController("Taxi.edit")
@UiDescriptor("taxi-edit.xml")
@EditedEntityContainer("taxiDc")
public class TaxiEdit extends StandardEditor<Taxi> {
    @Subscribe
    public void onInitEntity(InitEntityEvent<Taxi> event) {
    }
}