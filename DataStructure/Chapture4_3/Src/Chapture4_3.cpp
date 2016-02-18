/*
 * Chapture4_3.cpp
 *
 *  Created on: Feb 18, 2016
 *      Author: BluePandaLi
 */

#include <iostream>

using namespace std;

void matrixmult(int a[], int b[], int c[][3], int n);

//已知A 和 B是两个n＊n阶的对称矩阵，a，b是存储A，B矩阵的压缩一维数组，试写一算法，求对称矩阵A，B的乘积。
int main() {

	int n = 3;
	int a[] = { 1, 2, 9, 4, 5, 6 };
	int b[] = { -1, -2, -9, -4, -5, -6 };
	int c[3][3] = {};

	matrixmult(a,b, c, n);

	return 0;
}

void matrixmult(int a[], int b[], int c[][3], int n) {

	for (int i = 0; i < n; i++) {

		for (int j = 0; j < n; j++) {

			int s = 0;

			for (int k = 0; k < n; k++) {

				int aValue, bValue;

				if (i >= k) { //A下三角

					int index = i * (i + 1) / 2 + k;
					aValue = a[index];
				} else { //上三角

					int index = k * (k + 1) / 2 + i;
					aValue = a[index];
				}

				if (k >= j) {

					int index = k * (k + 1) / 2 + j;
					bValue = b[index];

				} else {

					int index = j * (j + 1) / 2 + k;
					bValue = b[index];

				}

				s += aValue * bValue;
			}

			c[i][j] = s;
			cout.width(4);
			cout << s;
		}
		cout << endl;
	}
}
