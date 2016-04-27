package com.deathstar.storageandenergy.domain

interface EnergyFactoryRepository {
    void saveFactory(EnergyFactory energyFactory)
    EnergyFactory getFactory(String name)
    EnergyFactory getFactory(UUID uuid)
}