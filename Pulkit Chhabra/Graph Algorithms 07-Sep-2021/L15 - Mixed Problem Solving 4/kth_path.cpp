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

int32_t main()
{
	FIO;
	int n, m; cin >> n >> m;
	vector<vector<vi>> adj(n + 1);

	while (m--)
	{
		int i, j, w; cin >> i >> j >> w;
		adj[i].pb({j, w});
		adj[j].pb({i, w});
	}

	vector<vector<vi> > d(n + 1, vector<vi>(2, vi(2, inf))); // d[n+1][2][2] = {inf}

	set<vi> s; //[dist, i, j, k] node - (i,j,k)
	s.insert({0, 1, 0, 0});

	d[1][0][0] = 0;

	//[node][added][subtracted]

	while (!s.empty())
	{
		auto it = s.begin();
		int i = (*it)[1], j = (*it)[2], k = (*it)[3];

		s.erase(it);

		for (vi e : adj[i]) // u -> v | i -> nb
		{
			int nb = e[0], w = e[1];

			if (d[i][j][k] + w < d[nb][j][k]) // normal
			{
				s.erase({d[nb][j][k], nb, j, k});
				d[nb][j][k] = d[i][j][k] + w;
				s.insert({d[nb][j][k], nb, j, k});
			}

			if (j == 0 and d[i][j][k] + 2 * w < d[nb][j + 1][k]) // add it
			{
				s.erase({d[nb][j + 1][k], nb, j + 1, k});
				d[nb][j + 1][k] = d[i][j][k] + 2 * w;
				s.insert({d[nb][j + 1][k], nb, j + 1, k});
			}

			if (k == 0 and d[i][j][k] + 0 < d[nb][j][k + 1]) // subtract it
			{
				s.erase({d[nb][j][k + 1], nb, j, k + 1});
				d[nb][j][k + 1] = d[i][j][k];
				s.insert({d[nb][j][k + 1], nb, j, k + 1});
			}

			if (j == 0 and k == 0 and d[i][j][k] + w < d[nb][j + 1][k + 1]) // do both
			{
				s.erase({d[nb][j + 1][k + 1], nb, j + 1, k + 1});
				d[nb][j + 1][k + 1] = d[i][j][k] + w;
				s.insert({d[nb][j + 1][k + 1], nb, j + 1, k + 1});
			}
		}
	}

	for (int i = 2; i <= n; ++i)
		cout << d[i][1][1] << ' ';
	return 0;
}
