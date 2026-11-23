package main

import (
	"fmt"
	"strconv"
)

func main() {
	var a, b int
	fmt.Scan(&a)
	fmt.Scan(&b)

	digits := strconv.Itoa(b)
	for i := len(digits) - 1; i >= 0; i-- {
		d := int(digits[i] - '0')
		fmt.Println(a * d)
	}

	fmt.Println(a * b)
}