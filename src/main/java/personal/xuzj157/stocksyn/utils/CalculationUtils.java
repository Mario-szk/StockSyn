package personal.xuzj157.stocksyn.utils;

import personal.xuzj157.stocksyn.pojo.bo.RandomUnit;
import personal.xuzj157.stocksyn.pojo.bo.SecondCalculationUnit;

import java.util.*;

public class CalculationUtils {

    public static double getSum(RandomUnit randomUnit, SecondCalculationUnit second) {
        double sum = 0;
        sum = sum + randomUnit.getNetincGrowRate() * second.getNetincGrowRate();
        sum = sum + randomUnit.getMainbusiincome() * second.getMainbusiincome();
        sum = sum + randomUnit.getNetprofit() * second.getNetprofit();
        sum = sum + randomUnit.getTotalassets() * second.getTotalassets();
        sum = sum + randomUnit.getPeratio() * second.getPeratio();
        sum = sum + randomUnit.getBvRatio() * second.getBvRatio();
        sum = sum + randomUnit.getFifteenPrice() * second.getFifteenPrice();
        sum = sum + randomUnit.getLowFifteenPrice() * second.getLowFifteenPrice();
        sum = sum + randomUnit.getThirtyPrice() * second.getThirtyPrice();
        sum = sum + randomUnit.getLowThirtyPrice() * second.getLowThirtyPrice();
        sum = sum + randomUnit.getSixtyPrice() * second.getSixtyPrice();
        sum = sum + randomUnit.getLowSixtyPrice() * second.getLowSixtyPrice();
        sum = sum + randomUnit.getOneEightyPrice() * second.getOneEightyPrice();
        sum = sum + randomUnit.getLowOneEightyPrice() * second.getLowOneEightyPrice();
        sum = sum + randomUnit.getFourHundredPrice() * second.getFourHundredPrice();
        sum = sum + randomUnit.getLowFourHundredPrice() * second.getLowFourHundredPrice();
        sum = sum + randomUnit.getHistoryPrice() * second.getLowHistoryPrice();
        sum = sum + randomUnit.getLowHistoryPrice() * second.getLowHistoryPrice();
        return sum;
    }

    public static Map<Double, Integer> getMap(Map<Double, Integer> map, Integer num) {

        map = sortMapByKey(map);    //按Key进行排序
        for (Map.Entry<Double, Integer> entry : map.entrySet()) {
            map.replace(entry.getKey(), entry.getValue() / num);
        }
        return map;
    }


    /**
     * 使用 Map按key进行排序
     *
     * @param map
     * @return
     */
    public static Map<Double, Integer> sortMapByKey(Map<Double, Integer> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        Map<Double, Integer> sortMap = new TreeMap<>(new MapKeyComparator());
        sortMap.putAll(map);
        return sortMap;
    }

    public static class MapKeyComparator implements Comparator<Double> {
        public int compare(Double str1, Double str2) {
            return str1.compareTo(str2);
        }
    }

}
