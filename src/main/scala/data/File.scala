package scala.data

import breeze.linalg._
import java.io._
import scala.io.Source

object File {

  case class textSample(text: String, l1: String) // To be expanded later

  def etsCorpus(indexFileName: String, delimiter: Char = ','): Array[textSample] = {
    return Source.fromFile(indexFileName)
      .getLines
      .map(_.split(delimiter))
      .map(r => new textSample(
        this.loadFile(r(0)),
        r(2)))
      .toArray
  }

  def loadFile(file: String): String = {
    return Source.fromFile(file).getLines.mkString(" ")
  }

  def main(args: Array[String]): Unit = {
    etsCorpus("test.txt")
  }

}
