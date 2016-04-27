package com.deathstar.storageandenergy.application

import com.deathstar.storageandenergy.domain.EnergyFactory
import com.deathstar.storageandenergy.domain.EnergyFactoryRepository
import com.deathstar.storageandenergy.domain.TransportSystem
import com.deathstar.storageandenergy.domain.Warehouse

class ProductionApplicationService {

    @Autowired
    EnergyFactoryRepository energyFactoryRepository

    public produceEnergy() {

        //complex authorization here

        EnergyFactory energyFactory = energyFactoryRepository.getFactory("EnergyFactory_01")
        energyFactory.produce()
        energyFactoryRepository.saveFactory(energyFactory)
    }
}
