package org.bukkit.craftbukkit.entity;

import org.bukkit.craftbukkit.CraftServer;
import ru.vladthemountain.lilybukkit.core.entity.LBProjectile;

@Deprecated
public class AbstractProjectile extends LBProjectile {
    public AbstractProjectile(CraftServer server, net.minecraft.src.Entity entity) {
        super(server.worldList.get(0), entity);
    }
}
