package com.deathstar.storageandenergy.domain

class AmmoFactory extends Factory {
    UUID uuid
    String name
    Storage<Ammunition> factoryStorage

    public produce() {
        //more complex logic can be added to produce ammo based on a timer
        factoryStorage.add(new Energy())
    }

    public Optional<Ammunition> takeItem() {
        factoryStorage.takeOne()
    }

    public List<Ammunition> depleteFactoryStorage() {
        factoryStorage.depleteStorage()
    }
}
