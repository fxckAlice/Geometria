# Geometria

"Geometria" is a program to help to calculate basic parameters in simple figures :ballot_box_with_check:

<div style="text-align:center">
  <img src="img_2.png" alt="img_2.png">
</div>
<!--![img_2.png](img_2.png)-->

___
## Short describtion and methods:
SDK: *corrnetto 11*;

The main figure is **rectangle**;
### The head class ```rectangle```:
- ```double lenght``` - the main values that denotes the value of rectangle`s side;
- ```set[-Lenght, -Width, -Perimeter, -Area, -Diagonal, -OutRadius, -InputRadius, -Corner](double value)``` - method which you should use to give values to parameters. For example ```setLenght(3);```
- ```round(double x, int dozen)``` - method which you should use to round the number to the degree you need. For example: ```round(341, 2);``` => *300*, ```round(3.3465, -2);``` => *3.35*. The method only works when the `int dozen` is less than -9 or greater than 9;
- ```area()``` - calculate the area of rectangle using ```double lenght``` and ```double width```;
- ```perimeter()``` - calculate the perimeter of rectangle using ```double lenght``` and ```double width```;
- ```diagonal()``` - calculate the diagonal of rectangle using ```double lenght``` and ```double width```;
- ```outRadius()``` - calculate the radius of out circle using ```double diagonal``` only if the rectangle corresponds to the conditions for the existence of such a circle;
- ```inputRadius()``` - calculate the radius of input circle using ```double lenght``` only if the rectangle corresponds to the conditions for the existence of such a circle;
- ```corner()``` - calculate the corner of rectangle;
- ```sumOfCorners()``` - calculate the sum of all corners in rectangle; 
- ```cornerDiagonal[-Lenght, -Width]``` - calculate the corner between the diagonal and particular side. For example ```cornerDiagonalLenght()``` => *30*;
- ```side(double value, char parameter)``` - calculate the ```double width``` using ```double lenght``` and characteristic in dependence of parameter:
  - `````'a'````` - ```double value``` is the area of rectangle;
  - ```'p'``` - ```double value``` is the perimeter of rectangle;
  - ```'d'``` - ```double value``` is the diagonal of rectangle;
  - ```'i'``` - ```double value``` is the radius of input circle of rectangle;
  - ```'o'``` - ```double value``` is the radius of out circle of rectangle.

  If you enter another parameter, an error will occur.
___

  

### The class is ```Square```:
*Square extends rectangle*
+ ```setWidth(double value)``` - method outputs Error because all sides of a square are equal(`setWidth() == setLength()`), so we use only `setLength()`;
+ ```cornerDiagonalWidth()``` - method outputs Error because 
```
                cornerDiagonalWidth() == cornerDiagonalLength();
```
---


### The class is ```Parallelogram```:
*Parallelogram extends rectangle*
+ ```corner()``` - corner must be less than 90 degrees, otherwise it will not be a parallelogram;
+ ```diagonal()``` -  since a parallelogram is a derivative of a rectangle and if you enter a diagonal, it doesn't work. It means you need to use `diagonal1()` or `diagonal2()` using ```double leinght```,```double width``` and `double corner`;

+ ```outRadius()``` - a circle can be described around a square and a rectangle, that is, when equality
```
             diagonal1() == diagonal2();       //is fulfilled.
```
  The method using method `diagonal1()`;
+ ```inputRadius()``` - method, which using `double length`, `double width` and `area()`, works only when `double length == double width` otherwise, it is not possible to inscribe a circle in a parallelogram and find the radius;
+ ```area()``` - the method works only by using parameters:
  + ```'h'``` - `double value` - calculation of the area using `double height` and `double length`;
  + ```'c'``` - `double value` - calculation of the area using `double width`, `double corner` and `double length`. 
  
  If you enter another parameter, an error will occur.  
---


### The class is ```Rhombus```:
*Rhombus extends Parallelogram.*
+ ```setWidth(double value)``` - method outputs Error because all sides of a rhombus are equal(`setWidth() == setLength()`), so we use only `setLength()`;
<!--+ ```area()``` - the method works only by using parameters:
  + ```'h'``` - `double value` - calculation of the area using `double height` and `double length`;
  + ```'c'``` - `double value` - calculation or the area using `double length` and `double corner`;
  
  If you enter another parameter, an error will occur.-->
  + ```cornerDiagonalWidth()``` - the method produces an Error, because all sides of a rhombus are equal and we use the `double length`, and therefore the `cornerDiagonalLength()` method.
---


### The head class is ```EquilateralTriangle```:
+ ```double a, double perimeter, double area, double median, double bisector, double height, double outRadius, double inputRadius``` - variables that will be used in methods;
+ ```set[-A, -Perimeter, -Area, -Median, -Bisector, -Height -OutRadius, -InputRadius, -Corner](double value)``` - method which you should use to give values to parameters. For example `setA(6)`;
+ ```round(double x, int dozen)``` - method which you should use to round the number to the degree you need. For example: ```round(341, 2);``` => *300*, ```round(3.3465, -2);``` => *3.35* .The method only works when the `int dozen` is less than -9 or greater than 9;
+ ```semiPerimeter()``` - calculation of the semi-perimeter using `double perimeter`;
+ ```setMedian(), setBisector()``` - these methods are designed to derive from this class, and it can't be used in this class. you should use `setHeight()`.
+ ```perimeter()``` -  calculate the perimeter of equilateral triangle using `double a`;
+ ```area()``` -  calculate the area of equilateral triangle using ```double a```;
+ ```height()``` - calculate the height of equilateral triangle using ```double a```;
+ ```outRadius``` - calculate the radius of the circle of equilateral triangle using ```double a```;
+ ```inputRadius``` - calculate the radius of the inscribed circle of equilateral triangle using ```double a```;
+ ```side(double value, char parameter)``` - calculate the ```double a``` using characteristic in dependence of parameter:
  + `````'a'````` - ```double value``` - using the `outRadius()`;
  + ```'p'``` - ```double value``` - using the `inputRadius()`;
  + ```'i'``` - ```double value``` - using the `perimeter()`;
  + ```'o'``` - ```double value``` - using the `area()`;
  + ```'h'``` - ```double value``` - using the `height()`.

  If you enter another parameter, an error will occur.
---
### The class is `IsoscelesTriangle`:
*IsoscelesTriangle extends EquilateralTriangle.*
+ ```double b, double medianB, double bisectorB, double heightB, double cornerApex, double ornerSid``` - variables that will be used in methods;
+ ```set[-B, -MedianB, -BisectorB, -HeightB, -CornerApex, -CornerSide](double value)``` - method which you should use to give values to parameters. For example `setMedianB(8)`;
+ ```medianB()``` - calculate the median of isosceles triangle using `double b` and `double a`;
+ ```heightB()``` - calculate the height of isosceles triangle using `double b`;
+ ```area(double value, char parameter)``` - calculate the area of isosceles triangle using characteristic in dependence of parameter:
  + ```'a'``` - ```double value``` - using the `height()` and `double b`;
  + ```'b'``` - ```double value``` - using the `heightB()` and `double a`.
+ ```sideB(double value, char parameter)``` - calculate the ```double b``` using characteristic in dependence of parameter:
  + ```'o'``` - ```double value``` - using the `outRadius()`, `area()` and `double a`;
  + ```'i'``` - ```double value``` - using the `inputRadius()`, `semiPerimeter()` and `double a`;
  + ```'p'``` - ```double value``` - using the `perimeter()` and `double a`;
  + ```'a'``` - ```double value``` - using the `area()` and `height()`;
  + ```'h'``` - ```double value``` - using the `double a` and `height()`.

  If you enter another parameter, an error will occur.




---
Project participants:
- [Alexandr Mykhailov](https://github.com/fxckAlice);
- [Polina Kovdrysh](https://github.com/pkovdrysh).