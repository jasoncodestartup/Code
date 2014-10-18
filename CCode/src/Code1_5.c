/*
 * Code1_5.c
 *
 *  Created on: Oct 18, 2014
 *      Author: jmp
 */

#include<stdio.h>
#include<string.h>

char* compressString(char* str){
	//figure out size
	int i, len = 0;
	for (i = 1; i < strlen(str); i++){
		if (str[i] != str[i-1]) len++;
	}
	len <<= 1;

	if (len >= strlen(str)) return NULL;	// not quite returning the original string.  Should be written in java/python to return string
	//create new string
	char* out = (char*)malloc(len * sizeof(char));
	int in_idx 	= 0;
	int out_idx = 0;
	int count 	= 0;
	out[out_idx] = str[in_idx];
	while (str[++in_idx]){
		if (str[i] == out[i]){
			count++;
		} else {
			out[out_idx++] = '0' + count; // doesn't account for multiple digit characters in a row.  This is a disaster to code in C.
		}
	}

	return out;
}


void Code1_5(){
	char str1[] = "aaaabcccddddeeeeega";
	char str2[] = "abcdefg";

	char* str1_compressed = compressString(str1);
	char* str2_compressed = compressString(str2);

	printf("Original1  : %s\r", str1);
	printf("Compressed1: %s\r", str1_compressed);

	printf("Original2  : %s\r", str2);
	printf("Compressed2: %s\r", str2_compressed);

	free(str1_compressed);
	free(str2_compressed);
}
