package com.deathstar.storageandenergy.domain


abstract class Factory {
    abstract void produce()
    abstract Optional<Item> takeItem()
    abstract List<Item> depleteFactoryStorage()
}
