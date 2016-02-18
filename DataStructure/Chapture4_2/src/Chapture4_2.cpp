//============================================================================
// Name        : Chapture4_2.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

#define M 3//行数
#define N 3//列数

//马鞍点： I行中最小，同时有事J行中最大
void saddlePoint(int array[M][N]);
int main() {

	int array[M][N] ={{20,18,19},
			 {9,10,10},
			 {11,0,0}};

	for(int i = 0; i < M; i++) {

		for(int j = 0; j < N; j++){

			cout.width(4);
			cout<<array[i][j];
		}

		cout<<endl;
	}

//	int i,k,j;
//
//	srand((unsigned)time(NULL));
//
//    for(i=0; i < M; i++)
//    {
//        for(j=0;j<N;j++)
//        {
//            k=rand()%100 + 9;
//            cout.width(4);//设置数字输出时的宽度，每一次输出都要设置
//            cout<<k<<" ";
//            array[i][j] = k;
//        }
//        cout<<endl<<endl;
//    }

    saddlePoint(array);

	return 0;
}

void saddlePoint(int array[M][N]) {



	int MIN[M] = {};
	int MAX[N] = {};

	for(int i = 0; i < M; i++) {

		MIN[i] = array[i][0];
		for(int j = 0; j < N; j++) {

			if(MIN[i] > array[i][j]){

				MIN[i] = array[i][j];
			}
		}
//		cout.width(4);
//		cout<<MIN[i];
	}

//	cout<<endl;

	for (int j = 0; j < N; j++) {

		MAX[j] = array[0][j];
		for (int i = 0; i < M; i++) {

			if (MAX[j] < array[i][j]) {

				MAX[j] = array[i][j];
			}
		}

//		cout.width(4);
//		cout<<MAX[j];
	}

//	cout<<endl;

	for(int i = 0; i < M; i++) {

		for(int j = 0; j < N; j++) {

			if(MIN[i] == MAX[j]){

				printf("The saddle point is %d, %d", i ,j);
			}
		}
	}

}
