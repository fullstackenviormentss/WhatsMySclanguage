package data

import scala.io.Source
import org.slf4j.Logger
import org.slf4j.LoggerFactory

object corpus {
  case class textSample(text: String, l1: String) // To be expanded later
  val logger: Logger = LoggerFactory.getLogger("File")

  def etsCorpus(indexFileName: String, delimiter: Char = ','): Array[textSample] = {
    logger.info(s"Loading ETS Corpus via index file $indexFileName")
    Source.fromFile(indexFileName)
      .getLines
      .map(_.split(delimiter))
      .map(r => textSample(
        this.loadFile(r(0)),
        r(2)))
      .toArray
  }

  def loadFile(file: String): String = {
    Source.fromFile(file).getLines.mkString(" ")
  }
}
