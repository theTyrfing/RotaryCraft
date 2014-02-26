package Reika.RotaryCraft.ModInterface.Lua;

import net.minecraft.tileentity.TileEntity;
import Reika.DragonAPI.ModInteract.Lua.LuaMethod;
import Reika.RotaryCraft.Auxiliary.Interfaces.RangedEffect;

public class LuaGetRange extends LuaMethod {

	public LuaGetRange() {
		super("getRange", RangedEffect.class);
	}

	@Override
	public Object[] invoke(TileEntity te, Object[] args) throws Exception {
		return new Object[]{((RangedEffect)te).getRange()};
	}

}
