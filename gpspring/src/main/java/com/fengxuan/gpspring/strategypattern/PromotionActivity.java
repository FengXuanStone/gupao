package com.fengxuan.gpspring.strategypattern;

public class PromotionActivity {
    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void executor() {
        promotionStrategy.doPromotion();
    }
}
