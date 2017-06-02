import com.A
import db.B

/**
 * Created by gavin on 2017/6/2.
 */

class C : A(), B {

    override var property: Int = 12


    override fun m(name: String, age: Int) {

    }

    override fun f() {
        super<A>.f()
    }

    override fun m() {

    }

}