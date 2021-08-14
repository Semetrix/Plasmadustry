package plasmadustry.content;

import arc.graphics.*;
import arc.math.*;
import arc.struct.*;
import mindustry.*;
import mindustry.ctype.*;
import mindustry.entities.bullet.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.*;
import mindustry.world.blocks.campaign.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.distribution.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.legacy.*;
import mindustry.world.blocks.liquid.*;
import mindustry.world.blocks.logic.*;
import mindustry.world.blocks.payloads.*;
import mindustry.world.blocks.power.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.sandbox.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.blocks.units.*;
import mindustry.world.consumers.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;
import plasmadustry.world.*;
import plasmadustry.world.blocks.*;
import plasmadustry.world.blocks.production.*;

import static mindustry.type.ItemStack.*;

public class Blocks implements ContentList{
    public static Block

      // production
      plasmaHeater
      ;
  
   @Override
    public void load(){
      
  plasmaHeater = new GasCrafter("plasma-heater"){{
            requirements(Category.crafting, with(Items.copper, 65, Items.lead, 30, Items.metaglass, 25, Items.titanium, 20));

            craftEffect = Fx.pulverizeRed;
            outputGas = new GasStack(Gases.plasma, 1);
            craftTime = 120f;
            size = 2;
            hasPower = true;
            
            consumes.power(0.55f);
            consumes.item(Items.coal, 2);
        }};
    }
}
