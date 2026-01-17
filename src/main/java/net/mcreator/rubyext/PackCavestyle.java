package net.mcreator.rubyext;

import net.minecraft.network.chat.Component;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.PathPackResources;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.minecraftforge.event.AddPackFindersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forgespi.locating.IModFile;
 
import java.nio.file.Path;

@Mod.EventBusSubscriber(
    bus = Mod.EventBusSubscriber.Bus.MOD,
    value = net.minecraftforge.api.distmarker.Dist.CLIENT
)
public class PackCavestyle {
 
    @SubscribeEvent
    public static void addPack(AddPackFindersEvent event) {
        if (event.getPackType() != PackType.CLIENT_RESOURCES) return;
 
        var modFileInfo = ModList.get().getModFileById("rubyext");
        if (modFileInfo == null) return;
 
        IModFile modFile = modFileInfo.getFile();
        Path packPath = modFile.findResource("resourcepacks/cavestyle");
 
        event.addRepositorySource(consumer -> {
            Pack pack = Pack.readMetaAndCreate(
                    "cavestyle",
                    Component.literal("Cavestyle"),
                    false,
                    id -> new PathPackResources(id, packPath, false),
                    PackType.CLIENT_RESOURCES,
                    Pack.Position.TOP,
                    PackSource.BUILT_IN
            );
 
            if (pack != null) {
                consumer.accept(pack);
            }
        });
    }
}