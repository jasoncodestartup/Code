/*
 * Code1_3.c
 *
 *  Created on: Oct 18, 2014
 *      Author: jmp
 */


// Input: two strings
// Output: is one a permutation of the other?
#include <stdio.h>
#include <string.h>

int isPermutation(char* str1, char* str2)
{
	// Must be the same size
	if (strlen(str1) != strlen(str2)) return 0;

	// Assume ASCII strings
	// If bigger character space, increase size of array or use a different data structure
	int count[256] = { 0 };  	// memset(count, 0, 256 * sizeof(int)); will also work
	int i;

	for (i = 0; i < strlen(str1); i++){
		count[(int)str1[i]]++;
		count[(int)str2[i]]--;
	}

	for (i = 0; i < 256; i++){
		if (count[i] != 0) return 0;
	}
	return 1;
}

void Code1_3()
{
	char* str1 = "ABcDE";
	char* str2 = "BAcDE";
	char* str3 = "AAAA";
	char* str4 = "BAcDEA";

	printf("Is %s a permutation of %s?  %d\r", str1, str2, isPermutation(str1, str2));
	printf("Is %s a permutation of %s?  %d\r", str1, str3, isPermutation(str1, str3));
	printf("Is %s a permutation of %s?  %d\r", str1, str4, isPermutation(str1, str3));
}
