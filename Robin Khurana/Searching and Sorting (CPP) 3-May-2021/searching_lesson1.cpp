#include <bits/stdc++.h>
using namespace std;

bool findElement(int arr[], int start, int end, int element) {
    // Termination conditions as well as all the parameter checking condition
    if (start > end) {
        return false;
    }
    int mid = (start + end)/2;
    if(arr[mid] == element) {
        return true;
    } else if (arr[mid] > element) {
        return findElement(arr, start, mid - 1, element);
    } else {
        return findElement(arr, mid + 1, end, element);
    }
}

int findAnyPeakElement(int arr[], int start, int end) {
    if (start == end) {
        return start;
    }
    int mid = (start + end)/2;
    if(mid == start) {
        if (arr[mid] >= arr[mid+1]){
            return mid;
        } else {
            return findAnyPeakElement(arr, mid+1, end);
        }
    }
    if(mid == end) {
        if (arr[mid] >= arr[mid-1]) {
            return mid;
        } else {
            return findAnyPeakElement(arr, start, mid-1);
        }
    }
    if (arr[mid] >= arr[mid-1] and arr[mid] >= arr[mid + 1]) {
        return mid;
    } else if(arr[mid] < arr[mid-1] ) {
        return findAnyPeakElement(arr, start, mid-1);
    } else {
        return findAnyPeakElement(arr, mid+1, end);
    }
}

int findMxIdx(int arr[], int n) {
    int mx = -1, mxIdx = -1;
    for(int i=0; i < n; i++) {
        if(mx < arr[i]) {
            mx = arr[i];
            mxIdx = i;
        }
    }
    return mxIdx;
}

pair<int, int > findingPeakIn2Darray(int arr[4][4], int start, int end, int n){
    if (end == start) {
        int mxIdx = findMxIdx(arr[start], n);
        return {mxIdx, start};
    }
    int mid = (start + end)/2;
    int mxIdx = findMxIdx(arr[mid], n);
    if(mid == end) {
        if(arr[mid][mxIdx] > arr[mid-1][mxIdx]) {
            return {mid, mxIdx};
        } else {
            return findingPeakIn2Darray(arr, start, mid-1, n);
        }
    } else if(mid == start) {
        if(arr[mid][mxIdx] > arr[mid+1][mxIdx]) {
            return {mid, mxIdx};
        } else {
            return findingPeakIn2Darray(arr, mid+1, end, n);
        }
    } else {
        if(arr[mid][mxIdx] > arr[mid-1][mxIdx] and arr[mid][mxIdx] > arr[mid+1][mxIdx]){
            return {mid, mxIdx};
        } else if (arr[mid][mxIdx] < arr[mid-1][mxIdx]) {
            return findingPeakIn2Darray(arr, start, mid-1, n);
        } else {
            return findingPeakIn2Darray(arr, mid+1, end, n);
        }
    }
}

int main() {
    int arr[] = {1, 2, 7, 10, 12, 15, 20};
    int element = 11;
    bool isFound = findElement(arr, 0, 6, element);
    if (isFound) {
        cout<<"Hi Element Found!!"<<endl;
    } else {
        cout<<"Hi Element Not Found!!"<<endl;
    }

    // Finding peak element in 1D array
    int arr1[] = {2, 7, 1, 3, 4, 5, 1};
    int peakIdx = findAnyPeakElement(arr1, 0, 6);
    cout<<"Hi We found a peak element at idx: "<< peakIdx<<"  value: "<< arr1[peakIdx]<<endl;

    // Finding Peak element in 2d array
    int arr2[4][4] = {{1, 3, 6, 2}, {2, 3, 1, 8}, {1, 7, 8, 10}, {1, 2, 1 , 9}};
    pair<int, int>peak2dIdx = findingPeakIn2Darray(arr2, 0, 3, 4);
    cout<<"Hi We found a peak element at idx: "<< peak2dIdx.first<< " " << peak2dIdx.second<<"  value: "<< arr2[peak2dIdx.first][peak2dIdx.second];
}

