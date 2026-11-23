package main

import "fmt"

func main() {
	// 윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
	var year int
	fmt.Scan(&year)

	if year%4 == 0 {
		if year%400 == 0 || year%100 != 0 {
			fmt.Println(1)
			return
		}
	}
	fmt.Println(0)
}
