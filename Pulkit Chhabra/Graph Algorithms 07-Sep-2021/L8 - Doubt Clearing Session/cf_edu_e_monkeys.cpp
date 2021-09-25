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
int l[200001], r[200001];
map<pii, int> edges;

pii removals[400001];

class union_find
{

public:
	int *loc;
	vi *list;
	int *sz;

	union_find(int n)
	{
		loc = new int[n + 1];
		sz = new int[n + 1];
		list = new vi[n + 1];

		for (int i = 1; i <= n; ++i)
			list[i] = {i}, loc[i] = i, sz[i] = 1;
	}

	int root(int i)
	{
		return loc[i];
	}

	int find(int i, int j)
	{
		return (root(i) == root(j));
	}

	int un(int i, int j)
	{
		int u = root(i);
		int v = root(j);

		if (u == v)
			return 0;

		if (sz[u] > sz[v])
			swap(u, v);

		sz[v] += sz[u];

		while (!list[u].empty())
			list[v].pb(list[u].back()), loc[list[u].back()] = v, list[u].pop_back();

		return 1;
	}

	int un(int i, int j, vi &ans, int cur_ans)
	{
		int u = root(i);
		int v = root(j);

		if (u == v)
			return 0;

		if (u == root(1))
			for (int i : list[v])
				ans[i] = cur_ans;

		else if (v == root(1))
			for (int i : list[u])
				ans[i] = cur_ans;


		if (sz[u] > sz[v])
			swap(u, v);

		sz[v] += sz[u];

		while (!list[u].empty())
			list[v].pb(list[u].back()), loc[list[u].back()] = v, list[u].pop_back();

		return 1;
	}
}; //default indexing is 1-based

int32_t main()
{
	FIO;
	cin >> n >> m;

	for (int i = 1; i <= n; ++i)
	{
		cin >> l[i] >> r[i];

		if (l[i] != -1)
			edges[ {i, l[i]}]++;

		if (r[i] != -1)
			edges[ {i, r[i]}]++;
	}

	for (int i = 0; i < m; ++i)
	{
		int mon, side; cin >> mon >> side;

		pii p;

		if (side == 1)
			p = {mon, l[mon]};

		else
			p = {mon, r[mon]};

		edges[p]--;

		if (edges[p] == 0)
			edges.erase(p);

		removals[i] = p;
	}

	union_find dsu(n + 1);

	for (auto p : edges)
		dsu.un(p.ff.ff, p.ff.ss);

	vi ans(n + 1, -1);

	for (int i = m - 1; i >= 0; --i)
	{
		int u = removals[i].ff, v = removals[i].ss;
		dsu.un(u, v, ans, i);
	}

	for (int i = 1; i <= n; ++i)
		cout << ans[i] << '\n';
	return 0;
}