package de.lecuutex.bedwars.utils;

import lombok.Getter;
import org.bukkit.Material;

@Getter
public enum PriceEnum {
    BRONZE("BRONZE", Material.CLAY_BRICK),
    IRON("EISEN", Material.IRON_INGOT),
    GOLD("GOLD", Material.GOLD_INGOT);

    private Material material;
    private String name;

    PriceEnum(String name, Material material) {
        this.name = name;
        this.material = material;
    }
}
