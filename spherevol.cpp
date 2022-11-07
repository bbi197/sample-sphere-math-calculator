#include <iostream>
using namespace std;
    int main()
    {
    	float rad1;
    	float volsph;		
        cout<<" Input the radius of a sphere : ";
    	cin>>rad1;
    	volsph=(4*3.142*rad1*rad1*rad1)/3;
        cout<<" The volume of a sphere is : "<< volsph << endl;
        cout << endl;
        return 0;
    }
