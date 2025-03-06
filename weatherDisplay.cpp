#include <iostream>
#include <fstream>
using namespace std;
int main() {
    ifstream file("weather_data.txt");
    string line;
    while (getline(file, line)) {
        cout << "Weather Info: " << line << endl;
    }
    file.close();
    return 0;
}
