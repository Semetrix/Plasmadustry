package plasmadustry.type;

import arc.math.*;
import arc.struct.*;
import mindustry.content.*;

public class GasStack implements Comparable<GasStack>{
    public static final GasStack[] empty = {};

    public Gas gas;
    public int amount = 0;

    public GasStack(Gas gas, int amount){
        if(gas == null) gas = Gases.plasma;
        this.gas = gas;
        this.amount = amount;
    }

    //serialization only
    public GasStack(){
        //prevent nulls.
        gas = Gases.plasma;
    }

    public GasStack set(Gas gas, int amount){
        this.gas = gas;
        this.amount = amount;
        return this;
    }

    public GasStack copy(){
        return new GasStack(item, amount);
    }

    public boolean equals(GasStack other){
        return other != null && other.gas == gas && other.amount == amount;
    }

    public static GasStack[] mult(GasStack[] stacks, float amount){
        var copy = new GasStack[stacks.length];
        for(int i = 0; i < copy.length; i++){
            copy[i] = new GasStack(stacks[i].gas, Mathf.round(stacks[i].amount * amount));
        }
        return copy;
    }

    public static GasStack[] with(Object... gases){
        var stacks = new GasStack[gases.length / 2];
        for(int i = 0; i < gases.length; i += 2){
            stacks[i / 2] = new GasStack((Gas)gases[i], ((Number)items[i + 1]).intValue());
        }
        return stacks;
    }

    public static Seq<GasStack> list(Object... gases){
        Seq<GasStack> stacks = new Seq<>(gases.length / 2);
        for(int i = 0; i < gases.length; i += 2){
            stacks.add(new GasStack((Gas)gases[i], ((Number)gases[i + 1]).intValue()));
        }
        return stacks;
    }

    @Override
    public int compareTo(GasStack gasStack){
        return gas.compareTo(GasStack.gas);
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof GasStack stack)) return false;
        return amount == stack.amount && gas == stack.gas;
    }

    @Override
    public String toString(){
        return "GasStack{" +
        "gas=" + gas +
        ", amount=" + amount +
        '}';
    }
}
