#include <iostream>

using namespace std;

int main()
{
    	string text = "takeuforward";
		string pattern = "forward";
		
		int foundIdx = text.find(pattern);
        cout<<foundIdx;
    return 0;
}
