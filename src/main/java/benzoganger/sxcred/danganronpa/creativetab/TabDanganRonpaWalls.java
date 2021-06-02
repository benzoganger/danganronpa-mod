
package benzoganger.sxcred.danganronpa.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.creativetab.CreativeTabs;

import benzoganger.sxcred.danganronpa.ElementsDanganronpaModMod;

@ElementsDanganronpaModMod.ModElement.Tag
public class TabDanganRonpaWalls extends ElementsDanganronpaModMod.ModElement {
	public TabDanganRonpaWalls(ElementsDanganronpaModMod instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabdangan_ronpa_walls") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(Items.SHULKER_SHELL, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
