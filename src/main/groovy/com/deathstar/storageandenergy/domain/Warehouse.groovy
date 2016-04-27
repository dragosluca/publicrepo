package com.deathstar.storageandenergy.domain

class Warehouse {
    List<Storage<Energy>> energyStorage
    List<Storage<Ammunition>> ammoStorage

    public void store() {
        //determine which type of storage you need
        //add to the specific storage
    }
}
