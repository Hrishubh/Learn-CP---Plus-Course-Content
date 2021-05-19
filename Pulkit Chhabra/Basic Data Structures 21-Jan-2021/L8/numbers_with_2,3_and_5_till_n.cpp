#include <bits/stdc++.h>
#include <ext/pb_ds/assoc_container.hpp>
using namespace std;
using namespace __gnu_pbds;

#define int            long long
#define vi             vector<int>
#define pii            pair<int,int>
#define ff             first
#define ss             second
#define setbits(x)     __builtin_popcountll(x)
#define pqi            priority_queue <int>
#define pqd            priority_queue <int,vi,greater<int> >
#define mii            map<int,int>
#define FIO            ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0);

int32_t main(){
    FIO;
    int n;
    cin>>n;
    deque<int> v;
    v.push_back(2);
    v.push_back(3);
    v.push_back(5);
    while( v.front()<=(n)){
        int a=v.front();
        cout<<a<<" ";
        v.pop_front();
        v.push_back(a*10 + 2);
        v.push_back(a*10 + 3);
        v.push_back(a*10 + 5);
    }
    while(!v.empty()){
        int a=v.front();
        cout<<a<<" ";
        v.pop_front();
    }
    return 0;
}
