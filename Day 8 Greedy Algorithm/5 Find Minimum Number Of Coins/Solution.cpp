int findMinimumCoins(int amount) 
{
    int coins[] = {1,2,5,10,20,50,100,500,1000};
    int ans = 0;
    for(int i = 9 - 1; i >= 0; i--) {
        ans += (amount)/coins[i];
        amount -= ((amount)/coins[i])*coins[i];
    }
    return ans;
}
