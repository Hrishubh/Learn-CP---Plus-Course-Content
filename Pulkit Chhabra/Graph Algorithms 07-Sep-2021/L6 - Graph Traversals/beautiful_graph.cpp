#include<bits/stdc++.h>
#include <ext/pb_ds/assoc_container.hpp>
using namespace __gnu_pbds;
using namespace std;

#define ff              first
#define ss              second
#define int             long long
#define pb              push_back
#define mp              make_pair
#define pii             pair<int,int>
#define vi              vector<int>
#define mii             map<int,int>
#define pqb             priority_queue<int>
#define pqs             priority_queue<int,vi,greater<int> >
#define setbits(x)      __builtin_popcountll(x)
#define zrobits(x)      __builtin_ctzll(x)
#define mod             998244353
#define inf             1e18
#define ps(x,y)         fixed<<setprecision(y)<<x
#define mk(arr,n,type)  type *arr=new type[n];
#define w(x)            int x; cin>>x; while(x--)
#define FIO             ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0)
mt19937                 rng(chrono::steady_clock::now().time_since_epoch().count());

typedef tree<int, null_type, less<int>, rb_tree_tag, tree_order_statistics_node_update> pbds;

vector<vi> adj;
int n, m;
int cnt0 = 0, cnt1 = 0, can = 1;

int pwmd(int a, int n)
{
	if (!n)
		return 1;
	int pt = pwmd(a, n / 2);
	pt *= pt, pt %= mod;
	if (n & 1)
		pt *= a, pt %= mod;
	return pt;
}

void dfs(int i, vi &vis, int parity = 0)
{
	if (vis[i])
	{
		if (1 + parity != vis[i])
			can = 0;
		return;
	}

	if (parity == 0)
		cnt0++, vis[i] = 1;

	else
		cnt1++, vis[i] = 2;

	for (auto el : adj[i])
		dfs(el, vis, 1 - parity);

}

int get()
{
	int ans = 1;
	vi vis(n + 1, 0);

	for (int i = 1; i <= n; ++i)
	{
		if (!vis[i])
		{
			cnt0 = 0, cnt1 = 0, can = 1;

			dfs(i, vis);

			if (!can)
				return 0;

			ans = (ans * (pwmd(2, cnt0) + pwmd(2, cnt1))) % mod;
		}
	}

	return ans;
}

int32_t main()
{
	FIO;
	w(t)
	{
		cin >> n >> m;
		adj.clear();
		adj.resize(n + 1);
		while (m--)
		{
			int u, v; cin >> u >> v;
			adj[u].pb(v);
			adj[v].pb(u);
		}

		cout << get() << '\n';
	}
	return 0;
}