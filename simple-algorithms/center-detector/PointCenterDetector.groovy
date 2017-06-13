/**
Compute average all the x, y coordinates and find the location in the dead center of them.
 **/

class Point{
  Integer x
  Integer y
}

def computeAverage(List<Point> points){
  Float totalX = 0;
  Float totalY = 0;

  points.each{
    totalX += it.x
    totalY += it.y
  }
  [totalX/points.size(),totalY/points.size()]
}

assert [2.5, 2.5] == computeAverage([new Point(x:3,y:4), new Point(x:2,y:1)])
