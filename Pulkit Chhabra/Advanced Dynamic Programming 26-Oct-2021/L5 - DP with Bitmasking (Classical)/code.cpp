#include<bits/stdc++.h>
#include <ext/pb_ds/assoc_container.hpp>
using namespace __gnu_pbds;
using namespace std;

#define ff              first
#define ss              second
#define int             long long
#define pb              push_back
#define mp              make_pair
#define mt              make_tuple
#define pii             pair<int,int>
#define vi              vector<int>
#define mii             map<int,int>
#define pqb             priority_queue<int>
#define pqs             priority_queue<int,vi,greater<int> >
#define setbits(x)      __builtin_popcountll(x)
#define mod             1000000007
#define inf             1e18
#define ps(x,y)         fixed<<setprecision(y)<<x
#define mk(arr,n,type)  type *arr=new type[n];
#define range(a,b)		substr(a,b-a+1)
#define w(x)            int x; cin>>x; while(x--)
#define trace(x) 		cerr<<#x<<": "<<x<<" "<<endl;
#define FIO             ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0)
mt19937                 rng(chrono::steady_clock::now().time_since_epoch().count());

typedef tree<int, null_type, less<int>, rb_tree_tag, tree_order_statistics_node_update> pbds;

int dp[1 << 20][20] = {0};

int32_t main()
{
	FIO;
	int n; cin >> n;
	vector<vi> adj(n, vi(n));

	for (int i = 0; i < n; ++i)
		for (int j = 0; j < n; ++j)
			cin >> adj[i][j];

	// n <= 20

	for (int m = 0; m < (1 << n); ++m)
		for (int i = 0; i < n; ++i)
		{
			if (((m >> i) & 1) == 0)
				continue;

			if (m == (1 << i))
			{
				dp[m][i] = 1;
				continue;
			}

			for (int j = 0; j < n; ++j)
				if ((m >> j) & 1)
					dp[m][i] |= (dp[m - (1 << i)][j] & adj[j][i]);
		}

	for (int i = 0; i < n; ++i)
	{
		if (dp[(1 << n) - 1][i])
		{
			cout << "Yes\n";
			return 0;
		}
	}

	cout << "No\n";

	return 0;
}