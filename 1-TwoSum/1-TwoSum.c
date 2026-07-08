// Last updated: 7/8/2026, 3:38:38 PM
/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
#include<stdio.h>
#include<stdlib.h>
int* twoSum(int* nums, int numsSize, int target, int* returnSize) {
    int* resuly = (int*)malloc(2 * sizeof(int));
    *returnSize=2;

    for(int i= 0;i < numsSize; i++){
        for(int j=i+1;j < numsSize; j++){
            if(nums[i]+nums[j]==target){
                resuly[0]=i;
                resuly[1]=j;
                return resuly;
            }
        }
    }
    return NULL;
}
