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

int n, m;
vector<pii> adj[100001];

int get_ans(int src, int dest)
{
	vector<vi> d(n + 1, vi(2, -1));
	queue<pii> q;

	q.push({src, 0});
	d[src][0] = 0;

	while (!q.empty())
	{
		int i = q.front().ff, j = q.front().ss;
		q.pop();

		for (pii e : adj[i])
		{
			int to = e.ff, col = e.ss;

			if (d[to][col] != -1 or (j == 1 and col == 0))
				continue;

			q.push({to, col});
			d[to][col] = d[i][j] + 1;
		}
	}

	return d[dest][1];
}

int32_t main()
{
	FIO;
	cin >> n >> m;

	int src, dest; cin >> src >> dest;

	while (m--)
	{
		int i, j, c; cin >> i >> j >> c; // c - 0 red, c - 1 blue

		if ((i == src or j == src) and c == 1)
			continue;

		adj[i].pb({j, c});
		adj[j].pb({i, c});
	}

	cout << get_ans(src, dest) << '\n';
	return 0;
}