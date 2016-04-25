package com.deathstar.storageandenergy.domain

import com.deathstar.storageandenergy.domain.enums.AmmunitionType
import groovy.transform.Immutable

@Immutable
class Ammunition {

    final private static double area = 1

    final private AmmunitionType ammunitionType
    final private double power

    public double calculateExplosiveArea() {
        return area * power
    }
}
