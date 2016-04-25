package com.deathstar.storageandenergy.domain

class Storage <T> {
    private UUID uuid
    private List<T> storage

    Storage(UUID uuid) {
        this.uuid = uuid
        storage = new ArrayList<>()
    }

    Storage(UUID uuid, List<T> storageItems) {
        this.uuid = uuid
        storage = storageItems
    }

    public void add(T item) {
        storage.add(item)
    }

    public Optional<T> takeOne() {
        return Optional.ofNullable(storage.isEmpty() ? null : storage.first())
    }

    public List<T> depleteStorage() {
        List<T> depletedItems = new ArrayList<>()
        depletedItems.addAll(storage)
        storage.clear()
        return depletedItems
    }
}
