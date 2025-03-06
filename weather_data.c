#include <stdio.h>
int main() {
    FILE *file = fopen("weather_data.txt", "w");
    fprintf(file, "Weather: Sunny, 25°C\n");
    fclose(file);
    printf("Weather data saved!\n");
    return 0;
}
