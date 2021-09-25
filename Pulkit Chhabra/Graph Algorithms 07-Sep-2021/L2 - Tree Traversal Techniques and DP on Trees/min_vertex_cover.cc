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

int dp[100001][2];

void dfs(int cur, int par, vector<vi> &adj)
{
	dp[cur][1] = 1;

	for (int nb : adj[cur])
		if (nb != par)
		{
			dfs(nb, cur, adj);
			dp[cur][0] += dp[nb][1];
			dp[cur][1] += min(dp[nb][0], dp[nb][1]);
		}
}

void print_cover(int i, int par, bool colored, vector<vi> &adj)
{
	if (!(colored) or dp[i][1] < dp[i][0])
	{
		cout << i << ' ';
		colored = 1;
	}

	else
		colored = 0;

	for (int nb : adj[i])
		if (nb != par)
			print_cover(nb, i, colored, adj);
}

int32_t main()
{
	FIO;
	int n, m; cin >> n >> m;

	// Input in adjacency list format
	vector<vi> adj(n + 1);

	while (m--)
	{
		int i, j; cin >> i >> j;
		adj[i].pb(j);
		adj[j].pb(i);
	}

	dfs(1, 0, adj);
	cout << min(dp[1][0], dp[1][1]) << '\n';
	print_cover(1, 0, 1, adj);

	return 0;
}