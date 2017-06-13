/**
The power set is the set of all subsets of a set. For example, the power set of the set {a, b, c} consists of the sets:

{}
{a}
{b}
{c}
{a,b}
{a,c}
{b,c}
{a,b,c}
Note that:

The empty set {} is in the power set
The set itself is in the power set
A subset can be represented as an array of boolean values of the same size as the set, called a characteristic vector. Each boolean value indicates whether the corresponding element in the set is present or absent in the subset.

This gives following correspondences for the set {a, b, c}:

[0,0,0] = {}
[1,0,0] = {a}
[0,1,0] = {b}
[0,0,1] = {c}
[1,1,0] = {a,b}
[1,0,1] = {a,c}
[0,1,1] = {b,c}
[1,1,1] = {a,b,c}
 **/

def array = ['a','b','c']

def computeSubsets(def array){
  def matcher = [[0,0,0],[1,0,0],[0,1,0],[0,0,1],[1,1,0],[1,0,1],[0,1,1],[1,1,1]]
  def all = []
  matcher.each { col ->
    def subset = []
    col.eachWithIndex { row, i ->
      if(row == 1){
        subset << array[i]
      }
    }
    if(!subset.isEmpty())
      all << subset
  }
  all.add(0,[])
  all
}

print computeSubsets(array)
