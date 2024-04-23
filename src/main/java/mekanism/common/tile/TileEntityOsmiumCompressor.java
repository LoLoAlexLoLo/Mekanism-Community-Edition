package mekanism.common.tile;

import java.util.Map;

import mekanism.api.MekanismConfig.usage;
import mekanism.api.gas.Gas;
import mekanism.api.gas.GasRegistry;
import mekanism.api.gas.GasStack;
import mekanism.common.Resource;
import mekanism.common.block.BlockMachine.MachineType;
import mekanism.common.recipe.RecipeHandler.Recipe;
import mekanism.common.recipe.machines.OsmiumCompressorRecipe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class TileEntityOsmiumCompressor extends TileEntityAdvancedElectricMachine<OsmiumCompressorRecipe>
{
	public TileEntityOsmiumCompressor()
	{
		super("compressor", "OsmiumCompressor", usage.osmiumCompressorUsage, 1, 200, MachineType.OSMIUM_COMPRESSOR.baseEnergy);
		MAX_GAS = 200; //FIXME with a better fix
	}

	@Override
	public Map getRecipes()
	{
		return Recipe.OSMIUM_COMPRESSOR.get();
	}

	@Override
	public GasStack getItemGas(ItemStack itemstack)
	{
		String mekanismMaterial = Resource.OSMIUM.getOredictName();

		for (ItemStack ore : OreDictionary.getOres("ingot" + mekanismMaterial)) {
			if (ore.isItemEqual(itemstack)) {
				return new GasStack(GasRegistry.getGas("liquid" + mekanismMaterial), 200);
			}
		}

		for (ItemStack ore : OreDictionary.getOres("block" + mekanismMaterial)) {
			if (ore.isItemEqual(itemstack)) {
				return new GasStack(GasRegistry.getGas("liquid" + mekanismMaterial), 1800);
			}
		}

		return null;
	}

	@Override
	public boolean isValidGas(Gas gas)
	{
		return false;
	}
}
