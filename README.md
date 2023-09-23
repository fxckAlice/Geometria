# Geometria

"Geometria" is a program to help to calculate basic parameters in simple figures :ballot_box_with_check:

![img_2.png](img_2.png)
___
## Short describtion and methods:
SDK: *corrnetto 11*;

The main figure is **rectangle**;
### The head class ```Rectangle```:
- ```double leight``` - the main values that denotes the value of figure`s side;
- *```set[-Leight, -Width, -Perimeter, -Area, -Diagonal, -OutRadius, -InputRadius, -Corner](double value)```* - method which you should use to give values to parameters. For example ```setLeight(3);```
- ```round(double x, int dozen)``` - method which you should use to round the number to the degree you need. For example: ```round(341, 2);``` --> 300, ```round(3.3465, -2);``` --> 3.35;
- ```area()``` - calculate the area of figure using ```double leight``` and ```double width```;
- ```perimeter()``` - calculate the perimeter of figure using ```double leight``` and ```double width```;
- ```diagonal()``` - calculate the diagonal of figure using ```double leight``` and ```double width```;
- ```outRadius()``` - calculate the radius of out circle using ```double diagonal``` only if the figure corresponds to the conditions for the existence of such a circle;
- ```inputRadius()``` - calculate the radius of input circle using ```double leight``` only if the figure corresponds to the conditions for the existence of such a circle;
- ```corner()``` - calculate the corner of figure;
- ```sumOfCorners()``` - calculate the sum of all corners in figure; 
- ```cornerDiagonal[-Leight, -Width]``` - calculate the corner between the diagonal and particular side. For example ```cornerDiagonalLeight()``` --> 30;
- ```side(double value, char parameter)``` - calculate the ```double width``` using ```double leight``` and characteristic in dependence of parameter:
  - `````'a'````` - ```double value``` is the area of figure;
  - ```'p'``` - ```double value``` is the perimeter of figure;
  - ```'d'``` - ```double value``` is the diagonal of figure;
  - ```'i'``` - ```double value``` is the radius of input circle of figure;
  - ```'o'``` - ```double value``` is the radius of out circle of figure;



### The class ```Square```:
+ ``` 

  
___


### The class is ```Square```:
+ ```setWidth``` - method outputs Error because all sides of a square are equal(`setWidth == setLength`), so we use only `setLength`.
+ ```cornerDiagonalWidth``` - method outputs Error because 
```
              cornerDiagonalWidth == cornerDiagonalLength;
```


### The class is ```Parallelogram```:
+ ```corner``` - corner must be less than 90 degrees, otherwise it will not be a parallelogram.
+ ```diagonal``` -  since a parallelogram is a derivative of a rectangle and if you enter a diagonal, it doesn't work. It means you need to use `diagonal1() or diagonal2`;

+ ```outRadius``` - a circle can be described around a square and a rectangle, that is, when equality
```
              diagonal1() == diagonal2;        //is fulfilled.
```
Therefore the angle should be only 90 degrees.
+ ```inputRadius``` - 




Project participants:
- [Alexandr Mykhailov](https://github.com/fxckAlice);
- [Polina Kovdrysh](https://github.com/pkovdrysh).