package com.deathstar.storageandenergy.domain

class EnergyFactory {
    UUID uuid
    Storage<Energy> factoryStorage

    EnergyFactory(UUID uuid) {
        this.uuid = uuid
    }

    public produceEnergy( ) {
        factoryStorage.add(new Energy())
    }

    public Optional<Energy> takeEnergyItem() {
        factoryStorage.takeOne()
    }

    public List<Energy> depleteFactoryStorage() {
        factoryStorage.depleteStorage()
    }
}
