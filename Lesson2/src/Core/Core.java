package Core;

import Abstractions.ItemGenerator;
import Rewards.Gold.GoldGenerator;
import Rewards.Jewel.JewelGenerator;
import Rewards.Silver.SilverGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Core {
    // Логика игры
    public void run() {
        List<ItemGenerator> generatorList = new ArrayList<>();
        // Генерируем рандомное число
        // Через switch выбираем что генерировать
        // Далее выводим
        Random random = new Random();
        int randomItem = random.nextInt(3) + 1;

        switch (randomItem) {
            case 1:
                generatorList.add(new GoldGenerator());
                ItemGenerator gold = generatorList.get(0);
                System.out.println(gold.openReward());
                break;
            case 2:
                generatorList.add(new SilverGenerator());
                ItemGenerator silver = generatorList.get(0);
                System.out.println(silver.openReward());
                break;
            case 3:
                generatorList.add(new JewelGenerator());
                ItemGenerator jewel = generatorList.get(0);
                System.out.println(jewel.openReward());
                break;

            default:
                break;
        }

//        generatorList.add(new GoldGenerator());
//      generatorList.add(new SilverGenerator());
//        ItemGenerator myGenerator = generatorList.get(0);
//        System.out.println(myGenerator.openReward());
    }
}
