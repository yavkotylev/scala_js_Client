/**
 * Created by Yaroslav on 06.08.15.
 */

import scala.scalajs.js.JSApp
import upickle.default._

object TutorialApp extends JSApp {
  def main(): Unit = {
    val str = write(testCase("Hohsdf"))

    println(str)

    val res = read[testCase](str)
    println(res.a)
  }

}

case class testCase(a: String)