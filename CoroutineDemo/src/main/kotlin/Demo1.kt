import kotlinx.coroutines.*

object  Demo1 {

     fun a() {
        GlobalScope.launch {
            // 在后台启动一个新的协程并继续
            delay(1000L) // 非阻塞的等待 1 秒钟（默认时间单位是毫秒）
            println("World!") // 在延迟后打印输出
        }
        println("Hello,=====") // 协程已在等待时主线程还在继续
        //Thread.sleep(2000L) // 阻塞主线程 2 秒钟来保证 JVM 存活



         runBlocking {     // 但是这个表达式阻塞了主线程
             delay(2000L)  // ……我们延迟 2 秒来保证 JVM 的存活
             println("4444444")
         }

         println("333333333")
     }

    @JvmStatic
    fun main(args: Array<String>) {



      //  a()

        listdemo()

    }


    fun listdemo(){

        val numbers = listOf("one", "two", "three", "four")

        var listIterator = numbers.listIterator()

        while (listIterator.hasPrevious()){

            print("Index: ${listIterator.previousIndex()}")
            println(", value: ${listIterator.previous()}")
        }
    }



}