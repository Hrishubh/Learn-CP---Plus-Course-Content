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

int n, ans = 0;
int w[100001];
vi adj[100001];

void dfs(int i, int par, int mx, int mn)
{
	mx = max(mx, w[i]);
	mn = min(mn, w[i]);

	ans = max({ans, mx - w[i], w[i] - mn});

	for (int ch : adj[i])
		if (ch != par)
			dfs(ch, i, mx, mn);
}

int32_t main()
{
	FIO;
	cin >> n;
	int root;

	for (int i = 1; i <= n; ++i)
		cin >> w[i];

	for (int i = 1; i <= n; ++i)
	{
		int pi; cin >> pi;

		if (pi == -1)
			root = i;

		else
			adj[i].pb(pi), adj[pi].pb(i);
	}

	dfs(root, 0, INT_MIN, INT_MAX);

	cout << ans << '\n';
	return 0;
}