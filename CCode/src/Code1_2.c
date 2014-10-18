/*
 * Code1_1.c
 *
 *  Created on: Oct 18, 2014
 *      Author: jmp
 */
#include <stdio.h>

void reverse(char* str)
{
	// check for empty string
	if (!str) return;

	// find the last index of the string
	char* end = str;
	while(*end) end++;
	end--;

	char tmp;
	while (str < end){
		tmp = *str;
		*str++ = *end;
		*end-- = tmp;
	}
}


void Code1_2(){
	char str[14] = "Hello, World!";

	printf("Original: %s\r", str);
	reverse(str);
	printf("Reversed: %s\r", str);
}
