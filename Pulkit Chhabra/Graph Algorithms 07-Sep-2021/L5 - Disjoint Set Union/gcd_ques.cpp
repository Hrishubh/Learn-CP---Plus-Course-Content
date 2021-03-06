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

class union_find
{

public:
	int *pr;
	int *sz;

	union_find(int n)
	{
		pr = new int[n + 1];
		sz = new int[n + 1];

		for (int i = 1; i <= n; ++i)
			pr[i] = i, sz[i] = 1;
	}

	int root(int i)
	{
		if (pr[i] == i)
			return i;

		return pr[i] = root(pr[pr[i]]);
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

		if (sz[u] < sz[v])
			swap(u, v);

		pr[v] = u;
		sz[u] += sz[v];

		return 1;
	}
}; //default indexing is 1-based

class query
{
public:
	int g, a, b, id;
};

bool cmp(query a, query b)
{
	return a.g > b.g;
}

int32_t main()
{
	FIO;
	int n, m; cin >> n >> m;
	vector<query> q(m);

	for (int i = 0; i < m; ++i)
	{
		cin >> q[i].g >> q[i].a >> q[i].b;
		q[i].id = i;
	}

	sort(q.begin(), q.end(), cmp);

	union_find dsu(n);
	vi ans(m);
	int last_gcd = n + 1;

	for (query qr : q)
	{
		int a = qr.a, b = qr.b, g = qr.g, i = qr.id;

		for (int gc = g; gc < last_gcd; ++gc)
			for (int num = gc; num + gc <= n; num += gc)
				dsu.un(num, num + gc);

		last_gcd = g;

		ans[i] = dsu.find(a, b);
	}

	for (int i : ans)
		cout << i << ' ';
	return 0;
}