#include <bits/stdc++.h> 
int modularExponentiation(int x2, int n, int m) {
    long long int pro = 1;
    long long int x = x2;
    while(n)
    {
        if(n % 2) pro *= x,pro %= m;
        x *= x;
        x %= m;
        n /= 2;
    }
    return (int)pro;
}
