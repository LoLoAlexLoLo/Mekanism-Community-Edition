package mekanism.tools.client.gui;

import cpw.mods.fml.client.config.DummyConfigElement.DummyCategoryElement;
import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.GuiConfigEntries;
import cpw.mods.fml.client.config.GuiConfigEntries.CategoryEntry;
import cpw.mods.fml.client.config.IConfigElement;
import mekanism.common.Mekanism;
import mekanism.common.util.LangUtils;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ben on 27/06/14.
 */
public class GuiToolsConfig extends GuiConfig
{
	public GuiToolsConfig(GuiScreen parent)
	{
		super(parent, getConfigElements(),
				"MekanismTools", false, false, "MekanismTools");
	}

	private static List<IConfigElement> getConfigElements()
	{
		List<IConfigElement> list = new ArrayList<IConfigElement>();
		list.add(new DummyCategoryElement(LangUtils.localize("mekanism.configgui.ctgy.tools.general"), "mekanism.configgui.ctgy.tools.general", GeneralEntry.class));
		list.add(new DummyCategoryElement(LangUtils.localize("mekanism.configgui.ctgy.tools.armor"), "mekanism.configgui.ctgy.tools.armor", ArmorEntry.class));
		list.add(new DummyCategoryElement(LangUtils.localize("mekanism.configgui.ctgy.tools.tools"), "mekanism.configgui.ctgy.tools.tools", ToolsEntry.class));
		return list;
	}

	public static class GeneralEntry extends CategoryEntry
	{
		public GeneralEntry(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement prop)
		{
			super(owningScreen, owningEntryList, prop);
		}

		@Override
		protected GuiScreen buildChildScreen()
		{
			return new GuiConfig(owningScreen,
					new ConfigElement(Mekanism.configurationtools.getCategory("tools.general")).getChildElements(),
					owningScreen.modID, Configuration.CATEGORY_GENERAL, configElement.requiresWorldRestart() || owningScreen.allRequireWorldRestart,
					configElement.requiresMcRestart() || owningScreen.allRequireMcRestart,
					GuiConfig.getAbridgedConfigPath(Mekanism.configurationtools.toString()));
		}
	}

	public static class ArmorEntry extends CategoryEntry
	{
		public ArmorEntry(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement prop)
		{
			super(owningScreen, owningEntryList, prop);
		}

		@Override
		protected GuiScreen buildChildScreen()
		{
			return new GuiConfig(owningScreen,
					new ConfigElement(Mekanism.configurationtools.getCategory("tools.armor-balance")).getChildElements(),
					owningScreen.modID, Configuration.CATEGORY_GENERAL, configElement.requiresWorldRestart() || owningScreen.allRequireWorldRestart,
					configElement.requiresMcRestart() || owningScreen.allRequireMcRestart,
					GuiConfig.getAbridgedConfigPath(Mekanism.configurationtools.toString()));
		}
	}

	public static class ToolsEntry extends CategoryEntry
	{
		public ToolsEntry(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement prop)
		{
			super(owningScreen, owningEntryList, prop);
		}

		@Override
		protected GuiScreen buildChildScreen()
		{
			return new GuiConfig(owningScreen,
					new ConfigElement(Mekanism.configurationtools.getCategory("tools.tool-balance")).getChildElements(),
					owningScreen.modID, Configuration.CATEGORY_GENERAL, configElement.requiresWorldRestart() || owningScreen.allRequireWorldRestart,
					configElement.requiresMcRestart() || owningScreen.allRequireMcRestart,
					GuiConfig.getAbridgedConfigPath(Mekanism.configurationtools.toString()));
		}
	}
}
