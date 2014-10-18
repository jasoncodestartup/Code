/*
 * Code1_4.c
 *
 *  Created on: Oct 18, 2014
 *      Author: jmp
 */

#include <stdio.h>
#include <string.h>

void replaceSpaces(char* str, int len){
	// input check
	if (!str) return;

	// count the number of spaces
	int i, count = 0;
	for (i = 0; i < len; i++){
		if (str[i] == ' ') count++;
	}

	// start at the end
	int endidx = len - 1 + count * 2;
	if (endidx > strlen(str)) return;	// one way to deal with bad input
	str[endidx+1] = '\0';				// one option to deal with additional spaces at the end

	for (i = len-1; i >= 0; i--){
		if (str[i] == ' '){
			str[endidx--] = '0';
			str[endidx--] = '2';
			str[endidx--] = '%';
		} else {
			str[endidx--] = str[i];
		}
	}
}


void Code1_4(){
	printf("Code1_4 Started\r\r");

	char str[] = "Hello World ABCDE     ";

	printf("Original: %s\r", str);
	replaceSpaces(str, 17);
	printf("Modified: %s\r", str);
}
