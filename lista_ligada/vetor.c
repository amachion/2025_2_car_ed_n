#include <stdio.h>
int main () {
    int v[10];
    for (int i=0; i < 10; i++) {
        v[i] = (i+1) * 10;
        //printf ("%d ", v[i]);
        printf ("%p ", v+i);
    }
    return 0;
}