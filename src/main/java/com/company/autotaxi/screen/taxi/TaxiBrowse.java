package com.company.autotaxi.screen.taxi;

import com.company.autotaxi.entity.Taxi;
import io.jmix.ui.screen.LookupComponent;
import io.jmix.ui.screen.StandardLookup;
import io.jmix.ui.screen.UiController;
import io.jmix.ui.screen.UiDescriptor;

@UiController("Taxi.browse")
@UiDescriptor("taxi-browse.xml")
@LookupComponent("taxisTable")
public class TaxiBrowse extends StandardLookup<Taxi> {
}