package plasmadustry.type;

import arc.graphics.*;
import arc.struct.*;
import mindustry.ctype.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.meta.*;

import static mindustry.Vars.*;

public class Gas extends UnlockableContent{
    public Color color;

    /** how electrically potent this gas is. */
    public float charge = 0f;
      /** how dense this gas is. */
    public float density = 0f;

    public Gas(String name, Color color){
        super(name);
        this.color = color;
    }

    public Gas(String name){
        this(name, new Color(Color.black));
    }

    @Override
    public void setStats(){
        stats.addPercent(Stat.density, density);
        stats.addPercent(Stat.charge, charge);
    }

    @Override
    public String toString(){
        return localizedName;
    }

    @Override
    public ContentType getContentType(){
        return ContentType.gas;
    }
}
