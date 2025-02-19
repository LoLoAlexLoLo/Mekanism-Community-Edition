package mekanism.generators.client.gui;

import java.util.List;

import mekanism.api.MekanismConfig.generators;
import mekanism.api.util.ListUtils;
import mekanism.client.gui.GuiMekanism;
import mekanism.client.gui.element.GuiElement.IInfoHandler;
import mekanism.client.gui.element.GuiEnergyInfo;
import mekanism.client.gui.element.GuiPowerBar;
import mekanism.client.gui.element.GuiRedstoneControl;
import mekanism.client.gui.element.GuiSecurityTab;
import mekanism.client.gui.element.GuiSlot;
import mekanism.client.gui.element.GuiSlot.SlotOverlay;
import mekanism.client.gui.element.GuiSlot.SlotType;
import mekanism.common.util.LangUtils;
import mekanism.common.util.MekanismUtils;
import mekanism.common.util.MekanismUtils.ResourceType;
import mekanism.generators.common.inventory.container.ContainerBioGenerator;
import mekanism.generators.common.tile.TileEntityBioGenerator;
import net.minecraft.entity.player.InventoryPlayer;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiBioGenerator extends GuiMekanism
{
	public TileEntityBioGenerator tileEntity;

	public GuiBioGenerator(InventoryPlayer inventory, TileEntityBioGenerator tentity)
	{
		super(new ContainerBioGenerator(inventory, tentity));
		tileEntity = tentity;
		guiElements.add(new GuiRedstoneControl(this, tileEntity, MekanismUtils.getResource(ResourceType.GUI, "GuiBioGenerator.png")));
		guiElements.add(new GuiSecurityTab(this, tileEntity, MekanismUtils.getResource(ResourceType.GUI, "GuiBioGenerator.png")));
		guiElements.add(new GuiEnergyInfo(new IInfoHandler()
		{
			@Override
			public List<String> getInfo()
			{
				return ListUtils.asList(
						LangUtils.localize("gui.producing") + ": " + MekanismUtils.getEnergyDisplay(tileEntity.isActive ? generators.bioGeneration * tileEntity.getMultiplier(tileEntity.fuelTank.getGasType()): 0) + "/t",
						LangUtils.localize("gui.maxOutput") + ": " + MekanismUtils.getEnergyDisplay(tileEntity.getMaxOutput()) + "/t");
			}
		}, this, MekanismUtils.getResource(ResourceType.GUI, "GuiBioGenerator.png")));
		guiElements.add(new GuiPowerBar(this, tileEntity, MekanismUtils.getResource(ResourceType.GUI, "GuiBioGenerator.png"), 164, 15));
		guiElements.add(new GuiSlot(SlotType.NORMAL, this, MekanismUtils.getResource(ResourceType.GUI, "GuiBioGenerator.png"), 16, 34));
		guiElements.add(new GuiSlot(SlotType.NORMAL, this, MekanismUtils.getResource(ResourceType.GUI, "GuiBioGenerator.png"), 142, 34).with(SlotOverlay.POWER));
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY)
	{
		super.drawGuiContainerForegroundLayer(mouseX, mouseY);

		boolean isEthanol = tileEntity.getFuelType() == 1;

 		String bioFuel = isEthanol ? "gui.bioGenerator.bioEthanol" : "gui.bioGenerator.bioGas";
		 int colorFuel = isEthanol ? 0xFF8622 : 0x00CD00;

		fontRendererObj.drawString(tileEntity.getInventoryName(), 45, 6, 0x404040);
		fontRendererObj.drawString(LangUtils.localize("container.inventory"), 8, (ySize - 96) + 2, 0x404040);
		fontRendererObj.drawString(MekanismUtils.getEnergyDisplay(tileEntity.getEnergy()), 51, 26, colorFuel);
		fontRendererObj.drawString(LangUtils.localize(bioFuel) + ": " + tileEntity.fuelTank.getStored(), 51, 35, colorFuel);
		fontRendererObj.drawString(LangUtils.localize("gui.out") + ": " + MekanismUtils.getEnergyDisplay(tileEntity.getMaxOutput()) + "/t", 51, 44, colorFuel);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTick, int mouseX, int mouseY)
	{
		mc.renderEngine.bindTexture(MekanismUtils.getResource(ResourceType.GUI, "GuiBioGenerator.png"));
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		int guiWidth = (width - xSize) / 2;
		int guiHeight = (height - ySize) / 2;
		drawTexturedModalRect(guiWidth, guiHeight, 0, 0, xSize, ySize);

		int displayInt;

		displayInt = tileEntity.getScaledFuelLevel(52);

		int gasType = tileEntity.getFuelType() * 4;

		drawTexturedModalRect(guiWidth + 7, guiHeight + 17 + 52 - displayInt, 176 + gasType, 52 + 52 - displayInt, 4, displayInt);

		super.drawGuiContainerBackgroundLayer(partialTick, mouseX, mouseY);
	}
}
