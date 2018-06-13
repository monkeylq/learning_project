package com.lbcy.bean;

public class EthPriceBean
{

    /**
     * data : {"id":1027,"name":"Ethereum","symbol":"ETH","website_slug":"ethereum","rank":2,"circulating_supply":9.9880032E7,"total_supply":9.9880032E7,"max_supply":null,"quotes":{"USD":{"price":593.63,"volume_24h":1.89297E9,"market_cap":5.9291783247E10,"percent_change_1h":0.76,"percent_change_24h":-2.1,"percent_change_7d":10.69},"CNY":{"price":3805.7108421377,"volume_24h":1.2135667760795979E10,"market_cap":3.80114519741E11,"percent_change_1h":0.76,"percent_change_24h":-2.1,"percent_change_7d":10.69}},"last_updated":1528189760}
     * metadata : {"timestamp":1528189711,"error":null}
     */

    private DataBean data;
    private MetadataBean metadata;

    public DataBean getData()
    {
        return data;
    }

    public void setData(DataBean data)
    {
        this.data = data;
    }

    public MetadataBean getMetadata()
    {
        return metadata;
    }

    public void setMetadata(MetadataBean metadata)
    {
        this.metadata = metadata;
    }

    public static class DataBean
    {
        /**
         * id : 1027
         * name : Ethereum
         * symbol : ETH
         * website_slug : ethereum
         * rank : 2
         * circulating_supply : 9.9880032E7
         * total_supply : 9.9880032E7
         * max_supply : null
         * quotes : {"USD":{"price":593.63,"volume_24h":1.89297E9,"market_cap":5.9291783247E10,"percent_change_1h":0.76,"percent_change_24h":-2.1,"percent_change_7d":10.69},"CNY":{"price":3805.7108421377,"volume_24h":1.2135667760795979E10,"market_cap":3.80114519741E11,"percent_change_1h":0.76,"percent_change_24h":-2.1,"percent_change_7d":10.69}}
         * last_updated : 1528189760
         */

        private String id;
        private String name;
        private String symbol;
        private String website_slug;
        private String rank;
        private String circulating_supply;
        private String total_supply;
        private Object max_supply;
        private QuotesBean quotes;
        private String last_updated;

        public String getId()
        {
            return id;
        }

        public void setId(String id)
        {
            this.id = id;
        }

        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public String getSymbol()
        {
            return symbol;
        }

        public void setSymbol(String symbol)
        {
            this.symbol = symbol;
        }

        public String getWebsite_slug()
        {
            return website_slug;
        }

        public void setWebsite_slug(String website_slug)
        {
            this.website_slug = website_slug;
        }

        public String getRank()
        {
            return rank;
        }

        public void setRank(String rank)
        {
            this.rank = rank;
        }

        public String getCirculating_supply()
        {
            return circulating_supply;
        }

        public void setCirculating_supply(String circulating_supply)
        {
            this.circulating_supply = circulating_supply;
        }

        public String getTotal_supply()
        {
            return total_supply;
        }

        public void setTotal_supply(String total_supply)
        {
            this.total_supply = total_supply;
        }

        public Object getMax_supply()
        {
            return max_supply;
        }

        public void setMax_supply(Object max_supply)
        {
            this.max_supply = max_supply;
        }

        public QuotesBean getQuotes()
        {
            return quotes;
        }

        public void setQuotes(QuotesBean quotes)
        {
            this.quotes = quotes;
        }

        public String getLast_updated()
        {
            return last_updated;
        }

        public void setLast_updated(String last_updated)
        {
            this.last_updated = last_updated;
        }

        public static class QuotesBean
        {
            /**
             * USD : {"price":593.63,"volume_24h":1.89297E9,"market_cap":5.9291783247E10,"percent_change_1h":0.76,"percent_change_24h":-2.1,"percent_change_7d":10.69}
             * CNY : {"price":3805.7108421377,"volume_24h":1.2135667760795979E10,"market_cap":3.80114519741E11,"percent_change_1h":0.76,"percent_change_24h":-2.1,"percent_change_7d":10.69}
             */

            private USDBean USD;
            private CNYBean CNY;

            public USDBean getUSD()
            {
                return USD;
            }

            public void setUSD(USDBean USD)
            {
                this.USD = USD;
            }

            public CNYBean getCNY()
            {
                return CNY;
            }

            public void setCNY(CNYBean CNY)
            {
                this.CNY = CNY;
            }

            public static class USDBean
            {
                /**
                 * price : 593.63
                 * volume_24h : 1.89297E9
                 * market_cap : 5.9291783247E10
                 * percent_change_1h : 0.76
                 * percent_change_24h : -2.1
                 * percent_change_7d : 10.69
                 */

                private String price;
                private String volume_24h;
                private String market_cap;
                private String percent_change_1h;
                private String percent_change_24h;
                private String percent_change_7d;

                public String getPrice()
                {
                    return price;
                }

                public void setPrice(String price)
                {
                    this.price = price;
                }

                public String getVolume_24h()
                {
                    return volume_24h;
                }

                public void setVolume_24h(String volume_24h)
                {
                    this.volume_24h = volume_24h;
                }

                public String getMarket_cap()
                {
                    return market_cap;
                }

                public void setMarket_cap(String market_cap)
                {
                    this.market_cap = market_cap;
                }

                public String getPercent_change_1h()
                {
                    return percent_change_1h;
                }

                public void setPercent_change_1h(String percent_change_1h)
                {
                    this.percent_change_1h = percent_change_1h;
                }

                public String getPercent_change_24h()
                {
                    return percent_change_24h;
                }

                public void setPercent_change_24h(String percent_change_24h)
                {
                    this.percent_change_24h = percent_change_24h;
                }

                public String getPercent_change_7d()
                {
                    return percent_change_7d;
                }

                public void setPercent_change_7d(String percent_change_7d)
                {
                    this.percent_change_7d = percent_change_7d;
                }
            }

            public static class CNYBean
            {
                /**
                 * price : 3805.7108421377
                 * volume_24h : 1.2135667760795979E10
                 * market_cap : 3.80114519741E11
                 * percent_change_1h : 0.76
                 * percent_change_24h : -2.1
                 * percent_change_7d : 10.69
                 */

                private String price;
                private String volume_24h;
                private String market_cap;
                private String percent_change_1h;
                private String percent_change_24h;
                private String percent_change_7d;

                public String getPrice()
                {
                    return price;
                }

                public void setPrice(String price)
                {
                    this.price = price;
                }

                public String getVolume_24h()
                {
                    return volume_24h;
                }

                public void setVolume_24h(String volume_24h)
                {
                    this.volume_24h = volume_24h;
                }

                public String getMarket_cap()
                {
                    return market_cap;
                }

                public void setMarket_cap(String market_cap)
                {
                    this.market_cap = market_cap;
                }

                public String getPercent_change_1h()
                {
                    return percent_change_1h;
                }

                public void setPercent_change_1h(String percent_change_1h)
                {
                    this.percent_change_1h = percent_change_1h;
                }

                public String getPercent_change_24h()
                {
                    return percent_change_24h;
                }

                public void setPercent_change_24h(String percent_change_24h)
                {
                    this.percent_change_24h = percent_change_24h;
                }

                public String getPercent_change_7d()
                {
                    return percent_change_7d;
                }

                public void setPercent_change_7d(String percent_change_7d)
                {
                    this.percent_change_7d = percent_change_7d;
                }
            }
        }
    }

    public static class MetadataBean
    {
        /**
         * timestamp : 1528189711
         * error : null
         */

        private String timestamp;
        private Object error;

        public String getTimestamp()
        {
            return timestamp;
        }

        public void setTimestamp(String timestamp)
        {
            this.timestamp = timestamp;
        }

        public Object getError()
        {
            return error;
        }

        public void setError(Object error)
        {
            this.error = error;
        }
    }
}
