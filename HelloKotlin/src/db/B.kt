package db

/**
 * Created by gavin on 2017/6/2.
 */
interface B {

    var property:Int

    fun f() {
        print("B")
    } //接口的成员变量默认是 open 的

    fun b() {
        print("b")
    }

    fun m()

    fun m(name: String,age:Int)
}