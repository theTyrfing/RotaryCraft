package Reika.RotaryCraft.ModInterface.Lua;

import net.minecraft.tileentity.TileEntity;
import Reika.DragonAPI.ModInteract.Lua.LuaMethod;
import Reika.RotaryCraft.TileEntities.Decorative.TileEntityMusicBox;

public class LuaClearChannel extends LuaMethod {

	public LuaClearChannel() {
		super("clearChannel", TileEntityMusicBox.class);
	}

	@Override
	public Object[] invoke(TileEntity te, Object[] args) throws Exception {
		TileEntityMusicBox mus = (TileEntityMusicBox) te;
		int channel = ((Double)args[0]).intValue();
		mus.clearChannel(channel);
		return null;
	}

}
