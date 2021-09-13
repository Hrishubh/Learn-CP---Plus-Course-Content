#include <bits/stdc++.h>
#include <ext/pb_ds/assoc_container.hpp>
using namespace std;
using namespace __gnu_pbds;

#define endl                "\n"
#define pi                  M_PI
#define inf                 1e18
#define mod                 1e9+7
#define ff                  first
#define ss                  second
#define int                 long long
#define vi                  vector<int>
#define mii                 map<int,int>
#define pii                 pair<int,int>
#define setbits(x)          __builtin_popcountll(x)
#define sp(x,y)             fixed<<setprecision(y)<<x
#define pqmax               priority_queue <int>
#define pqmin               priority_queue <int,vi,greater<int> >
#define FIO                 ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0)
mt19937                     rng(chrono::steady_clock::now().time_since_epoch().count());

typedef tree<int, null_type, less<int>, rb_tree_tag, tree_order_statistics_node_update> pbds;

//Try using pw_Function snippet in place of pow function to calc a^n faster!
//Try using GCD_Function snippet to find GCD using Euclid's Algorithm!
//Try using isPrime_Function snippet to check if a number is Prime or not

int32_t main(){
	FIO;
	while(true) {
		int n;
		cin>>n;
		if(n==-1) {
			return 0;
		}
		vi v(n);
		vi sum(n);
		int add=0;
		for (int i=0;i<n;i++){
			cin>>v[i];
			add+=v[i];
			if(i==0) {
				sum[i]=v[i];
			}else {
				sum[i]=sum[i-1]+v[i];
			}
		}
		if(add%n!=0) {
			cout<<-1<<endl;
			continue;
		}
		add/=n;
		int mx=0;
		for (int i=0;i<n;i++){
			mx= max(mx,abs(sum[i]-(add)*(i+1)));
		}
		cout<<mx<<endl;

	}
	return 0;
}

/* 
	Stuff you should look for :
	* int overflow, array bounds
	* special cases (n=1? or n=0?)
	* NEVER GIVE UP
	* WRITE STUFF DOWN
	* DON'T GET STUCK ON ONE APPROACH
*/