# Geometria

"Geometria" is a program to help to calculate basic parameters in simple figures :ballot_box_with_check:

![img_2.png](img_2.png)
___
## Short describtion and methods:
SDK: *corrnetto 11*;

The main figure is **rectangle**;
### The head class ```Rectangle.Rectangle```:
- ```double lenght``` - the main values that denotes the value of rectangle`s side;
- *```set[-Lenght, -Width, -Perimeter, -Area, -Diagonal, -OutRadius, -InputRadius, -Corner](double value)```* - method which you should use to give values to parameters. For example ```setLenght(3);```
- ```round(double x, int dozen)``` - method which you should use to round the number to the degree you need. For example: ```round(341, 2);``` => *300*, ```round(3.3465, -2);``` => *3.35*;
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
  - ```'o'``` - ```double value``` is the radius of out circle of rectangle;
___

  

### The class is ```Rectangle.Square```:
*Rectangle.Square extends Rectangle.Rectangle.*
+ ```setWidth(double value)``` - method outputs Error because all sides of a square are equal(`setWidth() == setLength()`), so we use only `setLength()`.
+ ```cornerDiagonalWidth()``` - method outputs Error because 
```
              cornerDiagonalWidth() == cornerDiagonalLength();
```
---


### The class is ```Rectangle.Parallelogram```:
*Rectangle.Parallelogram extends Rectangle.Rectangle.*
+ ```corner()``` - corner must be less than 90 degrees, otherwise it will not be a parallelogram.
+ ```diagonal()``` -  since a parallelogram is a derivative of a rectangle and if you enter a diagonal, it doesn't work. It means you need to use `diagonal1()` or `diagonal2()` using ```double leinght```,```double width``` and `double corner`;

+ ```outRadius()``` - a circle can be described around a square and a rectangle, that is, when equality
```
             diagonal1() == diagonal2();       //is fulfilled.
```
  The method using method `diagonal1()`.
+ ```inputRadius()``` - method, which using `double length`, `double width` and `area()`, works only when `double length == double width` otherwise, it is not possible to inscribe a circle in a parallelogram and find the radius.
+ ```area()``` - the method works only by using parameters:
  + ```'h'``` - `double value` - calculation of the area using `double height` and `double length`;
  + ```'c'``` - `double value` - calculation of the area using `double width`, `double corner` and `double length`. 
  
  If you enter another parameter, an error will occur.  
---


### The class is ```Rectangle.Rhombus```:
*Rectangle.Rhombus extends parallelogram.*






---
Project participants:
- [Alexandr Mykhailov](https://github.com/fxckAlice);
- [Polina Kovdrysh](https://github.com/pkovdrysh).