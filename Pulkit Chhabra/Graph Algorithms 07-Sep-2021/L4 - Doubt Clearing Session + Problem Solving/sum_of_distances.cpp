// https://cses.fi/problemset/task/1133/

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
vi adj[200001];
int in[200001], out[200001], sub[200001];

void in_dfs(int i = 1, int pr = 0)
{
	sub[i] = 1;

	for (int j : adj[i])
		if (j != pr)
			in_dfs(j, i), sub[i] += sub[j], in[i] += in[j] + sub[j];
}

void out_dfs(int i = 1, int pr = 0)
{
	if (i != 1)
	{
		int outside_parent = out[pr] + n - sub[pr];
		int inside_parent = (in[pr] - sub[i] - in[i]) + (sub[pr] - sub[i]);
		out[i] = inside_parent + outside_parent;
	}

	for (int j : adj[i])
		if (j != pr)
			out_dfs(j, i);
}

int32_t main()
{
	FIO;

	cin >> n;

	for (int i = 0; i < n - 1; ++i)
	{
		int u, v; cin >> u >> v;
		adj[u].pb(v);
		adj[v].pb(u);
	}

	in_dfs();
	out_dfs();

	for (int i = 1; i <= n; ++i)
		cout << in[i] + out[i] << ' ';
	return 0;
}