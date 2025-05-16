package com.company.musicshop.screen.taxi;

import io.jmix.ui.screen.*;
import com.company.musicshop.entity.Taxi;

@UiController("Taxi.browse")
@UiDescriptor("taxi-browse.xml")
@LookupComponent("taxisTable")
public class TaxiBrowse extends StandardLookup<Taxi> {
}