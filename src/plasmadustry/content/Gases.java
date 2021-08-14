package plasmadustry.content;

import arc.graphics.*;
import mindustry.ctype.*;
import mindustry.type.*;

public class Gases implements ContentList{
    public static Gas
    plasma;
  
    @Override
    public void load(){
        plasma = new Gas("plasma", Color.valueOf("feffbb")){{
            charge = 1f;
        }};
    }
}
