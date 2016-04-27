package com.deathstar.storageandenergy.domain

class EnergyFactory extends Factory {
    UUID uuid
    String name
    Storage<Energy> factoryStorage

    EnergyFactory(UUID uuid) {
        this.uuid = uuid
    }

    public void produce( ) {
        //more complex logic can be added to produce energy based on a timer
        factoryStorage.add(new Energy())
    }

    public Optional<Energy> takeItem() {
        factoryStorage.takeOne()
    }

    public List<Energy> depleteFactoryStorage() {
        factoryStorage.depleteStorage()
    }
}
