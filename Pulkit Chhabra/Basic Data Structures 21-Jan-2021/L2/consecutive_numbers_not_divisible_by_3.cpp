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
    double n;
    cin>>n;
    vi v(n);
    for (int i=0;i<n;i++){
        int a;
        cin>>a;
        v[i]=a%3;
    }
    int c=0;
    for (int i=0;i<n;i++){
        if(!v[i]){
            c++;
        }
    }
    if(c==ceil(n/2) || c==floor(n/2)){
        cout<<"YES";
    }else{
        cout<<"NO";
    }


    return 0;
}