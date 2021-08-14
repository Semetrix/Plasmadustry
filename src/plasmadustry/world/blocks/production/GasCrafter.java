package plasmadustry.worlds.blocks.production

import arc.*;
import mindustry.graphics.*;
import mindustry.ui.*;
import mindustry.world.meta.*;

public class GasCrafter extends GenericCrafter{
    public @Nullable GasStack outputGas;
   @Override
    public void setStats(){
            stats.add(Stat.output, outputGas.gas, outputGas.amount * (60f / craftTime), true);
    }
}
