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

vector<int> prefix_function(string s) {
	int n = (int)s.length();
	vector<int> pi(n);
	for (int i = 1; i < n; i++) {
		int j = pi[i - 1];
		while (j > 0 && s[i] != s[j])
			j = pi[j - 1];
		if (s[i] == s[j])
			j++;
		pi[i] = j;
	}
	return pi;
}

vector<int> match(string text, string pat)
{
	vi lps = prefix_function(pat);
	// lps[i] is len of longest pref suf of pat[0...i]

	int i = 0, j = 0, n = text.length(), m = pat.length();
	vi ans;

	while (i < n)
	{
		if (text[i] == pat[j])
			i++, j++;

		if (j == m)
		{
			ans.pb(i - m);
			j = lps[m - 1];
		}

		else if (i < n and text[i] != pat[j])
		{
			if (j)
				j = lps[j - 1];
			else // j == 0
				i++;
		}
	}
	return ans;
}

int32_t main()
{
	FIO;
	string text, pat; cin >> text >> pat;
	vi ans = match(text, pat);
	for (int i : ans)
		cout << i << ' ';
	return 0;
}