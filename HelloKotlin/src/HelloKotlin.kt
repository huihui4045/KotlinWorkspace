/**
 * Created by gavin on 2017/6/2.
 */

fun main(args: Array<String>) {

    var c= C();

    c.f()

    c.a()

    c.b()

}

fun sum(a: Int, b: Int): Int {

    return a + b
}

fun  sum(a:Int,b:Int,c:Int)=a+b+c

/*****
 * 返回一个没有意义的值
 */
fun  printSum(a:Int,b:Int):Unit{

    println("sum ${a+b}")
}