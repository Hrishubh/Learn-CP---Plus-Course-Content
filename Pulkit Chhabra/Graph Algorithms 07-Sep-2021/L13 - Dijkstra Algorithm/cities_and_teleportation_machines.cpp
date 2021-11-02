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

int n, k, xs, ys, xd, yd;

class edge {
public:
	int x, y, w;

	edge(int a, int b, int c) {
		x = a, y = b, w = c;
	}
};

map<pii, vector<edge> > adj;

int man(pii p1, pii p2)
{
	return abs(p1.ff - p2.ff) + abs(p1.ss - p2.ss);
}

int dijkstra(pii src)
{
	map<pii, int> d;
	set<pair<int, pii> > s; // {dist,node}

	d[src] = 0;
	s.insert({0, src});

	while (!s.empty())
	{
		pii cur = s.begin()->ss;
		s.erase(s.begin());

		for (auto e : adj[cur])
		{
			pii nb = {e.x, e.y};
			int w = e.w;

			if (!d.count(nb) or (d[cur] + w < d[nb]))
				s.erase({d[nb], nb}), d[nb] = d[cur] + w, s.insert({d[nb], nb});
		}
	}

	return d[ {xd, yd}];
}


int32_t main()
{
	FIO;
	cin >> n >> k >> xs >> ys >> xd >> yd;

	vector<pii> nodes = {{xs, ys}, {xd, yd}};

	while (n--)
	{
		int x1, y1, x2, y2; cin >> x1 >> y1 >> x2 >> y2;
		adj[ {x1, y1}].pb(edge(x2, y2, k));
		adj[ {x2, y2}].pb(edge(x1, y1, k));

		nodes.pb({x1, y1});
		nodes.pb({x2, y2});
	}

	for (int i = 0; i < nodes.size(); ++i)
		for (int j = 0; j < nodes.size(); ++j)
		{
			adj[nodes[i]].pb(edge(nodes[j].ff, nodes[j].ss, man(nodes[i], nodes[j])));
			adj[nodes[j]].pb(edge(nodes[i].ff, nodes[i].ss, man(nodes[i], nodes[j])));
		}

	cout << dijkstra({xs, ys}) << '\n';

	return 0;
}