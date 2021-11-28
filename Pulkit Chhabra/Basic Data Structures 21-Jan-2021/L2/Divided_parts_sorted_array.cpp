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
    vi v(n),vmax(n),vmin(n);
    for (int i=0;i<n;i++){
        cin>>v[i];
    }

    int pmax=INT_MIN;
    for (int i=0;i<n;i++){
        pmax=max(pmax,v[i]);
        vmax[i]=pmax;
    }

    int pmin=INT_MAX;
    for (int i=n-1;i>=0;i--){
        pmin=min(pmin,v[i]);
        vmin[i]=pmin;
    }

    int ans=1;
    for (int i=1;i<n;i++){
        if(vmax[i-1]<=vmin[i]){
            ans++;
        }
    }
    cout<<ans;

    return 0;
}