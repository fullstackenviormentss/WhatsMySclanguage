package features
import breeze.linalg.{SparseVector, VectorBuilder}
import epic.preprocess.TreebankTokenizer
import org.slf4j.Logger
import org.slf4j.LoggerFactory

import scala.collection.immutable.HashMap
import scala.collection.immutable.Stream

class NgramVectorizer(val char: Boolean, val ngramRange: (Int, Int), val corpus: Iterable[String]) extends Vectorizer {
  val logger: Logger = LoggerFactory.getLogger(classOf[NgramVectorizer])

  val tokenizer: String => IndexedSeq[String] = char match {
    case true => _.split("").toIndexedSeq // Splits into chars
    case false => new TreebankTokenizer() // Splits into words
  }
  private val vocab: HashMap[String, Int] = fit(corpus)


  override def vectorize(text: String): SparseVector[Double] = {
    null
  }


            ///////////////////
            ///// Private /////
            ///////////////////

  private def fit(corpus: Iterable[String]): HashMap[String, Int] = {
    logger.info("Building vocabulary...")
    val ngrams = corpus.flatMap(d => uniqueNgrams(d, tokenizer))

      return null
  }

  private val uniqueNgrams = (text: String, tokenizer: String => IndexedSeq[String]) => {
    val tokens = tokenizer.apply(text)
    val vectorLen = vectorSize(tokens)

    val vecBuilder = VectorBuilder
    (ngramRange._1 to ngramRange._2).map { n => tokens.sliding(n).toStream }
      .foldLeft(Stream[IndexedSeq[String]]()) {
        (ngramList, ngram) => {
          ngramList #::: ngram
          // TODO: Sparse Vector

        }
      }.toSet
  }

  private def vectorSize(tokens: IndexedSeq[Any]): Int = {
    (ngramRange._1 to ngramRange._2)
      .foldLeft(0)((accum, x) => accum + tokens.size - (x-1))
  }

}

object runner {

  def ngrams(text: String) = {
    val tokenizer: TreebankTokenizer = new TreebankTokenizer()

    (2 to 4).map { n => tokenizer.apply(text).sliding(n).toStream }
      .foldLeft(Stream[IndexedSeq[String]]()) {
        (ngrams, token) => ngrams #::: token
      }
  }

  def main(args: Array[String]): Unit = {
    val tokens = List[String]("Hello", "this", "is", "a", "fairly", "long", "sentence", ".")
    val vectorSize = (1 to 5).foldLeft(0){ (accum, x) =>
      println(s"Current accum: $accum\t Current x: $x")
      accum + tokens.length - (x-1)
    }
  }
}
