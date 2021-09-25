// https://codedrills.io/contests/amrita-icpc-practice-session-1/problems/aliens-attack

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

int n;
int a[100001], ans[100001];
vi adj[100001];
vi gc[101];

vi level;

void dfs(int cur, int par, vi &level, vi &ancestors)
{
	// level -> max_levels of all the numbers till now.
	int largest_level = -1;

	for (int j : gc[a[cur]])
		largest_level = max(largest_level, level[j]);

	if (largest_level == -1)
		ans[cur] = -1;
	else
		ans[cur] = ancestors[largest_level - 1];

	int old_val = level[a[cur]];

	ancestors.pb(cur);
	level[a[cur]] = ancestors.size();

	for (int ch : adj[cur])
		if (ch != par)
			dfs(ch, cur, level, ancestors);

	level[a[cur]] = old_val;
	ancestors.pop_back();
}

int32_t main()
{
	FIO;

	for (int i = 1; i <= 100; ++i)
		for (int j = 1; j <= 100; ++j)
			if (__gcd(i, j) == 1)
				gc[i].pb(j);

	w(t)
	{
		cin >> n;

		for (int i = 1; i <= n; ++i)
		{
			cin >> a[i];
			adj[i].clear();
		}

		for (int i = 1; i <= n - 1; ++i)
		{
			int u, v; cin >> u >> v;
			adj[u].pb(v);
			adj[v].pb(u);
		}

		level.assign(101, -1);
		vi ancestors;
		dfs(1, 0, level, ancestors);

		for (int i = 1; i <= n; ++i)
			cout << ans[i] << ' ';
	}
	return 0;
}