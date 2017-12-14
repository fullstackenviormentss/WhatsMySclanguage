package features

import breeze.linalg._

/*
  Takes a list of documents and converts it into a sparse matrix of n-gram counts
 */
trait Vectorizer {
  def vectorize(text: String): SparseVector[Double]
}

trait StatefulVectorizer extends Vectorizer {
  def fit(corpus: Iterator[String]): Unit
}
