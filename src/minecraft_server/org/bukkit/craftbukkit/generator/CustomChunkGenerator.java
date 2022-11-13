package org.bukkit.craftbukkit.generator;

import net.minecraft.src.Chunk;
import net.minecraft.src.IChunkProvider;
import net.minecraft.src.IProgressUpdate;
import net.minecraft.src.World;
import org.bukkit.generator.ChunkGenerator;

import java.util.Random;

@Deprecated
public class CustomChunkGenerator extends InternalChunkGenerator {

    public CustomChunkGenerator(World world, long seed, ChunkGenerator generator) {
        throw new UnsupportedOperationException("One of the plugins called deprecated Chunk Generation API");
    }

    @Override
    public boolean chunkExists(int x, int z) {
        throw new UnsupportedOperationException("One of the plugins called deprecated Chunk Generation API");
    }

    @Override
    public Chunk provideChunk(int x, int z) {
        throw new UnsupportedOperationException("One of the plugins called deprecated Chunk Generation API");
    }

    @Override
    public void populate(IChunkProvider chunkProvider, int x, int z) {
        throw new UnsupportedOperationException("One of the plugins called deprecated Chunk Generation API");
    }

    @Override
    public boolean saveChunks(boolean flag, IProgressUpdate progressUpdate) {
        throw new UnsupportedOperationException("One of the plugins called deprecated Chunk Generation API");
    }

    @Override
    public boolean unload100OldestChunks() {
        throw new UnsupportedOperationException("One of the plugins called deprecated Chunk Generation API");
    }

    @Override
    public boolean canSave() {
        throw new UnsupportedOperationException("One of the plugins called deprecated Chunk Generation API");
    }

    /**
     * Shapes the chunk for the given coordinates.<br>
     * <br>
     * This method should return a byte[32768] in the following format:
     * {@code
     * for (int x = 0; x < 16; x++) {
     * for (int z = 0; z < 16; z++) {
     * for (int y = 0; y < 128; y++) {
     * // result[(x * 16 + z) * 128 + y] = ??;
     * }
     * }
     * }
     * }
     *
     * Note that this method should <b>never</b> attempt to get the Chunk at
     * the passed coordinates, as doing so may cause an infinite loop
     *
     * @param world  The world this chunk will be used for
     * @param random The random generator to use
     * @param x      The X-coordinate of the chunk
     * @param z      The Z-coordinate of the chunk
     * @return byte[] containing the types for each block created by this generator
     */
    @Override
    public byte[] generate(org.bukkit.World world, Random random, int x, int z) {
        throw new UnsupportedOperationException("One of the plugins called deprecated Chunk Generation API");
    }
}
