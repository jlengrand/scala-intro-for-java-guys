package example

/**
  * Created by jll on 3/3/2017.
  */
object Timer {
  def oncePerSecond(callback: () => Unit) {
    while (true) { callback(); Thread sleep 1000 }
  }

  def main(args: Array[String]) {
    oncePerSecond(() => println("time flies like an arrow..."))
  }
}