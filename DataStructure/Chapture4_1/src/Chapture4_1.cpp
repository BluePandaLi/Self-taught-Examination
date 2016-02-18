//============================================================================
// Name        : Chapture4_1.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

void trsmat(int A[][8], int B[][3], int m, int n);

//设计一个算法，实现矩阵A(m,n)的转换矩阵B(n,m)
int main(void) {

	puts("矩阵转换");

	int A[3][8] =
			{
					{ 0, 1, 2, 3, 4, 5, 6, 7 },
					{ 8, 9, 10, 11, 12, 13, 14, 15 },
					{16, 17, 18, 19, 20, 21, 22, 23 }
			};

	int B[8][3] = { };

	puts("转换前数据：A矩阵");
	for (int i = 0; i < 3; i++) {

		for (int j = 0; j < 8; j++) {

			printf("%d\t", A[i][j]);
		}

		printf("\n");
	}

	puts("转置前数据：B矩阵");
	for (int i = 0; i < 8; i++) {

		for (int j = 0; j < 3; j++) {

			printf("%d\t", B[i][j]);
		}

		printf("\n");
	}

	trsmat(A,B,3,8);

	puts("转置后数据：B矩阵");
	for (int i = 0; i < 8; i++) {

		for (int j = 0; j < 3; j++) {

			printf("%d\t", B[i][j]);
		}

		printf("\n");
	}
	return EXIT_SUCCESS;
}

void trsmat(int A[][8], int B[][3], int m, int n) {

	for (int i = 0; i < m; i++) {

		for (int j = 0; j < n; j++) {

			B[j][i] = A[i][j];
		}
	}
}
