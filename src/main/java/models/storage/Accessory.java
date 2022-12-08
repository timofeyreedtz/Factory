package models.storage;

import models.storage.CarPart;

import java.util.UUID;

public class Accessory extends CarPart {
    public Accessory(UUID uuid, String name) {
        super(uuid, name);
    }
}
