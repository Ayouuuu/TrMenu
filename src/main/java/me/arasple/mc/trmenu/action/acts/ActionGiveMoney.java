package me.arasple.mc.trmenu.action.acts;

import io.izzel.taboolib.internal.apache.lang3.math.NumberUtils;
import io.izzel.taboolib.module.compat.EconomyHook;
import me.arasple.mc.trmenu.action.base.AbstractAction;
import me.arasple.mc.trmenu.utils.Vars;
import org.bukkit.entity.Player;

/**
 * @author Arasple
 * @date 2020/1/14 10:50
 */
public class ActionGiveMoney extends AbstractAction {

    private double value;

    @Override
    public String getName() {
        return "(give|add|deposit)(-)?(money|eco|coin)(s)?";
    }

    @Override
    public void onExecute(Player player) {
        double value = NumberUtils.toDouble(getContent(player), -1);
        if (value > 0) {
            EconomyHook.add(player, value);
        }
    }


}
