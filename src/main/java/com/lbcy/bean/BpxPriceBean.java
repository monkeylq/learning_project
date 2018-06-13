package com.lbcy.bean;

/**
 * Market包含了某一个市场(例如btccny)的所有信息:
 * <p>
 * at: 以秒为单位的时间戳
 * <p>
 * buy/sell: 当前买入/卖出价
 * <p>
 * low/high: 过去24小时之内的最低/最高成交价
 * <p>
 * last: 最后成交价
 * <p>
 * vol: 过去24小时之内的总成交量
 */
public class BpxPriceBean
{
    /**
     * at : 1528191001
     * ticker : {"buy":"0.393009","sell":"0.39363","low":"0.39","high":"0.39363","last":"0.393009","vol":"11044270.62"}
     */

    private String at;
    private TickerBean ticker;

    public String getAt()
    {
        return at;
    }

    public void setAt(String at)
    {
        this.at = at;
    }

    public TickerBean getTicker()
    {
        return ticker;
    }

    public void setTicker(TickerBean ticker)
    {
        this.ticker = ticker;
    }

    public static class TickerBean
    {
        /**
         * buy : 0.393009
         * sell : 0.39363
         * low : 0.39
         * high : 0.39363
         * last : 0.393009
         * vol : 11044270.62
         */

        private String buy;
        private String sell;
        private String low;
        private String high;
        private String last;
        private String vol;

        public String getBuy()
        {
            return buy;
        }

        public void setBuy(String buy)
        {
            this.buy = buy;
        }

        public String getSell()
        {
            return sell;
        }

        public void setSell(String sell)
        {
            this.sell = sell;
        }

        public String getLow()
        {
            return low;
        }

        public void setLow(String low)
        {
            this.low = low;
        }

        public String getHigh()
        {
            return high;
        }

        public void setHigh(String high)
        {
            this.high = high;
        }

        public String getLast()
        {
            return last;
        }

        public void setLast(String last)
        {
            this.last = last;
        }

        public String getVol()
        {
            return vol;
        }

        public void setVol(String vol)
        {
            this.vol = vol;
        }
    }
}
