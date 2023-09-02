package Rewards.Jewel;

import Abstractions.IGameItem;
import Abstractions.ItemGenerator;

public class JewelGenerator extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new JewelRewards();
    }
}
