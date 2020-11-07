001
import java.lang.*;
002
import java.util.*;
003
 
004
public class Stock
005
{
006
    //public static java.text.DecimalFormat money;
007
    private String symbol, name;
008
    private double hiPrice, loPrice, lastPrice;
009
    private int dayVolume, initCapacity;
010
    private Stock stock;
011
    private PriceComparator desc, asc;
012
    private PriorityQueue<TradeOrder> sellOrders;
013
    private PriorityQueue<TradeOrder> buyOrders;
014
     
015
    public Stock(String symbol, String name, double price)
016
    {
017
        symbol = this.symbol;
018
        name = this.name;
019
        hiPrice = price;
020
        loPrice = price;
021
        lastPrice = price;
022
        desc = new PriceComparator(false);
023
        asc = new PriceComparator(true);
024
        dayVolume = 0;
025
        initCapacity = 1;
026
         
027
        sellOrders = new PriorityQueue<TradeOrder>(initCapacity, asc);
028
        buyOrders = new PriorityQueue<TradeOrder>(initCapacity, desc);
029
    }
030
     
031
    protected void executeOrders()
032
    {
033
        for(int i = 0; i < buyOrders.size(); i++)
034
        {
035
            int maxShares;
036
             
037
            if(buyOrders.peek().isLimit() && sellOrders.peek().isLimit())
038
            {
039
                if(sellOrders.peek().getPrice() <= buyOrders.peek().getPrice())
040
                {
041
                    if(buyOrders.peek().getShares() >= sellOrders.peek().getShares())
042
                    {
043
                        maxShares = sellOrders.peek().getShares();
044
                        sellOrders.remove();
045
                        buyOrders.peek().subtractShares(maxShares);
046
                        dayVolume += maxShares;
047
                        loPrice = sellOrders.peek().getPrice();
048
                        hiPrice = buyOrders.peek().getPrice();
049
                        lastPrice = sellOrders.peek().getPrice();
050
                    }
051
                    else
052
                    {
053
                        maxShares = buyOrders.peek().getShares();
054
                        buyOrders.remove();
055
                        sellOrders.peek().subtractShares(maxShares);
056
                        dayVolume += maxShares;
057
                        loPrice = sellOrders.peek().getPrice();
058
                        hiPrice = buyOrders.peek().getPrice();
059
                        lastPrice = sellOrders.peek().getPrice();
060
                    }
061
                }
062
                else
063
                {
064
                    break;
065
                }
066
            }
067
else if(buyOrders.peek().isLimit() && sellOrders.peek().isMarket())
068
            {
069
if(buyOrders.peek().getShares() >= sellOrders.peek().getShares())
070
                {
071
                    maxShares = sellOrders.peek().getShares();
072
                    sellOrders.remove();
073
                    buyOrders.peek().subtractShares(maxShares);
074
                    dayVolume += maxShares;
075
                    loPrice = sellOrders.peek().getPrice();
076
                    hiPrice = buyOrders.peek().getPrice();
077
                    lastPrice = buyOrders.peek().getPrice();
078
                }
079
                else
080
                {
081
                    maxShares = buyOrders.peek().getShares();
082
                    buyOrders.remove();
083
                    sellOrders.peek().subtractShares(maxShares);
084
                    dayVolume += maxShares;
085
                    loPrice = sellOrders.peek().getPrice();
086
                    hiPrice = buyOrders.peek().getPrice();
087
                    lastPrice = buyOrders.peek().getPrice();
088
                }
089
            }
090
            else if(buyOrders.peek().isMarket() && sellOrders.peek().isLimit())
091
            {
092
                if(buyOrders.peek().getShares() >= sellOrders.peek().getShares())
093
                {
094
                    maxShares = sellOrders.peek().getShares();
095
                    sellOrders.remove();
096
                    buyOrders.peek().subtractShares(maxShares);
097
                    dayVolume += maxShares;
098
                    loPrice = sellOrders.peek().getPrice();
099
                    hiPrice = buyOrders.peek().getPrice();
100
                    lastPrice = buyOrders.peek().getPrice();
101
                }
102
                else
103
                {
104
                    maxShares = buyOrders.peek().getShares();
105
                    buyOrders.remove();
106
                    sellOrders.peek().subtractShares(maxShares);
107
                    dayVolume += maxShares;
108
                    loPrice = sellOrders.peek().getPrice();
109
                    hiPrice = buyOrders.peek().getPrice();
110
                    lastPrice = buyOrders.peek().getPrice();
111
                }
112
            }
113
            else
114
            {
115
                if(buyOrders.peek().getShares() >= sellOrders.peek().getShares())
116
                {
117
                    maxShares = sellOrders.peek().getShares();
118
                    sellOrders.remove();
119
                    buyOrders.peek().subtractShares(maxShares);
120
                    dayVolume += maxShares;
121
                    loPrice = sellOrders.peek().getPrice();
122
                    hiPrice = buyOrders.peek().getPrice();
123
                    lastPrice = buyOrders.peek().getPrice();
124
                }
125
                else
126
                {
127
                    maxShares = buyOrders.peek().getShares();
128
                    buyOrders.remove();
129
                    sellOrders.peek().subtractShares(maxShares);
130
                    dayVolume += maxShares;
131
                    loPrice = sellOrders.peek().getPrice();
132
                    hiPrice = buyOrders.peek().getPrice();
133
                    lastPrice = buyOrders.peek().getPrice();
134
                }
135
            }
136
        }
137
             
138
    }  
139
     
140
    }
