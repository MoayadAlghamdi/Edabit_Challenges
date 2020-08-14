The additive persistence of an integer, n, is the number of times you have to replace n with the sum of its digits until n becomes a single digit integer.

The multiplicative persistence of an integer, n, is the number of times you have to replace n with the product of its digits until n becomes a single digit integer.

Create two functions that take an integer as an argument and:

Return its additive persistence.
Return its multiplicative persistence.

**Examples: Additive Persistence**
***
additivePersistence(1679583) ➞ 3<br/>
// 1 + 6 + 7 + 9 + 5 + 8 + 3 = 39<br/>
// 3 + 9 = 12<br/>
// 1 + 2 = 3<br/>
// It takes 3 iterations to reach a single-digit number.

additivePersistence(123456) ➞ 2<br/>
// 1 + 2 + 3 + 4 + 5 + 6 = 21<br/>
// 2 + 1 = 3<br/>

additivePersistence(6) ➞ 0<br/>
// Because 6 is already a single-digit integer.
***

**Examples: Multiplicative Persistence**
***
multiplicativePersistence(77) ➞ 4<br/>
// 7 x 7 = 49<br/>
// 4 x 9 = 36<br/>
// 3 x 6 = 18<br/>
// 1 x 8 = 8<br/>
// It takes 4 iterations to reach a single-digit number.

multiplicativePersistence(123456) ➞ 2<br/>
// 1 x 2 x 3 x 4 x 5 x 6 = 720<br/>
// 7 x 2 x 0 = 0<br/>

multiplicativePersistence(4) ➞ 0<br/>
// Because 4 is already a single-digit integer.
***
