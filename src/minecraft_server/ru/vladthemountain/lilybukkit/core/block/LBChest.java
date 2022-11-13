package ru.vladthemountain.lilybukkit.core.block;

import net.minecraft.src.TileEntityChest;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.inventory.Inventory;
import ru.vladthemountain.lilybukkit.core.LBWorld;
import ru.vladthemountain.lilybukkit.core.inventory.LBInventory;

public class LBChest extends LBBlockState implements Chest {

    TileEntityChest entity;

    public LBChest(LBWorld w, Block b) {
        super(w, b);
        this.entity = (TileEntityChest) w.getWorldServer().getTileEntity(b.getX(), b.getY(), b.getZ());
    }

    /**
     * Get the block's inventory.
     *
     * @return
     */
    @Override
    public Inventory getInventory() {
        return new LBInventory(this.entity);
    }
}
