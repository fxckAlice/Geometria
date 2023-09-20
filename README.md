# Geometria

"Geometria" is a program to help to calculate basic parameters in simple figures :white_check_mark:
___
## Short describtion and methods:
The main figure is **rectangle**;
- *<leight>* - the main values that denotes the value of figure`s side;
- *set<-Leight, -Width, -Perimeter, -Area, -Diagonal, -OutRadius, -InputRadius, -Corner>(**double value**)* - method which you shoud use to give values to parameters. For example setLeight(3);
- round(double x, int dozen) - method which you shoud use to round the number to the degree you need. For example round(341, 2); --> 300, round(3.3415, -2); --> 3.34;
- area() - calculate the area of figure using <leight> and <width>;
- perimeter() - calculate the perimeter of figure using <leight> and <width>;
- diagonal() - calculate the diagonal of figure using <leight> and <width>;
- outRadius() - calculate the radius of out circle using <diagonal> only if the figure corresponds to the conditions for the existence of such a circle;
- inputRadius() - calculate the radius of input circle using <leight> only if the figure corresponds to the conditions for the existence of such a circle;
- corner() - calculate the corner of figure;
- sumOfCorners() - calculate the sum of all corners in figure; 
- cornerDiagonal<-Leight, -Width> - calculate the corner between the diagonal and paticular side. For example cornerDiagonalLeight() --> 30;
- side(double value, char parameter) - calculate the <width> using <leight> and characteristic in dependance of parameter:
- - 'a' - <value> is the area of figure;
- - 'p' - <value> is the perimeter of figure;
- - 'd' - <value> is the diagonal of figure;
- - 'i' - <value> is the radius of input circle of figure;
- - 'o' - <value> is the radius of out circle of figure;
