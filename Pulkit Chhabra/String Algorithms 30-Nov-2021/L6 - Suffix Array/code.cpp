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

int pwmd(int a, int n = mod - 2)
{
	if (!n)
		return 1;
	int pt = pwmd(a, n / 2);
	pt *= pt, pt %= mod;
	if (n & 1)
		pt *= a, pt %= mod;
	return pt;
}

vi sort_shifts(string s)
{
	int n = s.length(), classes = 1;
	vi p(n), c(n), cnt(256);

	// Set p for len = 1
	for (char c : s)
		cnt[c]++;

	for (int i = 1; i < 256; ++i)
		cnt[i] += cnt[i - 1];

	for (int i = 0; i < n; ++i)
		p[--cnt[s[i]]] = i;

	// Set c for len = 1
	c[p[0]] = 0;

	for (int i = 1; i < n; ++i)
	{
		if (s[p[i]] != s[p[i - 1]])
			classes++;

		c[p[i]] = classes - 1;
	}

	// Set for len = 2, 4, 8, ....
	vector<int> pn(n), cn(n);
	for (int k = 0; (1 << k) < n; ++k)
	{
		// Sort by 2nd
		for (int i = 0; i < n; ++i)
			pn[i] = (p[i] - (1 << k) + n) % n;

		cnt.assign(classes, 0);

		for (int num : pn)
			cnt[c[num]]++;

		for (int i = 1; i < classes; i++)
			cnt[i] += cnt[i - 1];

		for (int i = n - 1; i >= 0; i--)
			p[--cnt[c[pn[i]]]] = pn[i];

		cn[p[0]] = 0, classes = 1;

		for (int i = 1; i < n; i++)
		{
			pii cur = {c[p[i]], c[(p[i] + (1 << k)) % n]};
			pii prev = {c[p[i - 1]], c[(p[i - 1] + (1 << k)) % n]};

			if (cur != prev)
				classes++;

			cn[p[i]] = classes - 1;
		}
		c.swap(cn);
	}

	return p;
}

vi suffix_array(string s)
{
	vi ans = sort_shifts(s + "$");
	ans.erase(ans.begin()); // because ans[0] = n (i.e. "$");
	return ans;
}

/*
vi lcp_array(string s)
{
	int n = s.length();
	vi p = suffix_array(s);
	vi rank(n), lcp(n - 1);

	for (int i = 0; i < n; ++i)
		rank[p[i]] = i;

	int k = 0;

	for (int i = 0; i < n; ++i)
	{
		if (rank[i] == n - 1)
		{
			k = 0;
			continue;
		}

		int j = p[rank[i] + 1];

		while (max(i, j) + k < n and s[i + k] == s[j = k])
			k++;

		lcp[rank[i]] = k;

		k = max(0ll, k - 1);
	}

	return lcp;
}*/

int32_t main()
{
	FIO;

	string s; cin >> s;
	vi ans = suffix_array(s);

	for (int i : ans)
		cout << i << ' ';
	return 0;
}