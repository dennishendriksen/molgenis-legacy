package org.molgenis.framework.ui.commands;

import java.util.List;

import org.molgenis.framework.ui.ScreenController;
import org.molgenis.framework.ui.html.HtmlInput;
import org.molgenis.util.Tuple;

public abstract class PluginCommand extends SimpleCommand
{
	private static final long serialVersionUID = 1236057686333854770L;

	/** Constructor */
	public PluginCommand(String name, ScreenController<?>  parentScreen)
	{
		super(name, parentScreen);
		this.setMenu("Plugin");
		this.setIcon("plugin.png");
	}

	/** Optional function if you need a dialog */
	public abstract List<HtmlInput<?>> getInputs();

	/**
	 * Handle the request that is delegated from the formscreen
	 * 
	 * @param request
	 */
	public abstract void handleRequest(Tuple request);

	public abstract String getMacro();

	public abstract String getTemplate();
}
