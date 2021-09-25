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

vi bfs(vector<vi> &adj, int n)
{
	queue<int> q;
	vi par(n + 1); // 0
	vi dist(n + 1); // 0

	q.push(1);

	while (!q.empty()) // n
	{
		int cur = q.front();
		cout << cur << ' ';

		q.pop();

		for (int nb : adj[cur]) // deg(cur)
		{
			if (nb == par[cur])
				continue;

			q.push(nb);
			par[nb] = cur;
			dist[nb] = dist[cur] + 1;
		}
	}

	return dist;
}

vi get_path(int i, vi &par)
{
	vi path;

	while (i > 0)
	{
		path.pb(i);
		i = par[i];
	}

	reverse(path.begin(), path.end());

	return path;
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
	vi d = bfs(adj, n);
	cout << '\n';

	for (int i = 1; i <= n; ++i)
		cout << i << ' ' << d[i] << '\n';

	return 0;
}