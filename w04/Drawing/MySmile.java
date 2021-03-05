package Drawing;

import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;

public class MySmile {
  public static void main(String[] args) throws IOException {
    int width = 100;
    int height = 100;

    BufferedImage picture = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    Graphics g = picture.createGraphics();

    // background
    g.setColor(Color.GREEN);
    g.fillRect(0, 0, width, height);

    // face, ring
    g.setColor(Color.BLACK);
    g.fillArc(0, 0, width, height, 0, 360); //0- kell 3 alates, + - ules alla

    g.setColor(Color.YELLOW);

    // left eye
    g.drawArc(15, 15, 30, 10, 0, 180); //дуга
    g.fillOval(15, 20, 30, 30);

    // right eye
    g.drawArc(55, 15, 30, 10, 0, 180);
    g.fillOval(55, 20, 30, 30);

    // nose
    g.fillOval(40, 50, 20, 20);

    // mouth
    g.drawArc(20, 50, 60, 30, 0, -180);

    ImageIO.write(picture, "png", new File("smile.png"));
  }
}
    

/*
Методы класса Graphics для отрисовки
Рассмотрим обзорно методы класса Graphics, предназначенные для отрисовки.

drawLine(x1, y1, x2, y2)
Этот метод отображает линию толщиной в 1 пиксел, проходящую из точки ( x1, y1 ) в ( x2, y2 ). Именно он использовался в предыдущем примере.

drawRect(int x, int y, int width, int height)
Этот метод отображает прямоугольник, чей левый верхний угол находится в точке ( x, y ), а ширина и высота равняются width и height соответственно. Правая сторона пройдет по линии x+width, а нижняя – y+height.

Предположим, мы хотим дополнить предыдущий пример рисованием рамки вокруг компонента (периметр). Понятно, что левый верхний угол находится в точке (0, 0). Если ширина компонента равна, например, 100 пикселам, то координата x пробегает значения от 0 до 99. Это означает, что ширина и высота рисуемого прямоугольника должны быть уменьшены на единицу. На самом деле по той же причине в предыдущем примере такое уменьшение на единицу должно присутствовать и в остальных методах:

public void paint(Graphics g) {
  g.drawLine(0,0,getWidth()-1, getHeight()-1);
  g.drawLine(0,getHeight()-1, getWidth()-1,0);
  g.drawRect(0,0,getWidth()-1, getHeight()-1);
}
В результате компонент примет следующий вид:



fillRect(int x, int y, int width, int height)
Этот метод закрашивает прямоугольник. Левая и правая стороны прямоугольника проходят по линиям x и x+width-1 соответственно, а верхняя и нижняя – y и y+height-1 соответственно. Таким образом, чтобы зарисовать все пикселы компонента, необходимо передать следующие аргументы:

g.fillRect(0, 0, getWidth(), getHeight());
drawOval(int x, int y, int width, int height)
Этот метод рисует овал, вписанный в прямоугольник, задаваемый указанными параметрами. Очевидно, что если прямоугольник имеет равные стороны (т.е. является квадратом), овал становится окружностью.

Снова для того, чтобы вписать овал в границы компонента, необходимо вычесть по единице из ширины и высоты:

g.drawRect(0, 0, getWidth()-1, getHeight()-1);
g.drawOval(0, 0, getWidth()-1, getHeight()-1);
Результат:



fillOval(int x, int y, int width, int height)
Этот метод закрашивает указанный овал.

drawArc(int x, int y, int width, int height, int startAngle, int arcAngle)
Этот метод рисует дугу – часть овала, задаваемого первыми четырьмя параметрами. Дуга начинается с угла startAngle и имеет угловой размер arcAngle. Начальный угол соответствует направлению часовой стрелки, указывающей на 3 часа. Угловой размер отсчитывается против часовой стрелки. Таким образом, размер в 90 градусов соответствует дуге в четверть овала (верхнюю правую). Углы "растянуты" в соответствии с размером прямоугольника. В результате, например, угловой размер в 45 градусов всегда задает границу дуги по линии, проходящей из центра прямоугольника в его правый верхний угол.

fillArc(int x, int y, int width, int height, int startAngle, int arcAngle)
Этот метод закрашивает сектор, ограниченный дугой, задаваемой параметрами.

drawString(String text, int x, int y)
Этот метод выводит на экран текст, задаваемый первым параметром. Точка (x, y) задает позицию самого левого символа. Для наглядности приведем пример:

g.drawString("abcdefgh", 15, 15);
g.drawLine(15, 15, 115, 15);
*/