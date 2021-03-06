package mod.lucky.drop.func;

import net.minecraft.util.text.StringTextComponent;

public class DropFuncMessage extends DropFunc {
    @Override
    public void process(DropProcessData processData) {
        processData.getPlayer().sendMessage(
            new StringTextComponent(processData.getDropSingle().getPropertyString("ID")));
    }

    @Override
    public String getType() {
        return "message";
    }
}
