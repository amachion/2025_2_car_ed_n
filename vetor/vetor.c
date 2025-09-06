#include <stdio.h>

int main () {
    int v[5];
    for (int i=0; i<15; i++) {
        //printf ("%d ", v[i]);
        printf ("%p ", v + i);
    }
    v[3] = 10;
    for (int i=0; i<15; i++) {
        printf ("%d ", v[i]);
    }
    return 0;
}