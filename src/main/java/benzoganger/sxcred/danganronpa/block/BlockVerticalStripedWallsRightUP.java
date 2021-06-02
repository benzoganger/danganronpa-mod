
package benzoganger.sxcred.danganronpa.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import benzoganger.sxcred.danganronpa.creativetab.TabDanganRonpaWalls;
import benzoganger.sxcred.danganronpa.ElementsDanganronpaModMod;

@ElementsDanganronpaModMod.ModElement.Tag
public class BlockVerticalStripedWallsRightUP extends ElementsDanganronpaModMod.ModElement {
	@GameRegistry.ObjectHolder("danganronpa_mod:vertical_striped_walls_right_up")
	public static final Block block = null;
	public BlockVerticalStripedWallsRightUP(ElementsDanganronpaModMod instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("vertical_striped_walls_right_up"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("danganronpa_mod:vertical_striped_walls_right_up", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.ROCK);
			setUnlocalizedName("vertical_striped_walls_right_up");
			setSoundType(SoundType.STONE);
			setHardness(1F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabDanganRonpaWalls.tab);
		}
	}
}
